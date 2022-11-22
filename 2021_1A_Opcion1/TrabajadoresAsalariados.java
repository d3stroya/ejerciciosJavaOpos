public class TrabajadoresAsalariados extends Trabajadores {
    // ATRIBUTOS
    private double salario;
    private String puesto;
    String tipo = "asalariado";

    // CONSTRUCTOR
    public TrabajadoresAsalariados(int id, String apellidos, String nombre, String tfn, double salario, String puesto) {
        super(id, apellidos, nombre, tfn);
        this.salario = salario;
        this.puesto = puesto;
    }

    // GETTER Y SETTER
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // TO STRING
    @Override
    public String toString() {
        return  id + ";" +
                getNombre() + ";" +
                getApellidos() + ";" +
                getTfn() + ";" +
                tipo + ";" +
                salario +";" +
                puesto + ";";
    }
}
