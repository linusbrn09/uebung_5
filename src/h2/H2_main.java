package h2;

public class H2_main {
	public static void main(String[] args) {

        int n = 299;
        int digits = 0;

        int temp = n;
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
        }

        int[] a = new int[9]; 


        temp = n;
        for (int i = 8; i >= 9 - digits; i--) {
            a[i] = temp % 10;
            temp /= 10;
        }
	}

}
