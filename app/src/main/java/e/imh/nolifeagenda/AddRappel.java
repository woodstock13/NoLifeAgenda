package e.imh.nolifeagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Alexandre on 30/03/2018.
 */

class AddRappel extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_addrappel);

        //Récupération des informations
        Intent intent = this.getIntent();
    }
}
