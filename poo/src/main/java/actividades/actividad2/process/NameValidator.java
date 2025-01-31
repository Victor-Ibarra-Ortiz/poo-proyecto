package actividades.actividad2.process;

import static actividades.actividad2.data.Data.nombres;;
/*
 * NameValidator valida los nombres de Data
 */
public class NameValidator {
    public static boolean validateName(String name){
        boolean valid = false;
        int index = 0;
        while(!valid && index<nombres.length){
            if(nombres[index].equalsIgnoreCase(name)){
                valid = true;
        }
        index++;
}
return valid;
}
}
