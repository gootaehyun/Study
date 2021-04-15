import java.util.*;
import java.io.FileInputStream;
public class AL_20210404_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - 달팽이숫자 한번더");
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

    public void solution2(){
        System.out.println("2번문제 - 스도쿠 검증");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int[][] puzzle = new int[9][9];
            // 입력받기
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }
            // 검증
            int[] chk = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] tmp = new int[9];
            boolean check = true;
            int result = 1;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    tmp[j] = puzzle[i][j];
                }
                Arrays.sort(tmp);
                for (int t = 0; t < 9; t++) {
                    if (tmp[t] != chk[t]) {
                        // System.out.println("1");
                        check = false;
                    }
                }
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    tmp[j] = puzzle[j][i];
                }
                Arrays.sort(tmp);
                for (int t = 0; t < 9; t++) {
                    if (tmp[t] != chk[t]) {
                        // System.out.println("2");
                        check = false;
                    }
                }
            }
            for (int c1 = 0; c1 < 3; c1++) {
                for (int c2 = 0; c2 < 3; c2++) {
                    int n = 0;
                    for (int k1 = 0 + 3 * c1; k1 < 3 + 3 * c1; k1++) {
                        for (int k2 = 0 + 3 * c2; k2 < 3 + 3 * c2; k2++) {
                            tmp[n] = puzzle[k1][k2];
                            // System.out.println("n : " + n + "tmp=>" + tmp[n]);
                            n++;
                        }
                    }
                    Arrays.sort(tmp);
                    for (int t = 0; t < 9; t++) {
                        if (tmp[t] != chk[t]) {
                            // System.out.println("3");
                            check = false;
                        }
                    }
                }
            }
            if (!check) {
                result = 0;
            }
            System.out.println("#" + test_case + " " + result);
		}
    }

    public void solution3(){
        System.out.println("3번문제 - 숫자 배열 회전");
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = 0;
            N = sc.nextInt();
            int[][] matrix = new int[N][N];
            int[][] result1 = new int[N][N];
            int[][] result2 = new int[N][N];
            int[][] result3 = new int[N][N];
            // 입력받기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    result1[i][j] = matrix[N - j - 1][i];
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    result2[i][j] = result1[N - j - 1][i];
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    result3[i][j] = result2[N - j - 1][i];
                }
            }
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(result1[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(result2[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(result3[i][j]);
                }
                System.out.println();
            }
        }
    }
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		AL_20210404_GTH AL = new AL_20210404_GTH();
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