public class Questionfive {

   static int gameWinner(int n, int k) {
        int ans = 0;
        for(int i = 1; i <= n; i++)
        {
            ans = (ans + k) % i;
        }
        return ans + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int winner = gameWinner(n, k);
        System.out.println(winner);
    }
}