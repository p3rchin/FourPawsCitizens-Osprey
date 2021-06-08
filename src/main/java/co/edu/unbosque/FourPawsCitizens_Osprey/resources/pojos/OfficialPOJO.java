package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Official
 */
public class OfficialPOJO {

    private Integer officialId;
    private String username;
    private String name;

    /**
     * Creating the pojo constructor of Official
     */
    public OfficialPOJO() {
    }

    /**
     * Creating the pojo constructor of Official
     * @param officialId is the id of the official, officialId!=null, officialId!=" ".
     * @param username is the username of the official, username!=null, username!=" ".
     * @param name is the name of the official, name!=null, name!=" ".
     */
    public OfficialPOJO(Integer officialId, String username, String name) {
        this.officialId = officialId;
        this.username = username;
        this.name = name;
    }

    public Integer getOfficialId() {
        return officialId;
    }

    public void setOfficialId(Integer officialId) {
        this.officialId = officialId;
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
}
