package pkg09_member;

public class Contact {

  private String tel;
  private String mobile;

  public Contact() {
    
  }
  
  public Contact(String mobile) {
    // this.mobile = mobile;
    this(null, mobile); // 밑에 있는 생성자를 호출 > null = tel, 호출하지 않기에 null로 작성
  }
  
  public Contact(String tel, String mobile) {
    this.tel = tel;
    this.mobile = mobile;
  }
  
  public void info() {
    System.out.println("Tel : " + (tel == null ? "없음" : tel));
    System.out.println("Mobile : " + (mobile == null ? "없음" : mobile));
  }
 
  
}
