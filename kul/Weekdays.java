/* import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day=sc.nextInt();
        System.out.println("Enter your time:");
        sc.nextLine();
        String time=sc.nextLine();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;
            
            case 2:
                System.out.println("Monday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                
                break;
              
            case 3:
                System.out.println("Tuesday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;

            case 4:
                System.out.println("Wednesday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;

            case 5:
                System.out.println("Thursday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;

            case 6:
                System.out.println("Friday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;
            
            case 7:
                System.out.println("Saturday");
                switch (time) {
                    case "m":
                        System.out.println("It's Morning");
                        break;

                    case "a":
                        System.out.println("It's Afternoon");
                        break;

                    case "n":
                        System.out.println("It's Night");
                        break;
                
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;
        
            default:
                System.out.println("Invalid");
                break;
              
        }
        sc.close();  
    }
}
 */

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the grade");
        char grade = sc.nextLine().charAt(0);
        
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        
        switch (grade) {
            case 'A':
                System.out.println("Congratulations you got grade A");
                switch (marks/10) {
                    case 9:
                    case 10:
                        System.out.println("Excellent performance!");
                        break;
                    default:
                        System.out.println("Good but can improve.");
                        break;
                }
                break;
                
            case 'B':
                System.out.println("Congratulations you got grade B"); // Fixed: was "grade A" in original
                switch (marks/10) {
                    case 7:
                    case 8:
                        System.out.println("Nice work");
                        break;
                    default:
                        System.out.println("Keep practicing");
                        break;
                }
                break;
                
            case 'C':
            case 'D':
            case 'F':
                System.out.println("Needs improvement.");
                break;
                
            default:
                System.out.println("Invalid grade");
                break;
        }
        sc.close();
    }
}