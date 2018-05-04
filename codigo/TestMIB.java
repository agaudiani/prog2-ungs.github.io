package tad_MIB;

import tad_MIB.MIB;

public class TestMIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MIB mib = new MIB(100000,100000);
		
		mib.setearValor(20, 30, true);
		mib.setearValor(20, 31, true);
		mib.setearValor(20, 30, false);
		
		System.out.println(mib.leerValor(20, 30));  //  false
		System.out.println(mib.leerValor(20, 31));  // true
		System.out.println(mib.leerValor(20, 32)); // false

	}

}
