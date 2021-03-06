# 프로그래머스(Programmers) 코딩테스트 연습

## Level1 해시 완주하지 못한 선수 자바(Java) 풀이

- https://programmers.co.kr/learn/courses/30/lessons/42576?language=java

## GitBlog 주소

- https://hon99oo.github.io/algorithm/java_02/

## 문제풀이
> java 알고리즘 문제 풀이의 두번째 문제이다. 처음 풀어본 문제보다는 자바 문법이 조금 익숙했다. 하지만, 해시를 어떻게 선언하는지 조차 모르고 있어서, 이 부분은 구글링을 하며 풀었다.
> 이번 문제를 통해서 자바의 해쉬맵을 사용할 수 있게 되었다. 해쉬맵의 여러가지 method들을 숙지하고 있으면 코테에 많은 도움이 될 것 같다.


1. 참가자들이 저장되어 있는 String 배열을 HashMap에 옮겨 담는다.
2. 이 때 참가자들의 이름은 Key값으로 Value는 참가자들의 중복의 유무를 포함하기 위해 default 값을 0으로, 중복된 참가자가 있으면 value를 1씩 증가시킨다.
3. 완주한 참가자들의 이름을 containsKey를 사용하여 해당 Key값의 Value를 1씩 감소시킨다.
4. 해쉬맵의 모든 키를 순회하면서 value값이 0보다 큰 값을 찾는다.
5. 해당 키값을 answer에 저장한다.
6. return answer

## 코드

{% highlight java %}

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

{% endhighlight %}