package Modelo;
public class Empregado{

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String alergias;
    private String problemasMedicos;

    public Empregado(int id, String nome, String email, String telefone, String alergias, String problemasMedicos){
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser um número positivo.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
    }

        public int getId(){
            return id;
        }

        public String getNome(){
            return nome;
        }

        public void setNome (String nome)
        {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail (String email)
        {
            this.email = email;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone (String telfone)
        {
            this.telefone = telfone;
        }

        public String getAlergias() {
            return alergias;
        }

        public void setAlergias (String alergias)
        {
            this.alergias =  alergias;
        }

        public String getProblemasMedicos(){
            return problemasMedicos;
        }

        public void setProblemasMedicos (String problemasMedicos)
        {
            this.problemasMedicos = problemasMedicos;
        }

        public void setId(int id) {
            this.id = id;
        }
        public String toString() {
            return "Empregado{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", email='" + email + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", alergias='" + alergias + '\'' +
                    ", problemasMedicos='" + problemasMedicos + '\'' +
                    '}';
                
        }
}
