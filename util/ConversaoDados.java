package util;
/**
 * Classe responsavél por tratar a conversão entrata e saída de datas
 * @author (Roberta de Siqueira) 
 * @version (2.0)
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ConversaoDados
{
    public static Date converteStringData(String data) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   
        return sdf.parse(data);
    }
    
    public static String converteDataString(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
        
    } 
}
