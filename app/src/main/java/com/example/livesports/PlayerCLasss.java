package com.example.livesports;

public class PlayerCLasss {
private String fullname;
private  String dateofbirth;
private  Position position;

    public PlayerCLasss(String fullname, String dateofbirth, Position position) {
        this.fullname = fullname;
        this.dateofbirth = dateofbirth;
        this.position = position;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
