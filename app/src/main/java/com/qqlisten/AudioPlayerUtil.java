package com.qqlisten;

import android.media.MediaPlayer;

/**
 * Created by xiong on 2018/3/26.
 */

public class AudioPlayerUtil {
    private static final String TAG = "AudioRecordTest";
    private MediaPlayer mPlayer;

    public AudioPlayerUtil() {
    }





    public void start(String mFileName, MediaPlayer.OnCompletionListener listener) {
        if(this.mPlayer == null) {
            this.mPlayer = new MediaPlayer();
        } else {
            this.mPlayer.reset();
        }

        try {
            this.mPlayer.setDataSource(mFileName);
            this.mPlayer.prepare();
            this.mPlayer.start();
            if(listener != null) {
                this.mPlayer.setOnCompletionListener(listener);
            }
        } catch (Exception var4) {
        }

    }

    public void stop() {
        if(this.mPlayer != null) {
            this.mPlayer.stop();
            this.mPlayer.release();
            this.mPlayer = null;
        }

    }
}
