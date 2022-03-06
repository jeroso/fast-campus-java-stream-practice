package chapter08.model;

public class User {

    private int id;
    private String name;
    private boolean  verified;
    private String emailAddress;




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setVerified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public User setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", verified=" + verified +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
