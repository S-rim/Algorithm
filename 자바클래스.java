//Car 클래스 만들기

class Main {
    public static void main(String[] args) {
      Car car1 = new Car();
    }
  }
  
class Car {
  
  }

// 메소드 만들어 차가 달리게 하기

  class Main {
    public static void main(String[] args) {
      Car car1 = new Car();
      car1.run();
    }
  }
  
  class Car {
    void run()
    {
      System.out.println("차가 달립니다.");
    }
  }

// duck클래스 만들고 메소드 만들기

  class Main {
    public static void main(String[] args) {
      duck aduck = new duck();
      aduck.fly();
    }
  }
  
  class duck
  {
    void fly()
    {
      System.out.println("날았다.");
    }
  }

// 클래스 만들고 각각 메소드 만들기

  class Main {
    public static void main(String[] args) {
        Duck aduck = new Duck();
        RedDuck bduck = new RedDuck();
        BlueDueck cduck = new BlueDuck(); 

        aduck.fly();
        bduck.fly();
        cduck.fly();
    }
  }
  
  class Duck
  {
    void fly()
    {
      System.out.println("날았다.");
    }
  }

  class RedDuck 
  {
    void fly()
    {
      System.out.println("날았다.");
    }
  }

  class BlueDuck
  {
    void fly()
    {
      System.out.println("날았다.");
    }
  }

// 상속 이용하여 중복 없애기

  public class Main {
    public static void main(String[] args) {
        Duck aduck = new Duck();
        RedDuck bduck = new RedDuck();
        BlueDueck cduck = new BlueDuck(); 

        aduck.fly();
        bduck.fly();
        cduck.fly();
    }
  }
  
  class Duck
  {
    void fly()
    {
      System.out.println("날았다.");
    }
  }

  class RedDuck extends Duck
  {

  }

  class BlueDuck extends Duck
  {

  }