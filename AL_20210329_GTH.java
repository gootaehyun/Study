import java.util.Scanner;
import java.io.FileInputStream;
public class AL_20210329_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - 최빈수 구하기");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
			int a;
            a = sc.nextInt();
            int[] score = new int[1000];
            for(int i = 0; i < 1000; i++){
            	score[i] = sc.nextInt();
            }
            int[] arr = new int[101];
            for(int i = 0; i<1000; i++){
            	arr[score[i]]++;
            }
            int max=0;
            int result = 0;
            for(int i = 0; i<101; i++){
                if(max <= arr[i]){
                    max = arr[i];
                    result = i;
                }
            }
            System.out.println("#"+test_case+" "+result);
		}
    }

    public void solution2(){
        System.out.println("2번문제 - 달팽이 숫자");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = 0;
            N = sc.nextInt();
            int[][] result = new int[N][N];

            int chk1 = 0;
            int chk2 = 1;
            int c = 0;
            int r = 1;
            for(int i = 0; i < 2*N-1; i++){
                //System.out.println("순번 : "+i);
            	if(i%2 == 0){
                    if(c%2 == 0){
                        for(int j = 0+chk1; j <= N-chk2; j++){
                            result[chk1][j] = r;
                            r++;
                            //System.out.println("1번째r: "+r+" chk1 : "+chk1+" result["+(chk1)+"]["+j+"] : "+result[chk1][j]);
                        }
                        chk1++;
                    }else{
                        for(int j = N-chk2; j >= chk1-1; j--){
                            result[N-chk1][j] = r;
                            r++;
                           //System.out.println("2번째r: "+r+" chk1 : "+chk1+" result["+(N-chk1)+"]["+j+"] : "+result[N-chk1][j]);
                        } 
                    }
                }else{
                    if(c%2 == 0){
                        for(int k = 0+chk1; k <= N-chk2; k++){
                            result[k][N-chk1] = r;
                            r++;
                            //System.out.println("3번째r: "+r+" chk2 : "+chk2+" result["+k+"]["+(N-chk1)+"] : "+result[k][N-chk1]);
                        }
                        chk2++;
                        c++;
                    }else{
                        for(int k = N-chk2; k >= chk1; k--){
                            result[k][chk1-1] = r;
                            r++;
                            //System.out.println("4번째r: "+r+" chk2 : "+chk2+" result["+k+"]["+(chk1-1)+"] : "+result[k][chk1-1]);
                        }
                        c++;
                    }
                }
            }
            System.out.println("#"+test_case);
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    System.out.print(""+result[i][j]+" ");
                }
                System.out.println();
            }
		}
    }

    public void solution3(){
        System.out.println("3번문제 - 3 6 9 게임");
        Scanner sc = new Scanner(System.in);
        int N = 0;
        N = sc.nextInt();
        String[] str = new String[N];
        
        for(int i = 0; i < N; i++){
            str[i] = Integer.toString(i+1).replace("3","-");
            str[i] = str[i].replace("6","-");
            str[i] = str[i].replace("9","-");
            if(str[i].contains("-")){
                str[i] = str[i].replaceAll("[\\d]","");
            }
            System.out.print(str[i]+" ");
        }
        System.out.print("\n");
    }
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		AL_20210329_GTH AL = new AL_20210329_GTH();
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