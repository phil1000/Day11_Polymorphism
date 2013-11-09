public class PhoneScript {
	private String myNumber="";
	
	public PhoneScript(String myNumber) {
		this.myNumber=myNumber;
	}

	public void launch() {
	
		// code amended so that we are upcasting Smartphone to a mobile phone
		// we can't access SMartphone methods that aren't in Mobile phone BUT
		// if we call a method that exists in both Mobile and Smart, the SmartPhone method
		// will be called.
		MobilePhone myPhone = new SmartPhone(); // see the upcasting from Smart to Mobile
		myPhone.call(myNumber);
		myPhone.ringAlarm();
		System.out.println(myPhone.playGame("Space Invaders"));
		//myPhone.browseWeb("http://www.bbc.co.uk"); ... cannot call this method as not in MobilePhone class
		testPhone(myPhone); // see method below for what we are trying to test here
		
		MobilePhone newPhone = new MobilePhone(); // this causes a castclass runtime exception in the testphone method as mobile phone cannot be recast to a smartphone
		testPhone(newPhone);
	}
	
	public void testPhone(Phone myPhone) {
		// the incoming parameter type is set to Phone and so only have access to methods defined on the
		// phone interface .. the ringAlarm() and playGame(..) methods return compile errors saying cannot
		// find symbol ringAlarm, playGame 
		
		myPhone.call(myNumber);
		//myPhone.ringAlarm(); .............. would return compile error
		//System.out.println(myPhone.playGame("Space Invaders")); .............. would return compile error
		//myPhone.browseWeb("http://www.bbc.co.uk"); ... .............. would return compile error
		
		SmartPhone downcastPhone = (SmartPhone) myPhone; // have now downcasted the incoming object and so should have access to the methods
		downcastPhone.call(myNumber);
		downcastPhone.ringAlarm();
		System.out.println(downcastPhone.playGame("Space Invaders"));
		downcastPhone.browseWeb("blah web");
	}
	
	public static void main(String[] args) {
		String phoneNumber = "";
		
		if (args.length>0)
			phoneNumber=args[0];
		else
			phoneNumber="07792026450";
			
		PhoneScript myPhone = new PhoneScript(phoneNumber);
		myPhone.launch();
	}

}