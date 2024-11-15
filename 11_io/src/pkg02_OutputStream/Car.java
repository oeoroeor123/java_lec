package pkg02_OutputStream;

import java.io.Serializable;

public class Car implements Serializable {

  private static final long serialVersionUID = 8700815857560380024L;
  private String brand;
  private String model;
  
  /* 직렬화가 가능한 클래스
   * 1. java.io.Serializable 인터페이스를 구현한다.
   * 2. serial version UID 값을 생성한다. 
   */
  
  public Car(String brand, String model) {
    super();
    this.brand = brand;
    this.model = model;
  }


  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }
  
}
