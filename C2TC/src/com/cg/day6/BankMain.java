package com.cg.day6;

import com.cg.day6.IciciBank;
import com.cg.day6.SBIBank;
import com.cg.day6.IndianBank;


public class BankMain {
	public static void main(String args[]) {
		SBIBank s;
        IndianBank i;
        IciciBank c;
    
        s=new SBIBank();
        s.interest();
        i= new IndianBank();
        i.interest();
        c = new IciciBank();
        c.interest();
        
	}

}
