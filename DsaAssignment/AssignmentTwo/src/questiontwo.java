
public class questiontwo {

   
    public int distributeCandies(int[] candyType) {
        
        HashSet<Integer> set = new HashSet<>();

        int n = candyType.length;

        for(int i=0; i<n;i++){
            set.add(candyType[i]);
        }


        return min(set.size(),n/2);
    }

}
