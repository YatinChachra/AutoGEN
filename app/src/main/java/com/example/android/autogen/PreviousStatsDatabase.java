package com.example.android.autogen;

/**
 * Created by 300 on 3/10/2018.
 */


/*
Class for storing the results when gen set was on and off time.
 */
public class PreviousStatsDatabase {

    private String userName;
    private String siteName;
    private String genOnDTStamp;
    private String genOffDTStamp;
    private String mainOffDTStamp;
    private String mainOnDTStamp;

    public PreviousStatsDatabase(String userName, String siteName, String genOnDTStamp, String genOffDTStamp, String mainOffDTStamp, String mainOnDTStamp) {
        this.userName = userName;
        this.siteName = siteName;
        this.genOnDTStamp = genOnDTStamp;
        this.genOffDTStamp = genOffDTStamp;
        this.mainOffDTStamp = mainOffDTStamp;
        this.mainOnDTStamp = mainOnDTStamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getGenOnDTStamp() {
        return genOnDTStamp;
    }

    public void setGenOnDTStamp(String genOnDTStamp) {
        this.genOnDTStamp = genOnDTStamp;
    }

    public String getGenOffDTStamp() {
        return genOffDTStamp;
    }

    public void setGenOffDTStamp(String genOffDTStamp) {
        this.genOffDTStamp = genOffDTStamp;
    }

    public String getMainOffDTStamp() {
        return mainOffDTStamp;
    }

    public void setMainOffDTStamp(String mainOffDTStamp) {
        this.mainOffDTStamp = mainOffDTStamp;
    }

    public String getMainOnDTStamp() {
        return mainOnDTStamp;
    }

    public void setMainOnDTStamp(String mainOnDTStamp) {
        this.mainOnDTStamp = mainOnDTStamp;
    }
}
