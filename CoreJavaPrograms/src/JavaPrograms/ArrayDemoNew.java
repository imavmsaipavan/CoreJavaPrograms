package JavaPrograms;

public class ArrayDemoNew {

	public static void main(String[] args) {

		int[][] arr={{10,20,30,40,50},{1,2,3,4,5}};
		
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				System.out.print(arr[r][c]+"\t");
			}
		   System.out.println();
			}
	}

}
