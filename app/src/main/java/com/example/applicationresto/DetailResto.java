package com.example.applicationresto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.appresto.modele.metier.Restaurant;

public class DetailResto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resto);
        // Récupérer les informations depuis l'indent
        Intent intent = getIntent();
        if (intent != null) {

            String nomResto = intent.getStringExtra("nomResto");
            String villeResto = intent.getStringExtra("villeResto");
            String numResto = intent.getStringExtra("numResto");
            String voieResto = intent.getStringExtra("voieResto");
            String cpResto = intent.getStringExtra("cpResto");
            String descResto = intent.getStringExtra("descResto");
            String horaireResto = intent.getStringExtra("horaireResto");

            // Affichage des informations
            TextView textViewNom = (TextView) findViewById(R.id.TextViewNom);
            textViewNom.setText(nomResto);

            TextView textViewVille = (TextView) findViewById(R.id.TextViewVille);
            textViewVille.setText(villeResto);

            TextView textViewNum = (TextView) findViewById(R.id.TextViewNum);
            textViewNum.setText(numResto);

            TextView textViewVoie = (TextView) findViewById(R.id.TextViewVoie);
            textViewVoie.setText(voieResto);

            TextView textViewCp = (TextView) findViewById(R.id.TextViewCp);
            textViewCp.setText(cpResto);

            TextView textViewDesc = (TextView) findViewById(R.id.TextViewDesc);
            textViewDesc.setText(descResto);

            TextView textViewHoraire = (TextView) findViewById(R.id.TextViewHoraire);
            textViewHoraire.setText(horaireResto);
        }
    }
}