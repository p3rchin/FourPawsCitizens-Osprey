package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;

/**
 * Creating UserApp with constructor and Getters and Setters
 */

@Entity
@Table(name = "UserApp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UserApp {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;


    /**
     * Creating default constructor
     */
    public UserApp() {
    }

    /**
     * Creating an specific constructor
     * @param username is the name that was created by the program . username!= null, username!= " "
     * @param password is the key that has the user that open the program. password != null, username!=" "
     * @param email is the @ that has the user. email != null, email != " "
     * @param role is the role that has de user . role != null, role != " "
     */

    public UserApp(String username, String password, String email, String role) {
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


    /**
     * Creating an usserAp
     * @return the usser Ap
     */
    @Override
    public String toString() {
        return "UserApp{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

}
