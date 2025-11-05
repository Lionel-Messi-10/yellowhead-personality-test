import java.util.Scanner;

public class PersonalityQuiz
{
    public static void ask(String question, String c1, String c2, String c3, String c4, String c5, String c6){
        System.out.println(question);
        System.out.println("1: " + c1);
        System.out.println("2: " + c2);
        if(!c3.equals("x")){
            System.out.println("3: " + c3);
            if(!c4.equals("x")){
                System.out.println("4: " + c4);
                if(!c5.equals("x")){
                    System.out.println("5: " + c5);
                    if(!c6.equals("x")){
                        System.out.println("6: " + c6);
                    }
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        Scanner b = new Scanner(System.in);
        Data a = new Data();
        int choice = 0;
        boolean ans = false;
        while (!ans) {
            ask("What do you value the most?", "Ephemeral Happiness", "Morality", "Reputation", "Personal Success", "Personal Competence", "x");
            choice = b.nextInt();
            if (choice > 0 && choice <= 5) {
                if (choice == 1) {
                    a.a(5, 0, 0, 0, 3, 4, 0);
                } else if (choice == 2) {
                    a.a(1, 0, 2, 6, 1, -1, 0);
                } else if (choice == 3) {
                    a.a(0, 3, 3, 9, 1, 4, 4);
                } else if (choice == 4) {
                    a.a(3, 0, 3, 1, 0, 3, 1);
                } else {
                    a.a(0, 8, 2, 0, 0, 0, 0);
                }
                ans = true;
            } else {
                System.out.println("Please enter a valid integer with a corresponding answer\n");
            }
        }
        System.out.println();
        ans = false;
        
        while (!ans) {
            ask("Introversion or Extroversion?", "Introversion", "Extroversion", "x", "x", "x", "x");
            choice = b.nextInt();
            if (choice > 0 && choice <= 2) {
                if (choice == 1) {
                    a.a(0, 4, 3, 6, 0, 1, 2);
                } else {
                    a.a(6, 0, 2, 0, 2, 4, 0);
                }
                ans = true;
            } else {
                System.out.println("Please enter a valid integer with a corresponding answer\n");
            }
        }
        System.out.println();
        ans = false;
        
        while (!ans) {
            ask("What do you value the most?", "1 on 1 convos", "Group convos", "Thoughts about yourself", "x", "x", "x");
            choice = b.nextInt();
            if (choice > 0 && choice <= 3) {
                if (choice == 1) {
                    a.a(6, 0, 0, 0, 0, 4, 0);
                } else if (choice == 2) {
                    a.a(-1, 0, 4, 5, 3, 0, 3);
                } else {
                    a.a(1, 5, 1, 0, 0, 0, 3);
                }
                ans = true;
            } else {
                System.out.println("Please enter a valid integer with a corresponding answer\n");
            }
        }
        System.out.println();
        ans = false;
        
        while (!ans) {
            ask("How much do you care about grades?", "More than the average student", "Less than the average student", "x", "x", "x", "x");
            choice = b.nextInt();
            System.out.println();
            if (choice > 0 && choice <= 2) {
                if (choice == 1) {
                    a.a(-2, 1, 1, 0, -1, 4, 2);
                    
                    while (!ans) {
                        ask("STEM or Liberal Arts?", "STEM", "Liberal Arts", "x", "x", "x", "x");
                        choice = b.nextInt();
                        System.out.println();
                        if (choice > 0 && choice <= 2) {
                            if (choice == 1) {
                                a.a(7, -3, 5, 0, 0, 5, 1);
                                
                                while (!ans) {
                                    ask("Which is your favorite?", "Math", "Chemistry", "Biology", "Physics", "x", "x");
                                    choice = b.nextInt();
                                    System.out.println();
                                    if (choice > 0 && choice <= 4) {
                                        if (choice == 1) {
                                            a.a(7, 0, 3, 0, 0, 0, 0);
                                        } else if (choice == 2) {
                                            a.a(5, 0, 4, 0, 0, 1, 0);
                                        } else if (choice == 3) {
                                            a.a(0, 2, 7, 0, 0, 0, 0);
                                        } else {
                                            a.a(6, 0, 0, 0, 0, 4, 0);
                                        }
                                        ans = true;
                                    } else {
                                        System.out.println("Please enter a valid integer with a corresponding answer\n");
                                    }
                                }
                                ans = false;
                                
                            } else {
                                a.a(0, 6, 1, 3, 6, 0, 7);
                                
                                while (!ans) {
                                    ask("Which is your favorite?", "History", "Geography", "Lingustics", "Philosophy", "Literature", "Media");
                                    choice = b.nextInt();
                                    if (choice > 0 && choice <= 6) {
                                        if (choice == 1) {
                                            a.a(0, 0, 0, 0, 0, 4, 4);
                                        } else if (choice == 2) {
                                            a.a(4, 4, 4, 0, 0, 0, 4);
                                        } else if (choice == 3) {
                                            a.a(0, 6, 6, 0, 0, 0, 1);
                                        } else if (choice == 4) {
                                            a.a(1, 2, 1, 0, 0, 1, 7);
                                        } else if (choice == 5) {
                                            a.a(0, 5, 0, 0, 0, 0, 5);
                                        } else {
                                            a.a(0, 0, 0, 3, 7, 0, 0);
                                        }
                                        ans = true;
                                    } else {
                                        System.out.println("Please enter a valid integer with a corresponding answer\n");
                                    }
                                }
                                ans = false;
                                
                            }
                            ans = true;
                        } else {
                            System.out.println("Please enter a valid integer with a corresponding answer\n");
                        }
                    }
                    ans = false;
                    
                } else {
                    a.a(2, 1, 1, 0, 2, 0, 2);
                    
                    while (!ans) {
                        ask("Who is closest (in genre) to your favorite artist?", "Jungkook", "Rex Orange County", "fawn burke", "Charli xcx", "Galaxie 500", "Laura Brehm");
                        choice = b.nextInt();
                        if (choice > 0 && choice <= 6) {
                            if (choice == 1) {
                                a.a(-2, 0, 0, 5, 1, 0, 0);
                            } else if (choice == 2) {
                                a.a(4, 1, -1, 0, 1, -1, 3);
                            } else if (choice == 3) {
                                a.a(0, 0, 0, 0, 1, 5, 3);
                            } else if (choice == 4) {
                                a.a(-1, 5, 0, 0, 3, 2, 2);
                            } else if (choice == 5) {
                                a.a(0, 0, 0, 0, 0, 3, 5);
                            } else {
                                a.a(5, 1, 5, 0, 0, -1, -1);
                            }
                            ans = true;
                        } else {
                            System.out.println("Please enter a valid integer with a corresponding answer\n");
                        }
                    }
                    ans = false;
                    
                }
                ans = true;
            } else {
                System.out.println("Please enter a valid integer with a corresponding answer\n");
            }
        }
        System.out.println();
        ans = false;

        System.out.println("You are the most like " + a.toString());
    }
}
