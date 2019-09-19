package test.groovy.com

import spock.lang.Specification
import main.java.com.Arthimatic

public class ArthimaticSpec extends Specification  {

	Arthimatic ar=new Arthimatic();
	
	def TestAdd() 
	{	
		int result;
		result=ar.add(3, 4)
		expect:
		result==7
	}

}

