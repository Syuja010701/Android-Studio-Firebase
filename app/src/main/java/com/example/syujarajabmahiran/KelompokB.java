package com.example.syujarajabmahiran;

public class KelompokB {

    private String Name;
    private String Tugas;

    public KelompokB() {
    }

    public KelompokB(String name, String tugas) {
        Name = name;
        Tugas = tugas;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTugas() {
        return Tugas;
    }

    public void setTugas(String tugas) {
        Tugas = tugas;
    }
}