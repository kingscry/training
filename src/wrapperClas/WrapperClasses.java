package wrapperClas;

public class WrapperClasses {
	public static void main(String[] args) {
		int i=10;
		Integer x=new Integer(i);//boxing
		System.out.println("x:"+x);
		Integer z=Integer.valueOf(i);
		
		Integer y=i;//auto boxing
		System.out.println("y:"+y);
		
		Integer c=30;
		System.out.println("z:"+z);
		int a=c.intValue();//unboxing
		Boolean flag=true;
		boolean b=flag.booleanValue();//unboxing
		System.out.println("a:"+a+" "+"c: "+c);
		
		
		Character ch='a';//auto-boxing
		char ch1=ch;//auto-boxing
		
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);//here also address are being compared but both got same address both are literals
		String s3=new String("Hello");
		System.out.println(s1==s3);//here address or reference are being compared which is different so false
		String s4=new String("Hello");
		System.out.println(s3==s4);//Still false
		Integer k=12;
		Integer l=12;
		System.out.println("128 try");// when both k and l are 128 it is giving false
		System.out.println(k==l);//references(address) are not getting compared, they are getting
		//auto unboxed and values are being compared
		
		Integer i1=10;
		Short s12=2;
		Long l1=(long)s12 + i1;//here s12 is being unboxed and forced type conversion taking place
		System.out.println(l1);
		
		//String str=(String)(s12+l1);
		
		
		}

}
