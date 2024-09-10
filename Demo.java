class Demo {
	static int removeOddAndDuplicate(int[] x){
		int sum=0;
		if(x[0]%2==0)
			sum=sum+x[0];
		for(int i=1;i<x.length;i++){
			int j=i-1;
			if(x[i]%2==0){
				while(j>=0 && x[j]!=x[i]){
					j--;
				}
				if(j==-1){
					sum=sum+x[i];
				}
			}				
		}
		return sum;		
	}

	public static void main(String[] args){
		int[] arr = {2,3,4,2,4};
		int sum=removeOddAndDuplicate(arr);
		System.out.println(sum);
	}
}