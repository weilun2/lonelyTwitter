package ca.ualberta.cs.lonelytwitter.Moods;

import java.util.Date;

public abstract class Mood {
    private Date date;

    Mood(){
        this.date = new Date();
    }

    Mood(Date datearg){
        this.date = datearg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
