package com.example.damian.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClear;
    TextView tvProcessor, tvResult;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnMultiply,btnBack,btnPercantage,btnSmall_bracket,btnDelete,btnMinus,btnPlus,btnDivide,btnDoth,btnEqual;
    String processor;
    Boolean isSmallBracketOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isSmallBracketOpen=false;

        btnClear = findViewById(R.id.btn_delete);
        tvProcessor= findViewById(R.id.tv_process);
        tvResult =  findViewById(R.id.tv_result) ;

        tvProcessor.setText("");
        tvResult.setText("");

        btn1= findViewById(R.id.btn_1);
        btn2= findViewById(R.id.btn_2);
        btn3= findViewById(R.id.btn_3);
        btn4= findViewById(R.id.btn_4);
        btn5= findViewById(R.id.btn_5);
        btn6= findViewById(R.id.btn_6);
        btn7= findViewById(R.id.btn_7);
        btn8= findViewById(R.id.btn_8);
        btn9= findViewById(R.id.btn_9);
        btn0= findViewById(R.id.btn_0);


        btnMultiply = findViewById(R.id.btn_multiply);
        btnMinus = findViewById(R.id.btn_minus);
        btnBack = findViewById(R.id.btn_back);
        btnPlus= findViewById(R.id.btn_plus);
        btnPercantage = findViewById(R.id.btn_percantage);
        btnSmall_bracket = findViewById(R.id.btn_small_bracket);
        btnDelete = findViewById(R.id.btn_delete);
        btnDivide= findViewById(R.id.btn_divide);
        btnDoth= findViewById(R.id.btn_doth );
        btnEqual=findViewById(R.id.btn_equal);

btnClear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        tvProcessor.setText("");
        tvResult.setText("");
    }
});
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"0");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"x");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"-");
            }
        });
        btnPercantage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"%");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"+");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"/");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+"/");
            }
        });
        btnDoth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor=tvProcessor.getText().toString();
                tvProcessor.setText(processor+".");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                if (processor.length() > 0) {
                    processor = processor.substring(0, processor.length() - 1);
                    tvProcessor.setText(processor);
                }
            }
        });
        btnSmall_bracket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (isSmallBracketOpen) {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + ")");
               isSmallBracketOpen=false;
                }
                else
                {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + "(");
                    isSmallBracketOpen=true;
                }

                }
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();

            }


        });
    }
}
