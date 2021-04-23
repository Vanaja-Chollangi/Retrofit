package com.example.firstretrofitgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickedActivity extends AppCompatActivity {
    ImagesResponse imagesResponse;
    TextView tvname;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked);
        tvname = findViewById(R.id.selectedname);
        imageView = findViewById(R.id.selectedimage);



        Intent intent =  getIntent();
        if (intent.getExtras() != null){
            imagesResponse = (ImagesResponse) intent.getSerializableExtra("data");
            tvname.setText(imagesResponse.getName());
            GlideApp.with(this).load(imagesResponse.getUrl()).into(imageView);


            String message = "name: "+imagesResponse.getName();
            Log.e("data" , message);
        }
    }
}