package no.tfjorstad.trainingapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import no.tfjorstad.trainingapp.R;

public class NewTrainingSession extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_training_session);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_training_session_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.icon_newTrainingRecord_save:
                Toast.makeText(this, "Save selected", Toast.LENGTH_SHORT)
                        .show();
                        break;
            default:

        return super.onOptionsItemSelected(item);
        }
        return false;
    }
}
