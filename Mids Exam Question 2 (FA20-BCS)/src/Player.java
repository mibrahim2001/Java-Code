public abstract class Player {

    //initializing the variables for player class
    private String name;
    private String address;
    private long telephone;
    private String status;

    //constructor for player

    public Player(String name, String address, long telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.status = status;
    }

    //getter setter for player variables

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

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    //abstract method playerAverage

    public abstract double playerAverage();

    //toString method

    public String toString(){
        return String.format("%n Name: %s%n Contact Address: %s%n Telephone Number: %s%n Status: %s",name,address,telephone,status);
    }

}
