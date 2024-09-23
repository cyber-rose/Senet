package senet.model;

/*
 * The game pieces for Senet. Each piece can move, attack, or block.
 */

public class SenetPiece {
    private final Character symbol;

    private boolean visible;
    private boolean movable;

    public SenetPiece(char s) {
        this.symbol = s;
        this.visible = false;
        this.movable = false;
    }

    public Character getSymbol(){
        return this.symbol;
    }

    public boolean isMovable() {
        return this.movable;
    }

    public boolean isVisible() {
        return this.visible;
    }
}
