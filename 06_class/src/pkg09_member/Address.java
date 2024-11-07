package pkg09_member;

public class Address {

  private String zipCode;
  private String roadAddr;
  private String detailAddr;
  
  public Address(String zipCode, String roadAddr, String detailAddr) {
    this.zipCode = zipCode;
    this.roadAddr = roadAddr;
    this.detailAddr = detailAddr;
  }
  
  public void info() {
    System.out.println(zipCode);
    System.out.println(roadAddr + " " + detailAddr);
  }
  
  
  
  
  
  
  
  
}
