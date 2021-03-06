# 프로그래머스(Programmers) 코딩테스트 연습

## Level1 정렬 K번째수 자바(Java) 풀이

- https://programmers.co.kr/learn/courses/30/lessons/42840

## GitBlog 주소

- https://hon99oo.github.io/algorithm/java_03/

## 문제풀이
> 완전 탐색 문제다. 완전 탐색은 "컴퓨터의 빠른 계산을 이용하여 가능한 모든 경우의 수를 구하는 알고리즘"이다. 
> 문제를 어떻게 해결할지 방향을 잡고 최대한 빠른 로직으로 코드를 구현하는 것이 관건으로 보인다.


1. 사용자들의 정답 패턴을 각각의 배열에 저장한다.
2. 사용자들이 정답을 맞추는 개수를 저장하는 배열을 선언한다. (0으로 초기화한다.)
3. 사용자들의 정답 패턴의 length를 answers와의 나머지를 구하여 패턴을 일치시킨다.
4. 사용자들의 정답의 개수를 저장하고, 해당 배열의 max값을 찾는다.
5. max값과 일치하는 사용자들의 정답 개수를 갖는 index를 answer 배열에 저장한다.
6. return answer

> 

## 코드

{% highlight java %}

      import java.util.*;
      
      public class Main {
      public static void main(String[] args){
      int[] answers = {1,2,3,4,5};
      
              int[] answer = solution(answers);
              System.out.println(Arrays.toString(answer));
          }
          public static int[] solution(int[] answers){
              int[] user1 = {1,2,3,4,5};
              int[] user2 = {2,1,2,3,2,4,2,5};
              int[] user3 = {3,3,1,1,2,2,4,4,5,5};
      
              int[] answerList = {0,0,0};
      
              for(int i=0; i<answers.length; i++){
                  if(user1[i%user1.length]==answers[i]){
                      answerList[0]++;
                  }
                  if(user2[i%user2.length]==answers[i]){
                      answerList[1]++;
                  }
                  if(user3[i%user3.length]==answers[i]){
                      answerList[2]++;
                  }
              }
              int max=answerList[0];
              for(int i=0; i<answerList.length; i++){
                  if(answerList[i]>max) {
                      max = answerList[i];
                  }
              }
      
              ArrayList<Integer> arrList = new ArrayList();
      
              for(int i=0; i<answerList.length; i++){
                  if(answerList[i]==max){
                      arrList.add(i);
                  }
              }
      
              int size = arrList.size();
              int[] answer = new int[size];
      
              for(int i=0; i<size; i++){
                  answer[i] = arrList.get(i)+1;
              }
              return answer;
          }
      
          public static int[] BadSolution(int[] answers){
              int[] user1 = {1,2,3,4,5};
              int[] user2 = {2,1,2,3,2,4,2,5};
              int[] user3 = {3,3,1,1,2,2,4,4,5,5};
              int j1=0,j2=0,j3=0;
              int[] user_answer ={0,0,0};
              List<Integer> answer_list = new ArrayList<Integer>();
              for(int i=0; i<answers.length; i++){
                  if(j1>=user1.length){
                      j1=0;
                  }
                  if(answers[i] == user1[i]){
                      user_answer[0]++;
                  }
                  j1++;
                  if(j2>=user2.length){
                      j2=0;
                  }
                  if(answers[i] == user2[i]){
                      user_answer[1]++;
                  }
                  j2++;
                  if(j3>=user3.length){
                      j3=0;
                  }
                  if(answers[i] == user3[i]){
                      user_answer[2]++;
                  }
                  j3++;
              }
              int max=user_answer[0];
              for(int i=0; i<user_answer.length; i++){
                  if(user_answer[i]>max){
                      max = user_answer[i];
                  }
              }
              for(int i=0; i<user_answer.length; i++){
                  if(user_answer[i]==max){
                      answer_list.add(i);
                  }
              }
      
              int size = answer_list.size();
              int[] answer = new int[size];
      
              for(int i=0; i<size; i++){
                  answer[i] = answer_list.get(i)+1;
              }
              return answer;
          }
      }

{% endhighlight %}