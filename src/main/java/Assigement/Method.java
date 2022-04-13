package Assigement;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Method {
//	public  void sum() {
//		System.out.println("addtion");
//		int a=10;
//		int b =20;
//		
//		System.out.println(a+b);
//	}
	
//	public int product() {
//		int a=10;
//		int b=20;
//		int c=10*20;
//		return (c);
//		
//	}
//	
	public void circumference() {
		
	}

	public void radius() {
		
	}
	public void max(int a,int b,int c) {
		System.out.println("***********max****");
		int max=0;
		if(a>b&&a>c) {
			System.out.println("a is max");
		}else if(b>c) {
			System.out.println("b is max");

		}else {
			System.out.println("c is max");

		}
	}
		public void min(int a,int b,int c) {
			System.out.println("***********min****");
			int minx=0;
			if(a<b&&a<c) {
				System.out.println("a is min");
			}else if(b<c) {
				System.out.println("b is min");

			}else {
				System.out.println("c is min");

			}
		}
		
			public void evenOdd(int a1) {
				
				if(a1%2==0) {
					System.out.println("even umber");
				}else {
					System.out.println("odd number");
				}
			}
				public void vote(int b1) {
					if(b1>=18) {
						System.out.println("elgibile to vote");
					}else {
						System.out.println("not eligible");
					
					
				}
				}
					
					public void marks(int i) {
						if(i>90&&i<=100) {
							System.out.println("AA");
							
						}else if(i>80&&i<=90) {
							System.out.println("AB");
						}else if(i>70&&i<=80) {
							System.out.println("BB");
						}else if(i>60&&i<=70) {
							System.out.println("BC");
						}else if(i>50&&i<=60) {
							System.out.println("CD");

						}else if(i>40&&i<+50) {
							System.out.println("DD");

						}else {
							System.out.println("Fail");
						}
						
						
					}
					
					public void checkPrime(int num) {
						int count=0;
						for(int i=1;i<=num;i++) {
							if (num % i == 0) {
							count++;
							}
						}
					
					if(count==2) {
						System.out.println("prime number");
					}else {
						System.out.println("not prime");
					}
					}

	public static void main(String[] args) {

		Method m = new Method();
		//System.out.println(m.product());
//		m.max(10, 200, 30);
//		m.min(10, 20, 30);
		//m.evenOdd(9);
		//m.vote(18);
		//m.marks(35);
		m.checkPrime(4);
		
	}

	
	
}
