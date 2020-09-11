package com.example.gadsboard;

public class DataList {

    // attributes
    public int img;
    public String name, hours, nation;
    public int batchImage;
    public String fName,sName, iq,country;

    public DataList(int img, String name, String hours, String nation) {
        this.img = img;
        this.name = name;
        this.hours = hours;
        this.nation = nation;
    }
//    public DataList(int batchImage,String name, String iq, String country){
//        this.batchImage = batchImage;
//        this.fName = fName;
//        this.sName = sName;
//        this.iq = iq;
//        this.country = country;
//    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getBatchImage() {
        return batchImage;
    }

    public void setBatchImage(int batchImage) {
        this.batchImage = batchImage;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getString(String name) {
        return "";
    }
}
