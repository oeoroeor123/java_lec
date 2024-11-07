package pkg09_member;

public class Member {

  private String name;
  private Address address;
  private Contact contact;
  
  public Member(String name, Address address, Contact contact) {
    this.name = name;
    this.address = address;
    this.contact = contact;
  }
  
  public void info() {
    System.out.println(name);
    address.info(); // Address 클래스의 info 메소드 호출 
    contact.info(); // Contact 클래스의 info 메소드 호출
  }
  
}
