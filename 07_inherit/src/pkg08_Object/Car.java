package pkg08_Object;

public class Car {

  private String brand;
  private String model;
  
  public Car(String brand, String model) {
    super(); // Object 클래스의 생성자를 의미
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

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", model=" + model + "]";
  }
   
  
}
