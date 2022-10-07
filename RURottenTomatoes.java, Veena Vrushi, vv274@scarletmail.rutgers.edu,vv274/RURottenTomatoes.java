public class RURottenTomatoes{
    public static void main (String[] args){
        int r = Integer.parseInt(args[0]); // r = reviewers
        int m = Integer.parseInt(args[1]); // m = movies
        int a [][] = new int[r][m]; // a = ratings
        int n = 2; // n = index
        for (int i = 0 ;i < r; i++) {
            for (int j = 0 ;j < m; j++) {
                a[i][j] = Integer.parseInt(args[n++]);
            }
        }
        int movieAnswer = 0, maximumTotal = 0;
        for (int x = 0; x < m; x++){
            int total = 0;
            for (int i = 0; i < r; i++){
                total += a[i][x];
            }
            if (total > maximumTotal){
                maximumTotal = total;
                movieAnswer = x;
            }
        }
        System.out.println(movieAnswer);
    }
}