package programmers.level1.핸드폰번호가리기;

import java.net.SocketOption;

public class Main {
    public static String solution(String phone_number){
        String answer = "";
        int len = phone_number.length();
        for(int i=0; i<len-4; i++){
            answer += "*";
        }
        answer += phone_number.substring(len-4, len);
        return answer;
    }
    public static void main(String[] args){
        String phone_number = "01033334444";
        String answer = solution(phone_number);
        System.out.println(answer);
    }
}
