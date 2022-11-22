import java.util.List;
// 7. crear algún mecanismo que obligue a que los métodos citados sean desarrollados.
public interface InterfazColeccion {
    void agregar(Trabajadores trabajador);
    List devolverTodos();
    List<Trabajadores> devolverPorTipo(String tipo);
    List<Trabajadores> devolverPorSalario(double salarioMinimo);
    double devolverSalarioMedio();
    void volcar(String tipo);
}
