public class TestaPessoa {
    public static void main(String[] args){
        // criando objeto
        Pessoa p1 = new Pessoa();
        p1.nome = "Elaine";
        p1.idade = 25;
        p1.contador = 1;
        System.out.println("Contador: " + p1.contador);
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Jo�o";
        p2.idade = 30;
        p2.contador = p2.contador+1;
        System.out.println("Contador p1: " + p1.contador);
        System.out.println("Contador p2: " + p2.contador);
        
        // imprimindo variaveis
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        
        // chamando metodo incrementa idade
        p1.incIdade();

        // imprimindo ap�s o metodo
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p2.nome);
        System.out.println(p2.idade);
    }
}
