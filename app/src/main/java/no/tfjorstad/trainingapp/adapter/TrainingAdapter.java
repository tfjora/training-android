package no.tfjorstad.trainingapp.adapter;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import no.tfjorstad.trainingapp.R;
import no.tfjorstad.trainingapp.activity.TrainingActivity;
import no.tfjorstad.trainingapp.domaine.Training;

public class TrainingAdapter extends RecyclerView.Adapter<TrainingAdapter.ViewHolder> {

    //public static final String TRAINING_EXTRA_KEY = TrainingAdapter.class.getName() + "_TRAINING";
    private List<Training> trainings;
    private Context context;

    public TrainingAdapter(List<Training> trainings, Context context) {
        this.trainings = trainings;
        this.context = context;
    }

    @NonNull
    @Override
    public TrainingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_training, null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TrainingAdapter.ViewHolder viewHolder, int position) {
        final int position2 = position;
        final Training training = trainings.get(position);
        viewHolder.runNameTextView.setText(training.getRunName());
        String dateRun = training.getDateTime().getDayOfMonth() + "." + training.getDateTime().getMonthOfYear() +"." +  training.getDateTime().getYear();
        viewHolder.dateTextView.setText(dateRun);

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TrainingActivity.class);
                intent.putExtra("training", training);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return trainings.size();
    }

    public void setTrainingsRecord(List<Training> trainings){
        int firstPosition = 0;
        int numberOfItemsToRemove = this.trainings.size();
        int numberOfItemsToAdd = trainings.size();
        this.trainings.clear();
        notifyItemRangeRemoved(firstPosition, numberOfItemsToRemove);
        this.trainings.addAll(trainings);
        notifyItemRangeInserted(firstPosition, numberOfItemsToAdd);
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;
        private TextView runNameTextView;
        private TextView dateTextView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linearlayout_trainingitem_container);
            runNameTextView = itemView.findViewById(R.id.textview_main_trainings_runName);
            dateTextView = itemView.findViewById(R.id.textview_main_trainings_date);
        }
    }
}
