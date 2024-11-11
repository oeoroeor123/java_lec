package pkg00_Bus;

public class BusEx {

  public static void main(String[] args) {
   Bus bus = new Bus(5);
   
   bus.on(new Man("톰"));
   bus.on(new Man("저스틴"));
   bus.on(new Man("찰리"));
   bus.on(new Man("애덤"));
   bus.on(new Man("샘"));
   bus.on(new Man("에릭"));

   
   bus.info();
   
   bus.off(3);
   
   bus.info();
   
   bus.on(new Woman("제시카"));
  
   bus.info();

  }
}
