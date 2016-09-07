package com.example.maxuejun.firstapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.maxuejun.firstapptest.activity.AsyncTaskActivity;
import com.example.maxuejun.firstapptest.activity.SlidingMainActivity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btAsyncTask:
                clickAsyncTask();
                break;
            case R.id.btSlidingFlagment:
                clickSlidingFlagment();
                break;
            case R.id.btLiteHttp:
                clickLiteHttp();
                break;
            case R.id.btLiteOrm:
                clickLiteOrm();
                break;
            case R.id.btLiteComm:
                clickLiteCommon();
                break;
        }
    }

    private void clickAsyncTask(){
        Intent intent = new Intent(MainActivity.this, AsyncTaskActivity.class);
        startActivity(intent);
    }

    private void clickSlidingFlagment(){
        Intent intent = new Intent(MainActivity.this, SlidingMainActivity.class);
        startActivity(intent);
    }

    /**
     * 使用LiteHttp 开源库的网络请求实例
     */
    private void clickLiteHttp(){

    }

    /**
     * 使用LiteOrm 开源库进行数据库的操作
     */
    private void clickLiteOrm(){

    }

    /**
     *LiteCommon 开源库
     */
    private void clickLiteCommon(){

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
