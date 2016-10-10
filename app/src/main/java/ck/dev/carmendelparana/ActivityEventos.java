package ck.dev.carmendelparana;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ActivityEventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        Button buttonPlayVideo2 = (Button)findViewById(R.id.button_play_video);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView mVideoView2 = (VideoView)findViewById(R.id.videoView_publicidad);
        String uriPath2 = "android.resource://ck.dev.carmendelparana/"+R.raw.velocross;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();
        buttonPlayVideo2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView_publicidad);
                String uriPath = "android.resource://ck.dev.carmendelparana/" + R.raw.velocross;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });

    }
}
