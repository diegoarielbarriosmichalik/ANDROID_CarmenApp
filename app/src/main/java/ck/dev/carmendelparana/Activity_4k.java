package ck.dev.carmendelparana;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Activity_4k extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4k);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton_call);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel: +595985846411"));
                startActivity(i);
            }
        });

        FloatingActionButton map = (FloatingActionButton) findViewById(R.id.floatingActionButton_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:-27.2206738,-56.1486845(4k)");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        FloatingActionButton fab_email = (FloatingActionButton) findViewById(R.id.floatingActionButton_email);
        fab_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                    emailIntent.setType("text/html");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"estudiocuatrok@gmail.com"});
                    emailIntent.putExtra(android.content.Intent.EXTRA_TITLE, "Titulo");
                    emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Correo sobre CarmenApp");
                    emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hola, tengo una consulta sobre la App de Carmen del Paraná; ");
                    startActivity(Intent.createChooser(emailIntent, "Enviar E-mail..."));
                } catch (android.content.ActivityNotFoundException ex) {

                }


            }
        });
    }
}
