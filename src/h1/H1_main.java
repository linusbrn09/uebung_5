package h1;

public class H1_main {
	public static void main(String[] args) {

        int[] myArray = {5, 6, 7, 10};
        int[] reversed = new int[myArray.length];

        int j = 0;
        for (int i = myArray.length - 1; i >= 0; i--) {
            reversed[j] = myArray[i];
            j++;
        }
	}


}
