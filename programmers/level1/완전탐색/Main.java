package programmers.level1.완전탐색;

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
