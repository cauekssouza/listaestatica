public class Lista_Estatica <E> {
    // Atributos
    private E[] dados;
    private int tamanho;

    // Construtor
    public Lista_Estatica(int capacidade) {
        dados = (E[]) new Object[capacidade];
        tamanho = 0;
    }

    // Método para limpar a lista
    public void clear() {
        this.tamanho = 0;
    }

    // Método para adicionar um elemento no final da lista
    public void adicionar(E dados) {
        if (this.tamanho < this.dados.length) {
            this.dados[tamanho] = dados;
            tamanho++;
        } else {
            throw new IllegalStateException("A lista está cheia");
        }
    }

    // Método para adicionar um elemento em uma posição específica
    public void adicionar(E dados, int pos) {
        if (!isFull() && pos >= 0 && pos <= tamanho) {
            for (int i = tamanho; i > pos; i--) {
                this.dados[i] = this.dados[i - 1];
            }
            this.dados[pos] = dados;
            tamanho++;
        } else {
            throw new IndexOutOfBoundsException("Posição Inválida ou Lista Cheia");
        }
    }

    // Método para remover um elemento de uma posição específica
    public void remover(int pos) {
        if (pos >= 0 && pos < tamanho) {
            for (int i = pos; i < tamanho - 1; i++) {
                this.dados[i] = this.dados[i + 1];
            }
            this.dados[tamanho - 1] = null;  // Limpa o último elemento após a remoção
            tamanho--;
        } else {
            throw new IndexOutOfBoundsException("Posição Inválida, tente novamente");
        }
    }

    // Método para verificar se a lista está vazia
    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    // Método para verificar se a lista está cheia
    public boolean isFull() {
        return this.tamanho == this.dados.length;
    }

    // Método para alterar o valor em uma posição específica
    public void setDado(E dados, int pos) {
        if (pos >= 0 && pos < tamanho) {
            this.dados[pos] = dados;
        } else {
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
    }

    // Método para obter o valor em uma posição específica
    public E getDado(int pos) {
        if (pos >= 0 && pos < tamanho) {
            return this.dados[pos];
        } else {
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
    }

    // Método para obter o tamanho atual da lista
    public int getTamanho() {
        return this.tamanho;
    }

    // Método para encontrar a posição de um dado na lista (retorna -1 se não encontrar)
    public int find(E dados) {
        for (int i = 0; i < tamanho; i++) {
            if (this.dados[i] == dados) { 
                return i;
            }
        }
        return -1;
    }
}
