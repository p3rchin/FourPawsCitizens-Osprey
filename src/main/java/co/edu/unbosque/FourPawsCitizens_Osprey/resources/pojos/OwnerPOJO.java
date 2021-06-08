package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Owner
 */
public class OwnerPOJO {

    private Integer ownerId;
    private String username;
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
     * Creating the pojo constructor of Owner
     * @param ownerId is the id of the owner, ownerId!=null, ownerId!=" ".
     * @param username is the username of the owner, username!=null, username!=" ".
     * @param personId is the id of the person, personId!=null, personId!=" ".
     * @param name is the name of the owner, name!=null, name!=" ".
     * @param address is the address of the owner , address!=null, address!=" ".
     * @param neighborhood is the neighborhood of the owner,  neighborhood!=null, neighborhood!=" ".
     */
    public OwnerPOJO(Integer ownerId, String username, Integer personId, String name, String address, String neighborhood) {
        this.ownerId = ownerId;
        this.username = username;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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
