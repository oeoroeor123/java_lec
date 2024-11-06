package pkg02_two_dimension;

public class TwoEx {

  public static void main(String[] args) {
   
    // 2차원 배열 : 테이블 형태로 이해 (실제로는 1차원 배열이 여러개 존재)
   
    // 배열 선언
    String[][] seats;
    
    // 배열 생성
    seats = new String[3][2]; // 3행(row)과 2열(col)을 결정 (실제로는 길이가 2인 1차원 배열이 3개 있는 것)

    // 배열 요소 : 1행의 2개 데이터 (실제로는 1번째 1차원 배열의 요소)
    seats[0][0] = "A1";
    seats[0][1] = "A2";
    
    // 배열 요소 : 2행의 2개 데이터 (2번째 1차원 배열의 요소)
    seats[1][0] = "B1";
    seats[1][1] = "B2";
    
    // 배열 요소 : 3행의 2개 데이터 (3번째 1차원 배열의 요소)
    seats[2][0] = "C1";
    seats[2][1] = "C2";
   
    /* 데이터 생성 위치
     A1 A2  -> 1차원 배열 (seats[0])
     B1 B2  -> 1차원 배열 (seats[1])
     C1 C2  -> 1차원 배열 (seats[2])
    */
    
    // 2차원 배열을 구성하는 1차원 배열 확인
    // 1번째 1차원 배열
    for(int j = 0; j < seats[0].length; j++) { // 배열 이름 : seats[0]
      System.out.print(seats[0][j] + " ");
    }
    System.out.println(); // 줄 바꿈용
    
    // 2번째 1차원 배열
    for(int j = 0; j < seats[1].length; j++) { // 배열 이름 : seats[1]
      System.out.print(seats[1][j] + " ");
    }
    System.out.println(); // 줄 바꿈용
      
    // 3번째 1차원 배열 
    for(int j = 0; j < seats[2].length; j++) { // 배열 이름 : seats[2]
      System.out.print(seats[2][j] + " ");
    }
    System.out.println(); // 줄 바꿈용

    // 2차원 배열의 순회 1 (일반 for 문)
    for(int i = 0; i < seats.length; i++) { // seats.length : 3행
      for(int j = 0; j < seats[i].length; j++) { // seats[i].length : 2열 
        System.out.print(seats[i][j] + " "); // seats[3][2]
      }
      System.out.println(); // 줄 바꿈용
    }
       
    
    // 2차원 배열의 순회 2 (Advanced for 문) 
    for(String[] ary : seats) { // 요소 : 배열
      for(String seat : ary) { // 1차원 배열의 구성 요소 : 배열
        System.out.print(seat + " ");
      }
      System.out.println();
    }

    // 서로 길이가 다른 1차원 배열을 2차원 배열로 관리하기
    String[][] menus = new String[3][]; // 1차원 배열이 3개 있으며, 각 1차원 배열의 길이는 모른다.
    
    // 각 1차원 배열의 길이 정하기 (선언할때 길이는 생략하고 각 배열 길이를 따로따로 정해주기)
    menus[0] = new String[3]; // 첫 번째 1차원 배열의 길이는 3
    menus[1] = new String[5]; // 두 번째 1차원 배열의 길이는 5
    menus[2] = new String[4]; // 세 번째 1차원 배열의 길이는 4
    
    // 2차원 배열의 순회 (일반 for 문)
    for(int i = 0; i < menus.length; i++) {
      for(int j = 0; j < menus[i].length; j++) {
        System.out.print(menus[i][j] + " ");
      }
      System.out.println();
    }
    
    // 2차원 배열의 초기화 1 (선언시에만 초기화 가능 > 큰 중괄호로 묶고 1차원 배열을 각 줄에 적어줌)
    String[][] animals = {
        {"tiger", "lion"}, // 첫 번째 1차원 배열의 초기화
        {"dolphin", "shark"}, // 두 번째 1차원 배열의 초기화
        {"falcon", "eagle"} // 세 번째 1차원 배열의 초기화
    };
     
    // for 문 출력 (일반 for 문)
    for(int i = 0; i < animals.length; i++) { // 3행
      for (int j = 0; j < animals[i].length; j++) { // 2열
        // System.out.print(animals[i][j] + " "); // animals[3][2]
        System.out.print(String.format("%-10s", animals[i][j])); // 각 배열 요소 간격 맞추기
      }
      System.out.println();
    }
    
    
    // 2차원 배열의 초기화 2 (선언과 초기화를 분리)
    String[][] flowers;
    flowers = new String[][] {
      {"장미", "안개꽃"},
      {"튤립", "동백", "프리지아"}
    };
    
    // for 문 출력 (일반 for 문)
    for(int i = 0; i < flowers.length; i++) { // 2행
      for(int j = 0; j < flowers[i].length; j++) { // 2열, 3열
        System.out.print(flowers[i][j]); // flowers[2][2 또는 3]
      }
      System.out.println();
     }
      
      
    }    
  }
  
