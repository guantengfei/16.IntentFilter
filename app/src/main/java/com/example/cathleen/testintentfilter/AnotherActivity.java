package com.example.cathleen.testintentfilter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button bt_second = (Button)findViewById(R.id.bt_second);
        bt_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMainIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("test://yoyo/path"));
                startActivity(toMainIntent);
            }
        });
    }
}
