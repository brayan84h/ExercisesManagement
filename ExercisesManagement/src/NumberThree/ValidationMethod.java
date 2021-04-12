package NumberThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationMethod {

    private String card_number;

    public ValidationMethod(String card_number) {
        this.setCard_number(card_number);
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
        int n = card_number.length();
        if (n == 16) {
            if (Validation_Card_Number(card_number)) {
                System.out.println("El numero de Targeta: "+card_number+" esta enmascarada. ");
            }else{
                System.out.println("El numero de Targeta: "+card_number+" no esta enmascarada. ");
            }
        }else {
            System.out.println("WARNING: El Numero de targeta "+card_number+" ingresado  no cumple con el numero establecido de caracteres.");
        }

    }

    public boolean Validation_Card_Number(String card_number){
        Pattern pattern = Pattern.compile("([0-9]{6})+([*]{6})+([0-9]{4})");
        Matcher matcher = pattern.matcher(card_number);
        return matcher.find();
    }
}
