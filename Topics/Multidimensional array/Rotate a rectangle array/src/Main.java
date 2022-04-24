import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] myflatArray = new int[n][m];
        int[][] myverticleArray = new int[m][n];

        for (int row = 0; row < myflatArray.length; row++) {
            for (int col = 0; col < myflatArray[row].length; col++) {
                myflatArray[row][col] = scanner.nextInt();
            }
        }

        // System.out.println(n + " " + m);  //print checks to see if we have what we think
        // System.out.println(Arrays.deepToString(myflatArray)); //print checks to see if we have what we think

        for (int row2 = 0; row2 < n; row2++) {
            for (int col2 = 0; col2 < m; col2++) {
                myverticleArray[col2][n - 1 - row2] = myflatArray[row2][col2];
            }
        }
        //    System.out.println(Arrays.deepToString(myverticleArray));  //print check to see if we have what we think

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myverticleArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}