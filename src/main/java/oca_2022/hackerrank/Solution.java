package oca_2022.hackerrank;

public class Solution {

    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(s.solution(3, 4, A));
    }
}




