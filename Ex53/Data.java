package co.pedrobelle.curso.Ex53;

public class Data {
    private String name;
    private String email;
    private double wage;

    public Data(String name, String email, double wage) {
        this.name = name;
        this.email = email;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Dados: " + "Nome: '" + name + '\'' + ", email='" + email + '\'' + ", salário: " + wage;
    }
}
