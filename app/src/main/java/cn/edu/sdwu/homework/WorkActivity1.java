package cn.edu.sdwu.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class WorkActivity1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);

        //加法，使用内部匿名类实现
        Button add = (Button) findViewById(R.id.jia);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input1 = (EditText) findViewById(R.id.num1);
                EditText input2 = (EditText) findViewById(R.id.num2);
                TextView textView = (TextView) findViewById(R.id.text1);
                String inputText1 = input1.getText().toString();
                String inputText2 = input2.getText().toString();
                int num1 = Integer.valueOf(inputText1).intValue();
                int num2 = Integer.valueOf(inputText2).intValue();
                String tv = String.valueOf(num1 + num2);
                textView.setText(tv);
            }
        });
        //减法，使用内部类实现
        Button subtract = (Button) findViewById(R.id.jian);
        subtract.setOnClickListener(new jianneibu());

        //乘法
        Button multiply = (Button) findViewById(R.id.cheng);
        multiply.setOnClickListener(this);
    }
    //减法的内部类
    class jianneibu implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            EditText input1=(EditText) findViewById(R.id.num1);
            EditText input2=(EditText) findViewById(R.id.num2);
            TextView textView=(TextView)findViewById(R.id.text1);
            String inputText1=input1.getText().toString();
            String inputText2=input2.getText().toString();
            int num1=Integer.valueOf(inputText1).intValue();
            int num2=Integer.valueOf(inputText2).intValue();
            String tv=String.valueOf(num1-num2);
            textView.setText(tv);
        }
    }
    //除法，xml调用
    public void division(View view){
        EditText input1=(EditText) findViewById(R.id.num1);
        EditText input2=(EditText) findViewById(R.id.num2);
        TextView textView=(TextView)findViewById(R.id.text1);
        String inputText1=input1.getText().toString();
        String inputText2=input2.getText().toString();
        int num1=Integer.valueOf(inputText1).intValue();
        int num2=Integer.valueOf(inputText2).intValue();
        String tv=String.valueOf(num1/num2);
        textView.setText(tv);
    }
    public void onClick(View view){
        EditText input1=(EditText) findViewById(R.id.num1);
        EditText input2=(EditText) findViewById(R.id.num2);
        TextView textView=(TextView)findViewById(R.id.text1);
        String inputText1=input1.getText().toString();
        String inputText2=input2.getText().toString();
        int num1=Integer.valueOf(inputText1).intValue();
        int num2=Integer.valueOf(inputText2).intValue();
        String tv=String.valueOf(num1*num2);
        textView.setText(tv);
    }
}
