package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Owner
 */
public class OwnerPOJO {

    private String username;
    private String password;
    private String email;
    private Integer personId;
    private String name;
    private String address;
    private String neighborhood;

    /**
     * Creating the pojo constructor of Owner
     */
    public OwnerPOJO() {
    }



    /**
     *
     * @param username     is the username of the owner, username!=null, username!=" ".
     * @param password     is the key word to access, password!=null, password!=" ".
     * @param email        is the digital address of a person, email!=null, email!=" ".
     * @param personId     is the id of the person, personId!=null, personId!=" ".
     * @param name         is the name of the owner, name!=null, name!=" ".
     * @param address      is the address of the owner , address!=null, address!=" ".
     * @param neighborhood is the neighborhood of the owner,  neighborhood!=null, neighborhood!=" ".
     */
    public OwnerPOJO(String username, String password, String email, Integer personId, String name, String address, String neighborhood) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
