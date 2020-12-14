package com.example.androidtutorial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Var declarations
        var button:Button = findViewById(R.id.button)
        var email:EditText = findViewById(R.id.editTextTextEmailAddress)
        var name:EditText = findViewById(R.id.editTextTextPersonName)
        var pass:EditText = findViewById(R.id.editTextTextPassword)
        var pass2:EditText = findViewById(R.id.editTextTextPassword2)

        button.setOnClickListener {
            val email1 = email.text.toString()
            val name1 = name.text.toString()
            val pass1 = pass.text.toString()
            val passw2= pass2.text.toString()
        if(isValidEmail(email1)&&isValidName(name1)&&passw(pass1)&&passwo2(passw2, pass1)){
            //Toast.makeText(this, "Signed Up Successfully", Toast.LENGTH_LONG).show()
            intent = Intent(this,success::class.java)
            startActivity(intent)
        }
            else {
            Toast.makeText(this, "Failed to sign up", Toast.LENGTH_LONG).show()
        }
        }

    }

    private fun isValidEmail(email: String):Boolean {

        if(email.length>0){
        return true
        }
      else{
          Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_LONG).show()
          return false
        }
    }

    private fun isValidName(name: String):Boolean{
        val pattern = Regex("[a-zA-Z]+")
        if(name.length>4 && pattern.matches(name)){
            return true
        }
        else{
            Toast.makeText(this, "Fill Name properly with minimum 5 alphabets", Toast.LENGTH_LONG).show()
            return false
        }
    }
    private fun passw(pass: String):Boolean{
        val pattern = Regex("[A-Za-z0-9]+")
        if(pass.length>5 && pattern.matches(pass)){
            return true
        }
        else{
            Toast.makeText(
                this,
                "Fill Password properly with minimum 6 characters",
                Toast.LENGTH_LONG
            ).show()
            return false
        }
    }

    private fun passwo2(passw2: String, pass1: String):Boolean{

        if(passw2.equals(pass1)){
            return true
        }

        else{
            Toast.makeText(this, "Confirm password doesn't match with password.", Toast.LENGTH_LONG).show()
            return false
        }
    }
}