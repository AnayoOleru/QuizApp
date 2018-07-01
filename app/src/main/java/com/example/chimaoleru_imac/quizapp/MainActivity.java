package com.example.chimaoleru_imac.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import android.widget.Toast;

import com.example.chimaoleru_imac.quizapp.R;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton question1A, question1B, question1C, question2D, question2E, question2F, question5M, question5N, question5O, question6P, question6Q, question6R;
    CheckBox question3G, question3H, question3I, question4J, question4K, question4L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question1A = (RadioButton) findViewById(R.id.question1A);
        question1B = (RadioButton) findViewById(R.id.question1B);
        question1C = (RadioButton) findViewById(R.id.question1C);
        question2D = (RadioButton) findViewById(R.id.question2D);
        question2E = (RadioButton) findViewById(R.id.question2E);
        question2F = (RadioButton) findViewById(R.id.question2F);
        question6P = (RadioButton) findViewById(R.id.question6P);
        question6Q = (RadioButton) findViewById(R.id.question6Q);
        question6R = (RadioButton) findViewById(R.id.question6R);
        question5M = (RadioButton) findViewById(R.id.question5M);
        question5N = (RadioButton) findViewById(R.id.question5N);
        question5O = (RadioButton) findViewById(R.id.question5O);
        question3G = (CheckBox) findViewById(R.id.question3G);
        question3H = (CheckBox) findViewById(R.id.question3H);
        question3I = (CheckBox) findViewById(R.id.question3I);
        question4J = (CheckBox) findViewById(R.id.question4J);
        question4K = (CheckBox) findViewById(R.id.question4K);
        question4L = (CheckBox) findViewById(R.id.question4L);


    }

    public void btnClick(View v) {

        if (question1A.isChecked() && question2F.isChecked() && question3G.isChecked() && question3H.isChecked() && question4J.isChecked() && question4K.isChecked() && question5M.isChecked() && question6R.isChecked()) {
            Toast.makeText(this, "Excellent performance!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, " Your score is 60/60", Toast.LENGTH_SHORT).show();

        } else if (question1B.isChecked() || question1C.isChecked() || question2D.isChecked() || question2E.isChecked() || question3I.isChecked() || question4L.isChecked() || question5N.isChecked() && question5O.isChecked() || question6P.isChecked() && question6Q.isChecked()) {

            Toast.makeText(this, "Almost there!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Your answers are wrong.", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Please go back and try again", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please attempt all questions", Toast.LENGTH_SHORT).show();


        }

    }
}