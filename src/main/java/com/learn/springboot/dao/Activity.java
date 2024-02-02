package com.learn.springboot.dao;

public class Activity {
    private String activity;
    private String type;
    private int participants;
    private float price;
    private String link;
    private float key;
    private float accessibility;
    

    /**
     * @return String return the activityName
     */
    public String getActivity() {
        return activity;
    }

    /**
     * @param activityName the activityName to set
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }


    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return int return the participants
     */
    public int getParticipants() {
        return participants;
    }

    /**
     * @param participants the participants to set
     */
    public void setParticipants(int participants) {
        this.participants = participants;
    }

    /**
     * @return float return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return String return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return float return the key
     */
    public float getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(float key) {
        this.key = key;
    }

    /**
     * @return float return the accessibility
     */
    public float getAccessibility() {
        return accessibility;
    }

    /**
     * @param accessibility the accessibility to set
     */
    public void setAccessibility(float accessibility) {
        this.accessibility = accessibility;
    }

}
