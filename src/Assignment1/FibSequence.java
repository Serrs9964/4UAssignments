/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class FibSequence {

    /**
     * @param args the command line arguments
     */
    
        public int fib(int n) {
            //base case
       if (n==1 || n==0){
           return 1;
       }
       //recursive call
       return fib(n-1)+fib(n-2);
            
    }
        public static void main(String[] args) {
        // TODO code application logic here
            FibSequence test = new FibSequence();
       int n = test.fib (100);
            System.out.println("The number is "+n);
    }
        public void solveMaze(int[][] maze, int startX, int startY, int finishX, int finishY){
            maze[startX][startY]=2;
            //basecase
            if(startX==finishX && startY == finishY){
                //print solution
            }
            //recursive call section
            int up = startY -1;
            int down = startY +1;
            int right = startX +1;
            int left = startX -1;
            //make sire they are valid before calling
            if(up >= 0&&up<=maze[startX].length){
                solveMaze(maze,startX, up,finishX,finishY);
            }if(right >= 0&&right<=maze.length){
                solveMaze(maze,right, startY,finishX,finishY);
            }if(down >= 0&&down<=maze[startX].length){
                solveMaze(maze,startX, down,finishX,finishY);
            }if(left >= 0&&left<=maze.length){
                solveMaze(maze,left, startY,finishX,finishY);
            }
    }


}
