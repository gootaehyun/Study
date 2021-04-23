import java.util.Scanner;
import java.io.FileInputStream;
public class AL_20210418_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - 최대상금 구하기");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            
		}
    }

    public void solution2(){
        System.out.println("2번문제 - Flatten");
		Scanner sc = new Scanner(System.in);
		//int T;
		//T=sc.nextInt();

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N = 0;
            N = sc.nextInt();
            int[] box = new int[100];
            for(int i = 0; i < 100; i++)
                box[i] = sc.nextInt();
            int p = 0;
            int result = 0;
            int min = 100;
            int max = 0;
            while(p<=N){
                min = 100;
                max = 0;
                int m = 0;
                int n = 0;
                for(int i = 0; i < 100; i++){
                    //System.out.print(" "+box[i]);
                    if(box[i]<=min){
                        min = box[i];
                        n = i;
                    }
                    if(box[i]>=max){
                        max = box[i];
                        m = i;
                    }
                }
                //System.out.println("max : "+max);
                //System.out.println("min : "+min);
                if(min == max){
                    break;
                }
                box[n]++;
                box[m]--;
                p++;
            }
            //System.out.println("max : "+max+" min : "+min);
            result = max-min;
            System.out.println("#"+test_case+" "+result);
        }
	}

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		AL_20210418_GTH AL = new AL_20210418_GTH();
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
        }
	}
}