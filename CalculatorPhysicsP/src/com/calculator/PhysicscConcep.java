package com.calculator;

public class PhysicscConcep {
	float a = 0;
	float b = 0;
	float c = 0;

	// fungsi plus
	public void jumlah(float b, float c) {
		a = b + c;
		System.out.println("hasil metod jumlah = " + a);
	}

	// fungsi minus
	public void minus(float b, float c) {
		a = b - c;
		System.out.println("hasil metod minus = " + a);
	}

	// fungsi kali
	public void kali(float b, float c) {
		a = b * c;
		System.out.println("hasil metod kali = " + a);
	}

	// fungsi bagi
	public void bagi(float b, float c) {
		a = b / c;
		System.out.println("hasil metod pembagi = " + a);
	}
}
