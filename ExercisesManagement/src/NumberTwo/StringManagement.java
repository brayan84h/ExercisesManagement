package NumberTwo;

import java.util.ArrayList;
import java.util.List;

public class StringManagement {

    private String trama;
    private List<Rule> rules_list;
    private final int LONG_MAX_TRAMA = 50;
    private final int LONG_MIN_TRAMA = 30;

    public StringManagement(String trama) {
        this.setTrama(trama);
        this.rules_list = new ArrayList<Rule>();
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        int long_string = trama.length();
        if (trama.length() >= LONG_MIN_TRAMA && trama.length() <= LONG_MAX_TRAMA) {
            this.trama = trama;
        }else{
            System.out.println("ERROR: " +
                    "El Tamaño de la trama no es el definido[30-50] en el sistema , no se asignara.");
        }
    }

    public void AddRules(Rule rule){
        this.rules_list.add(rule);
    }

    public void ShowListRules(){
        System.out.println();
        System.out.println("MOSTRANDO LISTA DE LA RULES QUE CONTIENE LA TRAMA: "+this.trama);
        for (Rule r: this.rules_list) {
            System.out.println(r.toString());
        }
    }

    public void Get_value(Rule rule){
        System.out.println("\nBUSQUEDA DE REGLA EN LA LISTA DE LA TRAMA: "+this.trama);
        boolean found = false;
        for (Rule r : this.rules_list) {
            if (r.getName().equals(rule.getName())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("La regla encontrada es: ");
            System.out.println(rule.toString());
        }else{
            System.out.println("No se ha encontrado la regla buscada");
        }
    }


    @Override
    public String toString() {
        return "\tTrama: " + trama;
    }
}
