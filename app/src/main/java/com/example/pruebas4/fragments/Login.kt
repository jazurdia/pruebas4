package com.example.pruebas4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.pruebas4.R
import com.google.android.material.textfield.TextInputLayout

class Login : Fragment(R.layout.fragment_login) {

    private lateinit var inputEmail: TextInputLayout
    private lateinit var inputPassword: TextInputLayout
    private lateinit var buttonLogin: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.apply {
            inputEmail = findViewById(R.id.login_email_textInputLayout)
            inputPassword = findViewById(R.id.login_password_textInputLayout)
            buttonLogin = findViewById(R.id.login_ingresar_button)
        }

    }


    private fun listeners(){
        buttonLogin.setOnClickListener {
            loginIfUser(
                email = inputEmail.editText!!.text.toString(),
                password2 = inputPassword.editText!!.text.toString()
            )
        }
    }

    private fun loginIfUser(email: String, password2: String) {
        if(email == "admin" && password2 == "admin"){
            requireView().findNavController().navigate(R.id.action_login_to_inicio)
            //requireView().findNavController().navigate(LoginDirections.actionLoginToInicio())
        }
    }


}