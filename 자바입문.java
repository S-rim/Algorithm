// 1부터 100까지 홀수만 출력

class Main {
    public static void main(String[] args) {
      for(int i=1; i<=100; i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }
    }
  }

// 1부터 100까지 짝수만 출력

class Main {
    public static void main(String[] args) {
      for(int i=1; i<=100; i++)
      {
        if(i%2==0)
        {
          System.out.println(i);
        }
      }
    }
  }

// 이중 while문 99단

class Main {
  
    public static void main(String[] args) {
      int i=2;
      int j=1;
  
      while(i<10)
      {
        while(j<9)
        {
          j++;
          System.out.println(i + " * " + j + " = " + i*j);
        }
        System.out.println("\t");
        j=1;
        i++;
      }
    }
}

// 1000까지 약수 구하기

class Main {
    public static void main(String[] args) {
      for(int i=1;i<=1000;i++)
        if(1000%i==0) System.out.println(i);
    }
  }

// 1000의 약수의 합

class Main {
    public static void main(String[] args) {
      int sum=0;
  
      for(int i=1;i<=1000;i++)
      {
        if(1000%i==0)
        {
          sum+=i;
        }   
      }
      System.out.println(sum);
    }
  }

//num이 소수인지 아닌지 판별(입력받아서)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int num;
    int i;
    Scanner scan = new Scanner(System.in);
    num = scan.nextInt();        // 키보드 숫자 정수 


    for (i=2; i<num; i++) 
    {
      if (num % i == 0)
        break;
    }
      if ( i == num )
        System.out.println("소수 입니다.");
      else 
        System.out.println("소수가 아닙니다.");
  }
}