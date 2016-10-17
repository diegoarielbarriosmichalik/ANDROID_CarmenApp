package ck.dev.carmendelparana;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.github.snowdream.android.widget.SmartImageView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class ActivityPublicidad extends AppCompatActivity {

    private ListView listView;
    ArrayList imagen = new ArrayList();
    SmartImageView smartImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicidad);
        listView = (ListView) findViewById(R.id.listview2);
        descargarImagen();
    }

    private void descargarImagen(){
        imagen.clear();
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://municipalidaddecarmendelparana.com/CarmenApp_publicidad.php", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    try {
                        JSONArray jsonArry = new JSONArray(new String(responseBody));
                        for(int i=0; i<jsonArry.length();i++){
                            imagen.add(jsonArry.getJSONObject(i).getString(("id")));
                        }
                        listView.setAdapter((ListAdapter) new ImageAdapter(getApplicationContext()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, Throwable error) {

            }

        });
    }

    public class ImageAdapter extends BaseAdapter {
        Context ctx;
        LayoutInflater layoutInflater;

        public ImageAdapter(Context applicationContext) {
            this.ctx = applicationContext;
            layoutInflater = (LayoutInflater) ctx.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imagen.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.publicidad_fotos_items, null);
            smartImageView = (SmartImageView) viewGroup.findViewById(R.id.imageView_publicidad_fotos);
            Rect rect = new Rect(smartImageView.getLeft(),smartImageView.getRight(),smartImageView.getTop(),smartImageView.getBottom());
            smartImageView.setImageUrl("http://municipalidaddecarmendelparana.com/4k/publicidad/"+imagen.get(position).toString()+".jpg",rect);
            return viewGroup;
        }
    }
}
