package ck.dev.carmendelparana;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static com.google.android.youtube.player.YouTubePlayer.*;

public class ActivityEventos extends YouTubeBaseActivity {


    Button b;
    private YouTubePlayerView youtubepLayerView;
    private OnInitializedListener OnInitializerListener;

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        youtubepLayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        OnInitializerListener = new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("UrpWy6l6BEI");            }

            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b = (Button) findViewById(R.id.button_youtube);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubepLayerView.initialize("AIzaSyD4yIz0guMqrBEuKJQp7bqwhgwCAbwGskg",OnInitializerListener);
            }
        });

    }

}
