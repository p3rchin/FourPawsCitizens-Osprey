package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;

/**
 * Creating  Official with constructors and Getters and Setters
 */
@Entity
@Table(name = "Official")
@PrimaryKeyJoinColumn
public class Official extends UserApp {

    @Column(name = "name")
    private String name;


    /**
     * Creating an specific constructor
     * @param username     is the name that was created by the program . username!= null, username!= " "
     * @param password     is the key that has the user that open the program. password != null, username!=" "
     * @param email        is the @ that has the user. email != null, email != " "
     * @param name is the name of the user. name!=null, name!=" "
     */
    public Official(String username, String password, String email,String name) {
        super(username, password, email, "official");
        this.name = name;
    }

    /**
     * Creating default constructor
     */
    public Official() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
