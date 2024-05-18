class Solution {
    int[] answer = {0,0};
    public int[] solution(int[][] arr) {
        quad(0, 0, arr.length, arr);
        return answer;
    }
    public void quad(int start_x, int start_y, int size, int[][] arr) {
        boolean isCompressed = true;
    
        for (int r = start_x; r < start_x+size; r++) 
            for (int c = start_y; c < start_y+size; c++) 
                if (arr[start_x][start_y]!= arr[r][c]) {
                    isCompressed = false;
                    break;
                }
            

        if (isCompressed || size == 1) {
            answer[arr[start_x][start_y]] += 1;
            return;
        }

        size /= 2;

        quad(start_x, start_y, size, arr);
        quad(start_x, start_y+size, size, arr);
        quad(start_x+size, start_y, size, arr);
        quad(start_x+size, start_y+size, size, arr);
    }   
}