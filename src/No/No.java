package No;

public class No<T>{
    private T conteudo;
    // a referencia do proximo nó é do tipo anterior
    private No<T> proximoNo;

    public No(T conteudo) {
        // a referencia do ultimo nó é sempre null
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    // estrutura base
    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
