package u3pp;

/**
 * I could be on Summoner's Rift right now slaying Baron Nashor.
 * This code should return true or false as to whether a given date is a leap year.
 * @ian 
 *
 */

public class LeapYear {
	/**
	 * This code first checks to ensure that the given date is past 1582. It then checks to see whether the given date is divisible by four. 
	 * It then checks to make sure that the date is not divisible by 100, or if it is, it much also be divisible by 400.
	 */
	public static boolean isLeapYear(int year) {
		if ((year >= 1582 && year % 4 == 0)&&(year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
}