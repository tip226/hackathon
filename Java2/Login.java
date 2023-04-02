public class Login {
    //data members
    private String email;
    private String name;
    private String password;

    //default constructor
    //arguement constructor
    public Login(String email, String name, String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%-20s\t%-30s\t%-20s", name, email, password);
    }
}