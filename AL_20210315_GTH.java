import java.util.Scanner;
import java.io.FileInputStream;
public class AL_20210315_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - 지그재그 숫자");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = 0;
            int sum = 0;
            n = sc.nextInt();
            for(int i = 1; i <= n; i++){
            	if(i%2==1){
                    sum = sum+i;
                }else{
                    sum = sum-i;
                }
            }
            System.out.println("#"+test_case+" "+sum);
		}
    }

    public void solution2(){
        System.out.println("2번문제 - 파리퇴치");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = 0;
            int M = 0;
            
			N = sc.nextInt();
            if(N < 5 || N > 15){
                System.out.println("N은 5이상 15이하의 숫자여야합니다.");
                N = sc.nextInt();
            }
            M = sc.nextInt();
            if(M < 2 || M > N){
                System.out.println("M은 2이상 N이하의 숫자여야합니다.");
                M = sc.nextInt();
            }
            int[][] matrix = new int[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j <N; j++){
                	matrix[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            int result = 0;
            for(int k =0; k<=N-M; k++){
                for(int h = 0; h<=N-M;h++){
                    for(int p = 0; p<M; p++){
                        for(int q = 0; q<M;q++){
                            //System.out.println("matrix["+(p+h+k)+"]["+(q+h+k)+"]");
                            sum = sum+matrix[p+k][q+h];
                        }
                    }
                    if(result < sum){
                    	result = sum;
                    }else{
                    }
                    sum = 0;
                }
        	}
            System.out.println("#"+test_case+" "+result);
		}
    }

    public void solution3(){
        System.out.println("3번문제 - 백만 장자 프로젝트");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = 0;
            N=sc.nextInt();
            int[] price = new int[N];
            int max = 0;
            int maxlength = 0;
            long sum = 0;
            long result = 0;
            int length = 0;
            
            for(int i = 0; i < N; i++){
                price[i] = sc.nextInt();
            }
            while(maxlength<N-1){
                int day = 0;
                
                for(int i = length; i < N; i++){
                    if(max<price[i]){
                        max=price[i];
                        maxlength=i;
                        //System.out.println("maxlength : "+maxlength);
                    }
                }
                for(int i = length; i < maxlength; i++){
                    sum = sum + price[i];
                    day++;
                    //System.out.println("sum : "+sum);
                }
                length = maxlength+1;
                //System.out.println("length : "+length);
                result = result + price[maxlength] * day - sum;
                //System.out.println("result : "+result);

                max = 0;
                sum = 0;
                day = 0;
            }
            System.out.println("#"+test_case+" "+result);
		}

    }
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		AL_20210315_GTH AL = new AL_20210315_GTH();
        int number =0 ;
        System.out.println("문제번호를 입력하세요.1~3");
        number = sc.nextInt();
        switch(number){
            case 1:
                AL.solution1();
                break;
            case 2:
                AL.solution2();
                break;
            case 3:
                AL.solution3();
                break;    
        }

	}

}
