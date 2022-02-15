package doodles;
import java.io.*;

public class CharIOExam{
    public static void main(String[]args){
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("data.txt"));
            String line = null;
            line = "안녕하세요. PrintWriter입니다.";
            pw.println(line);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            pw.close();
        }
        System.out.println("안녕하세요. PrintWriter입니다.");

    }
}
