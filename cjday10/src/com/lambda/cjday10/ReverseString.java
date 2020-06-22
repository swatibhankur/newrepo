package com.lambda.cjday10;

interface I2{
	void reverse(String name);
}


public class ReverseString {

	public static void main(String[] args) {
		
		I2 iobj2=(String name) -> {
			String s1="Devil";
			String s2="";
			int n=s1.length()-1;
			for(int i=n;i>=0;i--) {
				s2=s2+s1.charAt(i);
			
			}
			System.out.println("The reversed string is"+ " "+s2);
		};
		iobj2.reverse("Devil");
		
	}

}
