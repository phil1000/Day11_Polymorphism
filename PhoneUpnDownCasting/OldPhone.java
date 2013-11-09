import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class OldPhone implements Phone {
	public void call(String callingNumber) {
		//get current date time with Calendar()
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Number <" + callingNumber + "> called at " + dateFormat.format(cal.getTime()));
	}
}