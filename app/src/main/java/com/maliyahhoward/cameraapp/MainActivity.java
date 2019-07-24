package com.maliyahhoward.cameraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextView;
    private Button mCameraButton;
    private ImageButton mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCameraButton = (Button) findViewById(R.id.camera_button);
        mImageView = (ImageButton) findViewById(R.id.image_view);
        mTextView = (TextView) findViewById(R.id.text_view);

        mImageView.setOnClickListener(this);
        mCameraButton.setOnClickListener(this);
        mTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }

}
