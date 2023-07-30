package com.cg.day2;

public class Operators {
	public static void main(String[] args) {
        int i=10,j=5;
        
        //ARITHMETIC OPERATORS
        System.out.println("Add : "+(i-j));
        System.out.println("Sub : "+(i+j));
        System.out.println("Mul : "+(i*j));
        System.out.println("Div : "+(i/j));
        System.out.println("Mod : "+(i%j));
        
        
        //UNARY OPERATOR
        System.out.println("Post increment : "+(i++));
        System.out.println("Pre increment : "+(++i));
        System.out.println("Post decrement : "+(i--));
        System.out.println("Pre decrement : "+(--i));
        System.out.println("Post increment : "+(j++));
        System.out.println("Pre increment : "+(++j));
        System.out.println("Pre decrement : "+(--j));
        System.out.println("Post decrement : "+(j--));
        System.out.println("Concatenation(i+j)= " + i + j);
        
        
        //ASSIGNMENT OPERATOR
        int x=15,y=16;
        System.out.println("x+=2 : "+(x+=2));//
        System.out.println("x-=2 : "+(x-=2));
        System.out.println("x*=2 : "+(x*=2));
        System.out.println("x/=2 : "+(x/=2));
        System.out.println("y&=2 : "+(y&=2));//y value becomes 0
        System.out.println("y|=2 : "+(y|=2));//y value becomes 2
        System.out.println("y^=2 : "+(y^=2));//y value becomes 0 so in next y value is 0 only
        System.out.println("x%=2 : "+(x%=2));
        System.out.println("y &= 0b01010: " + (y &= 0b01010));// y value is 0
        System.out.println("y |= 0b01100: " + (y |= 0b01100));
        System.out.println("y ^= 0b01010: " + (y ^= 0b01010));
        System.out.println("y>>=2 : "+(y>>=2));
        System.out.println("y<<=2 : "+(y<<=2));
        System.out.println("x>>>=1 : "+(x >>>= 1));
        
        
        //COMPARISON OPERATOR or RALTIONAL OPERATOR
        if(i==j) {
            System.out.println("i equals to j : "+i);
            }
        if(i<j) {
        System.out.println("i is less than : "+i);
        }
        if(i<=j) {
            System.out.println("i is less than or equal to j : "+i);
            }
        if(i>=j) {
            System.out.println("i is greater than or equal to j : "+i);
            }
        if(i>j) {
            System.out.println("i greater than j : "+i);
        }
        if(i!=j) {
                 System.out.println("i not equal to j : "+i);
        }
        
        
        //LOGICAL OPERATOR
        if(i<5 && j<6) {
            System.out.println(i);
   }
        if(i<5 || j<4 ) {
            System.out.println(j);
   }
        if(!(x < 5 && x < 10)) {
            System.out.println(i);
   }
        
        
        //TERNARY OPERATOR
        // i=10,j=5,x=2;     
        //        |condtn| ? |    if true     | : |    if false   |  
        int res = ((i > j) ? ((i > x) ? i : x ) : ((j > x) ? j : x));
        System.out.println("Ternary : "+res);
        
        
        //BITWISE OPERATOR
        int a= 0b1010;
        int b = 0b1100;
        System.out.println("a & b : " +( a & b));
        System.out.println("a | b : " +( a | b));
        System.out.println("a ^ b : " +( a ^ b));
        System.out.println("~b : " +( ~b));
        System.out.println("a << 3 : "+( a << 3));
        System.out.println("a >> 1 : " +(a >> 1));
        System.out.println("a >>> 1 : " +(a >>> 1));
        
        
        
     //INSTANCE OF OPERATOR 
                Operators o = new Operators();
                Operators n = new Operators();
                System.out.println("o instanceof Operators : "
                                   + (o instanceof Operators));
                System.out.println("b instanceof Operators : "
                                   + (n instanceof Operators));
                
	} 
        }