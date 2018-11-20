package dotEight;
//V7
import java.util.*;
public class Grades {
	private double sub1, sub2, sub3, sub4, sub5, sub6, average, minimum, maximum;
	String name;
	double[] grades = new double[6];
	Grades(String nameIn, double s1, double s2, double s3, double s4, double s5, double s6){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;
		sub6 = s6;
		name = nameIn;
		average = ((sub1 + sub2 + sub3 + sub4 + sub5 + sub6)/6);
	}
	Grades() {
		//Empty Constructor
	}
	
	public double average() {
		return ((sub1 + sub2 + sub3 + sub4 + sub5 + sub6)/6);
	}
	
	public String isFailing() {
		boolean fail = false;
		String failMsg;
		if(sub1 < 60 || sub2 < 60 || sub3 < 60 || sub4 < 60 || sub5 < 60 || sub6 < 60) {
			fail = true;
		}
		if(fail == true) {
			failMsg = "This student is Failing!";
		}
		else {
			failMsg = "This Student is Passing!";
		}
		return failMsg;
	}
	
	public void print() {
		System.out.println("            Grades            ");
		System.out.println("Name: " + name + "\t" + "Average: " + average);
		System.out.println("  1    2    3    4    5    6  ");
		System.out.println(" " + sub1 + " " + sub2 + " " + sub3 + " " + sub4 + " " + sub5 + " " + sub6);
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	static double getRandomNumberDblRange(double min, double max) {
	    if (min >= max) {
	        throw new IllegalArgumentException("max must be greater than min");
	    }
	    Random r = new Random();
	    return min + (max - min) * r.nextDouble();
	}
	
	public String randName() {
		int randInt = getRandomNumberInRange(1, 100);
		switch(randInt){
		case 1:
			name = "Tiamat";
			break;
		case 2:
			name = "Kasandra";
			break;
		case 3:
			name = "Haroon";
			break;
		case 4:
			name = "Heirani";
			break;
		case 5:
			name = "Ithiel";
			break;
		case 6:
			name = "Mansel";
			break;
		case 7:
			name = "Lennart";
			break;
		case 8:
			name = "Aristaios";
			break;
		case 9:
			name = "Branca";
			break;
		case 10:
			name = "Avinash";
			break;
		case 11:
			name = "Danilo";
			break;
		case 12:
			name = "Nur";
			break;
		case 13:
			name = "Quanah";
			break;
		case 14:
			name = "Duke";
			break;
		case 15:
			name = "Thomas";
			break;
		case 16:
			name = "Sean";
			break;
		case 17:
			name = "Dylan";
			break;
		case 18:
			name = "William";
			break;
		case 19:
			name = "Tabitha";
			break;
		case 20:
			name = "Joseph";
			break;
		case 21:
			name = "Joshua";
			break;
		case 22:
			name = "Alice";
			break;
		case 23:
			name = "Kathryn";
			break;
		case 24:
			name = "Kris";
			break;
		case 25:
			name = "Asriel";
			break;
		case 26:
			name = "Susie";
			break;
		case 27:
			name = "Stacy";
			break;
		case 28:
			name = "Luke";
			break;
		case 29:
			name = "Danell";
			break;
		case 30:
			name = "Rebecca";
			break;
		case 31:
			name = "Robert";
			break;
		case 32:
			name = "Richard";
			break;
		case 33:
			name = "James";
			break;
		case 34:
			name = "Oliver";
			break;
		case 35:
			name = "Jessica";
			break;
		case 36:
			name = "Leo";
			break;
		case 37:
			name = "Johnathan";
			break;
		case 38:
			name = "Rose";
			break;
		case 39:
			name = "Kimmy";
			break;
		case 40:
			name = "Alec";
			break;
		case 41:
			name = "Dave";
			break;
		case 42:
			name = "Jade";
			break;
		case 43:
			name = "Jane";
			break;
		case 44:
			name = "Jaden";
			break;
		case 45:
			name = "Kyle";
			break;
		case 46:
			name = "Gerald";
			break;
		case 47:
			name = "Jake";
			break;
		case 48:
			name = "Jacob";
			break;
		case 49:
			name = "Blake";
			break;
		case 50:
			name = "Andreas";
			break;
		case 51:
			name = "Carlos";
			break;
		case 52:
			name = "Q.J.";
			break;
		case 53:
			name = "Destiny";
			break;
		case 54:
			name = "Mathew";
			break;
		case 55:
			name = "Riley";
			break;
		case 56:
			name = "Clayton";
			break;
		case 57:
			name = "Tanna";
			break;
		case 58:
			name = "Hannah";
			break;
		case 59:
			name = "Anthony";
			break;
		case 60:
			name = "Dustin";
			break;
		case 61:
			name = "Alvin";
			break;
		case 62:
			name = "Noah";
			break;
		case 63:
			name = "Tavi";
			break;
		case 64:
			name = "Zephyr";
			break;
		case 65:
			name = "Donnie";
			break;
		case 66:
			name = "Grace";
			break;
		case 67:
			name = "Haskelle";
			break;
		case 68:
			name = "Kaleb";
			break;
		case 69:
			name = "Steven";
			break;
		case 670:
			name = "Steve";
			break;
		case 71:
			name = "Brian";
			break;
		case 72:
			name = "Dan";
			break;
		case 73:
			name = "Arin";
			break;
		case 74:
			name = "Arron";
			break;
		case 75:
			name = "Erin";
			break;
		case 76:
			name = "Ethan";
			break;
		case 77:
			name = "Adria";
			break;
		case 78:
			name = "Wilfred";
			break;
		case 79:
			name = "Leah";
			break;
		case 80:
			name = "Jesse";
			break;
		case 81:
			name = "Nathan";
			break;
		case 82:
			name = "Patrick";
			break;
		case 83:
			name = "Rein";
			break;
		case 84:
			name = "Patricia";
			break;
		case 85:
			name = "Adam";
			break;
		case 86:
			name = "Anthony";
			break;
		case 87:
			name = "Allisa";
			break;
		case 88:
			name = "Justin";
			break;
		case 89:
			name = "Henry";
			break;
		case 90:
			name = "Haily";
			break;
		case 91:
			name = "Johanna";
			break;
		case 92:
			name = "Gabrial";
			break;
		case 93:
			name = "Fred";
			break;
		case 94:
			name = "Felix";
			break;
		case 95:
			name = "Todd";
			break;
		case 96:
			name = "Tyler";
			break;
		case 97:
			name = "Mark";
			break;
		case 98:
			name = "Ian";
			break;
		case 99:
			name = "Jack";
			break;
		case 100:
			name = "George";
			break;
		}
		return name;
	}

	public double[] randGrade() {
		double[] grades = new double[6];
		for(int i = 0; i < 6; i++) {
			grades[i] = getRandomNumberDblRange(0, 100);
		}
		return (grades);
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 * @return 
	 */
	public void setName(String nameOut) {
		this.name = nameOut;
	}
	/**
	 * @return the minimum
	 */
	public double getMinimum() {
		return minimum;
	}
	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}
	/**
	 * @return the maximum
	 */
	public double getMaximum() {
		return maximum;
	}
	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}
	/**
	 * @return the sub1
	 */
	public double getSub1() {
		return sub1;
	}
	/**
	 * @param sub1 the sub1 to set
	 */
	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}
	/**
	 * @return the sub2
	 */
	public double getSub2() {
		return sub2;
	}
	/**
	 * @param sub2 the sub2 to set
	 */
	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}
	/**
	 * @return the sub3
	 */
	public double getSub3() {
		return sub3;
	}
	/**
	 * @param sub3 the sub3 to set
	 */
	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}
	/**
	 * @return the sub4
	 */
	public double getSub4() {
		return sub4;
	}
	/**
	 * @param sub4 the sub4 to set
	 */
	public void setSub4(double sub4) {
		this.sub4 = sub4;
	}
	/**
	 * @return the sub5
	 */
	public double getSub5() {
		return sub5;
	}
	/**
	 * @param sub5 the sub5 to set
	 */
	public void setSub5(double sub5) {
		this.sub5 = sub5;
	}
	/**
	 * @return the sub6
	 */
	public double getSub6() {
		return sub6;
	}
	/**
	 * @param sub6 the sub6 to set
	 */
	public void setSub6(double sub6) {
		this.sub6 = sub6;
	}
}
