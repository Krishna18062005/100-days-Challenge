There is a snake in an n x n matrix grid and can move in four possible directions. Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.

The snake starts at cell 0 and follows a sequence of commands.

You are given an integer n representing the size of the grid and an array of strings commands where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will remain within the grid boundaries throughout its movement.

Return the position of the final cell where the snake ends up after executing commands.

 
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] matr=new int[n][n];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matr[i][j]=l++;
            }
        }
        int cr=0;
        int cc=0;
        for(String cm: commands){
            if(cm.equals("UP")){
                cr-=1;
            }
            else if(cm.equals("DOWN")){
                cr+=1;
            }
            else if(cm.equals("RIGHT")){
                cc+=1;
            }
            else{
                cc-=1;
            }
        }
        return matr[cr][cc];
    }
}
