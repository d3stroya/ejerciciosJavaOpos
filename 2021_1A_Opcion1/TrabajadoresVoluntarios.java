public class TrabajadoresVoluntarios extends Trabajadores {
    // ATRIBUTOS
    private String turno;
    private String descripcion;
    String tipo = "voluntario";

    // CONSTRUCTOR
    public TrabajadoresVoluntarios(int id, String apellidos, String nombre, String tfn, String turno, String descripcion) {
        super(id, apellidos, nombre, tfn);
        this.turno = turno;
        this.descripcion = descripcion;
    }

    // GETTER Y SETTER
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // TO STRING
    @Override
    public String toString() {
        return  id + ";" +
                getNombre() + ";" +
                getApellidos() + ";" +
                getTfn() + ";" +
                tipo + ";" +
                turno + ";" +
                descripcion + ";";


    }
}
