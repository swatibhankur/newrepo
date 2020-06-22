package com.lambda.cjday10;

interface I1{
	void square(int num);

}

public class LambdaSquare {

	public static void main(String[] args) {


		I1 iobj1=(int num) -> {
			int sq=num*num;
			System.out.println(sq);};
			iobj1.square(3);
	}
}


