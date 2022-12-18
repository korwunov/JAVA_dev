package ru.mirea.lab41.n9;

public class Sofa extends Furniture{
    private int seatPlaces;

    public Sofa() {}

    public Sofa(int seatPlaces) { this.seatPlaces = seatPlaces; }

    public Sofa (String material, int price, int seatPlaces){
        super(material, price);
        this.seatPlaces = seatPlaces;
    }

    public int getPrice() {
        return this.price * seatPlaces;
    }

    @Override
    public String toString() {
        return "Sofa: made of " + this.material + " for "
                + this.price + " with places " + this.seatPlaces
                + "; full price is " + (this.price * this.seatPlaces);
    }

}
