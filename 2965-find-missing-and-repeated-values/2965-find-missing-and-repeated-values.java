class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>set=new HashSet<>();
        int row=grid.length;
        int col=grid[0].length;
        int arr[]=new int[2];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(set.contains(grid[i][j])){
                    arr[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i=1;i<=(col*row);i++){
            if(!set.contains(i)){
                arr[1]=i;
            }
        }
        return arr;
    }
}