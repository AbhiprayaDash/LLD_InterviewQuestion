package Library_Management_Service.Model;

public class User {
    private int id;
    private String name;
    private int noissuedbooks;
    public User(int id,String name,int noissuedbooks)
    {
        this.id = id;
        this.name=name;
        this.noissuedbooks=noissuedbooks;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public void setNoissuedbooks(int noissuedbooks) {
        this.noissuedbooks = noissuedbooks;
    }
    public int getNoissuedbooks() {
        return noissuedbooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noissuedbooks=" + noissuedbooks +
                '}';
    }
}
