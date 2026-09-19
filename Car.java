public class Car {
    private String color;
    private String model;
    private double price;
    private String avtORmexa;
    private boolean working;
    public Car(String color, String model, double price, String avtORmexa, boolean working ){
        this.color=color;
        this.model=model;
        this.price=price;
        this.avtORmexa=avtORmexa;
        this.working=working;
    }
    public void start(){
        if (!working){
            working=true;
            System.out.println(model+": Engine is starting.");
        }else {
            System.out.println(model+": Engine is already working.");
        }
    }
    public void stopEngine(){
        if (working){
            working=false;
            System.out.println(model+": Engine is stopped");
        }else {
            System.out.println(model+": Engine is already off");
        }
    }
    public String toString(){
        return model+"_"+color+"_\nprice: $"+price+"\ntye: "+avtORmexa;
    }

}
