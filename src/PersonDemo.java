import org.checkerframework.common.value.qual.StaticallyExecutable;

import com.google.thirdparty.publicsuffix.PublicSuffixType;

public class PersonDemo {

	public static void main(String[] args) {
	
	 Personp P1=new PersonDemo();
	 
	 System.out.Println(P1.name);
	 
	 System.out.print(P1.age);
	 System.out.print(P1.phone);
	 P1.greet();
	 P1.name="Sivamani";
	 P1.age=30;
	 P1.phone=9848022338L;
	 System.out.print(P1.name);
	 System.out.printin(P1.age);
	System.out.print(P1.phone);
	 P1.greet();
	}	 Person.bye();