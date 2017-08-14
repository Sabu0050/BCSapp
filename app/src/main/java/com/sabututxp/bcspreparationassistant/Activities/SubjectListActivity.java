package com.sabututxp.bcspreparationassistant.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sabututxp.bcspreparationassistant.Adapters.ListItemAdapter;
import com.sabututxp.bcspreparationassistant.R;

public class SubjectListActivity extends AppCompatActivity {

    ListView listView;
    private AlphaAnimation buttonClick = new AlphaAnimation(2F, 0.5F);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);

        String[] mySubs = new String[] {"বাংলা","ইংরেজী","গণিত","সাধারণ বিজ্ঞান","বাংলাদেশ বিষয়াদি","আন্তর্জাতিক বিষয়াদি","ভৌগোলক বিষয়াদি","শব্দক্ষেপন"};
        ArrayAdapter<String> adapter = new ListItemAdapter(this,mySubs);
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
