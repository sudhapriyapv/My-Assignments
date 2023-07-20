package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java as week1 sessions";
		
		//int count=0;
		 
		String[] arr = text.split(" ");
		
		System.out.println("After removing the duplicate, the string is: ");
				
		for(int i=0; i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
			if(arr[i].equals(arr[j])) {
				arr[j]="";					
			}
		}
	}
		for(int i=0;i<arr.length;i++) {
		//String replace = text.replaceAll("java", "");
		System.out.print(arr[i]+" ");
		}
	}
}
