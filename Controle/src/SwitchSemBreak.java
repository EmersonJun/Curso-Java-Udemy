public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "marrom";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("sou foda dms");
            case "marrom":
                System.out.println("sou foda");
            case "branca":
                System.out.println("nao sou foda"); 
                break;    
            default:
                System.out.println("nao sei");
                
        }
        System.out.println("fim");

        String sabe = "falar";
        
        switch (sabe) {
            case "falar":
                System.out.println("sabe falar");
            case "correr":
                System.out.println("sabe correr");
            case "andar":
                System.out.println("sabe andar");
        }
    }
}
