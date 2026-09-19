public class Person {
    private String name;
    private String surname;
    private int  birthYear;
    private String gender;
    private String occupation;
    public Person(String name, String surname, int birthYear, String gender, String occupation){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
        this.occupation = occupation;
    }
    public int Age(){
        int currentYear = 2026;
        int age = currentYear-birthYear;
        return age;
    }
    public void changeJob(String newOccup){
        this.occupation = newOccup;
        System.out.println(name+" changed his/her occupation: "+newOccup);
    }
    public String toString(){
        return name+" "+surname+" ("+gender+")\nAge: "+Age()+"\nOccupation: "+occupation;
    }
}
