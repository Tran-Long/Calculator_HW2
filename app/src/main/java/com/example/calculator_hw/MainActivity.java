package com.example.calculator_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    TextView textView1;
    EditText editText;
    int num_a, ans;
    boolean begin_flag, equal_flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        textView1 = findViewById(R.id.text_view1);
        findViewById(R.id.plus).setOnClickListener(this);
        findViewById(R.id.minus).setOnClickListener(this);
        findViewById(R.id.multiply).setOnClickListener(this);
        findViewById(R.id.divide).setOnClickListener(this);
        findViewById(R.id.num_0).setOnClickListener(this);
        findViewById(R.id.num_1).setOnClickListener(this);
        findViewById(R.id.num_2).setOnClickListener(this);
        findViewById(R.id.num_3).setOnClickListener(this);
        findViewById(R.id.num_4).setOnClickListener(this);
        findViewById(R.id.num_5).setOnClickListener(this);
        findViewById(R.id.num_6).setOnClickListener(this);
        findViewById(R.id.num_7).setOnClickListener(this);
        findViewById(R.id.num_8).setOnClickListener(this);
        findViewById(R.id.num_9).setOnClickListener(this);
        findViewById(R.id.equal).setOnClickListener(this);
        findViewById(R.id.change_sign).setOnClickListener(this);
        findViewById(R.id.CE).setOnClickListener(this);
        findViewById(R.id.C).setOnClickListener(this);
        findViewById(R.id.BS).setOnClickListener(this);
        ans = 0;
        num_a = 0;
        begin_flag = true;
        equal_flag = false;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.num_0){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 0;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_1){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 1;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_2){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 2;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_3){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 3;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_4){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 4;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_5){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 5;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_6){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 6;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_7){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 7;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_8){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 8;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.num_9){
            if(equal_flag == true){
                begin_flag = true;
                equal_flag = false;
            }
            num_a = num_a * 10 + 9;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.CE){
            num_a = 0;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.C){
            num_a = 0;
            ans = 0;
            textView.setText("0");
            textView1.setText("");
            begin_flag = true;
        }
        if(id == R.id.BS){
            num_a = num_a/10;
            textView.setText(String.valueOf(num_a));
        }
        if(id == R.id.plus){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = textView1.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            textView.setText("");
            textView1.setText(String.valueOf(ans) + " +");
        }
        if(id == R.id.minus){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = textView1.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            textView.setText("");
            textView1.setText(String.valueOf(ans) + " -");
        }
        if(id == R.id.multiply){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = textView1.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            textView.setText("");
            textView1.setText(String.valueOf(ans) + " x");
        }
        if(id == R.id.divide){
            if(begin_flag == true){
                ans = num_a;
                begin_flag = false;
            }else if(equal_flag == true){
                num_a = ans;
                equal_flag = false;
            }else{
                String temp = textView1.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            num_a = 0;
            textView.setText("");
            textView1.setText(String.valueOf(ans) + " :");
        }
        if(id == R.id.equal){
            if(num_a != 0){
                String temp = textView1.getText().toString();
                if(temp.charAt(temp.length()-1) == '+'){
                    ans+=num_a;
                }else if(temp.charAt(temp.length()-1) == '-'){
                    ans-=num_a;
                }else if(temp.charAt(temp.length()-1) == 'x'){
                    ans*=num_a;
                }else if(temp.charAt(temp.length()-1) == ':'){
                    ans/=num_a;
                }
            }
            textView1.setText("");
            textView.setText(String.valueOf(ans));
            num_a = 0;
            equal_flag = true;
        }



    }
}