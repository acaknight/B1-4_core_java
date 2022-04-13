package day11_exception_handling;
import java.io.IOException;
public class example5 {
	void myMethod(int num)throws IOException, ClassNotFoundException
	{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
	} 


  public static void main(String args[])
  { 
   try
   { 
	   example5  obj=new example5 (); 
        obj.myMethod(1); 
    }
    catch(Exception ex){
     System.out.println(ex);
    } 
  }

}
