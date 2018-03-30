package e.imh.nolifeagenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAjouterMenu(View view)
    {
        if(this.findViewById(R.id.add_menu).getVisibility()==View.INVISIBLE)
        {
            this.findViewById(R.id.add_menu).setVisibility(View.VISIBLE);
        }
        else if(this.findViewById(R.id.add_menu).getVisibility()==View.VISIBLE)
        {
            this.findViewById(R.id.add_menu).setVisibility(View.INVISIBLE);
        }
    }

    public void onAjouterElement(View view)
    {
        Intent intent = null;

        switch(view.getId())
        {
            case R.id.flux_rss_addBouton :
                intent = new Intent(this, AddRSS.class);
                break;

            case R.id.event_addBouton :
                intent = new Intent(this, AddEvent.class);
                this.findViewById(R.id.add_menu).setVisibility(View.INVISIBLE);
                break;

            case R.id.rappel_addBouton :
                intent = new Intent(this, AddRappel.class);
                this.findViewById(R.id.add_menu).setVisibility(View.INVISIBLE);
                break;

            case R.id.liste_addBouton :
                intent = new Intent(this, AddListe.class);
                this.findViewById(R.id.add_menu).setVisibility(View.INVISIBLE);
                break;

            case R.id.patron_addBouton :
                intent = new Intent(this,AddPatron.class);
                this.findViewById(R.id.add_menu).setVisibility(View.INVISIBLE);
                break;
        }

        if(intent!=null)
        {
            this.startActivity(intent);
        }
    }

}
