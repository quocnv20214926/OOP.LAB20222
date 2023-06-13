import java.util.Scanner;
public class MonthDays{
	public static void main(String[] args){
		Scanner md = new Scanner(System.in);
		String mInput, yInput;
		int month=0,year=0,days=0;
		while (true){
			System.out.print("enter a month (e.g.January,Jan.,Jan,1)");
			mInput= md.nextLine();
			month= parseMonth(mInput);
			if(month !=-1){
				break;
			}
			System.out.println("invalid month , pls try again:");
		}
		while (true){
			System.out.print("enter a year (e.g 1989)");
			yInput= md.nextLine();
			year =parseYear(yInput);
			if (year!=-1){
				break;
			
			}
			System.out.println("invalid year, pls try again:");
			
		}
		switch (month){
			case 2:
				if (isLeapYear(year)){
					days=29;
				}else{
					days=28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			default:
				days=31;
		}
		System.out.println("the month " + mInput +"of year " +year+ " has day "+days);
		md.close();
	}
	public static int parseMonth(String input){
		switch (input.toLowerCase()){
			case "january":
			case "jan":
			case "1":
				return 1;
			case "february":
			case "feb":
			case "2":
				return 2;
			case "march":
			case "mar":
			case "3":
				return 3;
			case "april":
			case "apr":
			case "4":
				return 4;
			case "may":
			case "5":
				return 5;
			case "june":
			case "jun":
			case "6":
				return 6;
			case "july":
			case "jul":
			case "7":
				return 7;
			case "august":
			case "aug":
			case "8":
				return 8;
			case "september":
			case "sep":
			case "9":
				return 9;
			case "october":
			case "oct":
			case "10":
				return 10;
			case "november":
			case "nov":
			case "11":
				return 11;
			case "december":
			case "dec":
			case "12":
				return 12;
			default:
				return -1;		
		}
	}
	public static int parseYear(String input){
		try{
			int year =Integer.parseInt(input);
			if (year >0){
				return year;
			}else{
				return -1;
			}
		}catch(NumberFormatException e){
			return -1;
		}
	}
	public static boolean isLeapYear(int year){
		if (year%4==0){
			if (year%100==0){
				if (year%400 ==0){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
	
}
