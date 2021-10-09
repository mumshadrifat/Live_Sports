package com.example.livesports;

import java.util.List;

public class PlayerArray {
    List<PlayerCLasss>data;

    public PlayerArray(List<PlayerCLasss> data) {
        this.data = data;
    }

    public List<PlayerCLasss> getData() {
        return data;
    }

    public void setData(List<PlayerCLasss> data) {
        this.data = data;
    }
}
