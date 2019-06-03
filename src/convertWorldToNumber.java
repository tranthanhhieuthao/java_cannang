import java.util.Scanner;

public class convertWorldToNumber {
    public static void main(String[] args) {
        System.out.println("input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >=0 && number <10){
            switch (number){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        else if ( number >=10 && number <20){
            switch (number){
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        }
        else if (number >=20 && number <100){
            int numberDonVi = number%10;
            int numberHangChuc = number/10;
            String Donvi =" ";
            String HangChuc =" ";
            switch (numberDonVi){
                case 0:
                     Donvi =" ";
                    break;
                case 1:
                    Donvi ="one";
                    break;
                case 2:
                    Donvi = "two";
                    break;
                case 3:
                    Donvi ="three";
                    break;
                case 4:
                    Donvi ="four";
                    break;
                case 5:
                    Donvi ="five";
                    break;
                case 6:
                    Donvi ="six";
                    break;
                case 7:
                    Donvi ="seven";
                    break;
                case 8:
                    Donvi ="eight";
                    break;
                case 9:
                    Donvi ="nine";
                    break;
            }
            switch (numberHangChuc){
                case 2:
                    HangChuc ="twenty";
                    break;
                case 3:
                    HangChuc ="thirty";
                    break;
                case 4:
                    HangChuc ="forty";
                    break;
                case 5:
                    HangChuc ="fifty";
                    break;
                case 6:
                    HangChuc ="sixty";
                    break;
                case 7:
                    HangChuc ="seventy";
                    break;
                case 8:
                    HangChuc ="eighty";
                    break;
                case 9:
                    HangChuc ="ninety";
                    break;
            }
            String result = HangChuc + Donvi;
            System.out.println(result);
        }
        else {
            int HangDonVI3 = number %10;
            int HangChuc13 =(number%100)/10;
            int HangTram3 = number/100;
            String Donvi3 =" ";
            String HangChuc3 =" ";
            String HangTram =" ";

            switch (HangDonVI3){
                case 0:
                    Donvi3 =" ";
                    break;
                case 1:
                    Donvi3 ="one";
                    break;
                case 2:
                    Donvi3 = "two";
                    break;
                case 3:
                    Donvi3 ="three";
                    break;
                case 4:
                    Donvi3 ="four";
                    break;
                case 5:
                    Donvi3 ="five";
                    break;
                case 6:
                    Donvi3 ="six";
                    break;
                case 7:
                    Donvi3 ="seven";
                    break;
                case 8:
                    Donvi3 ="eight";
                    break;
                case 9:
                    Donvi3 ="nine";
                    break;
            }


            if (HangChuc13 == 1){
                switch (HangDonVI3){
                    case 0:
                        Donvi3 =" ";
                        break;
                    case 1:
                        Donvi3 ="eleven";
                        break;
                    case 2:
                        Donvi3 = "twelve";
                        break;
                    case 3:
                        Donvi3 ="thirteen";
                        break;
                    case 4:
                        Donvi3 ="fourteen";
                        break;
                    case 5:
                        Donvi3 ="fifteen";
                        break;
                    case 6:
                        Donvi3 ="sixteen";
                        break;
                    case 7:
                        Donvi3 ="seventeen";
                        break;
                    case 8:
                        Donvi3 ="eighteen";
                        break;
                    case 9:
                        Donvi3 ="nineteen";
                        break;

                }
                switch (HangChuc13){
                    case 0:
                        HangChuc3 =" ";
                        break;
                    case 2:
                        HangChuc3 ="twenty";
                        break;
                    case 3:
                        HangChuc3 ="thirty";
                        break;
                    case 4:
                        HangChuc3 ="forty";
                        break;
                    case 5:
                        HangChuc3 ="fifty";
                        break;
                    case 6:
                        HangChuc3 ="sixty";
                        break;
                    case 7:
                        HangChuc3 ="seventy";
                        break;
                    case 8:
                        HangChuc3 ="eighty";
                        break;
                    case 9:
                        HangChuc3 ="ninety";
                        break;
                }
            }
            switch (HangTram3){
                case 0:
                    HangTram =" ";
                    break;
                case 1:
                    HangTram ="one";
                    break;
                case 2:
                    HangTram = "two";
                    break;
                case 3:
                    HangTram ="three";
                    break;
                case 4:
                    HangTram ="four";
                    break;
                case 5:
                    HangTram ="five";
                    break;
                case 6:
                    HangTram ="six";
                    break;
                case 7:
                    HangTram ="seven";
                    break;
                case 8:
                    HangTram ="eight";
                    break;
                case 9:
                    HangTram ="nine";
                    break;
            }
            String result3 = HangTram +" "+ "hundred"+" "+ HangChuc3 +" "+ "and"+" "+Donvi3;
            System.out.println(result3);
        }
    }
}
