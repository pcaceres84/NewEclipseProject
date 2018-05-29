package syntaxReview;

public class AllMethods {
	
	public static void main(String[] args) {
		//className        variableName			 = new className
		AllMethods			callingOtherMethods=new AllMethods();
		//callingOtherMethods.checkOddNumber();
		//callingOtherMethods
		
		//int x= callingOtherMethods.sumTwoNumbers(4, 6);
		//System.out.println(x);
		//System.out.println(callingOtherMethods.subTwoNumbers(12, 11));
		
		//System.out.println(callingOtherMethods.multTwoNumbers(12, 12));
		
		System.out.println(callingOtherMethods.divTwoNumbers(12, 4));
		
		
		
		}
	
	
	
	

//	public void checkOddNumber() {
//		int a=10;
//		if (a%2!=0) {
//		System.out.println(a+ "is an odd number");
//		}else {
//		System.out.println(a+ "is an even number");
//		}
//		
//		public void sayHello() {
//		String a="Calling from inside method ";
//		System.out.println(a);
//		
//		}
//		
//		public boolean isOdd() {
//			
//			int a= 10;
//			if(a%2!=0) {
//				return true;
//			}else {
//				return false;
//				
//			}
//			}
		
//method to return sum of 2 numbers
	//public int sumTwoNumbers(int a, int b) {
		//return a+b;
		
				
		

	//public in subTwoNumbers(int a, int b) {
		//return a-b;
		

	
	private int multTwoNumbers(int a, int b) {
		return a*b;
	}
	
	protected int divTwoNumbers(int a, int b) {
		return a/b;
		
	}
	
}
