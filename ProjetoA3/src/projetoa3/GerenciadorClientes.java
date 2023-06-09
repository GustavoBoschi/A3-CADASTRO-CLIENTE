package projetoa3;

public class GerenciadorClientes {

    private Cliente[] clientes;
    private int tamanhoAtual;
    private int capacidade;

    public GerenciadorClientes(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.clientes = new Cliente[capacidadeInicial];
        this.tamanhoAtual = 1;
    }

    //Metodo para redimensionar a array
    private void redimensionarArray() {
        int novaCapacidade = capacidade * 2;
        Cliente[] novoArray = new Cliente[novaCapacidade];
        for (int i = 0; i < tamanhoAtual; i++) {
            novoArray[i] = clientes[i];
        }
        clientes = novoArray;
        capacidade = novaCapacidade;
    }

    //Metodo para inserir um cliente no array
    public void inserirCliente(Cliente cliente) {
        if (tamanhoAtual == capacidade) {
            redimensionarArray();
        }
        clientes[tamanhoAtual] = cliente;
        tamanhoAtual++;

    }

    //Metodo para buscar indice, id do funcionario
    private int buscarIndiceId(int id) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (this.clientes[i] != null && this.clientes[i].getId() == id) {
                return i;
            }

        }
        return -1; //caso n encontrar o id
    }

    //metodo para remover cliente
    public void removerCliente(int id) {
        int indice = buscarIndiceId(id);
        if (indice != -1) {
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            clientes[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        }
    }

    //metodo para atualizar atributos pelo id
    public void atualizarAtributo(int id, String novoAtributo, String valor) {
        int indice = buscarIndiceId(id);
        if (indice != -1) {
            Cliente cliente = clientes[indice];
            switch (novoAtributo.toLowerCase()) {
                case "nome":
                    cliente.setNome(valor);
                    break;
                case "sobrenome":
                    cliente.setSobrenome(valor);
                    break;
                case "cpf":
                    cliente.setCpf(valor);
                    break;
                case "data de nascimento":
                    cliente.setDatNasci(valor);
                    break;
                case "email":
                    cliente.setEmail(valor);
                    break;
                case "telefone":
                    cliente.setTelefone(valor);
                    break;
                case "cep":
                    cliente.setCep(valor);
                    break;
                default:
                    System.out.println("Atributo Inválido");
                    break;
            }
        }
    }

    //metodo para buscar informações do cliente por id
    public Cliente buscarCliente(int id) {
        int indice = buscarIndiceId(id);
        if (indice != -1) {
            Cliente clienteEncontrado = clientes[indice];

           // System.out.println("Nome:" + clientes[indice].getNome() + " " + clientes[indice].getSobrenome());
           // System.out.println("CPF:" + clientes[indice].getCpf());
           // System.out.println("Data de Nascimento:" + clientes[id].getDatNasci());
           // System.out.println("Email:" + clientes[indice].getEmail());
           // System.out.println("Telefone:" + clientes[indice].getTelefone());
           // System.out.println("CEP:" + clientes[indice].getCep());
           // System.out.print("Indice: ");
            return clienteEncontrado;
        }
        return null;
    }

}
