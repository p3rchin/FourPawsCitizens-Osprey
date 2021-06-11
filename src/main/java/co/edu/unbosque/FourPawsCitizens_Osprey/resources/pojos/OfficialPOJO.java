package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Official
 */
public class OfficialPOJO {

    private String username;
    private String password;
    private String email;
    private String name;

    /**
     * Creating the pojo constructor of Official
     */
    public OfficialPOJO() {
    }

    /**
     * Creating the pojo constructor of Official
     *
     * @param username is the username of the official, username!=null, username!=" ".
     * @param password is the key word to access, password!=null, password!=" ".
     * @param email    is the digital address of a person, email!=null, email!=" ".
     * @param name     is the name of the official, name!=null, name!=" ".
     */
    public OfficialPOJO(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
