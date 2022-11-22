public abstract class Trabajadores {
    // ATRIBUTOS
    int id;
    private String apellidos;
    private String nombre;
    private String tfn;
    private String tipo;

    // CONSTRUCTOR
    public Trabajadores(int id, String apellidos, String nombre, String tfn) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.tfn = tfn;
    }

    // GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTfn() {
        return tfn;
    }

    public void setTfn(String tfn) {
        this.tfn = tfn;
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
        return "Trabajadores{" +
                "id=" + id +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tfn='" + tfn + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
