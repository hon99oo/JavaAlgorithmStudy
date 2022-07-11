package programmers.level1.자릿수더하기;

public class Main {
    public static int solution(int n){
        int answer = 0;
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int N = 987;
        int answer = solution(N);
        System.out.println(answer);
    }
}
