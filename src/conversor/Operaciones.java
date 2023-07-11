package conversor;


public class Operaciones {
      //capturar datos de textfield se puede por numeros o textos
     private double  valor, resultado;
     private  int divisa;
     private  int divisa2;
     
       public Operaciones() {
           
          
    }
       
     
       //Getter Setter

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

  
     
     

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }
    
    public double convertir(){
        if(divisa==0&& divisa2==1){ // Dolar a Euro
            resultado= valor*0.91;
        }else if(divisa==0&& divisa2==0){
        resultado= valor;
        
        }else if(divisa==0&& divisa2==2){
            resultado= valor*0.78;
        }else if(divisa==0&& divisa2==3){
             resultado= valor*142.10;
        }else if(divisa==0&& divisa2==4){
             resultado= valor*1304.74;
        }else if(divisa==0&& divisa2==5){
             resultado= valor*492;
        }else if(divisa==1 && divisa2==0){
             resultado= valor*1.10;
        }else if(divisa==1 && divisa2==1){
             resultado= valor;
        }else if(divisa==1&& divisa2==2){
             resultado= valor*0.86;
        }else if(divisa==1&& divisa2==3){
             resultado= valor*175.71;
        }else if(divisa==1&& divisa2==4){
             resultado= valor*1429.5;
        }else if(divisa==1&& divisa2==5){
             resultado= valor*520;
        }else if(divisa==2&& divisa2==0){
             resultado= valor*1.28;
        }else if(divisa==2&& divisa2==1){
             resultado= valor*1.17;
        }else if(divisa==2&& divisa2==2){
             resultado= valor;
        }else if(divisa==2&& divisa2==3){
             resultado= valor*181.67;
        }else if(divisa==2&& divisa2==4){
             resultado= valor*1667.16;
        }else if(divisa==2&& divisa2==5){
             resultado= valor*613;
        }else if(divisa==3&& divisa2==0){
             resultado= valor*0.007;
        }else if(divisa==3&& divisa2==1){
             resultado= valor*0.0064;
        }else if(divisa==3&& divisa2==2){
             resultado= valor*0.0055;
        }else if(divisa==3&& divisa2==3){
             resultado= valor;
        }else if(divisa==3&& divisa2==4){
             resultado= valor*9.18;
        }else if(divisa==3&& divisa2==5){
             resultado= valor*1.84;
        }else if(divisa==4&& divisa2==0){
             resultado= valor*0.00077;
        }else if(divisa==4&& divisa2==1){
             resultado= valor*0.0007;
        }else if(divisa==4&& divisa2==2){
             resultado= valor / 1666.54;
        }else if(divisa==4&& divisa2==2){
             resultado= valor / 1666.54;
        }else if(divisa==4&& divisa2==3){
             resultado= valor *0.11;
        }else if(divisa==4&& divisa2==4){
             resultado= valor ;
        }else if(divisa==4&& divisa2==5){
             resultado= valor * 0.2;
        }else if(divisa==5&& divisa2==0){
             resultado= valor / 492;
        }else if(divisa==5&& divisa2==1){
             resultado= valor / 520;
        }else if(divisa==5&& divisa2==2){
             resultado= valor / 613;
        }else if(divisa==5&& divisa2==3){
             resultado= valor * 0.55;
        }else if(divisa==5&& divisa2==4){
             resultado= valor * 5.01;
        }else if(divisa==5&& divisa2==5){
             resultado= valor ;
        }
        
        
        
        
        return resultado;
    }
       
}
