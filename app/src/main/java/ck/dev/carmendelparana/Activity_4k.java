package ck.dev.carmendelparana;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_4k extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4k);
    }

    public void onClickLlamar4k(View v) {
        Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                Uri.parse("tel: +595985846411")); //
        startActivity(i);
    }
}
