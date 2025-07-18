import java.time.LocalDate;

public class ControllerData {
    public static int[] Data(){
        LocalDate data = LocalDate.now();
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        return new int[]{dia, mes, ano}; //Confesso que vi com o gpt como faria pra retornar dia, mes, ano, mas entendi que é uma lista de inteiros
    }



}
