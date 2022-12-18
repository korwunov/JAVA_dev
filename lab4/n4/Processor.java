package ru.mirea.lab4.n4;

public class Processor {
    private String name;
    private int coresAmount;
    private int freq;

    Processor(String _name, int _cores, int _freq) {
        this.name = _name;
        this.coresAmount = _cores;
        this.freq = _freq;
    }

    @Override
    public String toString() {
        return this.name + "; " + this.coresAmount + " ядер c частотой " + this.freq;
    }
}
