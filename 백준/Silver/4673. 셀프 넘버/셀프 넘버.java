public class Main {

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];	// 1부터 10000까지의 수 셀프넘버 확인

        for (int i = 1; i < 10001; i++){
            int A = d(i);

            if(A < 10001){	// 10000 이 넘는 수는 필요가 없음
                check[A] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {	// false 인 인덱스만 출력
                System.out.println(i);
            }
        }
    }

    public static int d(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10); // 1의 자리수
            number = number/10;	// 10을 나누어 1의 자리를 없앤다
        }
        return sum;
    }
}    