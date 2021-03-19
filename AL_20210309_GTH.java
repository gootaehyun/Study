import java.util.Scanner;
import java.io.FileInputStream;
public class AL_20210309_GTH {
    
    public void solution1(){
        System.out.println("1번문제 - 홀수만 더하기");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int sum = 0;
        int [] a = new int[10]; //초기화 값이 0인 10개의 index 가진 배열 생성

      for(int test_case = 1; test_case <= T; test_case++)
      {
         for(int i = 0; i<a.length;i++)
         {
               a[i] = sc.nextInt(); //배열마다 입력받기 
               if(a[i]%2==1) //홀수이면 더하기
                  sum += a[i];
        }
         System.out.print("#"+test_case+" "+sum); 
      }
    }

    public void solution2(){
        System.out.println("2번문제 - 큰 놈, 작은 놈, 같은 놈");
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1 = 0;
            int num2 = 0;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            
            if(num1 > num2){
                System.out.println("#"+test_case+" >");
            }else if(num1 < num2){
                System.out.println("#"+test_case+" <");
            }else{
                System.out.println("#"+test_case+" =");
            }
		}
    }

    public void solution3(){
		System.out.println("3번문제 - 연월일 달력");
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
		int num = 0;
		int year = 0;
		int month = 0;
		int day = 0;
		String t_year, t_month, t_day = "";
		boolean result = true;
		num = sc.nextInt();
		year = num / 10000;
		month = (num - year * 10000) / 100;
		day = num % 100;
		if (year < 1000) {
			t_year = "0" + Integer.toString(year);
		} else {
			t_year = "" + Integer.toString(year);
		}
		if (month == 0 || month > 12) {
			result = false;
		}
		if (month < 10) {
			t_month = "0" + Integer.toString(month);
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8) {
			if (day > 0 && day < 32) {
				if (day < 10) {
				t_day = "0" + Integer.toString(day);
				} else {
				t_day = "" + Integer.toString(day);
				}
			} else {
				result = false;
			}

			} else if (month == 2) {
			if (day > 0 && day < 29) {
				if (day < 10) {
				t_day = "0" + Integer.toString(day);
				} else {
				t_day = "" + Integer.toString(day);
				}
			} else {
				result = false;
			}
			} else {
			if (day > 0 && day < 31) {
				if (day < 10) {
				t_day = "0" + Integer.toString(day);
				} else {
				t_day = "" + Integer.toString(day);
				}
			} else {
				result = false;
			}
			}
		} else {
			t_month = "" + Integer.toString(month);
			if (month == 11) {
			if (day > 0 && day < 31) {
				if (day < 10) {
				t_day = "0" + Integer.toString(day);
				} else {
				t_day = "" + Integer.toString(day);
				}
			} else {
				result = false;
			}

			} else {
			if (day > 0 && day < 32) {
				if (day < 10) {
				t_day = "0" + Integer.toString(day);
				} else {
				t_day = "" + Integer.toString(day);
				}
			} else {
				result = false;
			}
			}
		}
		if (result) {
			System.out.println("#" +test_case + " " + t_year + "/" + t_month + "/" + t_day);
		} else {
			System.out.println("#" + test_case + " -1");
		}
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
