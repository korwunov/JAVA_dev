package ru.mirea.lab4.n2;

public enum clothesSize {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private int euroSize;
    private String description;
    clothesSize(int euroSize, String desc) {
        this.euroSize = euroSize;
        this.description = desc;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return this.description;
    }

}
