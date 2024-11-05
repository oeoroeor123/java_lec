package pkg01_one_dimension;

import java.util.Arrays;

public class OneEx {

  public static void main(String[] args) {
  
    // 1차원 배열 : 하나의 인덱스를 사용하는 배열
    
    // 배열의 선언
    String[] members; // 참조 변수(members) 하나가 생성된다.
    
    // 배열의 생성 (배열의 길이를 결정해야함)
    members = new String[4];
    // 힙(heap) 영역에 연속된 4개의 공간이 생기고, 해당 참조를 members 변수에 할당한다.
    // members 변수 메모리에 첫번째 힙 영역 공간의 위치가(ex_String의 경우 참조값) 저장된다. (인덱스가 0부터 시작되는 이유)
    // 배열을 생성할 순 있지만 삭제는 못한다.
    
    // 배열 요소 (배열 이름 + 인덱스)
    members[0] = "지수"; // 실제로 메모리에 저장된 값은 "지수"가 아닌 지수의 참조 값
    members[1] = "로제";
    members[2] = "리사";
    members[3] = "제니";
    
    System.out.println(members[0]); 
    System.out.println(members[1]);
    System.out.println(members[2]);
    System.out.println(members[3]);
    
    // 배열 요소의 초기화 1 (선언 시에만 초기화 가능)
    String[] hobbies = {"게임", "여행", "독서"};
    System.out.println(hobbies); // 참조 값 출력
    System.out.println(hobbies.toString());
    System.out.println(Arrays.toString(hobbies));
    
    // 배열 요소의 초기화 2 (선언과 초기화를 분리)
    String[] movies;
    movies = new String[] {"타이타닉","스타워즈","해리포터"};
    System.out.println(Arrays.toString(movies));
    
    
    // 배열 길이 (Immutable : 수정할 수 없음)
    String[] flowers = {"장미","국화","튤립"};
    System.out.println(flowers.length);
    // flowers.length = 10; > 배열 길이는 상수로 수정 불가 (length 필드는 final 필드)
    
    // 배열 순회 (일반 for 문)
    String[] animals = {"코뿔소", "기린", "하마"};
    for(int i = 0; i < animals.length; i++) {
      System.out.println(animals[i]);
      }
    
    // 배열의 길이를 늘이는 방법
    // 1. 새로운 길이의 새로운 배열을 만든다.
    // 2. 기존 배열의 요소를 모두 새로운 배열로 옮긴다.
    // 3. 기존 배열의 참조를 새로운 배열의 참조로 바꾼다.
    String[] seasons = {"봄","여름"};
    String[] temp = new String[4]; // 새로운 임시 배열을 생성
    for(int i = 0; i < seasons.length; i++) {
      temp[i] = seasons[i]; // 기존 배열 요소를 새로운 임시 배열 요소에 덮어씌움
    }
    seasons = temp; // 새로운 임시 배열의 길이와 기존 배열 길이를 똑같이 만들어 줌
    System.out.println(Arrays.toString(seasons));
  
    
    // 배열 순회 (Advanced for 문 : 배열 요소를 수정할때는 사용할 수 없음)
    String[] foods = {"김치", "보쌈", "시금치"};
    for(String food : foods) { // for(배열 요소 값을 가지고 있는 별도의 변수 : 배열)
    food = "오리로스";
    }
    System.out.println(Arrays.toString(foods)); // 모든 요소를 오리로스로 바꾸는 코드가 아님 !
    
    // 단순 참조 용으로 사용
    for(String food : foods) {
      System.out.println(food);
    }
    
    // 배열 요소를 모두 동일하게 바꾸는 방법 (일반 for 문 사용)
    for(int i = 0; i < foods.length; i++) {
      foods[i] = "오리로스";
    }
    System.out.println(Arrays.toString(foods));    
  }

}
