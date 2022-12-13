
package pack;

import com.java.Test.TesPublic;

public class FirstCode {

	
	private void testPrivate() {
		System.out.println("I am from Private block");
	}
	
	
	public static void main(String[] args) {

		TesPublic tesPublic=new TesPublic();
		tesPublic.show();
		TestProtected testProtected=new TestProtected();
		testProtected.testPro();
		FirstCode code=new FirstCode();
		code.testPrivate();

	}

}
