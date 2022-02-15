package programmers.level1.완주하지못한선수;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = solution(participant, completion);
        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion){
        //정답 문자열 변수 선언
        String answer = "";
        //해쉬맵(딕셔너리) 변수 선언 -> participant 키값으로 넣고 value 값에 Integer 선언해서 completion이랑 비교할거임
        Map<String, Integer>ht = new HashMap<String,Integer>();
        //해쉬맵에 participant를 키값으로 밸류는 default로 0씩, 키값 중복되면 1씩 추가
        for(int i=0; i<participant.length; i++){
            if(ht.containsKey(participant[i])){
                ht.put(participant[i],ht.get(participant[i])+1);
            }
            else{
                ht.put(participant[i],1);
            }
        }
        //completion을 키값으로 찾아서 밸류값 1씩 감소
        for(int i=0; i<completion.length; i++){
            if(ht.containsKey(completion[i])){
                ht.put(completion[i],ht.get(completion[i])-1);
            }
        }
        //해쉬맵 모든 키를 순회하면서 0보다 큰거 answer에 저장
        for(String key:ht.keySet()) {
            if(ht.get(key)>0){
                answer=key;
            }
        }

        return answer;
    }

}
