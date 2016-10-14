package ck.dev.carmendelparana;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static com.google.android.youtube.player.YouTubePlayer.*;

public class ActivityEventos extends YouTubeBaseActivity {


    Button b;
    private YouTubePlayerView youtubepLayerView;
    private OnInitializedListener OnInitializerListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
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
