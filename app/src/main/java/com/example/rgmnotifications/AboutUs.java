package com.example.rgmnotifications;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void call(View view) {
        Intent i = new Intent();
        i.setData(Uri.parse("tel:"+"9515000020"));
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i);
    }
}
