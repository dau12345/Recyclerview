package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.recyclerview);
        WordListAdapter mWordListAdapter = new WordListAdapter(this, PhotoData.generatePhotoData());

        mRecyclerView.setAdapter(mWordListAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}