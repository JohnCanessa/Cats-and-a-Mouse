import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
* Cats and Mouse
*/
public class Solution {

  // Complete the catAndMouse function below.
  static String catAndMouse(int x, int y, int z) {

    String result = "";

    // ???? ????
    // System.out.println("catAndMouse <<< cat x: " + x + " cat y: " + y + " mouse
    // z: " + z);

    // **** compute the distance from the first cat (A) and the second cat (B) to
    // the mouse ****
    int catAToMouse = Math.abs(x - z);
    int catBToMouse = Math.abs(y - z);

    // ???? ????
    // System.out.println("catAndMouse <<< d1: " + d1 + " d2: " + d2);

    // **** determine what happens based on the distances ****
    if (catAToMouse > catBToMouse)
      result = "Cat B";
    else if (catAToMouse < catBToMouse)
      result = "Cat A";
    else
      result = "Mouse C";

    // **** return the proper message ****
    return result;
  }

  private static final Scanner scanner = new Scanner(System.in);

  ///
  ///
  ///
  public static void main(String[] args) throws IOException {

    // ???? ????
    // System.out.println("main <<< cats and mouse\n");

    // **** ****
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int qItr = 0; qItr < q; qItr++) {
      String[] xyz = scanner.nextLine().split(" ");

      int x = Integer.parseInt(xyz[0]);

      int y = Integer.parseInt(xyz[1]);

      int z = Integer.parseInt(xyz[2]);

      String result = catAndMouse(x, y, z);

      bufferedWriter.write(result);
      bufferedWriter.newLine();
    }

    // **** close the buffered writer ****
    bufferedWriter.close();

    // **** close the scanner ****
    scanner.close();
  }

}