package th.ac.su.ict.apichat.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Dpresult = findViewById<TextView>(R.id.Display)
        var edtN1 = findViewById<EditText>(R.id.edtN1)
        var edtN2 = findViewById<EditText>(R.id.edtN2)
        var checkbox = findViewById<CheckBox>(R.id.checkbox)
        var btCalculate = findViewById<Button>(R.id.BtCalculate)

        btCalculate.setOnClickListener(){
            var num1 =  edtN1.text.toString().toFloat()
            var num2 =  edtN2.text.toString().toFloat()
            var discount:Float = 0F
            var result:Float = 0F


            discount = (num2/100)-1.00.toFloat()
            result = num1 * discount*-1


            if(checkbox.isChecked){
                discount = (num2/100)-1.00.toFloat()
                result = (num1*107)/100 * discount*-1


            }//end if
            Dpresult.setText(result.toString())
        }//end fune btCalculate
    }
}
