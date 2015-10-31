public class InsertionSort {
	
	
	public static void main (String[] args){
		
		int[] num = new int[args.length];
		try{
		
			for (int i = 0; i < args.length; ++i){
			
				num[i] = Integer.parseInt(args[i]);
				
			}
			
		} 
		
		catch (Exception e){
			System.exit(-1);
		}
		
		for (int i = 0; i < num.length; ++i){
			
			System.out.print(num[i] + " ");
			
		}
		
		sort(num);
		
		System.out.println();
		
		for (int i = 0; i < num.length; ++i){
			
			System.out.print(num[i] + " ");
			
		}
		
		
		
	}
	
	public static void sort(int[] num){
		
		for (int j = 1; j < num.length; ++j){
			
			int key = num[j];
			int i = j - 1;
			
			while (i >= 0 && num[i] > key){
				
				num[i+1] = num[i];
				i = i - 1;
			}
			num[i+1] = key;
		}
		
		return;
	}
}
