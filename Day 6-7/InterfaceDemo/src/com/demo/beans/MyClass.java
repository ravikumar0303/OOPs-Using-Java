ackage com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class MyClass implements I1,I2{

	@Override
	public void m11() {
		System.out.println("in  method 11");
		
	}

	@Override
	public void m12() {
		System.out.println("in default method 12");
		
	}

	@Override
	public void m21() {
		System.out.println("in default method 21");
		
	}

	@Override
	public void m22() {
		System.out.println("in default method 22");
		
	}

	@Override
	public int m31(int x) {
		// TODO Auto-generated method stub
		 int ans=I1.super.m31(x);
		 int ans1=I2.super.m31(x);
		 return ans+ans1;
	}

}
