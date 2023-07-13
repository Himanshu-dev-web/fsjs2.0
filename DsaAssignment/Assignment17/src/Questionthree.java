import java.util.*;

public class Questionthree {

	public static int countStudents(int[] students, int[] sandwiches) {
		int zeroCount = 0, oneCount = 0;
		for(int i : students) {
			if(i == 0) zeroCount ++;
			else oneCount ++;
		}
		for(int s: sandwiches) {
			if(s == 0) {
				if(zeroCount == 0) return oneCount;
				zeroCount --;
			}
			else {
				if(oneCount == 0) return zeroCount;
				oneCount--;
			}
		}
		return 0;
	}

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        int hungryStudents = countStudents(students, sandwiches);
        System.out.println(hungryStudents);
    }
}