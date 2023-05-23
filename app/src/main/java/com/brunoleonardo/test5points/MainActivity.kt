package com.brunoleonardo.test5points

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.brunoleonardo.test5points.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding // le lien entre le fichier xml et l'activité


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater) // le lien entre le fichier xml et l'activité
        setContentView(binding.root) // le lien entre le fichier xml et l'activité

        binding.btn1 // on récupère le bouton 1
    }


    // fonction qui est appelée lorsqu'on clique sur le bouton
    fun actionB1(view: View) { // view est le bouton qui a été cliqué
        var b : Button = view as Button // on récupère le bouton qui a été cliqué
        if(b == binding.btn1) // si c'est le bouton 1
            binding.textViewResultat.text = "Bouton 1" // on affiche le texte "Bouton 1"
        else
            binding.textViewResultat.text = "Bouton 2" //   sinon on affiche le texte "Bouton 2"
    }

}