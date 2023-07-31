package com.cg.day6;

import com.cg.day6.Icici;
import com.cg.day6.SBI;
import com.cg.day6.IndianBank;


public class BankMain {
	public static void main(String args[]) {
		SBI s;
        IndianBank i;
        Icici c;
    
        s=new SBI();
        s.interest();
        i= new IndianBank();
        i.interest();
        c = new Icici();
        c.interest();
        
	}

}
