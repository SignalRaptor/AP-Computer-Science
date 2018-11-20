package dotEight;
/**
 * @author Thomas Morey
 * @version 11/18/2018
 * V7
 */
import java.util.*;
public class GradesTester {
	public static void main(String[] args) {
		Grades GradeObj = new Grades();
		
		Scanner in = new Scanner(System.in);
		
		double grade1, grade2, grade3, grade4, grade5, grade6 = 0;
		String name = "";
		System.out.println("How many Students are there?");
		int num = in.nextInt();
		Grades[] grades = new Grades[num];
		
		for(int t = 0; t < grades.length; t++) {
			System.out.println("Would you like to auto Gen name? (1 = yes, 2 = no)");
			int ans = in.nextInt();
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			if(ans == 2) {
				System.out.println("What is Student " + t + "'s name?");
				grades[t].setName(in.nextLine());
				try
				{     
					Thread.sleep(1000);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
			}
			else {
				name = GradeObj.randName();
			}

			System.out.println("Would you like to auto Gen grade? (1 = yes, 2 = no)");
			ans = in.nextInt();
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			if(ans == 2) {
				System.out.println("What is Student " + t + "'s Grade? Please Enter 6 scores all in one line.");
				grade1 = in.nextDouble();
				grade2 = in.nextDouble();
				grade3 = in.nextDouble();
				grade4 = in.nextDouble();
				grade5 = in.nextDouble();
				grade6 = in.nextDouble();
				grades[t] = new Grades(name, grade1, grade2, grade3, grade4, grade5, grade6);
				try
				{     
					Thread.sleep(1000);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
			}
			else {
				double[] gArr;{
					gArr = GradeObj.randGrade();
				}
				for(int i = 0; i < gArr.length; i++) { 
					double temp = 0;
					temp = gArr[i];
					grade1 = 0;
					grade2 = 0;
					grade3 = 0;
					grade4 = 0;
					grade5 = 0;
					grade6 = 0;
					switch(i) {
					case 1:
						grade1 = temp;
						break;
					case 2:
						grade2 = temp;
						break;
					case 3:
						grade3 = temp;
						break;
					case 4:
						grade4 = temp;
						break;
					case 5:
						grade5 = temp;
						break;
					case 6:
						grade6 = temp;
						break;
					default:
						break;
					}
					grades[t] = new Grades(name, grade1, grade2, grade3, grade4, grade5, grade6);
				}
				
			}
		}
		System.out.println("            Grades            ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Name: " + grades[i].getName());
			System.out.println("Average Grade: " + grades[i].getAverage());
			System.out.println("  1    2    3    4    5    6  ");
			System.out.println(" " + grades[i].getSub1() + " " + grades[i].getSub2() + " " + grades[i].getSub3() + " " + grades[i].getSub4() + " " + grades[i].getSub5() + " " + grades[i].getSub6());
		}

		/*double grade1A, grade2A, grade3A, grade4A, grade5A, grade6A;
		String nameA;
		System.out.println("What is Student One's name?");
		nameA = in.nextLine();
		try
		{     
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		System.out.println("What are Student One's grades? Please input 6 numbers in a line.");
		grade1A = in.nextDouble();
		grade2A = in.nextDouble();
		grade3A = in.nextDouble();
		grade4A = in.nextDouble();
		grade5A = in.nextDouble();
		grade6A = in.nextDouble();
		Grades student1 = new Grades(nameA, grade1A, grade2A, grade3A, grade4A, grade5A, grade6A);
		try
		{     
			Thread.sleep(5000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}

		double grade1B, grade2B, grade3B, grade4B, grade5B, grade6B;
		String nameB;
		System.out.println("What is Student Two's name?");
		nameB = in.nextLine();
		nameB = in.nextLine();
		try
		{     
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		System.out.println("What are Student Two's grades? Please input 6 numbers in a line.");
		grade1B = in.nextDouble();
		grade2B = in.nextDouble();
		grade3B = in.nextDouble();
		grade4B = in.nextDouble();
		grade5B = in.nextDouble();
		grade6B = in.nextDouble();
		Grades student2 = new Grades(nameB, grade1B, grade2B, grade3B, grade4B, grade5B, grade6B);
		try
		{     
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}

		System.out.println("Grades for" + nameA);
		student1.print();
		System.out.println();
		System.out.println("Grades for" + nameB);
		student2.print(); */
		in.close();
	}
}