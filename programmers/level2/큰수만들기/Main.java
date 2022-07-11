package programmers.level2.큰수만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        String number = "4177252841";
        int k = 4;

        String answer = solution(number,k);
        System.out.println(answer);
    }

    public static String solution(String number, int k){
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Character> number_list = new ArrayList<Character>();
        char[] tmp = number.toCharArray();
        for(char c : tmp)
            number_list.add(c);

        int count = 0;

        for(int i=0; i<k; i++){
            for(int j=1; j<tmp.length; j++){
                if(number_list.get(j-1) < number_list.get(j)){
                    number_list.remove(j-1);
                    count = count + 1;
                    break;
                }
            }
        }

        for(int i=0; i<k-count; i++){
            number_list.remove(Collections.min(number_list));
        }
        String str = "";
        for (char s : number_list) {
            str+=s;
        }
        String answer = str;

        return answer;
    }
}
