package com.player.api.playerapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player")
public class Player implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String playerID;

    @Column(name = "birthYear")
    private String birthYear;

    @Column(name = "birthMonth")
    private String birthMonth;

    @Column(name = "birthDay")
    private String birthDay;

    @Column(name = "birthCountry")
    private String birthCountry;

    @Column(name = "birthState")
    private String birthState;

    @Column(name = "birthCity")
    private String birthCity;

    @Column(name = "deathYear")
    private String deathYear;

    @Column(name = "deathMonth")
    private String deathMonth;

    @Column(name = "deathDay")
    private String deathDay;
    @Column(name = "deathCountry")
    private String deathCountry;
    @Column(name = "deathState")
    private String deathState;
    @Column(name = "deathCity")
    private String deathCity;
    @Column(name = "nameFirst")
    private String nameFirst;
    @Column(name = "nameLast")
    private String nameLast;
    @Column(name = "nameGiven")
    private String nameGiven;
    @Column(name = "weight")
    private String weight;
    @Column(name = "height")
    private String height;
    @Column(name= "throws")
    private String throwsValue;
    @Column(name = "bats")
    private String bats;
    @Column(name = "debut")
    private String debut;
    @Column(name = "finalGame")
    private String finalGame;
    @Column(name = "retroID")
    private String retroID;
    @Column(name = "bbrefID")
    private String bbrefID;

    public String getThrowsValue() {
        return throwsValue;
    }

    public void setThrowsValue(String throwsValue) {
        this.throwsValue = throwsValue;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(String deathMonth) {
        this.deathMonth = deathMonth;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(String deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(String finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroID() {
        return retroID;
    }

    public void setRetroID(String retroID) {
        this.retroID = retroID;
    }

    public String getBbrefID() {
        return bbrefID;
    }

    public void setBbrefID(String bbrefID) {
        this.bbrefID = bbrefID;
    }
}
