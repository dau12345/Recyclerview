package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class WordListAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Photo> photos;
    private final LayoutInflater mInfalter;
    private Context context;

    public WordListAdapter(Context context, ArrayList<Photo> photos) {
        mInfalter = LayoutInflater.from(context);
        this.photos = photos;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View mItemView = mInfalter.inflate(R.layout.text_row_item, viewGroup, false);
        return new ViewHolder(mItemView, this, context);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Photo mCurrent = photos.get(position);
        viewHolder.setId(mCurrent.getId());
        viewHolder.getTv_Title().setText(mCurrent.getTitle_photo());
        Picasso.get().load(mCurrent.getSource_photo()).into(viewHolder.getIv_Image());

        //Check if details contain more than 10 words
        ArrayList<String> strSplit = new ArrayList<>();
        strSplit.addAll(Arrays.asList(mCurrent.getDescription_photo().split(" ")));
        if (strSplit.size() <= 10) {
            viewHolder.getTv_Description().setText(mCurrent.getDescription_photo());
        } else {
            strSplit.subList(10, strSplit.size()).clear();
            String strJoin = String.join(" ", strSplit);
            viewHolder.getTv_Description().setText(strJoin + "...");
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return photos.size();
    }
}
