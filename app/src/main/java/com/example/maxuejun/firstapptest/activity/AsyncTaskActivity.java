package com.example.maxuejun.firstapptest.activity;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.maxuejun.firstapptest.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AsyncTaskActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.asyncTaskProgress)
    ProgressBar mProgressBar;
    @Bind(R.id.asyncTaskImage)
    ImageView mImageView;
    @Bind(R.id.asyncTaskLoad)
    Button btLoadImage;
    @Bind(R.id.asyncTaskAbort)
    Button btAbortImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btLoadImage.setOnClickListener(this);
        btAbortImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.asyncTaskLoad:

                break;
            case R.id.asyncTaskAbort:
                break;

        }
    }

    private class ImageLoader extends AsyncTask<String, Integer, Bitmap> {

        @Override
        protected void onPreExecute() {
            //初始化
            super.onPreExecute();
            btLoadImage.setEnabled(false);
            btAbortImage.setEnabled(true);
            mProgressBar.setVisibility(View.VISIBLE);
            mImageView.setImageResource(R.mipmap.ic_launcher);
        }

        @Override
        protected Bitmap doInBackground(String... params) {
            //耗时操作,最核心的操作
            try {

            }catch (Exception e){
                e.printStackTrace();
            }finally {

            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
        }

        @Override
        protected void onCancelled() {
            //中断
            super.onCancelled();
        }
    }
}
