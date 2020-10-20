package edu.temple.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {

    public final Context mContext;
    public final String[] colors;

    public CustomAdapter(Context mContext, String[] colors_in){
        //Inits with colors already defined
        this.mContext = mContext;
        this.colors = colors_in;
    }


    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public String getName(int position){
      return colors[position];
    };

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView v = new TextView(mContext);
        //Get the text value then set background accordingly
        if (position == 0) {
            v.setText(mContext.getResources().getString(R.string.White));
        }
        else if (position == 1) {
            v.setText(mContext.getResources().getString(R.string.Black));
            v.setTextColor(Color.WHITE);
        }
        else if (position == 2) {
            v.setText(mContext.getResources().getString(R.string.Cyan));
        }
        else if (position == 3) {
            v.setText(mContext.getResources().getString(R.string.DKGray));
            v.setTextColor(Color.WHITE);
        }
        else if (position == 4) {
            v.setText(mContext.getResources().getString(R.string.Gray));
        }
        else if (position == 5) {
            v.setText(mContext.getResources().getString(R.string.LTGray));
        }
        else if (position == 6) {
            v.setText(mContext.getResources().getString(R.string.Magenta));
        }
        else if (position == 7) {
            v.setText(mContext.getResources().getString(R.string.Green));
        }
        else if (position == 8) {
            v.setText(mContext.getResources().getString(R.string.Red));
        }
        else if (position == 9) {
            v.setText(mContext.getResources().getString(R.string.Yellow));
        }
        else if (position == 10) {
            v.setText(mContext.getResources().getString(R.string.Blue));
        }
        v.setBackgroundColor(Color.parseColor(getItem(position).toString()));

        return v;
    }
}
