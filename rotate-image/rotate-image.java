class Solution {
    public void rotate(int[][] matrix) {
        int tempOne;
        int tempTwo;
        int a = matrix.length;
        if (a != 1) {
            if (a % 2 != 0) {
                for (int i = 0; i <= a / 2; i++) {
                    for (int j = 0; j < a / 2; j++) {
                        tempOne = matrix[j][a-1-i];
                        matrix[j][a-1-i] = matrix[i][j];
                        tempTwo = matrix[a-1-i][a-1-j];
                        matrix[a-1-i][a-1-j] = tempOne;
                        tempOne = matrix[a-1-j][i];
                        matrix[a-1-j][i] = tempTwo;
                        matrix[i][j] = tempOne;
                    }
                }
            } else {
                for (int i = 0; i < a / 2; i++) {
                    for (int j = 0; j < a / 2; j++) {
                        tempOne = matrix[j][a-1-i];
                        matrix[j][a-1-i] = matrix[i][j];
                        tempTwo = matrix[a-1-i][a-1-j];
                        matrix[a-1-i][a-1-j] = tempOne;
                        tempOne = matrix[a-1-j][i];
                        matrix[a-1-j][i] = tempTwo;
                        matrix[i][j] = tempOne;
                    }
                }    
            }
        }
    }
}