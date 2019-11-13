package models;

public class Customers  {
    private String name;
    private String dob;
    private String address;
    private String avatar;

    public Customers() {
    }

    public Customers(String name, String dob, String address, String avatar) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

