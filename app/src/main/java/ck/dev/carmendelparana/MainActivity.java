package ck.dev.carmendelparana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {

        //      public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //})

        ;

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_main);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FloatingActionButton fab_whatsapp = (FloatingActionButton) findViewById(R.id.fab_whatsapp);
                FloatingActionButton fab_facebook = (FloatingActionButton) findViewById(R.id.fab_facebook);
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_main);
                FloatingActionButton fab_main_gris = (FloatingActionButton) findViewById(R.id.fab_main_gris);

                fab.setVisibility(view.INVISIBLE);
                fab_whatsapp.setVisibility(view.VISIBLE);
                fab_facebook.setVisibility(view.VISIBLE);
                fab_main_gris.setVisibility(view.VISIBLE);

            }
        });

        final FloatingActionButton fab_whatsapp = (FloatingActionButton) findViewById(R.id.fab_whatsapp);
        fab_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FloatingActionButton fab_whatsapp = (FloatingActionButton) findViewById(R.id.fab_whatsapp);
                FloatingActionButton fab_facebook = (FloatingActionButton) findViewById(R.id.fab_facebook);
                FloatingActionButton fab_main_gris = (FloatingActionButton) findViewById(R.id.fab_main_gris);
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_main);

                fab_whatsapp.setVisibility(view.INVISIBLE);
                fab_facebook.setVisibility(view.INVISIBLE);
                fab_main_gris.setVisibility(view.INVISIBLE);
                fab.setVisibility(view.VISIBLE);

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=" + "ck.dev.carmendelparana");
                //intent.setPackage("com.facebook.katana");
                intent.setPackage("com.whatsapp");
                startActivity(intent);



            }
        });

        final FloatingActionButton fab_facebook = (FloatingActionButton) findViewById(R.id.fab_facebook);
        fab_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FloatingActionButton fab_whatsapp = (FloatingActionButton) findViewById(R.id.fab_whatsapp);
                FloatingActionButton fab_facebook = (FloatingActionButton) findViewById(R.id.fab_facebook);
                FloatingActionButton fab_main_gris = (FloatingActionButton) findViewById(R.id.fab_main_gris);
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_main);

                fab_whatsapp.setVisibility(view.INVISIBLE);
                fab_facebook.setVisibility(view.INVISIBLE);
                fab_main_gris.setVisibility(view.INVISIBLE);
                fab.setVisibility(view.VISIBLE);

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=" + "ck.dev.carmendelparana");
                intent.setPackage("com.facebook.katana");
               // intent.setPackage("com.whatsapp");
                startActivity(intent);



            }
        });

        final FloatingActionButton fab_main_gris = (FloatingActionButton) findViewById(R.id.fab_main_gris);
        fab_main_gris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FloatingActionButton fab_whatsapp = (FloatingActionButton) findViewById(R.id.fab_whatsapp);
                FloatingActionButton fab_facebook = (FloatingActionButton) findViewById(R.id.fab_facebook);
                FloatingActionButton fab_main_gris = (FloatingActionButton) findViewById(R.id.fab_main_gris);
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_main);

                fab_whatsapp.setVisibility(view.INVISIBLE);
                fab_facebook.setVisibility(view.INVISIBLE);
                fab_main_gris.setVisibility(view.INVISIBLE);
                fab.setVisibility(view.VISIBLE);




            }
        });


        Snackbar.make(navigationView, "Nuevos EVENTOS disponibles", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //  @Override
    //  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    //   int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    // if (id == R.id.action_settings) {
    //    return true;
    //  }

    //    return super.onOptionsItemSelected(item);
    // }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void Lanzar_Activity_4k(View view) {
        Intent intent = new Intent(this, Activity_4k.class);
        startActivity(intent);

    }

    public void Lanzar_Activity_MCA(View view) {
        //Intent intent = new Intent(this, Activity_mcanovedades.class);
        Intent intent = new Intent(this, ScrollingActivity_mcanovedades.class);
        //Intent intent = new Intent(this, Activity_fragment_prueba.class);
        startActivity(intent);

    }

    public void Lanzar_Activity_Kinesio_Romi(View view) {
        Intent intent = new Intent(this, Activity_kinesio_romi.class);
        startActivity(intent);

    }

    public void Lanzar_Activity_Informatica(MenuItem item) {
        Intent intent = new Intent(this, Activity_informatica.class);
        startActivity(intent);
    }
    public void Lanzar_Activity_Escribanias(MenuItem item) {
        Intent intent = new Intent(this, Activity_escribano.class);
        startActivity(intent);
    }

    public void Lanzar_Activity_Carmen(MenuItem item) {
        Intent intent = new Intent(this, Activity_carmen.class);
        startActivity(intent);
    }

    public void Lanzar_Activity_Eventos(MenuItem item) {
        Intent intent = new Intent(this, ActivityEventos.class);
        startActivity(intent);
    }

    public void Lanzar_Activity_GYM(MenuItem item) {
        Intent intent = new Intent(this, Activity_GYM.class);
        startActivity(intent);
    }

    public void Lanzar_Activity_Recarga_Saldo(MenuItem item) {
        Intent intent = new Intent(this, Activity_Recarga_saldo.class);
        startActivity(intent);
    }

    public void Lanzar_Activity_Publicitar(MenuItem item) {
        Intent intent = new Intent(this, Activity_publicitar.class);
        startActivity(intent);
    }
/*
    public void Lanzar_4k(MenuItem item) {
        Intent intent = new Intent(this, Activity_4k.class);
        startActivity(intent);
    }*/


    public void onClickLlamarMCA(View v) {
        Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                Uri.parse("tel: +595983180467")); //
        startActivity(i);
    }

    public void onClickLlamarKinesioRomi(View v) {
        Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                Uri.parse("tel: +595985808754")); //
        startActivity(i);
    }


    public void onClickMapa4k(View v) {
        float latitude = 37.456456f;
        float longitude = -156.8767f;
        String url = String.format("geo:%f, %f", latitude, longitude);
        Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(url));
        startActivity(i);
    }


    private Button btnGPS;
    TextView txtCoordenadas;
    TextView direccion;
    private boolean gpsVisto;
    private boolean tieneGPS;


}
