import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AL_20210322_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - View");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = 0;
            N = sc.nextInt();
            int[] height = new int[N];
            int result = 0;
            for(int i = 0; i < N; i++){
                height[i] = sc.nextInt();
            }
            for(int i = 2; i < N-2; i++){
                int max = 0;
                int max2 = 0;
                for(int j = i-2; j < 3+i; j++){
                    if(max < height[j]){
                        max = height[j];
                    }
                }
                //System.out.println("max값: "+max);
                if(max == height[i]){
                    if(max2 < height[i-2])
                        max2 = height[i-2];
                    if(max2 < height[i-1])
                        max2 = height[i-1];
                    if(max2 < height[i+1])
                        max2 = height[i+1];
                    if(max2 < height[i+2])
                        max2 = height[i+2];
                    //System.out.println("max2값: "+max2);
                    result = result + max-max2;
                }
            }
            System.out.println("#"+test_case+" "+result);
		}
    }

    public void solution2() throws Exception{
        System.out.println("2번문제 - 무한사전");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String P = br.readLine();
            String Q = br.readLine();
            String result = "";
            if(P.length() < Q.length()) {
                P += "a";
                if(P.equals(Q)) {
                    result = "N";
                }else {
                    result = "Y";
                }
            }else if(P.length() > Q.length()){
                result = "Y";
            }else {
                result = "Y";
            }
            System.out.println("#"+test_case+" "+result);
		}
	}

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		AL_20210322_GTH AL = new AL_20210322_GTH();
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