package sep19th2024;

public class dog {

    int age;
    String name;

    /*
    public dog(String dogName, int dogAge){
        name = dogName;
        age =  dogAge;
    }
*/
    public void setName(String givenName){
        name = givenName;
    }

    public void displayname(){
        System.out.println("This dog's name is " + name);
    }





    public static void main(String[] args) {

        dog bellaDog = new dog();

        bellaDog.displayname();
        bellaDog.setName("bella");
        bellaDog.displayname();
        //System.out.println(bellaDog.name + " " + bellaDog.age);

    }

    }
