public class Main{
  public static void main(String args[]){
  	Yuck why = new A().foo();
  	why.bar();
  }
}

interface Yuck{
	void bar();
}

class A{
	
  private char x = 'x';
  
  class C{
  	private char v = 'v';
  	public char u = 'u';
  }
  
  public Yuck foo(){
  	
    char y = 'y';
    final char z = 'z';
    final C c = new C();
    
    c.u = 'n';
    y = 'w';
    class B implements Yuck{
      public void bar(){
        System.out.printf("%s,%s,%s,%s\n", c.u /*later*/, c.v /*not qualified*/, x, z);
        //System.out.println(y); /* Remove the above re-assignment of y and this line will compile in Java 8 but not 7 */
        
      }
    }
    B b = new B();
    b.bar();
    return b;
  }
}
