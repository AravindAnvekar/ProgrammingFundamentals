package Sep13_14_2023;

public class SwitchDemo {

	public static void main(String[] args) {
		int month = 12;
		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		boolean flag = true;
		boolean flag1 = false;
		
		if(flag) {
			System.out.println("if Month : " + month + " : " + monthString);
		} else if (flag1) {
			System.out.println("else Month : " + month + " : " + monthString);
		} else {
			System.out.println("Month : " + month + " : " + monthString);
		}
		System.out.println(flag ? "Hi":"Hello");
	}

}
