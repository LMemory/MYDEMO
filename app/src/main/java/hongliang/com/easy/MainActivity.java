package hongliang.com.easy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout vertcalLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        System.out.println("List<String>转化示例开始----------");
//        List<String> list = new ArrayList<String>();
//        list.add("fastjson1");
//        list.add("fastjson2");
//        list.add("fastjson3");
//        String jsonString = JSON.toJSONString(list);
//        System.out.println("json字符串:" + jsonString);
//
//        //解析json字符串
//        List<String> list2 = JSON.parseObject(jsonString, new TypeReference<List<String>>() {
//        });
//        System.out.println(list2.get(0) + "::" + list2.get(1) + "::" + list2.get(2));
//        System.out.println("List<String>转化示例结束----------");


        vertcalLayout1 = (LinearLayout) findViewById(R.id.vertcalLayout1);
        Button b = new Button(this);
        b.setText("btn1");
        b.setOnClickListener(this);
        b.setPadding(10, 10, 10, 10);
        vertcalLayout1.addView(b);
    }

    @Override
    public void onClick(View v) {
        if (v == vertcalLayout1.getChildAt(0)) {

        }
    }
}
