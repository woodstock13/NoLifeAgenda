package e.imh.nolifeagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Alexandre on 30/03/2018.
 */

public class AddPatron extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_addpatron);

        this.setTitle("Ajouter un patron d'activité");
        Spinner spinner = (Spinner) findViewById(R.id.patronActivitesList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.patronListeEntries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void onValidation(View view) //Faire revenir à la page principale
    {
        this.finish();
    }

    public void onSelectText(View view)
    {
        ((EditText)view).setText("");
    }
}
