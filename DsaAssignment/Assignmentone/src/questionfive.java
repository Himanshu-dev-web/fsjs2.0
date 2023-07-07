import java.util.Arrays;

public class questionfive {
    public static void main(String[] args) {
        
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m=3,n=3;

        int k = (m+n)-1;
        int a = m-1;
        int b = n-1;

        while(a >= 0 && b >= 0){
            if(num1[a] > num2[b]){
                num1[k--] = num1[a--];
            }
            else{
                num1[k--] = num2[b--];
            }
        }

        if(a >= 0){
            num1[k--] =num1[a--];
        }
        if(b >= 0){
            num1[k--] =num1[b--];
        }

        System.out.println(Arrays.toString(num1));

    }
}
