import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public static void main(String[] args){
    //file reader
    File myFile = new File("ChessPieces.txt");
        
    Scanner fileScanner = new Scanner(myFile);

        while (fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            String[] data = line.split(",")

            String piece_name = datar[0];
            String color = data[lues1];
            int pos_X = Integer.parseInt(data[2]);
            int pos_Y = data[3];

            ChessPiece piece = new ChessPiece(piece_name, color, pos_X, pos_Y);

        }

    }
    catch (FileNotFoundException e){
    }
}


public class ChessPiece{

    //attributes
    private String piece_name;
    private String color;
    private String pos_X;
    private String pos_Y;



    public ChessPiece(String piece_name, string color, String pos_X, String pos_Y){
        this.piece_name = piece_name;
        this.color = color;
        this.pos_X = pos_X;
        this.pos_Y = pos_Y;
    }

    public String getPieceName(){
        return piece_name;
    }

    public void setPieceName(){
        
    }

    private boolean kingMove(String newX, int newY){
        
    }

    private boolean rookMove(String newX, int newY){

    }

    private boolean queenMove(String newX, int newY){

    }

    private boolean bishopMove(String newX, int newY){

    }

    private boolean knightMove(String newX, int newY){

    }

   private boolean pawnMove(String newX, int newY){
        
    }
}