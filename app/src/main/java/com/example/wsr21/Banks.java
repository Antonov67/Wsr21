package com.example.wsr21;

import java.util.ArrayList;

public class Banks {
    String address = "", type = "", time = "";

    public Banks(String address, String type, String time) {
        this.address = address;
        this.type = type;
        this.time = time;
    }

    public ArrayList<Banks> makeBanks(){
        ArrayList<Banks> arr = new ArrayList<>();
        arr.add(new Banks("Смоленск","отделение","00:00-00:00"));
        arr.add(new Banks("Москва","отделение","09:00-00:00"));
        arr.add(new Banks("Калуга","банкомат","00:00-00:00"));
        return arr;

    }
}
