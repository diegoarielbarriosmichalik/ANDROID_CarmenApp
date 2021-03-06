package ck.dev.carmendelparana;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PruebasFotos extends AppCompatActivity {

    private static String IMG_URL = "http://municipalidaddecarmendelparana.com/fotos_carmen/1.png";
    public ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas_fotos);
     new DownloadImageTask().execute(IMG_URL);
        mImageView = (ImageView) findViewById(R.id.mImageView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class DownloadImageTask extends AsyncTask<String, Integer, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... urls) {
            return downloadImagen(urls[0]);
        }
        protected void onPostExecute(Bitmap result) {
            mImageView.setImageBitmap(result);
        }
        private Bitmap downloadImagen(String baseUrl) {
            Bitmap myBitmap = null;
            try
            {
                URL url = new URL(baseUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                myBitmap = BitmapFactory.decodeStream(input);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return myBitmap;
        }


    }
}
