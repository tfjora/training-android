package no.tfjorstad.trainingapp.service;


import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

import no.tfjorstad.trainingapp.domaine.Training;

public class TrainingService {

    public List<Training> getTrainings() {

        List<Training> trainings = new ArrayList<>();
        trainings.add(getFloyen());
        trainings.add(getUlriken());
        trainings.add(getLovstakken());
        return trainings;
    }

    public Training getFloyen () {
        Training training = new Training();
        training.setRunName("Floyen");
        training.setTime(18);
        training.setKm(10);
        training.setFeeling("Ok");
        training.setDateTime(new DateTime());
        return training;
    }

    public Training getUlriken () {
        Training training = new Training();
        training.setRunName("Ulriken");
        training.setTime(118);
        training.setKm(101);
        training.setFeeling("Ok");
        training.setDateTime(new DateTime());
        return training;
    }

    public Training getLovstakken () {
        Training training = new Training();
        training.setRunName("Løvstakken");
        training.setTime(27);
        training.setKm(11);
        training.setFeeling("Good");
        training.setDateTime(new DateTime());
        return training;
    }


}