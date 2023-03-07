public class InsertElementInArray {
    public static int[] insertElement(int newElement, int insertAfterIndex, int []array) {
        // creating new array of size + 1 
        int []newArray = new int[array.length + 1];
        int index = 0;

        for(int i = 0; i < newArray.length; i++) {
            if(i == insertAfterIndex + 1) {
                newArray[i] = newElement;
            } else {
                newArray[i] = array[index++];
            }
        }

        // returning new array
        return newArray;
    }
}