package pkg03_one_dimension_ex;

public class Ex04 {

  public static void main(String[] args) {
   
 // 10진수를 2진수로 변환한 결과를 배열에 저장하기

    // 10진수
    int number = 35;            // 2 | 35
                                //   └----
                                // 2 | 17  ... 1 → binary[0]
                                //   └----
                                // 2 |  8  ... 1 → binary[1]
                                //   └----
                                // 2 |  4  ... 0 → binary[2]
                                //   └----
                                // 2 |  2  ... 0 → binary[3]
                                //   └----
                                // 2 |  1  ... 0 → binary[4]
                                //   └----
                                //      0  ... 1 → binary[5]
    
    // 2진수                    //   ┌---------------------------------------┐
    int[] binary = new int[10]; //   | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
                                //   └---------------------------------------┘
        
    int i = 0;
    while(number > 0) {
      binary[i++] = number % 2; // 인덱스 i가 출력 후 증가하기에 실제로 인덱스가 가리키고 있는 값은 인덱스 + 1
      number /= 2; // number = number / 2
    }
    for(int j = i - 1; j >= 0; j--) { // 초기 값이 인덱스 - 1 : 실제 인덱스 첫 값으로 시작함
      System.out.print(binary[j]);
    }
        
  }

}
