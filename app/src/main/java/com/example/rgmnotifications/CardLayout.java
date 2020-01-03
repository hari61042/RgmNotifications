package com.example.rgmnotifications;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_layout);
        providePermissions();
    }

    public void notification(View view) {
        Intent i =new Intent(CardLayout.this,MainActivity.class);
        startActivity(i);
    }

    public void aboutus(View view) {
        Intent i =new Intent(CardLayout.this,AboutUs.class);
        startActivity(i);
    }

    public void providePermissions(){
        int status= ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if(status== PackageManager.PERMISSION_GRANTED){
        }else{
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_NOTIFICATION_POLICY,Manifest.permission.INTERNET},123);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]==PackageManager.PERMISSION_GRANTED){

        }
    }

    public void web(View view) {

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://rgmexams.co.in/login.php"));
        startActivity(i);
    }
}
