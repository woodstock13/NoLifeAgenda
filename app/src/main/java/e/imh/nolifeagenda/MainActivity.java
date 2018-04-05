package e.imh.nolifeagenda;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private static MainActivity main;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        MainActivity.main = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((CalendarView)this.findViewById(R.id.calendrier)).setOnDateChangeListener(new CalendarView.OnDateChangeListener()
            {
                @Override
                public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2)
                {
                    TextView dailyTitle = MainActivity.main.findViewById(R.id.dailyTaskTitle);
                    String str = dailyTitle.getResources().getString(R.string.daily)+" "+i2+"/"+i1+"/"+i;
                    dailyTitle.setText(str);
                }
            }
        );
    }

    public void afficherAddMenu(View view)
    {
        if(this.findViewById(R.id.add_button_text).getVisibility()==View.VISIBLE)
        {
            this.findViewById(R.id.add_button_text).setVisibility(View.INVISIBLE);

            this.findViewById(R.id.event_addBouton).setVisibility(View.VISIBLE);
            this.findViewById(R.id.rappel_addBouton).setVisibility(View.VISIBLE);
            this.findViewById(R.id.liste_addBouton).setVisibility(View.VISIBLE);
            this.findViewById(R.id.patron_addBouton).setVisibility(View.VISIBLE);
            this.findViewById(R.id.flux_rss_addBouton).setVisibility(View.VISIBLE);
        }
        else if(this.findViewById(R.id.add_button_text).getVisibility()==View.INVISIBLE)
        {
            this.findViewById(R.id.add_button_text).setVisibility(View.VISIBLE);

            this.findViewById(R.id.event_addBouton).setVisibility(View.INVISIBLE);
            this.findViewById(R.id.rappel_addBouton).setVisibility(View.INVISIBLE);
            this.findViewById(R.id.liste_addBouton).setVisibility(View.INVISIBLE);
            this.findViewById(R.id.patron_addBouton).setVisibility(View.INVISIBLE);
            this.findViewById(R.id.flux_rss_addBouton).setVisibility(View.INVISIBLE);
        }
    }

    public void onAjouterElement(View view)
    {
        Intent intent = null;

        switch(view.getId())
        {
            case R.id.event_addBouton :
                intent = new Intent(this, AddEvent.class);
                break;

            case R.id.rappel_addBouton :
                intent = new Intent(this, AddRappel.class);
                break;

            case R.id.liste_addBouton :
                intent = new Intent(this, AddListe.class);
                break;

            case R.id.patron_addBouton :
                intent = new Intent(this,AddPatron.class);
                break;

            case R.id.flux_rss_addBouton :
                intent = new Intent(this, AddRSS.class);
                break;
        }

        this.afficherAddMenu(null); //On masque les boutons
        if(intent!=null)
        {
            this.startActivity(intent);
        }
    }

}
