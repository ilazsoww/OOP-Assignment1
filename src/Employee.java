public class Employee extends Human{
    private String specialization;
    private float coffeeDrunk;

    public Employee(String specialization, float coffeeDrunk, int teeth, String ru, boolean isKind){
        super(teeth, ru, isKind);
        this.specialization = specialization;
        this.coffeeDrunk = coffeeDrunk;
    }
    public Employee(String specialization){
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return "I am specialized in " + specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getCoffeeDrunk(){
        String cofe = String.valueOf(this.coffeeDrunk);
        return "I had drunk " + cofe + " litres of coffee";
    }
    public void setCoffeeDrunk(float coffeeDrunk){
        this.coffeeDrunk = coffeeDrunk;
    }

    @Override
    public void Greet(){
        System.out.println("I am a worker in small tech company.");
    }
}