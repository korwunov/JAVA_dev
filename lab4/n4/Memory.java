package ru.mirea.lab4.n4;

public class Memory {
    private int size;
    private String standard;

    public Memory(int size, String standard) {
        this.size = size;
        this.standard = standard;
    }

    @Override
    public String toString() {
        return this.size + "гб оперативной памяти стандарта " + this.standard;
    }
}
