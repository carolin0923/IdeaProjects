package livraria;

public class Buyer {
    private String name ;
    private String email;
    private String address;

    public Buyer (String name, String email, String address ){
        this.name= name;
        this.email= email;
        this.address=address;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }


}
