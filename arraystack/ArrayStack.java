/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class ArrayStack
{
	public static void main(String[] args) {
	    ArrayStack stack=new ArrayStack();
	    stack.push(9);
	    stack.push(10);
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
		
	}
	static final int max=30;
	int arr[]=new int[max];
	int top;
	ArrayStack(){
	    top=-1;
	}
	public void push(int val){
	    if(top==max-1){ 
	    throw new IndexOutOfBoundsException("Full");
	    }
	    arr[++top]=val;
	}
	public int pop(){
	    if(top==-1) {
	        throw new IndexOutOfBoundsException("Empty");
	    }
	    return arr[top--];
	}
	public int peek(){
	    return arr[top];
	}
	
}
