package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Vet
 */
public class VetPOJO {


    private String username;
    private String password;
    private String email;
    private String name;
    private String address;
    private String neighborhood;

    /**
     * Creating the pojo constructor of Vet
     */
    public VetPOJO() {
    }

    /**
     * @param username     is the username of the owner, username!=null, username!=" ".
     * @param password     is the key word to access, password!=null, password!=" ".
     * @param email        is the digital address of a person, email!=null, email!=" ".
     * @param name         is the name of the vet, name!=null, name!=" ".
     * @param address      is the address of the vet, address!=null, address!=" ".
     * @param neighborhood is the neighborhood of the vet, neighborhood!=null, neighborhood!=" ".
     */
    public VetPOJO(String username, String password, String email, String name, String address, String neighborhood) {
        this.username = username;
        this.password = password;
        this.email = email;
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
