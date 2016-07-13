package me.wangyuwei.elemeshopping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import me.wangyuwei.shoppoing.ShoppingView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShoppingView mSv1 = (ShoppingView) findViewById(R.id.sv_1);
        mSv1.setOnShoppingClickListener(new ShoppingView.ShoppingClickListener() {
            @Override
            public void onAddClick(int num) {
                Log.d("@=>", "add.......num=> " + num);
            }

            @Override
            public void onMinusClick(int num) {
                Log.d("@=>", "minus.......num=> " + num);
            }
        });

        ShoppingView mSv2 = (ShoppingView) findViewById(R.id.sv_2);
        mSv2.setTextNum(1);

    }
}
