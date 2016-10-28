package com.example.cathleen.testintentfilter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_first = (Button)findViewById(R.id.bt_first);
        bt_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toAnotherIntent = new Intent();
                toAnotherIntent.setAction("toAnotherIntent");
                startActivity(toAnotherIntent);
            }
        });
        Button bt_baidu = (Button)findViewById(R.id.bt_baidu);
        bt_baidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toBaiduIntent = new Intent(Intent.ACTION_VIEW);
                toBaiduIntent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(toBaiduIntent);
            }
        });
        Button bt_location = (Button)findViewById(R.id.bt_location);
        bt_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent locationIntent = new Intent(Intent.ACTION_VIEW);
                locationIntent.setData(Uri.parse("geo:39.99895296,116.32633209"));
                startActivity(locationIntent);
            }
        });
    }
}

