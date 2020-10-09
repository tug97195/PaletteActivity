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
                v.setText(R.string.White);
            }
            else if(((TextView) v).getText().equals("Blue")){
                v.setBackgroundColor(Color.BLUE);
                v.setText(R.string.Blue);
            }
            else if(((TextView) v).getText().equals("Cyan")){
                v.setBackgroundColor(Color.CYAN);
                v.setText(R.string.Cyan);
            }
            else if(((TextView) v).getText().equals("DKGray")){
                v.setTextColor(Color.WHITE);
                v.setBackgroundColor(Color.DKGRAY);
                v.setText(R.string.DKGray);
            }
            else if(((TextView) v).getText().equals("Gray")){
                v.setBackgroundColor(Color.GRAY);
                v.setText(R.string.Gray);
            }
            else if(((TextView) v).getText().equals("LTGray")){
                v.setBackgroundColor(Color.LTGRAY);
                v.setText(R.string.LTGray);
            }
            else if(((TextView) v).getText().equals("Magenta")){
                v.setBackgroundColor(Color.MAGENTA);
                v.setText(R.string.Magenta);
            }
            else if(((TextView) v).getText().equals("Green")){
                v.setBackgroundColor(Color.GREEN);
                v.setText(R.string.Green);
            }
            else if(((TextView) v).getText().equals("Red")){
                v.setBackgroundColor(Color.RED);
                v.setText(R.string.Red);
            }
            else if(((TextView) v).getText().equals("Yellow")){
                v.setBackgroundColor(Color.YELLOW);
                v.setText(R.string.Yellow);
            }
            else if(((TextView) v).getText().equals("Black")){
                v.setTextColor(Color.WHITE);
                v.setBackgroundColor(Color.BLACK);
                v.setText(R.string.Black);
            }

        } catch(Exception e){
            System.out.println("ERROR: " + e);
        }


        return v;
    }
}
