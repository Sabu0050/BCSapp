package com.sabututxp.bcspreparationassistant.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sabututxp.bcspreparationassistant.Model.SubjectsCatagory;
import com.sabututxp.bcspreparationassistant.R;

import java.util.ArrayList;

/**
 * Created by s on 8/14/17.
 */

public class ListItemAdapter extends BaseAdapter{

    private Context mContext;
    private int textViewResourceId;
    private ArrayList<SubjectsCatagory> mSubjectsCatagoryList;

    public ListItemAdapter(Context mContext, int textViewResourceId, ArrayList<SubjectsCatagory> mSubjectsCatagoryList) {
        this.mContext = mContext;
        this.textViewResourceId = textViewResourceId;
        this.mSubjectsCatagoryList = mSubjectsCatagoryList;
    }

    @Override
    public int getCount() {
        return mSubjectsCatagoryList.size();
    }

    @Override
    public Object getItem(int i) {
        return mSubjectsCatagoryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mSubjectsCatagoryList.get(i).getId();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater) mContext
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        convertView = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_listview, null);

            TextView textView = (TextView) convertView.findViewById(R.id.textView);

            SubjectsCatagory subjectsCatagory = mSubjectsCatagoryList.get(position);

            textView.setText(subjectsCatagory.getTitle());
        }

        return convertView;
    }
}
