package programmers.level1.K번째수;

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
