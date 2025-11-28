public class Data {
        int dia;
        int mes;
        int ano;

        Data (){
                dia = 23;
                mes = 05;
                ano = 2006;
        }
        
        public Data(int dia, int mes, int ano) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
        }

        String dataFormatada(){
                return dia + "/" + mes + "/" + ano;
        }
        // String dataFormatada(){
        //         return String.format("%d/%d/%d", dia, mes, ano);
        // }
}
