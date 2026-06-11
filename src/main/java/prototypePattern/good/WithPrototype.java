package prototypePattern.good;

public class WithPrototype {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();

        board.addPiece(new GamePiece("Red", 1));
        board.addPiece(new GamePiece("Blue", 5));

        System.out.println("Original Board:");
        board.showBoardState();

        GameBoard copiedBoard=board.clone();
        System.out.println();
        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }

}
