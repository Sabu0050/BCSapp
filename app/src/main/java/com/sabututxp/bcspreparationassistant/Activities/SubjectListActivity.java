package com.sabututxp.bcspreparationassistant.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sabututxp.bcspreparationassistant.Adapters.ListItemAdapter;
import com.sabututxp.bcspreparationassistant.Database.DatabaseHelper;
import com.sabututxp.bcspreparationassistant.Model.SubjectsCatagory;
import com.sabututxp.bcspreparationassistant.R;

import java.util.ArrayList;

public class SubjectListActivity extends AppCompatActivity {

    private ListView listView;
    private AlphaAnimation buttonClick = new AlphaAnimation(2F, 0.5F);
    private ArrayList<SubjectsCatagory> mSubjectsList;
    private DatabaseHelper mDatabase;
    private  ListItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);


        mDatabase = new DatabaseHelper(this);
        mSubjectsList = (ArrayList<SubjectsCatagory>) mDatabase.getAllCategoryList();

        //String[] mySubs = new String[] {"বাংলা","ইংরেজী","গণিত","সাধারণ বিজ্ঞান","বাংলাদেশ বিষয়াদি","আন্তর্জাতিক বিষয়াদি","ভৌগোলক বিষয়াদি","শব্দক্ষেপন"};
        adapter = new ListItemAdapter(getApplicationContext(),R.layout.custom_listview,mSubjectsList);
        listView = (ListView) findViewById(R.id.subject_listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setAnimation(buttonClick);
                
            }
        });


    }
}
