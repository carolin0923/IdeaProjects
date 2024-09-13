public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int  rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2 ){
        if(lutador1.getCategoria() = lutador2.getCategoria()){
            and (lutador1 <> lutador2);
            this.aprovada=true;
            this.desafiado=lutador1;
            this.desafiante=lutador2;
        } else {
            this.aprovada=falso;
            this.desafiado=nulo;
            this.desafiante=nulo;
        }
    }

    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            this.vencedor = aleatório[3]

        } else{
            System.out.println("Luta não pode acontecer");
        }

    }
}
