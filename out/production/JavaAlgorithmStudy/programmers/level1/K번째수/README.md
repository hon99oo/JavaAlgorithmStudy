# 프로그래머스(Programmers) 코딩테스트 연습

## Level1 정렬 K번째수 자바(Java) 풀이

- https://programmers.co.kr/learn/courses/30/lessons/42748?language=java

## GitBlog 주소

- https://hon99oo.github.io/algorithm/java_01/

## 문제풀이
> java 알고리즘 문제 풀이의 첫 문제였다. 배열 생성도 어색하고 디버깅 하는 것도 너무 어려웠다. 몇가지 문법은 구글링을 해가면서 풀었다.
> 나는 지금까지 python으로만 알고리즘 문제를 해결했었다. python과 java는 너무나도 다르다... 우선 변수들간의 전송과 출력 모두 python과 달랐다.
> 여튼 java는 거의 모든 기능을 모듈을 import하여 사용한다는 것이다. 예를들어 Arrays 모듈을 import하여 배열을 한번에 출력하고, ArrayList를 import하여 연결리스트를 만든다.


1. 2차원 배열인 commands를 반복문을 통해 하나씩 접근한다.
2. commands에 포함된 1차원 배열에서 index 0,1에 위치한 value로 Arrays.copyOfRange(arr,startIndex,endIndex)를 사용하여 array를 slicing 한다.
    - ex) arr = {10,20,30,40,50}<br>Arrays.copyOfRange(arr, 2, 4) -> returns {20,30,40}
3. Arrays.sort()를 사용하여 slicing된 배열을 정렬한다.
4. 정렬된 배열에서 commands index 2에 위치한 value에 해당하는 위치를 answer arrayList에 add한다.
5. return answer

## 코드

{% highlight java %}

      import java.util.ArrayList;
      import java.util.Arrays;
      
      public class Main {
      public static void main(String[] args){
      int[] array = {1,5,2,6,3,7,4};
      int[][] commands =  {{2,5,3},{4,4,1},{1,7,3}};
      
              int[] answer = solution(array,commands);
              System.out.println(Arrays.toString(answer));
          }
      
          public static int[] solution(int[] array, int[][] commands){
              ArrayList<Integer> arrList = new ArrayList<>();
      
              for(int i=0; i<commands.length; i++){
                  int[] k = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
                  Arrays.sort(k);
                  arrList.add(k[commands[i][2]-1]);
              }
      
              int size = arrList.size();
              int[] answer = new int[size];
      
              for(int i=0; i<size; i++){
                  answer[i] = arrList.get(i);
              }
      
              return answer;
          }
      }

{% endhighlight %}