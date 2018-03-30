package com.qqlisten;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by xiong on 2018/3/26.
 */

public class SecondActivity extends AppCompatActivity {


    @BindView(R.id.im)
    PhotoView im;
    PhotoViewAttacher mAttacher;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ButterKnife.bind(this);
        mAttacher = new PhotoViewAttacher(im);
        im.setImageResource(R.drawable.guide_a);
        mAttacher.update();

    }
}
