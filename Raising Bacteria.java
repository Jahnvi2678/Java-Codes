// You are a lover of bacteria. You want to raise some bacteria in a box.

// Initially, the box is empty. Each morning, you can put any number of bacteria into the box. And each night, every bacterium in the box will split into two bacteria. 
//   You hope to see exactly x bacteria in the box at some moment.

// What is the minimum number of bacteria you need to put into the box across those days?

// Input
// The only line containing one integer x (1 ≤ x ≤ 109).

// Output
// The only line containing one integer: the answer.

// Examples
// inputCopy
// 5
// outputCopy
// 2
// inputCopy
// 8
// outputCopy
// 1
// Note
// For the first sample, we can add one bacterium in the box in the first day morning and at the third morning there will be 4 bacteria in the box. 
//   Now we put one more resulting 5 in the box. We added 2 bacteria in the process so the answer is 2.

// For the second sample, we can put one in the first morning and in the 4-th morning there will be 8 in the box. So the answer is 1.
___________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Integer.bitCount(n));
	    }
	    catch (Exception e){ return;}
		
	}
		
}
