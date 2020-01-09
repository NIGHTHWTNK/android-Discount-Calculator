package th.ac.su.ict.apichat.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = findViewById<TextView>(R.id.Display)
        var edtN1 = findViewById<EditText>(R.id.edtN1)
        var edtN2 = findViewById<EditText>(R.id.edtN2)
    }
}
