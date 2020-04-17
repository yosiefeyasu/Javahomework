package homeworkone;

class Exam 
{ 
  
    static int MAX = 100; 
  
    public  String[] sortStrings(String[] arr, int n)  
    { 
		String temp;
  
        // Sorting strings using bubble sort 
        for(int x=1;x<n;x++)
		{
		for(int y=0;y<n-x;y++)
			{
			if(arr[y].compareTo(arr[y+1])>0)
				{
				temp=arr[y];
				arr[y]=arr[y+1];
				arr[y+1]=temp;
				
				}
				}
				}
        return arr;
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
    	Exam gfg=new Exam();
        String[] arr = { "kiwi" ,"pineapple", "apple" , "banana" , "orange", "grapes", "watermelon" , "cherry" ,"strawberry" ,"melon"  }; 
        int n = arr.length; 
       String[] sorted=gfg.sortStrings(arr, n); 
        System.out.println("Strings in sorted order are in Descending order : "); 
        for (int i = n-1; i  >=0; i--) 
            System.out.println("String " + (i + 1) + " is " + sorted[i]); 
        System.out.println("==================================================== "); 
        System.out.println("Strings in sorted order are in Ascending order : "); 
        for (int i = 0; i <n; i++) 
            System.out.println("String " + (i + 1) + " is " + sorted[i]); 
        
        System.out.println("===================================================");
        System.out.println("Strings Stats with Vowel : ");  
        String[] starwitvowel=gfg.startWithVowel(arr, n);
        for (int i = starwitvowel.length-1; i  >=0; i--) 
            System.out.println( starwitvowel[i]); 
    } 
    public  String[] startWithVowel(String[] arr, int n) {
    	String[] withvowel=new String[2];
    	int j=0;
    	for (int i = 0; i < n; i++) {
			if(arr[i].startsWith("a") ||arr[i].startsWith("e") ||arr[i].startsWith("i") ||arr[i].startsWith("o") ||arr[i].startsWith("u") ){
				withvowel[j]=arr[i]	;
				j++;
				}
		}
    	return withvowel;
    }
} 
  
