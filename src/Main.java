void main() {
    Student student1 = new Student("Math", 6.5f, 32, "Tabyn", true);
    Human sAsHuman = new Student("OOP", 1.0f);
    IWalk sAsWalk = new Student("Physics", 26.5f);

    Employee employee1 = new Employee("Backend", 2.2f, 32, "Zhagalbaily", true);
    Human eAsHuman = new Employee("Frontend", 0.5f, 30, "Naiman", false);
    IWalk eAsWalk = new Employee("QA", 0.0f, 32, "Kerey", true);
    IWork eAsWork = new Employee("DevOps", 255.0f, 32, "Tama", true);

    student1.greet();
    student1.goToDentist(32);
    student1.sleep();
    System.out.println("\n");

    employee1.greet();
    employee1.goToDentist(17);
    employee1.sleep();
    System.out.println("\n");

    student1.step();
    student1.jump();
    student1.study();
    student1.setBestSubject("Samopoznanie");
    System.out.println(student1.getBestSubject());
    student1.setHoursOfSleep(8.0f);
    System.out.println(student1.getHoursOfSleep());
    System.out.println("\n");

    System.out.println(Student.getStudentsCount());
    System.out.println("\n");

    employee1.step();
    employee1.jump();
    employee1.clickMouse();
    employee1.clickKey();
    System.out.println("\n");

    employee1.setSpecialization("Senior developer");
    System.out.println(employee1.getSpecialization());
    employee1.setCoffeeDrunk(3.5f);
    System.out.println(employee1.getCoffeeDrunk());
    System.out.println("\n");

    sAsWalk.step();
    sAsWalk.jump();
    System.out.println("\n");

    eAsWalk.step();
    eAsWalk.jump();
    System.out.println("\n");

    eAsWork.clickMouse();
    eAsWork.clickKey();
}