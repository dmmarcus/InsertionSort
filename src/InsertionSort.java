public class InsertionSort {
	
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
