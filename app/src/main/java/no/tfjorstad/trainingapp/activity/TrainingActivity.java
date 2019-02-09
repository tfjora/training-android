package no.tfjorstad.trainingapp.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import no.tfjorstad.trainingapp.R;
import no.tfjorstad.trainingapp.domaine.Training;

public class TrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        showBackButton();
        setTraining(getTraining());
    }

    private Training getTraining() {
        return  (Training) getIntent().getSerializableExtra("training");
    }

    private void setTraining(Training training) {
        TextView textView_runName = findViewById(R.id.textview_training_runName);
        textView_runName.setText("Løype: " + training.getRunName());

        TextView textView_time = findViewById(R.id.textview_training_time);
        textView_time.setText("Time: "+String.valueOf(training.getTime()));

        TextView textView_km = findViewById(R.id.textview_training_km);
        textView_km.setText("Km: " + String.valueOf(training.getKm()));

        TextView textView_feeling = findViewById(R.id.textview_training_feeling);
        textView_feeling.setText("Følelse: " + training.getFeeling());

        TextView textView_date = findViewById(R.id.textview_training_date);
        textView_date.setText("Dato: " + String.valueOf(training.getDateTime().getDayOfMonth() + "." + training.getDateTime().getMonthOfYear() +"." +  training.getDateTime().getYear()));
    }


    private void showBackButton() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null)
            supportActionBar.setDisplayHomeAsUpEnabled(true);
    }
}
