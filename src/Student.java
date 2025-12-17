public class Student extends Human{
    String bestSubject;
    float hoursOfSleep;
    int teeth = 32;

    public Student(String bestSubject, float hoursOfSleep, int teeth, String ru, boolean isKind){
        super(teeth, ru, isKind);
        this.bestSubject = bestSubject;
        this.hoursOfSleep = hoursOfSleep;
    }
    public Student(String bestSubject, float hoursOfSleep){
        this.bestSubject = bestSubject;
        this.hoursOfSleep = hoursOfSleep;
    }

    public String getBestSubject(){
        return bestSubject + "is the best subject!";
    }
    public void setBestSubject(String bestSubject){
        this.bestSubject = bestSubject;
    }
    public String getHoursOfSleep() { return "I have slept " + hoursOfSleep + " hours."; }
    public void setHoursOfSleep(float hoursOfSleep){
        this.hoursOfSleep = hoursOfSleep;
    }

    @Override
    public void goToDentist(int lostTeeth){
        System.out.println("I still have calf's teeth!\n" + (teeth-(lostTeeth/2)));
    }
}