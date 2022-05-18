package chap02;
//소수 구하기
public class exec2_9to11
{
    public static void main(String[] args) {
        getPrimeNumber3();
    }


    static void getPrimeNumber1(){
        //소수를 나열하는 메서드.
        int counter = 0;

        for(int n = 2; n <= 1000; n++){
            int i;
            for(i=2; i < n; i++){
                counter++;
                if(n % i == 0)
                    break;
            }
            if(n==i)
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter); //78022
    }

    static void getPrimeNumber2(){
        //소수는 모든 수로 나눠봐야 할 필요는 없음. 합성수로 나누는 것은 결국 소수로 나누는 것과
        //결과가 다르지 않으므로 합성수를 제외한 소수만으로 나누어서 확인하면 연산 횟수 줄일 수 있음.
        //따라서 소수는 1과 자기 자신을 제외한 어떤 소수로도 나누어 떨어지지 않는 수라고 생각하면,

        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        //2를 제외한 짝수는 어차피 소수가 아니므로 홀수만 계산
        for(int n = 3; n <= 1000; n+= 2){
            int i;
            for(i = 1; i < ptr; i++){
                counter++;
                if(n%prime[i]==0)
                    break;
            }
            if(ptr == i)
                prime[ptr++] = n;
        }

        for(int i=0; i<ptr; i++)
            System.out.println(prime[i]);

        System.out.println("곱셈, 나눗셈을 수행한 횟수 : " + counter); //14622 많이 줄었다.
    }

    static void getPrimeNumber3(){
        //정사각형, 직사각형은 어느 한 변으로 나눌 수 있음. 이러한 원리를 활용해 소수 배열에 담긴 수 중 제곱을 하였을 때 대상 수보다 크다면
        //더이상 소수를 구해 연산을 할 필요가 없음.

        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        //2를 제외한 짝수는 어차피 소수가 아니므로 홀수만 계산
        for(int n = 5; n <= 1000; n+= 2){
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++){
                counter+=2;
                if(n%prime[i]==0){
                    flag = true;
                    break;
                }

            }
            if(!flag){
                prime[ptr++] = n;
                counter++;
            }
        }

        for(int i=0; i<ptr; i++)
            System.out.println(prime[i]);

        System.out.println("곱셈, 나눗셈을 수행한 횟수 : " + counter); //3774
    }


}
