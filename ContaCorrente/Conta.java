public class Conta{
    int numero;
    double saldo;
    int dv;
    
    public Conta(int numero, double saldo){
        if(numero>0 && numero <=999)
            this.numero= numero;
        
        if(saldo>=0)
            this.saldo = saldo;        
    }
    
    public int getNumero(){return numero;
    }
    
    public double getSaldo() { return saldo;
    }
    
    public void sacar(double valor){
        //if(valor<=saldo)
            saldo = saldo - valor;        
    }
    
    public void depositar(double valor){
      //  if(valor>=0)
            saldo = saldo + valor;
    }
    
    public void transferir(Conta destino, double valor){
        if(valor>0 && saldo>=valor){
            sacar(valor);
            destino.depositar(valor);
        }
    }
    
    /* (a) Some o número da conta com o valor que corresponde ao número da
conta na ordem inversa. (Ex: para numero = 235, o valor inverso é
532. Faça 235 + 532 = 767)
    (b) Multiplique cada dígito do valor encontrado em (a) pela sua ordem
posicional e some os valores encontrados. (Ex:7x1 + 6x2 + 7x3 = 40)
    (c) O último dígito do valor encontrado em (b) é o dígito verificador
    (Ex:40 → 0).
    }*/
    
    
    public void geraDV(){
        int centena,dezena, unidade, invertido,soma, multiplica;
        String digito;
        char d;
        centena = numero/100;
        dezena = numero%100/10;
        unidade = numero%100%10;
        invertido = unidade*100+dezena*10+centena;
        soma = numero + invertido;
        centena = soma/100;
        dezena = soma%100/10;
        unidade = soma%100%10;
        multiplica = centena*1 + dezena *2 + unidade * 3;
        digito = Integer.toString(multiplica);
        d = digito.charAt(digito.length()-1);
        dv = Integer.parseInt(d+"");
    }

    public int getDv(){ return dv;
    }
    
    @Override
    public String toString(){
        return "Numero: "+ numero + "-" + dv + "\nSaldo: " + saldo;
    }
    
}
