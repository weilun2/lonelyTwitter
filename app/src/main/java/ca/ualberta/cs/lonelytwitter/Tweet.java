/*
 * CMPUT301
 *
 * Version 1.0
 *
 * Jan 22, 2019
 *
 * Developed by Weilun Huang on 1/22/19 6:09 PM.
 * Last modified 1/22/19 6:06 PM.
 * Copyright (c) 2019. All right reserved
 */

package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 *
 * @author weilun2
 * @version 1.0
 * @see LonelyTwitterActivity
 */
public class Tweet {

    String message;
    Date date;

    Tweet(){
    }


    /**
     *
     * @param message, string type
     * @since 1.0
     */

//Overloading: so that we can specify the tweet cont
    Tweet(String message){
        this.message = message;
    }

    /**
     *
     * @param message, string type
     * @since 1.0
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString(){
        return message;
    }
}