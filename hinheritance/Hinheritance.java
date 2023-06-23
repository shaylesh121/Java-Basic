package hinheritance;

interface Vehicle{
    void start();
    void movement();
    void stop();
}
class Bus implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bus start.");
    }
    @Override
    public void movement(){
        System.out.println("Bus move.");
    }
    @Override
    public void stop(){
        System.out.println("Bus stop.");
    }
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car start.");
    }
    @Override
    public void movement(){
        System.out.println("Car move.");
    }
    @Override
    public void stop(){
        System.out.println("Car stop.");
    }
}

public class Hinheritance {
    public static void main(String[] args){
        Bus b= new Bus();
        b.start();
        b.movement();
        b.stop();
        
        Car c= new Car();
        c.start();
        c.movement();
        c.stop();
    }
}
