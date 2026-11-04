
public class pessoa
{
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    
    pessoa(String n, int i, String t, String e){
        nome = n;
        idade = i;
        telefone = t;
        email = e;
    }
    
    public pessoa(){
        nome = "";
        idade = 0;
        email = "..@..";
        telefone = "(xx)xxxx-xxxx";
    }
    
    public String getNome(){return nome;}
    public void setNome(String n){nome = n;}
    public int getIdade(){return idade;}
    public void setIdade(int i){idade = i;}
    public String getTelefone(){return telefone;}
    public void setTelefone(String t){telefone = t;}
    public String getEmail(){return email;}
    public void setEmail(String e){email = e;}
    
    @Override
    public String toString(){
        return nome + "tem" + idade + "anos, email" + email + "telefone" + telefone;
    }
}
