public class Contact {

    private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;

    public Contact() {
    }

    public Contact(String personName, String personId, int age, String mobileNumber, char gender) {
        this.personName = personName;
        this.personId = personId;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    void ShowPersonInfo(){
        System.out.println("Name: " + this.getPersonName() +
                "\nID: " + this.getPersonId() +
                "\nAGE: " + this.getAge() +
                "\nMobile Number: " + this.getMobileNumber() +
                "\nGender: " + this.getGender());
    }

    void DetectMobileOperator(){

        if (getMobileNumber().toLowerCase().contains("016")){
            System.out.println("Operator: Airtel" +"\n................");
        }
        if (getMobileNumber().toLowerCase().contains("017")){
            System.out.println("Operator: GP"+"\n................");
        }
        if (getMobileNumber().toLowerCase().contains("018")){
            System.out.println("Operator: ROBI"+"\n................");
        }


    }



    ///////////////class end/////////////////
}
