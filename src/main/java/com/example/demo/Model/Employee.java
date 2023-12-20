package com.example.demo.Model;

import java.sql.Time;
import java.time.LocalTime;
//import java.util.Date;
import java.sql.Date;
public class Employee {
    private java.sql.Date date;
    private java.sql.Date month;
    private String Team;
    private String PanelName;
    private String Round;
    private String skill;
    private Time time;
    private String CurrentLoc;
    private String PreferredLoc;
    private String CandidateName;

    public Employee(java.sql.Date date,java.sql.Date month ,String team, String panelName, String round, String skill, Time time, String currentLoc, String preferredLoc, String candidateName) {
        this.date = date;
        this.month=month;
        Team = team;
        PanelName = panelName;
        Round = round;
        this.skill = skill;
        this.time = time;
        CurrentLoc = currentLoc;
        PreferredLoc = preferredLoc;
        CandidateName = candidateName;
    }

    public java.sql.Date getMonth() {
        return month;
    }

    public void setMonth(java.sql.Date month) {
        this.month = month;
    }

    public java.sql.Date getDate() {
        return (java.sql.Date) date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getPanelName() {
        return PanelName;
    }

    public void setPanelName(String panelName) {
        PanelName = panelName;
    }

    public String getRound() {
        return Round;
    }

    public void setRound(String round) {
        Round = round;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getCurrentLoc() {
        return CurrentLoc;
    }

    public void setCurrentLoc(String currentLoc) {
        CurrentLoc = currentLoc;
    }

    public String getPreferredLoc() {
        return PreferredLoc;
    }

    public void setPreferredLoc(String preferredLoc) {
        PreferredLoc = preferredLoc;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "date=" + date +
                ", Month=" + month +
                ", Team='" + Team + '\'' +
                ", PanelName='" + PanelName + '\'' +
                ", Round='" + Round + '\'' +
                ", skill='" + skill + '\'' +
                ", time=" + time +
                ", CurrentLoc='" + CurrentLoc + '\'' +
                ", PreferredLoc='" + PreferredLoc + '\'' +
                ", CandidateName='" + CandidateName + '\'' +
                '}';
    }
}
