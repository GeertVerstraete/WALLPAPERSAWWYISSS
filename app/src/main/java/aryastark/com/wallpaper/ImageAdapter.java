package aryastark.com.wallpaper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by aryastark on 14/10/16.
 */

public class ImageAdapter extends BaseAdapter {


    private Context mContext;

    public Integer[] mThumbIds = {
            R.drawable.pic01, R.drawable.pic02, R.drawable.pic09, R.drawable.pic14, R.drawable.pic17
    };


    public ImageAdapter(Context c) {
        mContext = c;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 200));
        return imageView;
    }
}
