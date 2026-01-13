import java.util.*;
class account{
    List<Email> emails=new ArrayList<>();
}
class msg{
    String sender;
    String recipient;
    String subject;
    String message;
}
class Email {
String email;
String password;
List<msg> inbox=new ArrayList<>();
Email(String email,String password){
    this.email=email;
    this.password=password;
}
}
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    account acc=new account();
     while(true){
        System.out.println(" ");
        System.out.println("1.Sign Up ");
        System.out.println("2.Login ");
        System.out.println("3.Exit ");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:

            System.out.print("Enter your email: ");
            String em=sc.next();
            System.out.print("Enter your password: ");
            String password=sc.next();
            if(acc.emails.isEmpty()){
                acc.emails.add(new Email(em,password));
                System.out.println("Sign Up Successful!");
                break;
            }
            else{
                boolean exists=false;
                for(Email e:acc.emails){
                    if(e.email.equals(em)){
                        System.out.println("Email already exists!");
                        exists=true;
                        break;
                    }

                }
                if(!exists){
                    acc.emails.add(new Email(em,password));
                    System.out.println("Sign Up Successful!");
                    System.out.println(" ");
                    break;
                }

            }
break;
            case 2:

            System.out.print("Enter your email: ");
            String loginEmail=sc.next();
            System.out.print("Enter your password: ");
            String loginPassword=sc.next();
            for(Email e:acc.emails){
                if(e.email.equals(loginEmail) && e.password.equals(loginPassword)){
                    System.out.println("Login Successful!");
                    while(true){
                        System.out.println(" ");
                        System.out.println("1.Compose Email ");
                        System.out.println("2.View Inbox ");
                        System.out.println("3.Logout ");
                        System.out.println(" ");
                        System.out.print("Enter your choice: ");
                        int loginChoice=sc.nextInt();
                        System.out.println(" ");
                        switch(loginChoice){
                            case 1:
                            msg newMsg=new msg();
                            System.out.print("Enter recipient email: ");
                            newMsg.recipient=sc.next();
                            System.out.print("Enter subject: ");
                            newMsg.subject=sc.next();
                            System.out.print("Enter message: ");
                            newMsg.message=sc.next();
                            newMsg.sender=loginEmail;
                            boolean recipientExists=false;
                            for(Email rec:acc.emails){
                                if(rec.email.equals(newMsg.recipient)){
                                    recipientExists=true;
                                    rec.inbox.add(newMsg);
                                    System.out.println("Email Sent!");
                                    System.out.println(" ");
                                    break;
                                }
                                
                            }

                            if(!recipientExists){
                                System.out.println(" ");
                                System.out.println("Recipient does not exist!");
                                break;
                            }
                            break;
                            case 2:
                            System.out.println("Inbox:");
                            if(e.inbox.isEmpty()){
                                System.out.println("Inbox is empty!");
                                System.out.println(" ");
                                break;
                            }
                            for(msg m:e.inbox){
                                System.out.println("-----");
                                System.out.println("From: "+m.sender);
                                System.out.println("To: "+m.recipient);
                                System.out.println("Subject: "+m.subject);
                                System.out.println("Message: "+m.message);
                                System.out.println("-----");
                            }
                            break;
                            case 3:
                                System.out.println("Logged Out!");
                                break;
                            default:
                            System.out.println("Invalid Choice!");
                        }
                        if(loginChoice==3){
                            break;
                        }
                    }
                }
                
            }
                    System.out.println("Invalid Email or Password!");
                    break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        if(choice==3){
            break;
        }
    }

    
}}
