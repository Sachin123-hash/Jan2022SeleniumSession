package Assigement;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Loop {

	public static void main(String[] args) {

		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println("I am Batman ");
			
		}
		
		int b=1;
		do {
			System.out.println("I am Batman");
			b++;
		}while(b<=5);
	


	int n=0;
	while(n++<9) {
		System.out.println("I am Batman" + n);
	}

//System.out.println(n);
	
	for(int k=10;k>0;k--) {
		System.out.println(k);
	}
	System.out.println("*******While*********");
	int l=10;
	while( l>=1) {
		System.out.println(l);
		l--;
		
	}
	System.out.println("******DO***********");
	int m=10;
	do {
		System.out.println(m);
		m--;
	}while(m>=1);
	
	System.out.println("******Hello******");
	int d=1;
	while(d<=10) {
		System.out.println("Hello World");
		d++;
	}
	
	System.out.println("******1to10******");
	int a=1;
	while(a<=10) {
	System.out.println(a);
	a++;
	}
	
	int c=10;
	if(c%2==0) {
		System.out.println("postive number"+c);
	}else {
		System.out.println("negative number" + c);
	}
	
	
	//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
	double a1=25.5;
	double b1=3.5;
	double b2=3.5;
	double b3=3.5;
	double c1=40.5;
	double d1=4.5;
	
	System.out.println((a1*b1-b2*b3) / (c1-d1)); //2.138888888888889
	
	System.out.println("Hello");
	System.out.println("Sachin");
	
	int a2=100;
	int a3=178;
	int a4=87;
	
	if(a2>a3 & a2>a4) {
		System.out.println("a2 is greatest"+ a2);
		
	}else if(a3>a4) {
		System.out.println("a3 is greatest"+ a3);
	}else {
		System.out.println("a4 is greates"+a4);
	}
	
	int a5=-11;
	
	if(a5>0) {
		System.out.println("number is postive" +a5);
	}else if(a5<0) {
		System.out.println("number is negative"+a5);
	}
	else {
		System.out.println("number is zero");
	 
	
}
}
}
