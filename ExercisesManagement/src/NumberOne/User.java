package NumberOne;

import java.util.ArrayList;
import java.util.List;

public class User extends DataBase{

    public String name_user;
    public String password_user;
    public List<Client> clients;

    public User(String name_database, String name_user, String password_user) {
        super(name_database);
        this.name_user = name_user;
        this.password_user = password_user;
        this.clients = new ArrayList<Client>();
    }

    public void AddClient(){
        System.out.println("Agregar Clientes:  lista de clientes por usuario");
    }
}
