package com.sabututxp.bcspreparationassistant.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sabututxp.bcspreparationassistant.R;

/**
 * Created by s on 8/14/17.
 */

public class ListItemAdapter extends ArrayAdapter<String>{

    public ListItemAdapter(Context context, String[] item) {
        super(context, R.layout.custom_listview,item);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater sabuInflat = LayoutInflater.from(getContext());
        View customListView = sabuInflat.inflate(R.layout.custom_listview, parent, false);
        String singleItem = getItem(position);

        TextView textView = (TextView) customListView.findViewById(R.id.textView);

        for(int i=0;i<=position;i++) {
            textView.setText(singleItem);
        }
        return customListView;
    }
}
