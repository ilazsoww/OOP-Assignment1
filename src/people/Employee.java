package people;

import interfaces.IWork;
import interfaces.IWalk;

public class Employee extends Human implements IWalk, IWork {
    private String specialization;
    private float coffeeDrunk;

    public Employee(String specialization, float coffeeDrunk, int teeth, String ru, boolean isKind){
        super(teeth, ru, isKind);
        this.specialization = specialization;
        this.coffeeDrunk = coffeeDrunk;
    }
    public Employee(String specialization){
        this(specialization, 0, 32, "Tabyn", true);
    }

    @Override
    public void greet(){
        System.out.println("I am a worker in small tech company.");
    }
    @Override
    public void step(){
        System.out.println("people.Employee stepped...");
    }
    @Override
    public void jump(){
        System.out.println("people.Employee jumped...");
    }
    @Override
    public void clickMouse(){
        System.out.println("people.Employee clicked the mouse...");
    }
    @Override
    public void clickKey(){
        System.out.println("people.Employee clicked the key...");
    }
    @Override
    public void sleep(){
        System.out.println("people.Employee sleeping...");
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public float getCoffeeDrunk(){ return coffeeDrunk; }
    public void setCoffeeDrunk(float coffeeDrunk){
        this.coffeeDrunk = coffeeDrunk;
    }
}