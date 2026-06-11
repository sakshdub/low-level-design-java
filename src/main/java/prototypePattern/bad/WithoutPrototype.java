package prototypePattern.bad;

public class WithoutPrototype {
    public static void main(String[] args) {
        GameBoard gameBoard=new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();


        GameBoard copiedBoard=new GameBoard();
        for(GamePiece piece:gameBoard.getPiece()){
            copiedBoard.addPiece(new GamePiece(piece.getColor(),piece.getPosition()));
        }
        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
