package org.bellotech;

public class ChesseGame {

    public static void main(String[] args) {

        System.out.println(getEndPosition("5h",11,25));
    }
    public static String endPosition(String start, int R, int C) {
        int row = start.charAt(0) - '1';
        int col = start.charAt(1) - 'a';
        row = (row + R) % 8;
        col = (col + C) % 8;

        String endpoint = (char)(row + '1') + "" + (char)(col+'a');
        return endpoint;
}
    public static  String getEndPosition(String startPosition, int row, int column){
        int BOARD_SIZE = 8;
        String columnslabel ="abcdefgh";
        int startRow = Character.getNumericValue(startPosition.charAt(0));
        char startColChar = startPosition.charAt(1);
        int startColumn =columnslabel.indexOf(startColChar)+1;
        int endRow = (startRow-1 + row) % BOARD_SIZE + 1;
        int endCol = (startColumn-1 + column) % BOARD_SIZE + 1;
        char  endColChar =  columnslabel.charAt(endCol-1);
       String endpoint = endRow+""+endColChar;
        return endpoint;

}
}
