package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of UserApp
 */
public class UserAppPOJO {

    private String username;
    private String password;
    private String email;
    private String role;

    /**
     * Creating the pojo constructor of UserApp
     */
    public UserAppPOJO() {
    }

    /**
     * Creating the pojo constructor of UserApp
     * @param username is the username that identifies, username!=null, username!=" ".
     * @param password is the key word to get access, password!=null, password!=" ".
     * @param email is the identification on the web, email!=null, email!=" ".
     * @param role is the occupation of the person, role!=null, role!=" ".
     */
    public UserAppPOJO(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
