package pkg00_Bus;

public class Bus {

  private Seat[] seats;
  private int numOfPerson;
  
  public Bus(int limit) {
    seats = new Seat[limit]; // Seat 배열 생성
    for(int i = 0; i < limit; i++) {
      seats[i] = new Seat(); // limit 만큼 Seat 생성자를 부름 > 하나씩 꺼내서 seat 채워줌
    }
  }
  
  // 버스 탑승 (빈 좌석 앞자리부터 채우기, 입석 금지)
  public void on(Person person) {
  if(numOfPerson == seats.length) {
    System.out.println("자리 없음");
    return;
  }
  for(int i = 0; i < seats.length; i++) {
    if(seats[i].getPerson() == null) { // 빈 좌석일 경우
      seats[i].setPerson(person); // 사람 1명씩 채우기
      numOfPerson++;
      return;
    }
  }
  }
  
  // 버스 하차 (내리는 사람의 좌석 번호를 이용해서 하차)
  public void off(int seatNo) {
    seatNo--;
    if(seatNo < 0 || seatNo >= seats.length) {
      System.out.println("좌석 번호가 잘못 전달 되었습니다.");
      return;
    }
    seats[seatNo].setPerson(null);
    numOfPerson--;
  }
  
  // 버스 탑승 명단 (1번 좌석 : 홍길동, 2번 좌석 : 비어있음, ...)
  public void info() {
    for(int i = 0 ; i < seats.length; i++) {
      Person p = seats[i].getPerson(); // 각 좌석에 앉은 사람
      if(p == null)
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어있음");
      else
        System.out.println(String.format("%20d", i + 1) + "번 좌석 : " + p.getName());
    }
  }
  
  
  
}
