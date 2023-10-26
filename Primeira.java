public class Primeira {
    int idade;
    String nome = "Gary Payton";;
    int ano = 2022;
  

    public void ImprimirIdade(int idade) {
    	for(int x=1; x<5;x++){
    	this.ano = ano+x;	
        this.idade = idade+x;
        System.out.println("A idade de " + nome + " em " + ano +" é " + this.idade);
    }
    }
}
