package e.imh.nolifeagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Alexandre on 30/03/2018.
 */

public class AddRSS extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_addrss);

        this.setTitle("Ajouter un flux RSS");
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
