package app.alignsolution.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aligndev on 21-May-17.
 */

public class MyAdapter extends BaseAdapter{

            // เป็นการส่งข้อมูลระหว่าง Opject and Opject
    private Context context;
    private  String[] titleStrings , DetailStrings;
    private  int[] ints ;
    private TextView  titleTextView,DetailTextView;
    private ImageView imageView;

           // Create Constructor Alt+Insert
    public MyAdapter(Context context,
                     String[] titleStrings,
                     String[] detailStrings,
                     int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        DetailStrings = detailStrings;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //ขออนุญาติให้สร้าง เลย์เอาทเสมือน
        //ทำการ cash เพื่อ ให้แปลงค่า ใน คลาส
        //inflate ดึงค่า layout มาใช้งาน
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_layout,parent,false);

        // initial  View
        titleTextView = (TextView) view.findViewById(R.id.txtTitle);
        DetailTextView = (TextView) view.findViewById(R.id.txtDetail);
        imageView = (ImageView) view.findViewById(R.id.imvIcon);

        //Show View เอาวิวไปแสดงในตัวจำรอง
        titleTextView.setText(titleStrings[position]);
       // function  ตัดคำในสั้นเพื่อเเสดงให้สวย
        String strShortDetail = DetailStrings[position].substring(0,18) +"...";
        DetailTextView.setText(strShortDetail);
        imageView.setImageResource(ints[position]);
        return view;
    }
} // class main
