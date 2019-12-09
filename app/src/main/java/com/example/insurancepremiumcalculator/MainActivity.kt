package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){

            var age:Spinner? = spinnerAge
            var cost:Double = 60.00

            if(spinnerAge.selectedItemPosition == 0){

                result.text = "RM %.2f".format(cost).toString()

            }
            else if(spinnerAge.selectedItemPosition == 1){

                if(radioButton1.isChecked){

                    cost + 50.00
                    result.text = "RM %.2f".format(cost).toString()

                }
                else if(checkBox.isChecked){

                    cost + 100.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else if(radioButton1.isChecked && checkBox.isChecked){

                    cost + 50.00 + 100.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else{
                    cost + 10.00
                    result.text = "RM %.2f".format(cost).toString()
                }
            }

            else if(spinnerAge.selectedItemPosition == 2){

                if(radioButton1.isChecked){

                    cost + 100.00
                    result.text = "RM %.2f".format(cost).toString()

                }
                else if(checkBox.isChecked){

                    cost + 150.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else if(radioButton1.isChecked && checkBox.isChecked){

                    cost + 150.00 + 100.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else{
                    cost + 30.00
                    result.text = "RM %.2f".format(cost).toString()
                }
            }

            else if(spinnerAge.selectedItemPosition == 3){

                if(radioButton1.isChecked){

                    cost + 150.00
                    result.text = "RM %.2f".format(cost).toString()

                }
                else if(checkBox.isChecked){

                    cost + 200.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else if(radioButton1.isChecked && checkBox.isChecked){

                    cost + 150.00 + 200.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else{
                    cost + 60.00
                    result.text = "RM %.2f".format(cost).toString()
                }
            }

            else if(spinnerAge.selectedItemPosition == 4){

                if(radioButton1.isChecked){

                    cost + 200.00
                    result.text = "RM %.2f".format(cost).toString()

                }
                else if(checkBox.isChecked){

                    cost + 250.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else if(radioButton1.isChecked && checkBox.isChecked){

                    cost + 250.00 + 200.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else{
                    cost + 90.00
                    result.text = "RM %.2f".format(cost).toString()
                }
            }


            else if(spinnerAge.selectedItemPosition == 5){

                if(radioButton1.isChecked){

                    cost + 200.00
                    result.text = "RM %.2f".format(cost).toString()

                }
                else if(checkBox.isChecked){

                    cost + 300.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else if(radioButton1.isChecked && checkBox.isChecked){

                    cost + 300.00 + 200.00
                    result.text = "RM %.2f".format(cost).toString()
                }
                else{
                    cost + 90.00
                    result.text = "RM %.2f".format(cost).toString()
                }
            }

        }



    }
}
