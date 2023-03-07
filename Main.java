import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputString = sc.nextLine();

        // extracting values from the string
        String []stringArray = inputString.split("#");

        int newElement = Integer.parseInt(stringArray[0]);
        int insertAfterIndex = Integer.parseInt(stringArray[1]);
        int []newArray = Arrays.stream(stringArray[2].split(",")).mapToInt(Integer::parseInt).toArray();

        // printing new array after insertion
        System.out.println(Arrays.toString(InsertElementInArray.insertElement(newElement, insertAfterIndex, newArray)));

        // closing resource
        sc.close();
    }
}