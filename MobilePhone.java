package program.program1;

public class MobilePhone {

		public void powerOn() {
			System.out.println("Power On");
		}
		public void enterPasscode() {
			System.out.println("Enter Passcode");
		}
		public void sendMessage() {
			System.out.println("Send Message");
		}
		public void makePhonecall() {
			System.out.println("Make Phonecall");
		}
public static void main(String[] args)	{
		MobilePhone iphone=new MobilePhone();
		iphone.powerOn();
		iphone.enterPasscode();
		iphone.sendMessage();
		iphone.makePhonecall();
	}
	}

