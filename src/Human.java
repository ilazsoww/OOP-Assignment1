public abstract class Human {
    protected int teeth = 32;
    protected String region;
    protected boolean isKind;

    public Human(int teeth, String region, boolean isKind) {
        setTeeth(teeth);
        setRegion(region);
        this.isKind = isKind;
    }
    public Human() {}

    public void greet(){
        String kindText = isKind ? "kind" : "evil";
        System.out.println("Hi! My ru is " + region + ". I have " + teeth + " teeth and I am " + kindText);
    }
    public void goToDentist(int lostTeeth){
        if (lostTeeth < 0) {
            System.out.println("Human can't have negative teeth");
        }
        System.out.println("Now I have: " + Math.max(0, this.teeth - lostTeeth));
    }
    public abstract void sleep();

    public int getTeeth() { return teeth; }
    public void setTeeth(int teeth) { this.teeth = teeth; }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public boolean isKind() {
        return isKind;
    }
    public void setKind(boolean kind) {
        isKind = kind;
    }
}