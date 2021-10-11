import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AarrayTwoDirection
 */
public class AarrayTwoDirection {
    public static void main(String[] args) throws IOException{
        int row = 4;
        int col = 2;
        BufferedReader Stdin = new BufferedReader(new InputStreamReader(System.in));
        int array[][] = new int[row][col];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print("input ["+i+"]["+j+"] = ");
                array[i][j] = Integer.parseInt(Stdin.readLine());
            }
        }
        int total = 0;
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    total += array[i][j];
                }
            }
            System.out.println("Total = "+total);
        }
    }