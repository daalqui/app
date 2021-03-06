package com.upv.dadm.valenparking;

public class Parkings {
    public String name;
    public String calle;
    private boolean isSelected = false;
    public float lat;
    public float lon;
    public boolean clicked = false;
    public String freePlaces;

    public Parkings(String name, String calle, float lat, float lon, String freePlaces){
        this.name = name;
        this.calle = calle;
        this.lat = lat;
        this.lon = lon;
        this.freePlaces = freePlaces;
    }

    public Parkings(){ }

    public String getParkingName() {
        return name;
    }

    public void setParkingName(String ParkingName) {
        this.name = ParkingName;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public void setLat(float latitud){ lat = latitud; }

    public void setLon(float longitud){ lon = longitud; }

    public float getLat(){ return lat;}

    public float getLon(){ return lon;}

    public boolean isSelected() {
        return isSelected;
    }

    public boolean isClicked() {return clicked; }

    public void setClicked(boolean onclicked) {clicked = onclicked; }

    public void setFreePlaces(String free){freePlaces = free; }

    public String getFreePlaces(){return freePlaces;}
}

