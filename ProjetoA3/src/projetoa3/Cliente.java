package projetoa3;

public class Cliente {

    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String datNasci;
    private String telefone;
    private String email;
    private String cep;
    private static int proximoId = 1;

    public Cliente() {

    }

    public Cliente(String nome, String sobrenome, String cpf, String datNasci, String email, String telefone, String cep) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.datNasci = datNasci;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        setId(proximoId);
        proximoId++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatNasci() {
        return datNasci;
    }

    public void setDatNasci(String datNasci) {
        this.datNasci = datNasci;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Cliente.proximoId = proximoId;
    }

}
