package com.sabututxp.bcspreparationassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubjectListActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);

        String[] mySubs = new String[] {"বাংলা সাহিত্য","বাংলা ব্যকরণ","ইংরেজী গ্রামার","ইংরেজী সাহিত্য","সাধারণ জ্ঞান","বাংলাদেশ বিষয়াদি","আন্তর্জাতিক বিষয়াদি","ভৌগোলক বিষয়াদি"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mySubs);
        listView = (ListView) findViewById(R.id.subject_listView);
        listView.setAdapter(adapter);


    }
}
