package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Toast


class Data {
    companion object{
        var name =" "
        var location =" "
        var phoneNumber =" "
        var email =" "
    }
}
class MainActivity : AppCompatActivity() {
    private lateinit var edName: EditText
    private lateinit var edLocation: EditText
    private lateinit var edPhoneNumber: EditText
    private lateinit var edEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName= findViewById(R.id.edName)
        edLocation= findViewById(R.id.edLocation)
        edPhoneNumber= findViewById(R.id.edPhoneNumber)
        edEmail= findViewById(R.id.edEmail)
    }

    fun showData(view: View) {
        if (edName.text.isNotBlank()&&
            edLocation.text.isNotBlank()&&
            edPhoneNumber.text.isNotBlank()&&
            edEmail.text.isNotBlank()){

            Data.name= edName.text.toString()
            Data.location= edLocation.text.toString()
            Data.phoneNumber= edPhoneNumber.text.toString()
            Data.email= edEmail.text.toString()

            startActivity(Intent(this,ViewActivity::class.java))
        }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
}