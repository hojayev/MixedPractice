package GreatSolutions;

import Credentials.GmailCredentials;
import org.apache.commons.mail.SimpleEmail;

public class SendEmails {

    public static void main(String[] args) {

        /*
            first Step:  go to  :
             https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
         */
        GmailCredentials obj=new GmailCredentials();

        String Receiver ="spartabatch11@gmail.com" ,
                MSG = "Hi, This is Muhtar \n \t How are you";



        sendEmails( obj.getUsername(), obj.getPassword(),  Receiver , MSG );
            System.out.println("Send");


    }

    public static void sendEmails(String username, String password, String Receiver, String MSG){

        SimpleEmail email=new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthentication(username, password);
            email.setSSLOnConnect(true);


        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.setSubject("Testing");
            email.addTo(Receiver);
            email.send();
            Thread.sleep(3000);
        } catch (Exception e) {   }


    }

}

public class GmailCredentials {

         private   final String username="spartabatch11@gmail.com";
         private  final String Password="cybertek2019";

         public String getUsername(){
             return username;
         }

         public String getPassword(){
             return Password;
         }




}