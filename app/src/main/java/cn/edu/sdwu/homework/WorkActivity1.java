package cn.edu.sdwu.homework;

import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class WorkActivity1 extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new myclass());


        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);



        //匿名内部类
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                /*获取输入框里的值*/
                EditText editText1 = findViewById(R.id.num1);
                String num1 = editText1.getText().toString();

                EditText editText2 = findViewById(R.id.num2);
                String num2 = editText2.getText().toString();

                /*转化成 数值类型*/
                int num_1 = Integer.parseInt(num1);
                int num_2 = Integer.parseInt(num2);

                final int count = num_1+num_2;

                final TextView textView = findViewById(R.id.text);
                textView.setText(count+"");
            }
        });



    }


    //直接实现 重写的 onClick()
    @Override
    public void onClick(View v) {
        /*获取输入框里的值*/
        EditText editText1 = findViewById(R.id.num1);
        String num1 = editText1.getText().toString();

        EditText editText2 = findViewById(R.id.num2);
        String num2 = editText2.getText().toString();

        /*转化成 数值类型*/
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);

        final int count = num_1*num_2;

        final TextView textView = findViewById(R.id.text);
        textView.setText(count+"");
    }

    //XML 直接指定
    public void sendxml(View view){
        /*获取输入框里的值*/
        EditText editText1 = findViewById(R.id.num1);
        String num1 = editText1.getText().toString();

        EditText editText2 = findViewById(R.id.num2);
        String num2 = editText2.getText().toString();

        /*转化成 数值类型*/
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);

        final int count = num_1/num_2;

        final TextView textView = findViewById(R.id.text);
        textView.setText(count+"");
    }


    //定义一个内部类
    class myclass implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            /*获取输入框里的值*/
            EditText editText1 = findViewById(R.id.num1);
            String num1 = editText1.getText().toString();

            EditText editText2 = findViewById(R.id.num2);
            String num2 = editText2.getText().toString();

            /*转化成 数值类型*/
            int num_1 = Integer.parseInt(num1);
            int num_2 = Integer.parseInt(num2);

            final int count = num_1-num_2;

            final TextView textView = findViewById(R.id.text);
            textView.setText(count+"");
        }
    }
}
