public class User {
    private int id;
    private String name;
    private String city;
    private static int userID = 0;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User( String name,String city) {
        userID++;
        this.id = userID;
        this.name = name;
        this.city = city;
    }

    public User(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.city = user.getCity();
    }
    public User() {
        this.id = 0;
        this.name = "abc";
        this.city="abcd";
    }

    public String toString(){
        return String.format("%n User ID: %d%n User Name: %s%n User City: %s%n",getId(),getName(),getCity());
    }


}
