import java.util.Scanner;
import java.io.FileInputStream;
public class AL_20210411_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - 최빈수 구하기");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = 0;
            N = sc.nextInt();
            System.out.println("#"+test_case);
            int[][] pascal = new int[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j <=i; j++){
                    if(j == 0 || j == i){
                        pascal[i][j] = 1;
                    }else if(i>0){
                        pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j];
                    }
                    System.out.print(pascal[i][j]);
                    if(j != i)
                        System.out.print(" ");
                }
                System.out.println();
            }
		}
    }

    public void solution2(){
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = 0;
            N = sc.nextInt();
            
            String[][] omok = new String[N][N];
            String tmp = "";
            for(int i = 0; i < N; i++){
                tmp = sc.next();
                String[] arr = tmp.split("");
                for(int j = 0; j < N; j++){
                    omok[i][j] = arr[j];
                }
            }
            for(String[] s : omok){
                for(String c : s){
                    //System.out.print(c);
                }
                //System.out.println();
            }
            String check = "ooooo";
            String result = "NO";
            //가로확인
            for(int i = 0; i < N; i++){
                String chk = "";
            	for(int j = 0; j < N-4; j++){
                    //System.out.print(omok[i][j]+" ");
                	if(omok[i][j].equals("o")){
                        //System.out.print("o확인 i:"+i+" j:"+j);
                        for(int k = 0; k < 5; k++){
                        	chk += omok[i][j+k];
                        }
                    }
                    if(chk.equals(check))
                        result = "YES";
                    //System.out.print("임시저장"+chk);
                }
                //System.out.println();
            }
            
            //세로확인
            for(int i = 0; i < N-4; i++){
                String chk = "";
            	for(int j = 0; j < N; j++){
                    //System.out.print(omok[i][j]+" ");
                	if(omok[i][j].equals("o")){
                        //System.out.print("o확인 i:"+i+" j:"+j);
                        for(int k = 0; k < 5; k++){
                        	chk += omok[i+k][j];
                        }
                    }
                    if(chk.equals(check))
                        result = "YES";
                    //System.out.print("임시저장"+chk);
                }
                //System.out.println();
            }
            
            //대각선오른쪽아래
            for(int i = 0; i < N-4; i++){
                String chk = "";
            	for(int j = 0; j < N-4; j++){
                    //System.out.print(omok[i][j]+" ");
                	if(omok[i][j].equals("o")){
                        //System.out.print("o확인 i:"+i+" j:"+j);
                        for(int k = 0; k < 5; k++){
                        	chk += omok[i+k][j+k];
                        }
                    }
                    if(chk.equals(check))
                        result = "YES";
                    //System.out.print("임시저장"+chk);
                }
                //System.out.println();
            }
            
            //대각선왼쪽아래
            for(int i = 0; i < N-4; i++){
                String chk = "";
            	for(int j = 4; j < N; j++){
                    //System.out.print(omok[i][j]+" ");
                	if(omok[i][j].equals("o")){
                        //System.out.print("o확인 i:"+i+" j:"+j);
                        for(int k = 0; k < 5; k++){
                        	chk += omok[i+k][j-k];
                        }
                    }
                    if(chk.equals(check))
                        result = "YES";
                    //System.out.print("임시저장"+chk);
                }
                //System.out.println();
            }
            System.out.println("#"+test_case+" "+result);
		}
	}

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		AL_20210411_GTH AL = new AL_20210411_GTH();
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