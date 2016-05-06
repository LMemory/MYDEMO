package hongliang.com.easy;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
//        findViewById(R.id.doid).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "FAB", Snackbar.LENGTH_LONG)
//                        .setAction("cancel", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                //这里的单击事件代表点击消除Action后的响应事件
//                            }
//                        })
//                        .show();
//
//            }
//        });


    }
}
