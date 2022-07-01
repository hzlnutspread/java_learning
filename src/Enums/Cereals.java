package Enums;

public enum Cereals {

    CAPTAIN_CRUNCH(50, 3.5),
    FROOT_LOOPS(60, 2.1),
    REESES_PUFFS(100, 6.3),
    COCOA_PUFFS(75, 5.0);

    // enums can have fields too
    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;

    }

}

