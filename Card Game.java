// There is a card game called "Durak", which means "Fool" in Russian. The game is quite popular in the countries that used to form USSR. The problem does not state all the game's rules explicitly — you can find them later yourselves if you want.

// To play durak you need a pack of 36 cards. Each card has a suit ("S", "H", "D" and "C") and a rank (in the increasing order "6", "7", "8", "9", "T", "J", "Q", "K" and "A"). 
//   At the beginning of the game one suit is arbitrarily chosen as trump.

// The players move like that: one player puts one or several of his cards on the table and the other one should beat each of them with his cards.

// A card beats another one if both cards have similar suits and the first card has a higher rank then the second one. Besides, a trump card can beat any non-trump card whatever 
// the cards’ ranks are. In all other cases you can not beat the second card with the first one.

// You are given the trump suit and two different cards. Determine whether the first one beats the second one or not.

// Input
// The first line contains the tramp suit. It is "S", "H", "D" or "C".

// The second line contains the description of the two different cards. Each card is described by one word consisting of two symbols. 
//   The first symbol stands for the rank ("6", "7", "8", "9", "T", "J", "Q", "K" and "A"), and the second one stands for the suit ("S", "H", "D" and "C").

// Output
// Print "YES" (without the quotes) if the first cards beats the second one. Otherwise, print "NO" (also without the quotes).

// Examples
// inputCopy
// H
// QH 9S
// outputCopy
// YES
// inputCopy
// S
// 8D 6D
// outputCopy
// YES
// inputCopy
// C
// 7H AS
// outputCopy
// NO
_______________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
  
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
               String order="6789TJQKA",suit="SHDC",ch=sc.next(), s1=sc.next(),s2=sc.next();
	            
	            if(s1.charAt(1)==ch.charAt(0) && s2.charAt(1)!=ch.charAt(0)) 
	              System.out.println("YES");
	            else if(s1.charAt(1)==s2.charAt(1)){
	               if(order.indexOf(s1.charAt(0)) > order.indexOf(s2.charAt(0)))
	               System.out.println("YES");
	               else System.out.println("NO");
	           }
	           else System.out.println("NO");
	           
	    }
        catch(Exception e) 	{ return; }
	}
}


