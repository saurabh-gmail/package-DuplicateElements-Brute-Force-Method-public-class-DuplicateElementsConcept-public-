package DuplicateElements;   //Brute Force Method

public class DuplicateElementt {

	public static void main(String[] args) {
		int[]a = {7,3,2,7,1,3};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				  if(a[j]==a[i] && i!=j) {
					  System.out.print(a[j]+" ");
				  }
			}
		}

	}

}
