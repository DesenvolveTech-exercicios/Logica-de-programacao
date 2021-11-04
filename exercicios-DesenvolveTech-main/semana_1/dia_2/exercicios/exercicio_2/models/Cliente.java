package semana_1.dia_2.exercicios.exercicio_2.models;
public class Cliente{
    private String name;
    private String cpf;
    private int age;
    private String gender;
    private boolean status = true;

    public Cliente(String name, String cpf, int age, String gender){
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}