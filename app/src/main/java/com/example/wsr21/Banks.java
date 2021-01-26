package com.example.wsr21;

import java.util.ArrayList;

public class Banks {
    String address = "", type = "", time = "";
    boolean work_or_not = false;

    public Banks(String address, String type, String time, boolean work_or_not) {
        this.address = address;
        this.type = type;
        this.time = time;
        this.work_or_not = work_or_not;
    }

    public ArrayList<Banks> makeBanks(){
        ArrayList<Banks> arr = new ArrayList<>();
        arr.add(new Banks("Смоленск","отделение","00:00-00:00", true));
        arr.add(new Banks("Москва","отделение","09:00-00:00", false));
        arr.add(new Banks("Калуга","банкомат","00:00-00:00", true));
        return arr;

    }
}
