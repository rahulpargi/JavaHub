import java.net.*;
import java.io.*;

import java.util.*;
class MultiThread extends Thread{
   public void run(){
      try{
         ServerSocket  ss=new ServerSocket(1234);
         while(true){
            Socket s=ss.accept();
            Date d=new Date();
            
            
            
            System.out.println(d.toString());

         }
      }catch(Exception e){

      }
   }
}
public class SocServer2{
   public static void main(String[] args) {
      MultiThread a=new MultiThread();
      a.start();
   }
}