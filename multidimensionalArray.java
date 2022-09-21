public class multidimensionalArray {
    public static void main(String[] args) {

        String[][] city = new String[2][2];

        city[0][0] = "istanbul";
        city[0][1] = "Bursa";
        city[1][0] = "Konya";
        city[1][1] = "Ankara";

        for (int i = 0; i <= 1; i++) {
            System.out.println("-------------------");
            for (int j = 0; j <= 1; j++) {

                System.out.println(city[i][j]);
            }

        }

    }

}
