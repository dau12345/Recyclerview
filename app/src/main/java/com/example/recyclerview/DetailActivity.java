package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView tv_DtTitle, tv_DtDescription;
    ImageView iv_DtImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv_DtDescription = findViewById(R.id.tv_DtDescription);
        tv_DtTitle = findViewById(R.id.tv_DtTitle);
        iv_DtImage = findViewById(R.id.iv_DtImage);

        Intent intent = getIntent();
        Photo photo = (Photo) intent.getSerializableExtra("photo");

        tv_DtTitle.setText(photo.getTitle_photo());
        tv_DtDescription.setText(photo.getDescription_photo());
        Picasso.get().load(photo.getSource_photo()).into(iv_DtImage);
    }
}