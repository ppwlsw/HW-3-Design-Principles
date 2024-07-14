// 6510450658 Pinpawat Limsuwat
public class User implements Verification{
    private Email email;
    private String name;
    private int age;



    public User(String username, Email email, int age) {
        this.name = username;
        this.email = email;
        this.age = age;
    }


    public Email getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean Verify() {
        System.out.println("Name : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("Age : " + getAge());

        if (getName() == null || getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        if (getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }

        if(getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }

        return true;
    }
}
