package programmers.level1.가운데글자가져오기;

public class Main {
    public static String solution(String s){
        String answer = "";
        int len = s.length();
        if(len%2 == 0){
            answer = s.substring(len/2-1,len/2+1);
        }
        else{
            answer = s.substring(len/2,len/2+1);
        }
        return answer;
    }
    static public void main(String args[]){
        String s = "qwer";
        String answer = solution(s);
        System.out.println(answer);
    }
}
