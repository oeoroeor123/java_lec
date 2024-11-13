package pkg01_wrapper_class;

public class WrapperEx {

  public static void main(String[] args) {
    
    // primitive type → wrapper class (primitive 타입을 reference 타입으로 바꿔준다.)
    Byte a = 1;
    Short b = 2;
    Integer c = 3;
    Long d = 4L;
    Float e = 5.0F;
    Double f = 6.0;
    Character g = 'A';
    Boolean h = true;

    
    // Auto Boxing : primitive type(기본 타입)이 자동으로 wrapper class(참조타입)로 바뀌는 것
    Integer x = 10;
    
    // Auto UnBoxing : wrapper class(참조타입) 값이 자동으로 primitive type(기본 타입)으로 바뀌는 것
    int y = x + 10;
   
  }

}
