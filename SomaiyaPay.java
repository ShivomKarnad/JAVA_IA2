import java.util.*;

public class SomaiyaPay extends student {
  static public Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int c;
    c = sc.nextInt();
    do {
      switch (c) {
        case 1:
          canteen c_call = new canteen();
          c_call.entercanteen();
          break;
        case 2:
          stationery s_call = new stationery();
          s_call.enterstationery();
          break;
        case 3:
          break;
      }
    } while (c != 5);
  }

}

class canteen {
  static int bill_canteen = 0;

  public void entercanteen() {
    Scanner sc = new Scanner(System.in);
    System.out.println("-------------------------------------------------------------------");
    System.out.println("|                WELCOME TO SOMAIYA CANTEEN                       |");
    System.out.println("|-----------------------------------------------------------------|");
    System.out.println("|                  1. SOMAIYA RESTAURANT                          |");
    System.out.println("|                  2. SOMAIYA CAFE                                |");
    System.out.println("|_________________________________________________________________|");
    int choice = sc.nextInt();
    do {
      switch (choice) {
        case 1: {
          System.out.println("-------------------------------------------------------------------");
          System.out.println("|                       SOMAIYA RESTAURANT                        |");
          System.out.println("|-----------------------------------------------------------------|");
          System.out.println("|                                                                 |");
          System.out.println("|                                                                 |");
          System.out.println("|   1.SPL. TEA-----------------------------------Rs.30/-          |");
          System.out.println("|   2.COFFEE-------------------------------------Rs.20/-          |");
          System.out.println("|   3.CHEESE SANDWICH----------------------------Rs.150/-         |");
          System.out.println("|   4.PAV BHAJI----------------------------------Rs.160/-         |");
          System.out.println("|   5.MASALA DOSA--------------------------------Rs.80/-          |");
          System.out.println("|                                                                 |");
          System.out.println("|_________________________________________________________________|");
          System.out.print("Enter no. of Spl. Tea: ");
          int n1 = sc.nextInt();
          System.out.print("Enter no. of Coffee: ");
          int n2 = sc.nextInt();
          System.out.print("Enter no. of Cheese Sandwitch: ");
          int n3 = sc.nextInt();
          System.out.print("Enter no. of Pav Bhaji: ");
          int n4 = sc.nextInt();
          System.out.print("Enter no. of Masala Dosa: ");
          int n5 = sc.nextInt();
          bill_canteen = bill_restaurant(n1, n2, n3, n4, n5);
          System.out.print("Bill: Rs." + bill_canteen);
        }
          break;
        case 2: {
          System.out.println("-------------------------------------------------------------------");
          System.out.println("|                       SOMAIYA CAFE                              |");
          System.out.println("|-----------------------------------------------------------------|");
          System.out.println("|                                                                 |");
          System.out.println("|                                                                 |");
          System.out.println("|   1.CAFE LATTE-----------------------------------Rs.50/-        |");
          System.out.println("|   2.HOT VELVET COFFEE----------------------------Rs.150/-       |");
          System.out.println("|   3.ESPRESSO SHOT--------------------------------Rs.120/-       |");
          System.out.println("|   4.VANILLA CAPPUCCINO---------------------------Rs.100/-       |");
          System.out.println("|   5.LEMON GREEN TEA------------------------------Rs.85/-        |");
          System.out.println("|                                                                 |");
          System.out.println("|_________________________________________________________________|");
          System.out.print("Enter no. of Cafe Latte: ");
          int n1 = sc.nextInt();
          System.out.print("Enter no. of Hot Velvet Coffee: ");
          int n2 = sc.nextInt();
          System.out.print("Enter no. of Epresso Shot: ");
          int n3 = sc.nextInt();
          System.out.print("Enter no. of Vanilla Cappuccino: ");
          int n4 = sc.nextInt();
          System.out.print("Enter no. of Lemon Green Coffee: ");
          int n5 = sc.nextInt();
          bill_canteen = bill_cafe(n1, n2, n3, n4, n5);
          System.out.print("Bill: Rs." + bill_canteen);
        }
          break;
        default: {
          System.out.println("Please enter valid Choice!");
        }
          break;
      }
      if (choice != 7) {
        System.out.println("1.Repeat   2.Exit");
        choice = sc.nextInt();
      } else {
        System.out.println("*****************************************************************");
      }
      if (choice == 2) {
        exit();
        break;
      }

    } while (choice == 1);
  }

  public static void exit() {
    if (bill_canteen == 0) {
      System.out.println("Thank You For Visiting");
    } else {
      System.out.println("Remainder bill is " + bill_canteen);
      System.out.println("Thank You For Visiting");
    }
  }

  public static int bill_restaurant(int a, int b, int c, int d, int e) {
    int total = (a * 30) + (b * 40) + (c * 150) + (d * 160) + (e * 80);
    return total;
  }

  public static int bill_cafe(int a, int b, int c, int d, int e) {
    int total = (a * 50) + (b * 150) + (c * 120) + (d * 100) + (e * 85);
    return total;
  }
}

class stationery {
  int c, choice, bill_stationery = 0;

  public void enterstationery() {
    Scanner ob = new Scanner(System.in);
    do {
      System.out.println("------------------------------------------------------------------");
      System.out.println("|                WELCOME TO SOMAIYA STATIONERY                   |");
      System.out.println("|----------------------------------------------------------------|");
      System.out.println("|                                                                |");
      System.out.println("|                                                                |");
      System.out.println("|   1.XEROX-----------------------------------Rs.2 per page      |");
      System.out.println("|   2.NORMAL PRINT OUT------------------------Rs.5 per page      |");
      System.out.println("|   3.COLOUR PRINT OUT------------------------Rs.10 per page     |");
      System.out.println("|   4.BALL PEN--------------------------------Rs.8 per piece     |");
      System.out.println("|   5.GEL PEN---------------------------------Rs.10 per piece    |");
      System.out.println("|   6.SOMAIYA SHEETS--------------------------Rs.2 per piece     |");
      System.out.println("|   7.EXIT                                                       |");
      System.out.println("|                                                                |");
      System.out.println("|________________________________________________________________|");
      c = ob.nextInt();
      switch (c) {
        case 1:
          xerox();
          break;

        case 2:
          npt();
          break;

        case 3:
          cpt();
          break;

        case 4:
          ballpen();
          break;

        case 5:
          gelpen();
          break;

        case 6:
          ss();
          break;

        case 7:
          exit();
          break;
      }
      if (c != 7) {
        System.out.println("1.Repeat   2.Exit");
        choice = ob.nextInt();
      } else {
        System.out.println("*****************************************************************");
      }
      if (choice == 2) {
        exit();
        break;
      }
    } while (choice == 1);
  }

  public void xerox() {
    Scanner ob = new Scanner(System.in);
    System.out.println("XEROX is Rs.2 per page");
    System.out.println("Please enter number of pages to be xeroxed");
    int p = ob.nextInt();
    bill_stationery = bill_stationery + (p * 2);
  }

  public void npt() {
    Scanner ob = new Scanner(System.in);
    System.out.println("NORMAL PRINT OUT is Rs.5 per page");
    System.out.println("Please enter number of pages to be Normal-printed out");
    int p = ob.nextInt();
    bill_stationery = bill_stationery + (p * 5);
  }

  public void cpt() {
    Scanner ob = new Scanner(System.in);
    System.out.println("COLOUR PRINT OUT is Rs.5 per page");
    System.out.println("Please enter number of pages to be Colour-printed out");
    int p = ob.nextInt();
    bill_stationery = bill_stationery + (p * 10);
  }

  public void ballpen() {
    Scanner ob = new Scanner(System.in);
    System.out.println("BALL PEN is Rs.8 per piece");
    System.out.println("Please enter number of ball pens you want to buy");
    int p = ob.nextInt();
    bill_stationery = bill_stationery + (p * 8);
  }

  public void gelpen() {
    Scanner ob = new Scanner(System.in);
    System.out.println("GEL PEN is Rs.10 per piece");
    System.out.println("Please enter number of gel pens you want to buy");
    int p = ob.nextInt();
    bill_stationery = bill_stationery + (p * 10);
  }

  public void ss() {
    Scanner ob = new Scanner(System.in);
    System.out.println("SOMAIYA SHEETS are Rs.2 per page");
    System.out.println("Please enter number of sheets you want to buy");
    int p = ob.nextInt();
    bill_stationery = bill_stationery + (p * 2);
  }

  public void exit() {
    Scanner ob = new Scanner(System.in);
    if (bill_stationery == 0) {
      exit_final();
    } else {
      System.out.println("Remainder bill is " + bill_stationery);
      exit_final();
    }
  }

  public void exit_final() {
    System.out.println("Thank You For Visiting");
  }
}

class examcell {
  static int amt;

  public void enterexamcell() {
    System.out.println("------------------------------------------------------------------");
    System.out.println("|                     WELCOME TO EXAM CELL                       |");
    System.out.println("|----------------------------------------------------------------|");
    System.out.println("|                                                                |");
    System.out.println("|                                                                |");
    System.out.println("|   1.SUPPLEMENTARY EXAM                                         |");
    System.out.println("|   2.RE-EVALUATION OF PAPER                                     |");
    System.out.println("|   3.CALCULATION ERROR IN MARKS                                 |");
    System.out.println("|   4.EXIT                                                       |");
    System.out.println("|                                                                |");
    System.out.println("|________________________________________________________________|");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    switch (choice) {
      case 1: {
        System.out.println("-SUPPLEMENTARY EXAMINATION-");
        System.out.println(
            "Examination Charges:\nFor ODD Semester: Rs. 200/- per exam\nFor Even Semester: Rs. 250/- per exam");
        System.out.println("Enter Current Semester: ");
        int sem = sc.nextInt();
        System.out.println("Enter number of examination appearing ");
        int count = sc.nextInt();
        amt = amt_supp(sem, count);
        System.out.println("Total amount payable: RS." + amt);
      }
        break;
      case 2: {
        System.out.println("-RE-EVALUATION of EXAMINATION PAPERS-");
        System.out.println(
            "Examination Charges:\nFor ODD Semester: Rs. 350/- per exam\nFor Even Semester: Rs. 450/- per exam");
        System.out.println("Enter Current Semester: ");
        int sem = sc.nextInt();
        System.out.println("Enter number of examination papers: ");
        int count = sc.nextInt();
        int amt = amt_reeval(sem, count);
        System.out.println("Total amount payable: RS." + amt);

      }
        break;
      case 3: {
        System.out.println("Re-Calculation of Marks");
        System.out.println("Charges: Rs.50/- pe disputed exam paper.");
        System.out.println("Enter number of disputed papers: ");
        int num = sc.nextInt();
        System.out.println("Amount Payable: Rs. " + (num * 50) + "/-.");
      }
        break;
      default: {
        System.out.println("Enter valid Choice");
      }
        break;
    }
  }

  public static int amt_supp(int a, int b) {
    if (a % 2 == 0) {
      return b * 250;
    } else {
      return b * 200;
    }
  }

  public static int amt_reeval(int a, int b) {
    if (a % 2 == 0) {
      return b * 450;
    } else {
      return b * 350;
    }
  }
}

class Library extends student {
  int lib_c, choice_lib, lib_bill, days;

  public void main() {
    Scanner ob = new Scanner(System.in);
    System.out.println("------------------------------------------------------------------");
    System.out.println("|                      LIBRARY FINE CHART                        |");
    System.out.println("|----------------------------------------------------------------|");
    System.out.println("|                                                                |");
    System.out.println("|                                                                |");
    System.out.println("|   1.DAY1->DAY5-----------------------------------Rs.2 per DAY  |");
    System.out.println("|   2.DAY6->DAY10----------------------------------Rs.5 per DAY  |");
    System.out.println("|   3.DAY11->DAY15--------------------------------Rs.10 per DAY  |");
    System.out.println("|   4.DAY15+--------------------------------------Rs.20 per DAY  |");
    // System.out.println("| 7.EXIT |");
    System.out.println("|                                                                |");
    System.out.println("|________________________________________________________________|");
    do {
      System.out.println("1.PAY FINE");
      System.out.println("2.EXIT");
      lib_c = ob.nextInt();
      switch (lib_c) {
        case 1:
          lib_pay();
          break;

        case 2:
          exit();
          break;
      }
      if (lib_c != 2) {
        System.out.println("1.REPEAT FOR MORE BOOKS            2.GO TO PAYMENT");
        choice_lib = ob.nextInt();
      } else {
        System.out.println("*****************************************************************");
      }
      if (choice_lib == 2) {
        exit();
        break;
      }
    } while (choice_lib == 1);
  }

  public void lib_pay() {
    Scanner ob = new Scanner(System.in);
    System.out.println("PLEASE ENTER THE NAME OF THE BOOK");
    String book = ob.nextLine();
    System.out.println("ENTER THE NUMBER OF DAYS BY WHICH YOU ARE LATE TO SUBMIT THE BOOK");
    days = ob.nextInt();
    if (days >= 0 && days <= 5) {
      lib_bill = lib_bill + (days * 2);
    } else if (days > 5 && days <= 10) {
      lib_bill = lib_bill + 10 + ((days - 5) * 5);
    } else if (days > 10 && days <= 15) {
      lib_bill = lib_bill + 10 + 25 + ((days - 10) * 10);
    } else {
      lib_bill = lib_bill + 10 + 25 + 50 + ((days - 15) * 20);
    }
  }

  public void exit() {
    if (lib_bill == 0) {
      exit_final();
    } else {
      System.out.println("FINE TO BE PAID IS Rs." + lib_bill);
      exit_final();
    }
  }

  public void exit_final() {
    System.out.println("THANK YOU FOR VISITING US!");
  }
}

class student {
  String username;
  String password;
  String email;
  long rollno;
  double balance;
  long phone;

  static Scanner sc = new Scanner(System.in);

  void register(Vector<student> studentsVector) {
    student s = new student();
    System.out.println("***** DETAILS OF STUDENT: *****");
    System.out.print("ROLL NUMBER: ");
    s.rollno = sc.nextLong();
    System.out.print("USERNAME: ");
    s.username = sc.next();
    System.out.print("EMAIL: ");
    eCheck(s.email);
    System.out.print("PASSWORD: ");
    s.password = sc.next();
    passCheck(s.password);
    System.out.println("PHONE NUMBER: ");
    if (numCheck(s.phone) == true && eCheck(s.email) == true) {
      studentsVector.add(s);
    } else {
      System.out.println("Details are invalid! Please try again!");
    }
  }

  public static boolean eCheck(String email) {
    email = sc.next();
    int x, y;
    x = email.indexOf('@');
    y = email.lastIndexOf('.');
    if (x == -1 || y == -1 || y < x) {
      System.out.println("INVALID......PLEASE TRY AGAIN");
      eCheck(email);
      return true;
    } else {
      return true;
    }
  }

  public static boolean passCheck(String password) {
    System.out.println("PLEASE CONFIRM YOUR PASSWORD");
    String p1 = sc.next();
    if (password.equals(p1) == true) {
      return true;
    } else {
      System.out.println("THERE IS SOME ERROR IN CONFIRMING YOUR PASSWORD......PLEASE TRY AGAIN");
      passCheck(password);
      return true;
    }
  }

  public static boolean numCheck(long phone) {
    phone = sc.nextLong();
    String l1 = String.valueOf(phone);
    if (l1.length() == 10) {
      return true;
    } else {
      System.out.println("WRONG INPUT- TRY AGAIN");
      numCheck(phone);
      return true;
    }
  }



  public static void display(Vector<student> v) {
    for (int i = 0; i < v.size(); i++) {
      student store = v.get(i);
      System.out.println(
          "***** " + (i + 1) + ") Username: " + store.username + " | Roll Number: " + store.rollno + " | Balance: "
              + store.balance + " | Phone: " + store.phone + " *****");
    }
  }

  public static void main(String[] args) {
    student call = new student();
    Vector<student> studentsVector = new Vector<student>();
    call.register(studentsVector);
    display(studentsVector);
  }
}


