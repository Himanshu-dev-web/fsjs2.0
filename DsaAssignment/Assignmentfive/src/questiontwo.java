import java.util.Arrays;

public class questiontwo {
    public static void main(String[] args) {
        
        int n=5;
        long l=0,r=n;
        long mid,k;
        while(l<=r){
            mid=l+(r-l)/2;
            k=mid*(mid+1)/2;
            if(k==n){
                System.out.println((int)mid);
            }
            else if(k<n){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println((int)r);
    }
}
