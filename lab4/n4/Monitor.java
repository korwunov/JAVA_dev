package ru.mirea.lab4.n4;

public class Monitor {
    private String resolution;
    private String definition;

    public Monitor(String resolution, String definition) {
        this.resolution = resolution;
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "разрешение " + this.resolution + " " + this.definition;
    }
}
