package com.example.lab_3_improved;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float valueOne, valueTwo;
    String tmpText;
    private Button _Button0;
    private Button _Button1;
    private Button _Button2;
    private Button _Button3;
    private Button _Button4;
    private Button _Button5;
    private Button _Button6;
    private Button _Button7;
    private Button _Button8;
    private Button _Button9;
    private Button _ButtonEqual;
    private Button _ButtonMultiply;
    private Button _ButtonAdd;
    private Button _ButtonAC;
    private Button _ButtonSubtract;
    private Button _ButtonDivide;
    private TextView _historyTextView;
    private TextView _calculationTextEdit;
    private Button _ButtonComa;
    private Button _ButtonPower;
    boolean addition, subtract, multiplication, division, power=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {


        _Button0 = (Button) findViewById(R.id.button0);
        _Button1 = (Button) findViewById(R.id.button1);
        _Button2 = (Button) findViewById(R.id.button2);
        _Button3 = (Button) findViewById(R.id.button3);
        _Button4 = (Button) findViewById(R.id.button4);
        _Button5 = (Button) findViewById(R.id.button5);
        _Button6 = (Button) findViewById(R.id.button6);
        _Button7 = (Button) findViewById(R.id.button7);
        _Button8 = (Button) findViewById(R.id.button8);
        _Button9 = (Button) findViewById(R.id.button9);
        _ButtonEqual = (Button) findViewById(R.id.buttonEqual);
        _ButtonMultiply = (Button) findViewById(R.id.buttonMultiply);
        _ButtonAdd = (Button) findViewById(R.id.buttonAdd);
        _ButtonAC = (Button) findViewById(R.id.buttonRemoveLast);
        _ButtonSubtract = (Button) findViewById(R.id.buttonSubstrack);
        _ButtonDivide = (Button) findViewById(R.id.buttonDivide);
        _historyTextView = (TextView) findViewById(R.id.historyTextView);
        _calculationTextEdit = (TextView) findViewById(R.id.calculationTextEdit);
         _ButtonComa = (Button) findViewById(R.id.buttonComa);
         _ButtonPower  = (Button) findViewById(R.id.buttonPower);

        //_calculationTextEdit.setText("text", TextView.BufferType.EDITABLE);
        _historyTextView.setText("");
        _Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "0");
            }
        });

        _Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "1");
            }
        });
        _Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "2");
            }
        });
        _Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "3");
            }
        });
        _Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "4");
            }
        });
        _Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "4");
            }
        });
        _Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "5");
            }
        });
        _Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "6");
            }
        });
        _Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "7");
            }
        });
        _Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + "8");
            }
        });
        _ButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valueTwo = Float.parseFloat(_calculationTextEdit.getText() + "");

                if(multiplication==true){
                    _historyTextView.append(valueOne + " * " + valueTwo + " = " + (valueOne*valueTwo));
                    _calculationTextEdit.setText(valueOne*valueTwo + "");
                    multiplication=false;
                }
                if(addition==true){
                    _historyTextView.append(valueOne + " + " + valueTwo + " = " + (valueOne+valueTwo) );
                    _calculationTextEdit.setText(valueOne+valueTwo + "");
                    addition=false;
                }

                if(division==true){
                    _historyTextView.append(valueOne + " / " + valueTwo + " = " + (valueOne/valueTwo) );
                    _calculationTextEdit.setText(valueOne/valueTwo + "");
                    division=false;
                }
                if(subtract==true){
                    _historyTextView.append(valueOne + " - " + valueTwo + " = " + (valueOne-valueTwo) );
                    _calculationTextEdit.setText(valueOne-valueTwo + "");
                    subtract=false;
                }



            }
        });
        _ButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_calculationTextEdit == null) {
                    _calculationTextEdit.setText("");
                }
                else {
                    _calculationTextEdit.setText("");
                    _historyTextView.setText("");
                }
            }
        });

        _ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_calculationTextEdit == null) {
                    _calculationTextEdit.setText("");
                }
                else {
                    valueOne = Float.parseFloat(_calculationTextEdit.getText() + "");
                    addition=true;
                    _historyTextView.append(_calculationTextEdit.getText() + "+");
                    _calculationTextEdit.setText("");
                }
            }
        });

        _ButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_calculationTextEdit == null) {
                    _calculationTextEdit.setText("");
                }
                else {
                    valueOne = Float.parseFloat(_calculationTextEdit.getText() + "");
                    multiplication=true;
                    _historyTextView.append(_calculationTextEdit.getText() + "*");
                    _calculationTextEdit.setText("");
                }
            }
        });
        _ButtonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_calculationTextEdit == null) {
                    _calculationTextEdit.setText("");
                }
                else {
                    valueOne = Float.parseFloat(_calculationTextEdit.getText() + "");
                    subtract = true;
                    _historyTextView.append(_calculationTextEdit.getText() + "-");
                    _calculationTextEdit.setText("");

                }
            }

        });
        _ButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_calculationTextEdit == null) {
                    _calculationTextEdit.setText("");
                }
                else {
                    valueOne = Float.parseFloat(_calculationTextEdit.getText() + "");
                    division     = true;
                    _historyTextView.append(_calculationTextEdit.getText() + "/");
                    _calculationTextEdit.setText("");
                }
            }
        });

       /* _ButtonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _calculationTextEdit.setText(  _calculationTextEdit.getText() + ".");
            }
        });
        _ButtonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_calculationTextEdit == null) {
                    _calculationTextEdit.setText("");
                }
                else {
                    valueOne = Float.parseFloat(_calculationTextEdit.getText() + "");
                    power = true;
                    _calculationTextEdit.setText(_calculationTextEdit.getText() + "^");
                }
            }


        });
        */






    }


}