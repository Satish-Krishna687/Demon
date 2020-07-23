class Demo{
	int a,b,c;
	static int x,y;
	Demo(){
		System.out.println("Demo's default constructor executed");
	}
	Demo(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Demo's parameterized constructor executed");
	}
	//static block is executed once before main method
	static{
		System.out.println("Satic block executed");
	}
	//it can have multiple static blocks
	static{
		System.out.println("Static block 2 executed");
	}
	//non static block is executed everytime a object is created
	{
		System.out.println("non-static block executed");
	}
	//it can have multiple non static block
	{
		System.out.println("non-static block 2 executed");
	}
	static void staticDisp(){
		System.out.println("Satic method executed");
	}
	void nonstaticDisp(){
		System.out.println("non staic method executed");
	}
}
class BlocksInJava{
	public static void main(String[] args){
		Demo d1=new Demo();
		d1.nonstaticDisp();
		d1.staticDisp();
		Demo d2=new Demo(1,2,3);
	}

}