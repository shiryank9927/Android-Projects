package com.example.ssc5q5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {

    private Context mContext;

    public  int[] imageArray = {

    R.drawable.image1, R.drawable.image2,
    R.drawable.image3, R.drawable.image4,
    R.drawable.image5, R.drawable.image6,
    R.drawable.image7, R.drawable.image8,
    R.drawable.image9, R.drawable.image10,
    R.drawable.image11, R.drawable.image12
    };

    public imageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridLayout.LayoutParams());
        return imageView;
    }
}
