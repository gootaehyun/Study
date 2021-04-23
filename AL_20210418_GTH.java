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
			int number = 0;
            int N = 0;
            number = sc.nextInt();
            N = sc.nextInt();
            int length = (int)(Math.log10(number)+1);
            int[] p = new int[length];
            for(int i = 0; i < length ; i++){
            	p[i] = number%10;
                number = number/10;
                //System.out.println("p : "+p[i]);
            }
            int i = 0;
            int C = 0;
            while(C<N){
                int max = 0;
                int tmp = 0;
                int chk1 = 0;
                int chk2 = 0;
            	for(int j = length-1-i; j >= 0; j--){
                	if(p[j] > max){
                        max = p[j];
                        chk1 = j;
                    }else if(p[j] == max && j > 0){
                    	chk2 = j;
                        //System.out.println("chk2 : "+chk2);
                    }
                }
                
                System.out.println("max : "+max);
                if(max != p[length-1-i]){
                	tmp = p[length-1-i];
                    p[length-1-i] = max;
                    p[chk1] = tmp;
                }else{
                	tmp = p[0];
                    p[0] = p[1];
                    p[1] = tmp;
                }
                i++;
                C++;
                if(i>=length)
                    i = i-length;
            }
            System.out.print("#"+test_case+" ");
            for(int a = length-1; a >= 0; a--){
                    System.out.print(p[a]);
            }
            System.out.println();
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