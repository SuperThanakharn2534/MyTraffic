package app.alignsolution.mytraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private MyData myData;
    private String[] titleStrings, DetailStrings;
    private int[] ints;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get value for MyData
        getVuelueMyData();
       // create Listview
        CreateListView();
    }// Method main

    private void CreateListView() {
    // Inticil View ทำการผูกกับ Activity Listview
        listView = (ListView) findViewById(R.id.livTraffic);
        MyAdapter myAdapter = new MyAdapter(this,titleStrings,DetailStrings,ints);
        listView.setAdapter(myAdapter);listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ทำการ get ค่าส่งไปหาหน้า DetailActivity
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("Title",titleStrings[position]);
                intent.putExtra("Detail",DetailStrings[position]);
                intent.putExtra("Image",ints[position]);
                startActivity(intent);
            }
        });
    }

    private void getVuelueMyData() {
        myData = new MyData();
        titleStrings = myData.getTitleStrings();
        DetailStrings = myData.getDetailStrings();
        ints =myData.getInts();

        //Check Value
        String tag = "21MayV1";
        String tag2 = "21MayV2";
        for (int i=0;i<titleStrings.length;i++){
            Log.d(tag,"titleString("+ i +") ==> " + titleStrings[i]);
            Log.d(tag2,"DetailString("+ i +") ==> " + DetailStrings[i]);
        }

    }
}// Mail Class
