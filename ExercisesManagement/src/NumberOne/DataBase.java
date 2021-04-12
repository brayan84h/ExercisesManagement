package NumberOne;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public String name_database;
    public List<User> Users;

    public DataBase(String name_database) {
        this.name_database = name_database;
        this.Users = new ArrayList<User>();
    }

    public void create_database(){
        System.out.println("Crear Base de Datos");
    }

    public void AddUser(){
        System.out.println("Agregar Usuarios:  lista de los Usuario del sistema");
    }

    public String getName_database() {
        return name_database;
    }

    public void setName_database(String name_database) {
        this.name_database = name_database;
    }
}
