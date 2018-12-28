package com.example.titouanfloch.morpion;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button bouton1,bouton2,bouton3,bouton4,bouton5,bouton6,bouton7,bouton8,bouton9,boutonReset;
    Button[] tabBouton = new Button[10];
    int fini = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bouton1 = (Button) findViewById(R.id.bouton1);
        bouton2 = (Button) findViewById(R.id.bouton2);
        bouton3 = (Button) findViewById(R.id.bouton3);
        bouton4 = (Button) findViewById(R.id.bouton4);
        bouton5 = (Button) findViewById(R.id.bouton5);
        bouton6 = (Button) findViewById(R.id.bouton6);
        bouton7 = (Button) findViewById(R.id.bouton7);
        bouton8 = (Button) findViewById(R.id.bouton8);
        bouton9 = (Button) findViewById(R.id.bouton9);
        tabBouton[0] = bouton1;
        tabBouton[1] = bouton2;
        tabBouton[2] = bouton3;
        tabBouton[3] = bouton4;
        tabBouton[4] = bouton5;
        tabBouton[5] = bouton6;
        tabBouton[6] = bouton7;
        tabBouton[7] = bouton8;
        tabBouton[8] = bouton9;



        boutonReset = (Button) findViewById(R.id.boutonReset);

        bouton1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton1.setText("X");
                bouton1.setEnabled(false);
                int test = random();
                verif();
                tourOrdi();
            }
        });
        bouton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton2.setText("X");
                bouton2.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton3.setText("X");
                bouton3.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton4.setText("X");
                bouton4.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton5.setText("X");
                bouton5.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton6.setText("X");
                bouton6.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton7.setText("X");
                bouton7.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton8.setText("X");
                bouton8.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        bouton9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                bouton9.setText("X");
                bouton9.setEnabled(false);
                verif();
                tourOrdi();
            }
        });
        boutonReset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                fini = 0;
                bouton1.setText("");
                bouton2.setText("");
                bouton3.setText("");
                bouton4.setText("");
                bouton5.setText("");
                bouton6.setText("");
                bouton7.setText("");
                bouton8.setText("");
                bouton9.setText("");
                bouton1.setTextColor(Color.rgb(0, 0, 0));
                bouton2.setTextColor(Color.rgb(0, 0, 0));
                bouton3.setTextColor(Color.rgb(0, 0, 0));
                bouton4.setTextColor(Color.rgb(0, 0, 0));
                bouton5.setTextColor(Color.rgb(0, 0, 0));
                bouton6.setTextColor(Color.rgb(0, 0, 0));
                bouton7.setTextColor(Color.rgb(0, 0, 0));
                bouton8.setTextColor(Color.rgb(0, 0, 0));
                bouton9.setTextColor(Color.rgb(0, 0, 0));
                bouton1.setEnabled(true);
                bouton2.setEnabled(true);
                bouton3.setEnabled(true);
                bouton4.setEnabled(true);
                bouton5.setEnabled(true);
                bouton6.setEnabled(true);
                bouton7.setEnabled(true);
                bouton8.setEnabled(true);
                bouton9.setEnabled(true);
            }
        });
    }
    public void verif()
    {
        if (fini != 1)
        {
            if (bouton1.getText() == "X" && bouton2.getText() == "X" && bouton3.getText() == "X")
            {
                bouton1.setTextColor(Color.rgb(0, 179, 0));
                bouton2.setTextColor(Color.rgb(0, 179, 0));
                bouton3.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;



                fin();

            }
            else if (bouton4.getText() == "X" && bouton5.getText() == "X" && bouton6.getText() == "X")
            {
                bouton4.setTextColor(Color.rgb(0, 179, 0));
                bouton5.setTextColor(Color.rgb(0, 179, 0));
                bouton6.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();
            }
           else  if (bouton7.getText() == "X" && bouton8.getText() == "X" && bouton9.getText() == "X")
            {
                bouton7.setTextColor(Color.rgb(0, 179, 0));
                bouton8.setTextColor(Color.rgb(0, 179, 0));
                bouton9.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();

            }
            else if (bouton1.getText() == "X" && bouton4.getText() == "X" && bouton7.getText() == "X")
            {
                bouton1.setTextColor(Color.rgb(0, 179, 0));
                bouton4.setTextColor(Color.rgb(0, 179, 0));
                bouton7.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();
            }
            else if (bouton2.getText() == "X" && bouton5.getText() == "X" && bouton8.getText() == "X")
            {
                bouton2.setTextColor(Color.rgb(0, 179, 0));
                bouton5.setTextColor(Color.rgb(0, 179, 0));
                bouton8.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();
            }
            else if (bouton3.getText() == "X" && bouton6.getText() == "X" && bouton9.getText() == "X")
            {
                bouton3.setTextColor(Color.rgb(0, 179, 0));
                bouton6.setTextColor(Color.rgb(0, 179, 0));
                bouton9.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();
            }
            else if (bouton1.getText() == "X" && bouton5.getText() == "X" && bouton9.getText() == "X")
            {
                bouton1.setTextColor(Color.rgb(0, 179, 0));
                bouton5.setTextColor(Color.rgb(0, 179, 0));
                bouton9.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();
            }
            else if (bouton3.getText() == "X" && bouton5.getText() == "X" && bouton7.getText() == "X")
            {
                bouton3.setTextColor(Color.rgb(0, 179, 0));
                bouton5.setTextColor(Color.rgb(0, 179, 0));
                bouton7.setTextColor(Color.rgb(0, 179, 0));
                fini = 1;
                fin();
            }
           else if (bouton1.getText() == "O" && bouton2.getText() == "O" && bouton3.getText() == "O")
            {
                bouton1.setTextColor(Color.rgb(230, 0, 0));
                bouton2.setTextColor(Color.rgb(230, 0, 0));
                bouton3.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();
            }
            else if (bouton4.getText() == "O" && bouton5.getText() == "O" && bouton6.getText() == "O")
            {
                bouton4.setTextColor(Color.rgb(230, 0, 0));
                bouton5.setTextColor(Color.rgb(230, 0, 0));
                bouton6.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();

            }
            else  if (bouton7.getText() == "O"&& bouton8.getText() == "O" && bouton9.getText() == "O")
            {
                bouton7.setTextColor(Color.rgb(230, 0, 0));
                bouton8.setTextColor(Color.rgb(230, 0, 0));
                bouton9.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();

            }
            else if (bouton1.getText() == "O" && bouton4.getText() == "O" && bouton7.getText() == "O")
            {
                bouton1.setTextColor(Color.rgb(230, 0, 0));
                bouton4.setTextColor(Color.rgb(230, 0, 0));
                bouton7.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();
            }
            else if (bouton2.getText() == "O" && bouton5.getText() == "O" && bouton8.getText() == "O")
            {
                bouton2.setTextColor(Color.rgb(230, 0, 0));
                bouton5.setTextColor(Color.rgb(230, 0, 0));
                bouton8.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();
            }
            else if (bouton3.getText() == "O" && bouton6.getText() == "O" && bouton9.getText() == "O")
            {
                bouton3.setTextColor(Color.rgb(230, 0, 0));
                bouton6.setTextColor(Color.rgb(230, 0, 0));
                bouton9.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();
            }
            else if (bouton1.getText() == "O" && bouton5.getText() == "O" && bouton9.getText() == "O")
            {
                bouton1.setTextColor(Color.rgb(230, 0, 0));
                bouton5.setTextColor(Color.rgb(230, 0, 0));
                bouton9.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();
            }
            else if (bouton3.getText() == "O" && bouton5.getText() == "O" && bouton7.getText() == "O")
            {
                bouton3.setTextColor(Color.rgb(230, 0, 0));
                bouton5.setTextColor(Color.rgb(230, 0, 0));
                bouton7.setTextColor(Color.rgb(230, 0, 0));
                fini = 1;
                fin();
            }
        }
    }
    public void tourOrdi()
    {
        if (fini != 1)
        {
                                            /* --------------------ATTAQUE--------------------*/
            if (bouton1.getText() == "O" && bouton2.getText() == "O" && bouton3.getText() != "O" && bouton3.getText() != "X")
            {
                bouton3.setText("O");
                bouton3.setEnabled(false);
                verif();
            }
            else if (bouton2.getText() == "O" && bouton3.getText() == "O" && bouton1.getText() != "O" && bouton1.getText() != "X")
            {
                bouton1.setText("O");
                bouton1.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "O" && bouton3.getText() == "O" && bouton2.getText() != "O" && bouton2.getText() != "X")
            {
                bouton2.setText("O");
                bouton2.setEnabled(false);
                verif();
            }
            else if (bouton4.getText() == "O" && bouton5.getText() == "O" && bouton6.getText() != "O" && bouton6.getText() != "X")
            {
                bouton6.setText("O");
                bouton6.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() == "O" && bouton6.getText() == "O" && bouton4.getText() != "O" && bouton4.getText() != "X")
            {
                bouton4.setText("O");
                bouton4.setEnabled(false);
                verif();
            }
            else if (bouton7.getText() == "O" && bouton8.getText() == "O" && bouton9.getText() != "O" && bouton9.getText() != "X")
            {
                bouton9.setText("O");
                bouton9.setEnabled(false);
                verif();
            }
            else if (bouton8.getText() == "O" && bouton9.getText() == "O" && bouton7.getText() != "O" && bouton7.getText() != "X")
            {
                bouton7.setText("O");
                bouton7.setEnabled(false);
                verif();
            }
            else if (bouton7.getText() == "O" && bouton9.getText() == "O" && bouton8.getText() != "O" && bouton8.getText() != "X")
            {
                bouton8.setText("O");
                bouton8.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "O" && bouton4.getText() == "O" && bouton7.getText() != "O" && bouton7.getText() != "X")
            {
                bouton7.setText("O");
                bouton7.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "O" && bouton7.getText() == "O" && bouton4.getText() != "O" && bouton4.getText() != "X")
            {
                bouton4.setText("O");
                bouton4.setEnabled(false);
                verif();
            }
            else if (bouton4.getText() == "O" && bouton7.getText() == "O" && bouton1.getText() != "O" && bouton1.getText() != "X")
            {
                bouton1.setText("O");
                bouton1.setEnabled(false);
                verif();
            }
            else if (bouton2.getText() == "O" && bouton5.getText() == "O" && bouton8.getText() != "O" && bouton8.getText() != "X")
            {
                bouton8.setText("O");
                bouton8.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() == "O" && bouton8.getText() == "O" && bouton2.getText() != "O" && bouton2.getText() != "X")
            {
                bouton2.setText("O");
                bouton2.setEnabled(false);
                verif();
            }
            else if (bouton3.getText() == "O" && bouton6.getText() == "O" && bouton9.getText() != "O" && bouton9.getText() != "X")
            {
                bouton9.setText("O");
                bouton9.setEnabled(false);
                verif();
            }
            else if (bouton3.getText() == "O" && bouton9.getText() == "O" && bouton6.getText() != "O" && bouton6.getText() != "X")
            {
                bouton6.setText("O");
                bouton6.setEnabled(false);
                verif();
            }
            else if (bouton6.getText() == "O" && bouton9.getText() == "O" && bouton3.getText() != "O" && bouton3.getText() != "X")
            {
                bouton3.setText("O");
                bouton3.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "O" && bouton5.getText() == "O" && bouton9.getText() != "O" && bouton9.getText() != "X")
            {
                bouton9.setText("O");
                bouton9.setEnabled(false);
                verif();
            }
            else if (bouton9.getText() == "O" && bouton5.getText() == "O" && bouton1.getText() != "O" && bouton1.getText() != "X")
            {
                bouton1.setText("O");
                bouton1.setEnabled(false);
                verif();
            }
            else if (bouton3.getText() == "O" && bouton5.getText() == "O" && bouton7.getText() != "O" && bouton7.getText() != "X")
            {
                bouton7.setText("O");
                bouton7.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() == "O" && bouton7.getText() == "O" && bouton3.getText() != "O" && bouton3.getText() != "X")
            {
                bouton3.setText("O");
                bouton3.setEnabled(false);
                verif();
            }
                /* --------------------DEFENSE--------------------*/
            else if (bouton1.getText() == "X" && bouton2.getText() == "X" && bouton3.getText() != "O" && bouton3.getText() != "X")
            {
                bouton3.setText("O");
                bouton3.setEnabled(false);
                verif();
            }
            else if (bouton2.getText() == "X" && bouton3.getText() == "X" && bouton1.getText() != "O" && bouton1.getText() != "X")
            {
                bouton1.setText("O");
                bouton1.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "X" && bouton3.getText() == "X" && bouton2.getText() != "O" && bouton2.getText() != "X")
            {
                bouton2.setText("O");
                bouton2.setEnabled(false);
                verif();
            }
            else if (bouton4.getText() == "X" && bouton5.getText() == "X" && bouton6.getText() != "O" && bouton6.getText() != "X")
            {
                bouton6.setText("O");
                bouton6.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() == "X" && bouton6.getText() == "X" && bouton4.getText() != "O" && bouton4.getText() != "X")
            {
                bouton4.setText("O");
                bouton4.setEnabled(false);
                verif();
            }
            else if (bouton7.getText() == "X" && bouton8.getText() == "X" && bouton9.getText() != "O" && bouton9.getText() != "X")
            {
                bouton9.setText("O");
                bouton9.setEnabled(false);
                verif();
            }
            else if (bouton8.getText() == "X" && bouton9.getText() == "X" && bouton7.getText() != "O" && bouton7.getText() != "X")
            {
                bouton7.setText("O");
                bouton7.setEnabled(false);
                verif();
            }
            else if (bouton7.getText() == "X" && bouton9.getText() == "X" && bouton8.getText() != "O" && bouton8.getText() != "X")
            {
                bouton8.setText("O");
                bouton8.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "X" && bouton4.getText() == "X" && bouton7.getText() != "O" && bouton7.getText() != "X")
            {
                bouton7.setText("O");
                bouton7.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "X" && bouton7.getText() == "X" && bouton4.getText() != "O" && bouton4.getText() != "X")
            {
                bouton4.setText("O");
                bouton4.setEnabled(false);
                verif();
            }
            else if (bouton4.getText() == "X" && bouton7.getText() == "X" && bouton1.getText() != "O" && bouton1.getText() != "X")
            {
                bouton1.setText("O");
                bouton1.setEnabled(false);
                verif();
            }
            else if (bouton2.getText() == "X" && bouton5.getText() == "X" && bouton8.getText() != "O" && bouton8.getText() != "X")
            {
                bouton8.setText("O");
                bouton8.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() == "X" && bouton8.getText() == "X" && bouton2.getText() != "O" && bouton2.getText() != "X")
            {
                bouton2.setText("O");
                bouton2.setEnabled(false);
                verif();
            }
            else if (bouton3.getText() == "X" && bouton6.getText() == "X" && bouton9.getText() != "O" && bouton9.getText() != "X")
            {
                bouton9.setText("O");
                bouton9.setEnabled(false);
                verif();
            }
            else if (bouton3.getText() == "X" && bouton9.getText() == "X" && bouton6.getText() != "O" && bouton6.getText() != "X")
            {
                bouton6.setText("O");
                bouton6.setEnabled(false);
                verif();
            }
            else if (bouton6.getText() == "X" && bouton9.getText() == "X" && bouton3.getText() != "O" && bouton3.getText() != "X")
            {
                bouton3.setText("O");
                bouton3.setEnabled(false);
                verif();
            }
            else if (bouton1.getText() == "X" && bouton5.getText() == "X" && bouton9.getText() != "O" && bouton9.getText() != "X")
            {
                bouton9.setText("O");
                bouton9.setEnabled(false);
                verif();
            }
            else if (bouton9.getText() == "X" && bouton5.getText() == "X" && bouton1.getText() != "O" && bouton1.getText() != "X")
            {
                bouton1.setText("O");
                bouton1.setEnabled(false);
                verif();
            }
            else if (bouton3.getText() == "X" && bouton5.getText() == "X" && bouton7.getText() != "O" && bouton7.getText() != "X")
            {
                bouton7.setText("O");
                bouton7.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() == "X" && bouton7.getText() == "X" && bouton3.getText() != "O" && bouton3.getText() != "X")
            {
                bouton3.setText("O");
                bouton3.setEnabled(false);
                verif();
            }
            else if (bouton5.getText() != "X" && bouton5.getText() != "O")
            {
                bouton5.setText("O");
                bouton5.setEnabled(false);
                verif();
            }
            else
            {
                int i = 0;
                String reussi = "non";
                while (reussi != "oui")
                {
                    int nombreRandom = random();
                    int nombreVerif = nombreRandom - 1;
                    try {
                        if (tabBouton[nombreVerif].getText() != "X" && tabBouton[nombreVerif].getText() != "O") {
                            tabBouton[nombreVerif].setText("O");
                            reussi = "oui";
                            tabBouton[nombreVerif].setEnabled(false);
                        }
                        if (i == 9)
                        {
                            reussi = "oui";
                        }
                        i++;
                    }
                    catch  (Exception e)
                    {

                    }
                }
            }
        }
    }
    int random()
    {
        Random r = new Random();
        int nombrePasBon = r.nextInt(9) ;
        int nombreBon = nombrePasBon + 1;
        return nombreBon;
    }
    public void fin()
    {
        bouton1.setEnabled(false);
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        bouton5.setEnabled(false);
        bouton6.setEnabled(false);
        bouton7.setEnabled(false);
        bouton8.setEnabled(false);
        bouton9.setEnabled(false);
    }

}
