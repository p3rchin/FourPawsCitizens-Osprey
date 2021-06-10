package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;

/**
 * Creating UserApp with constructor and Getters and Setters
 */

@Entity
@Table(name = "UserApp") // Optional
@NamedQueries({
        @NamedQuery(name = "UserApp.findByName",
                query = "SELECT a FROM UserApp a WHERE a.username = :username")
})
public class UserApp {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    @OneToOne(mappedBy = "username", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Official official;

    @OneToOne(mappedBy = "username", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Owner owner;

    @OneToOne(mappedBy = "username", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Vet vet;


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

    public Official getOfficial() {
        return official;
    }

    public void setOfficial(Official official) {
        this.official = official;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
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
    public void addOfficial(Official official) {
        this.official.setOfficialId(official.getOfficialId());
        this.official.setName(official.getName());
        official.setUsername(this);

    }
    public void addOwner(Owner owner) {
        this.owner.setOwnerId(owner.getOwnerId());
        this.owner.setName(owner.getName());
        this.owner.setPersonId(owner.getPersonId());
        this.owner.setAddress(owner.getAddress());
        this.owner.setNeighborhood(owner.getNeighborhood());
        owner.setUsername(this);

    }
    public void addVet(Vet vet) {
        this.vet.setVetId(vet.getVetId());
        this.vet.setName(vet.getName());
        this.vet.setAddress(vet.getAddress());
        this.vet.setNeighborhood(vet.getNeighborhood());
        vet.setUsername(this);

    }
}
