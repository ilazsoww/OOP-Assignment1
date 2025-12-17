public class Human {
    private int teeth = 32;
    private String ru;
    private boolean isKind;

    public Human(int teeth, String ru, boolean isKind) {
        this.teeth = teeth;
        this.ru = ru;
        this.isKind = isKind;
        System.out.println("Human initialized with properties");
    }
    public Human() { System.out.println("Human initialized with properties"); }

    public String getTeeth() {
        return "I have " + teeth + " teeth";
    }
    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
    public String getRu() {
        return ru;
    }
    public void setRu(String ru) {
        this.ru = ru;
    }
    public boolean isKind() {
        return isKind;
    }
    public void setKind(boolean kind) {
        isKind = kind;
    }

    public void Greet(){
        String kind = isKind ? "kind" : "evil";
        System.out.println("Hi! My ru is " + ru + ". I have " + teeth + " teeth and I am " + kind);
    }
    public void goToDentist(int lostTeeth){
        this.teeth = teeth-lostTeeth;
    }
}