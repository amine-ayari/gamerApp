package tn.esprit.gamerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
    }

    var et_email = findViewById<EditText>(R.id.email)
    var et_password = findViewById(R.id.password) as EditText
    var bt_sign_in = findViewById(R.id.Butt_sign_in)as Button
    var have_acc = findViewById(R.id.have_account)as TextView
    lateinit var binding: MainActivitytyOnsingup








Butt_sign_in.setOnClickbylistner(){
    var et_email = et_email.text;
        var et_password = et_password.text;
        if (isEmpty(et_email)||isEmpty(et_password)) {
            toast.maketext(this@MainActivity"please fill all fields ")
        }
        }


}




}