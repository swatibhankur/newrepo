package com.lambda.cjday10;


interface I{
	void method(String name);
}


public class LambdaName {

	public static void main(String[] args) {
		I iobj=(String name) ->   System.out.println("The name is" + " " +name);
		iobj.method("Demon");

	}

}
