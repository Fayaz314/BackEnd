public class array {
	public static void main(String args[]){
		int[][] college = new int[3][];
		college[0] = new int[]{0,1,2,3};
		college[1] = new int[]{4,5};
		college[2] = new int[]{6,7,8};
 
		for(int[] row : college){
			System.out.println(arrays.toString(row));
		}
	}
}
