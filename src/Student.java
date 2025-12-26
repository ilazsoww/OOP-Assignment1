public final class Student extends Human implements IWalk{
    private static final int DEFAULT_TEETH = 32;

    private String bestSubject;
    private float hoursOfSleep;

    private final boolean isNerd = true;

    private static int studentsCount;

    public Student(String bestSubject, float hoursOfSleep, int teeth, String ru, boolean isKind){
        super(teeth, ru, isKind);
        this.bestSubject = bestSubject;
        this.hoursOfSleep = hoursOfSleep;
        studentsCount++;
    }
    public Student(String bestSubject, float hoursOfSleep){
        this(bestSubject, hoursOfSleep, DEFAULT_TEETH, "Zhagalbaily", true);
    }

    @Override
    public void goToDentist(int lostTeeth){
        System.out.println("I still have calf's teeth!");
        super.goToDentist(lostTeeth / 2);
        System.out.println("Now I have " + getTeeth() + " teeth.");
    }
    @Override
    public void step(){
        System.out.println("Student stepped.");
    }
    @Override
    public void jump(){
        System.out.println("Student jumped.");
    }
    @Override
    public void sleep(){
        System.out.println("Student sleeping");
        hoursOfSleep += 3f;
    }
    public final void study(){
        System.out.println("Student studying...");
        hoursOfSleep -= 3f;
    }

    public String getBestSubject(){
        return bestSubject;
    }
    public void setBestSubject(String bestSubject){
        this.bestSubject = bestSubject;
    }
    public float getHoursOfSleep() { return hoursOfSleep; }
    public void setHoursOfSleep(float hoursOfSleep){
        this.hoursOfSleep = hoursOfSleep;
    }
    public boolean isNerd() { return isNerd; }
    public static int getStudentsCount() { return studentsCount; }
}