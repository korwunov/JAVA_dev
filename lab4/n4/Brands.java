package ru.mirea.lab4.n4;

public enum Brands {
    ASUS (3, new Computer[]{
        new Computer(
                new Processor("I3", 2, 1400),
                new Memory(4, "DDR3"),
                new Monitor("1920X1080", "2K")
        ),
        new Computer(
                new Processor("I5", 4, 1800),
                new Memory(8, "DDR4"),
                new Monitor("640X320", "2K")
        ),
        new Computer(
                new Processor("AMD R3", 4, 2400),
                new Memory(8, "DDR5"),
                new Monitor("1920X1880", "4K")
        ),
    }),

    DELL(2, new Computer[] {
        new Computer(
                new Processor("AMD R5", 4, 1800),
                new Memory(8, "DDR3"),
                new Monitor("640X320", "HD")
        ),
        new Computer(
                new Processor("I7", 6, 2800),
                new Memory(16, "DDR5"),
                new Monitor("1920X1080", "4K")
        )    
    }),

    HP(3, new Computer[] {
        new Computer(
                new Processor("I5", 4, 2400),
                new Memory(8, "DDR5"),
                new Monitor("1920X1080", "4k")
        ),
        new Computer(
                new Processor("I5", 4, 2400),
                new Memory(8, "DDR5"),
                new Monitor("1920X1080", "4k")
        ),
        new Computer(
                new Processor("I7", 6, 2800),
                new Memory(16, "DDR5"),
                new Monitor("1920X1080", "4k")
        )
    }),

    MSI(2, new Computer[] {
        new Computer(
                new Processor("AMD R5", 6, 2200),
                new Memory(16, "DDR5"),
                new Monitor("1920X1080", "4k")
        ),
        new Computer(
                new Processor("AMD R9", 6, 3400),
                new Memory(32, "DDR6"),
                new Monitor("1920X1080", "6k")
        )
    });

    private int amount;

    public Computer[] computers = new Computer[amount];

    Brands(int amountOfCompsInBrand, Computer[] comps) {
        this.amount = amountOfCompsInBrand;
        this.computers = comps;
    }
}
