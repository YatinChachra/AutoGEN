package com.example.android.autogen;

/**
 * Created by 300 on 3/9/2018.
 */

/*
General information Basic Records Database.
 */

public class RecordsDatabase {

    private String userName;
    private String siteName;
    private String batteryVolts;
    private String fuelLevel;
    private String error;
    private String currentMainStatus;
    private String currentGenStatus;

    public RecordsDatabase(String userName,String siteName,String batteryVolts,String fuelLevel,String error,String currentGenStatus,String currentMainStatus)
    {
        this.userName=userName;
        this.siteName=siteName;
        this.batteryVolts=batteryVolts;
        this.fuelLevel=fuelLevel;
        this.error=error;
        this.currentGenStatus=currentGenStatus;
        this.currentMainStatus=currentMainStatus;
    }


    public String getUserName() {return userName;}
    public String getSiteName() {return siteName;}
    public String getBatteryVolts() {return batteryVolts;}
    public String getFuelLevel() {return fuelLevel;}
    public String getError() {return error;}
    public String getCurrentMainStatus() {return currentMainStatus;}
    public String getCurrentGenStatus() {return  currentGenStatus;}

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setBatteryVolts(String batteryVolts) {
        this.batteryVolts = batteryVolts;
    }

    public void setFuelLevel(String fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setCurrentMainStatus(String currentMainStatus) {
        this.currentMainStatus = currentMainStatus;
    }

    public void setCurrentGenStatus(String currentGenStatus) {
        this.currentGenStatus = currentGenStatus;
    }
}
