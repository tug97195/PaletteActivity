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

    public final String[] colors = {
            "White",
            "Blue",
            "Cyan",
            "DKGray",
            "Gray",
            "LTGray",
            "Magenta",
            "Green",
            "Red",
            "Yellow",
            "Black"
    };

    public CustomAdapter(Context mContext){
        //Inits with colors already defined
        this.mContext = mContext;
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
        v.setText(colors[position]);
        try{
            if(((TextView) v).getText().equals("White")) {
                v.setBackgroundColor(Color.WHITE);
            }
            else if(((TextView) v).getText().equals("Blue")){
                v.setBackgroundColor(Color.BLUE);
            }
            else if(((TextView) v).getText().equals("Cyan")){
                v.setBackgroundColor(Color.CYAN);
            }
            else if(((TextView) v).getText().equals("DKGray")){
                v.setTextColor(Color.WHITE);
                v.setBackgroundColor(Color.DKGRAY);
            }
            else if(((TextView) v).getText().equals("Gray")){
                v.setBackgroundColor(Color.GRAY);
            }
            else if(((TextView) v).getText().equals("LTGray")){
                v.setBackgroundColor(Color.LTGRAY);
            }
            else if(((TextView) v).getText().equals("Magenta")){
                v.setBackgroundColor(Color.MAGENTA);
            }
            else if(((TextView) v).getText().equals("Green")){
                v.setBackgroundColor(Color.GREEN);
            }
            else if(((TextView) v).getText().equals("Red")){
                v.setBackgroundColor(Color.RED);
            }
            else if(((TextView) v).getText().equals("Yellow")){
                v.setBackgroundColor(Color.YELLOW);
            }
            else if(((TextView) v).getText().equals("Black")){
                v.setTextColor(Color.WHITE);
                v.setBackgroundColor(Color.BLACK);
            }

        } catch(Exception e){
            System.out.println("ERROR123: " + e);
        }


        return v;
    }
}
