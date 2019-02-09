package no.tfjorstad.trainingapp.domaine;

import org.joda.time.DateTime;

import java.io.Serializable;

public class Training implements Serializable {
    private String runName;
    private String feeling;
    private double time;
    private double km;
    private DateTime dateTime;

    public Training() {
    }

    public Training(String runName, String feeling, double time, double km, DateTime dateTime) {
        this.runName = runName;
        this.feeling = feeling;
        this.time = time;
        this.km = km;
        this.dateTime = dateTime;
    }

    public String getRunName() {
        return runName;
    }

    public void setRunName(String runName) {
        this.runName = runName;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}
