package ck.dev.carmendelparana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Activity_publicitar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicitar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_call);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
              //          .setAction("Action", null).show();

                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel: +595985846411")); //
                startActivity(i);
            }
        });

        FloatingActionButton map = (FloatingActionButton) findViewById(R.id.fab_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri gmmIntentUri = Uri.parse("geo:-27.2206738,-56.1486845(Estudio 4k)");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

               // float latitude = -27.2206738f;
                //float longitude = -56.1486845f;
                //String url = String.format("geo:%f, %f", latitude, longitude);
                //Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                 //       Uri.parse(url));
                //startActivity(i);
            }
        });

        FloatingActionButton fab_email = (FloatingActionButton) findViewById(R.id.fab_email);
        fab_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("text/html");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"estudiocuatrok@gmail.com"});
                emailIntent.putExtra(android.content.Intent.EXTRA_TITLE, "Titulo");
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Correo sobre CarmenApp");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hola, tengo una consulta sobre la App de Carmen del Paraná; ");
                try {
                    startActivity(Intent.createChooser(emailIntent, "Enviar E-mail..."));
                } catch (android.content.ActivityNotFoundException ex) {

                }


            }
        });
    }

}
