package no.tfjorstad.trainingapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import no.tfjorstad.trainingapp.R;
import no.tfjorstad.trainingapp.adapter.TrainingAdapter;
import no.tfjorstad.trainingapp.service.TrainingService;

public class MainActivity extends AppCompatActivity {

    private TrainingService trainingService;
    private TrainingAdapter trainingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trainingService = new TrainingService();
        trainingAdapter = new TrainingAdapter(trainingService.getTrainings(), getApplicationContext());

        RecyclerView recyclerView = findViewById(R.id.recyclerview_main_trainings);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(trainingAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.new_traingsrec:
                newTraining();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void newTraining() {
        Intent intent = new Intent(getApplicationContext(), NewTrainingSession.class);
        startActivity(intent);
    }
}

