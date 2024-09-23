package senet.model;

public class SenetModel {
    private SenetPiece[][] senetBoard;
    

    public SenetModel() {
        this.senetBoard = initializeSenetBoard();

    }

    private SenetPiece[][] initializeSenetBoard() {
        //a senet board has 3 rows and 10 columns
        SenetPiece[][] senetBoard = new SenetPiece[3][10]; 

        //set the board in the standard start set up:

        //alternating order of colors on rows 1-10 (0-9)

        return senetBoard;
    }

    //move a senet piece to another block
    public void movePiece() {
        //check if piece can be moved with current roll, forwards or backwards
        //if current space


        //may want game tiles as a separate notion... for reasons...

    }
}
