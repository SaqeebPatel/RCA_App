package com.empire.researchcomputeracademy.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

import com.empire.researchcomputeracademy.R;

public class ppsdDialog extends Dialog implements View.OnClickListener {

    public Activity a;
    public Dialog c;
    public ppsdDialog(Activity c)
    {
        super(c);
        this.a = c;
    }

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ppsd);
        videoView = (VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView.start();
            }
        });
        String path = "android.resource://" + getContext().getPackageName() + "/" + R.raw.ppsdvideo;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }

    @Override
    public void onClick(View v)
    {

    }





}
