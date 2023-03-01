package com.example.recyclerview;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private WordListAdapter mWordListAdapter;
    private int id;
    private TextView tv_Title, tv_Description;
    private ImageView iv_Image;
    private Context mainActivity;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }
    public TextView getTv_Title() {
        return tv_Title;
    }

    public void setTv_Title(TextView tv_Title) {
        this.tv_Title = tv_Title;
    }

    public TextView getTv_Description() {
        return tv_Description;
    }

    public void setTv_Description(TextView tv_Description) {
        this.tv_Description = tv_Description;
    }

    public ImageView getIv_Image() {
        return iv_Image;
    }

    public void setIv_Image(ImageView iv_Image) {
        this.iv_Image = iv_Image;
    }

    public ViewHolder(View itemView, WordListAdapter wordListAdapter, Context mainActivity) {
        super(itemView);

        tv_Title = itemView.findViewById(R.id.tv_Title);
        tv_Description = itemView.findViewById(R.id.tv_Description);
        iv_Image = itemView.findViewById(R.id.iv_Image);

        this.mainActivity = mainActivity;
        this.mWordListAdapter = wordListAdapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(mainActivity, DetailActivity.class);
        Photo mCurrent = PhotoData.getPhotoFromId(id);
        i.putExtra("photo", (Serializable) mCurrent);
        mainActivity.startActivity(i);
    }
}
