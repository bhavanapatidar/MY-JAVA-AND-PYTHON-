package add;

public class matrix2 {

	public static void main(String[] args) {
		
		int[] values= {1,2,4,7,9};
		System.out.println(values[0]);
		int[] nums= {3,5,8,6};
		for(int num: nums) {
			
			System.out.println(num);
		}
		int[][] grid= {
				{4,7,1},
				{6,2,9},
				{345,8,2,6},
				{34546,446,858}
				
		};
		System.out.println(grid[1][2]);
		System.out.println(grid[2][3]);
		System.out.println(grid[2][0]);
		
		String[][]texts= new String[2][3];
		texts[0][1]="hello there";
		texts[1][1]="i m here";
		System.out.println(texts[0][1]);
		System.out.println(texts[1][1]);
		for(int row=0;row<grid.length;row++) {
			
			for(int col=0;col<grid[row].length;col++) {
				
				System.out.print(grid[row][col] + " \t");
			}
			System.out.println();
		}
				
	   String[][] words= new String[2][4];
	   System.out.println(words[1]);
	   words[1]=new String[3];
	   words[0][1]="hi there";
	   System.out.println(words[0][1]);
			  
	}

}
