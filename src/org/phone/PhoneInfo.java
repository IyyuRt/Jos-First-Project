package org.phone;

public class PhoneInfo {

	private void phoneName() {
		// TODO Auto-generated method stub
		System.out.println("Phone Name : Iphone 5s");
	}
	private void phoneName(int model, String name) {
		System.out.println("Phone Model:" +model +"\t"+"Phone Name:" +name);
	}

	private void phoneImeiNumber() {
		// TODO Auto-generated method stub
		System.out.println("Imei No : 0001 ");
	}

	private void camera() {
		// TODO Auto-generated method stub
		System.out.println("MB : 12");
	}

	private void storage() {
		// TODO Auto-generated method stub
		System.out.println("storage : 32GB");
	}

	private void osName() {
		// TODO Auto-generated method stub
		System.out.println("OS : MAC");
	}

	public static void main(String[] args) {
		PhoneInfo P = new PhoneInfo();

		P.phoneName();
		P.phoneName(123,"Samsung");
		P.phoneImeiNumber();
		P.camera();
		P.storage();
		P.osName();
	}

}
