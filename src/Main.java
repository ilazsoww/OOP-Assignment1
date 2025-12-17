void main() {
    Human Adam = new Human();
    Employee e1 = new Employee("Procrastination");
    Student s1 = new Student("Math", 5.5f);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter human's ru: ");
    Adam.setRu(sc.nextLine());
    System.out.print("Is human kind? (True/False): ");
    Adam.setKind(sc.nextBoolean());

    Adam.Greet();
    System.out.println("Adam's Ru is: " + Adam.getRu() + "\nAdam has " + Adam.getTeeth() + " teeth\nAdam is " + (Adam.isKind() ? "kind." : "evil."));

    e1.setRu("Zhagalbaily");
    e1.Greet();
    e1.setCoffeeDrunk(30.0f);
    e1.setTeeth(30);
    System.out.println(e1.getTeeth());
    System.out.println(e1.getCoffeeDrunk());
    e1.goToDentist(15);
    System.out.println(e1.getTeeth());

    s1.setRu("Tabyn");
    s1.setKind(false);
    s1.Greet();
    System.out.println(s1.getBestSubject());
    System.out.println(s1.getHoursOfSleep());
    s1.goToDentist(32);
}