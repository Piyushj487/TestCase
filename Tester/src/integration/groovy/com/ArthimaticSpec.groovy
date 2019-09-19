package integration.groovy.com

import spock.lang.Specification;
import main.java.com.Arthimatic

public class ArthimaticSpec extends Specification  {

	Arthimatic ar=new Arthimatic();
	
	def Testsubstract() 
	{	
		int result;
		result=ar.substract(4, 2)
		expect:
		result==2
	}

}

