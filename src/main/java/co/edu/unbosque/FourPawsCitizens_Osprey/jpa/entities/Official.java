package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;

/**
 * Creating  Official with constructors and Getters and Setters
 */
@Entity
@Table(name = "Official") // Optional
@NamedQueries({
        @NamedQuery(name = "Official.findByName",
                query = "SELECT a FROM Official a WHERE a.username = :username")
})
public class Official {

    @Id
    @GeneratedValue
    @Column(name = "offcial_id", unique = true)
    private Integer officialId;

    @OneToOne
    @JoinColumn(name = "username")
    private UserApp username;

    @Column(name = "name")
    private String name;

    /**
     * Creating an specific constructor
     *
     * @param officialId is the id of the official,officialId!=null, officialId!=" "
     * @param username   is the username of the user that was enter in the program. username != null, username !=" "
     * @param name       is the name of the user. name!=null, name!=" "
     */
    public Official(Integer officialId, UserApp username, String name) {
        this.officialId = officialId;
        this.username = username;
        this.name = name;
    }

    /**
     * Creating an specific constructor
     *
     * @param officialId is the id of the official,officialId!=null, officialId!=" "
     * @param name       is the name of the user. name!=null, name!=" "
     */
    public Official(Integer officialId, String name) {
        this.officialId = officialId;
        this.name = name;
    }

    /**
     * Creating an specific constructor
     *
     * @param name is the name of the user. name!=null, name!=" "
     */
    public Official(String name) {
        this.name = name;
    }

    /**
     * Creating default constructor
     */
    public Official() {

    }

    public UserApp getUsername() {
        return username;
    }

    public void setUsername(UserApp username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOfficialId() {
        return officialId;
    }

    public void setOfficialId(Integer officialId) {
        this.officialId = officialId;
    }
}
