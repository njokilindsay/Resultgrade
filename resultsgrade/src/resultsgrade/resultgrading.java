package resultsgrade;
import java.util.Scanner;
public class resultgrading {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("What is your name?");
		String name= input.nextLine();
		System.out.print("Registration number:");
		String regno= input.next();
		System.out.print("Which sem are you in:");
		Float sem= input.nextFloat();
		String []unitname= {"Database","Systems","Algorithm","Statistics"};
		System.out.print("Number of units:");
		int numunits= input.nextInt();
		int total=0;
			System.out.println("Unit codes in order:");
			String []unitcode;
			unitcode=new String[numunits]; 
			unitcode[0]= input.next();
			unitcode[1]= input.next();
			unitcode[2]= input.next();
			unitcode[3]= input.next();
		
			System.out.println("Scores in order of unitcodes:");
			int []score;
			score= new int[numunits];
			score[0]= input.nextInt();
			score[1]= input.nextInt();
			score[2]= input.nextInt();
            score[3]= input.nextInt();
			total=score[0]+score[1]+score[2]+score[3];
			double sum=total;
			double avg= sum/numunits;
		
			char grade;
			if (avg>=70&&avg<+100) {
				grade ='A';
			}
				else if (avg>60) {
					grade ='B';
				}
				else if (avg>50) {
					grade ='C';
					}
				else if (avg>40) {
					grade ='D';
				}
					else {grade ='F';
					}
			
		System.out.println("\t\t\t Department of Computer Science");
		System.out.println("\t\t\t\tEnd Semester Results");
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("|Name:-"+name);
		System.out.print("    |Roll_No:"+regno);
		System.out.println("  \tSemester:"+sem);
		System.out.println("__________________________________________________________________________");
		System.out.print("|Unit Code\t\t");
		System.out.print("|Unit Name:\t\t\t");
		System.out.println("Score");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|"+unitcode[0]+"\t\t|"+unitname[0]+"\t\t\t|"+score[0]);
		System.out.print("\n");
		System.out.println("|"+unitcode[1]+"\t\t|"+unitname[1]+"\t\t\t|"+score[1]);
		System.out.print("\n");
		System.out.println("|"+unitcode[2]+"\t\t|"+unitname[2]+"\t\t\t|"+score[2]);
		System.out.print("\n");
		System.out.println("|"+unitcode[3]+"\t\t|"+unitname[3]+"\t\t\t|"+score[3]);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|Total\t\t\t\t\t\t\t|"+total);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|Average\t\t\t\t\t\t|"+avg);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|Grade\t\t\t\t\t\t\t|"+grade);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\tRecommendation  |");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Grading Criteria\t\tOverall Grade(A-D)\tRecommend Pass");
		System.out.println("70-100\t\tA");
		System.out.println("60-70\t\tB");
		System.out.println("50-60\t\tC");
		System.out.println("40-50\t\tD");
		System.out.println("Below 40\tF");
		System.out.println("--------------------------------------------------------------------------");
		

	}

}
