package edu.qc.seclass.tipcalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Math.*;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = (Button) findViewById(R.id.buttonCompute);
        EditText checkAmountET = findViewById(R.id.checkAmountValue);
        EditText partySizeET = findViewById(R.id.partySizeValue);
        EditText tipFor15PercentET = findViewById(R.id.fifteenPercentTipValue);
        EditText tipFor20PercentET = findViewById(R.id.twentyPercentTipValue);
        EditText tipFor25PercentET = findViewById(R.id.twentyfivePercentTipValue);
        EditText totalFor15PercentET = findViewById(R.id.fifteenPercentTotalValue);
        EditText totalFor20PercentET = findViewById(R.id.twentyPercentTotalValue);
        EditText totalFor25PercentET = findViewById(R.id.twentyfivePercentTotalValue);

        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                String cAmount = checkAmountET.getText().toString();

                String pSize = partySizeET.getText().toString();
                if (cAmount.isEmpty()) {
                    messageDisplay();
                    return;
                }
                if (pSize.isEmpty()) {
                    messageDisplay();
                    return;
                }

                int cAmountInt = Integer.parseInt(cAmount);
                int pSizeInt = Integer.parseInt(pSize);
                if (pSizeInt==0) {
                    messageDisplay();
                    return;
                }



                int eachPersonPay = (int) cAmountInt / pSizeInt;
                double tipFor15Percent = (eachPersonPay * .15);
                double tipFor20Percent = (eachPersonPay * .20);
                double tipFor25Percent = (eachPersonPay * .25);

                tipFor15Percent = round(tipFor15Percent);
                String stringTip15 = new Integer((int) tipFor15Percent).toString();
                tipFor15PercentET.setText(stringTip15);

                tipFor20Percent = round(tipFor20Percent);
                String stringTip20 = new Integer((int) tipFor20Percent).toString();
                tipFor20PercentET.setText(stringTip20);

                tipFor25Percent = round(tipFor25Percent);
                String stringTip25 = new Integer((int) tipFor25Percent).toString();
                tipFor25PercentET.setText(stringTip25);

                double totalFor15Percent = (eachPersonPay + tipFor15Percent);
                double totalFor20Percent = (eachPersonPay + tipFor20Percent);
                double totalFor25Percent = (eachPersonPay + tipFor25Percent);

                String stringTotal15 = new Integer((int) totalFor15Percent).toString();
                totalFor15PercentET.setText(stringTotal15);
                String stringTotal20 = new Integer((int) totalFor20Percent).toString();
                totalFor20PercentET.setText(stringTotal20);

                String stringTotal25 = new Integer((int) totalFor25Percent).toString();
                totalFor25PercentET.setText(stringTotal25);


            }


        });
    }

    public void messageDisplay() {
        Toast.makeText(MainActivity.this, "You enter invalid value", Toast.LENGTH_SHORT).show();


    }


}
