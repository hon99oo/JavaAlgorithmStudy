package programmers.level1.평균구하기;

public class Main {
    public static double solution(int[] arr) {
        double answer = 0;
        int len = arr.length;
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += arr[i];
        }
        answer = (double)sum/len;
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        double answer = solution(arr);
        System.out.println(answer);
    }
}
