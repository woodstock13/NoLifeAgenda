package e.imh.nolifeagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Alexandre on 30/03/2018.
 */

public class AddListe extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_addliste);

        this.setTitle("Ajouter une liste de tâches");
    }

    public void onValidation(View view) //Faire revenir à la page principale
    {
        this.finish();
    }
}
