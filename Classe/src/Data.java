public class Data {
        int dia;
        int mes;
        int ano;

        Data (){
                // dia = 23;
                // mes = 05;
                // ano = 2006;
                this(23, 05, 2006);
                //byte short int long = 0
                //float =0.0
                //bloolena = false
                //objetos = null        
                //char = '/u0000'
        }
        
        public Data(int dia, int mes, int ano) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
        }

        String obterDataFormatada(){
                final String formato = "%d/%d/%d";
                return String.format(formato, this.dia, mes, ano);
        }

        void imprimirDataFormatada(){
                System.out.println(this.obterDataFormatada());
        }
        // String dataFormatada(){
        //         return String.format("%d/%d/%d", dia, mes, ano);
        // }
}
