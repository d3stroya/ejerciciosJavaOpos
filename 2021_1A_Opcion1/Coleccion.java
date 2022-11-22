import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Coleccion implements InterfazColeccion {
    List<Trabajadores> lTrabajadores = new ArrayList<>();
    List<TrabajadoresAsalariados> lAsalariados = new ArrayList<>();

    // 3. añadir trabajadores a esta colección

    /**
     * Añade a la colección el trabajador pasado por parámetro
     * @param trabajador
     */
    public void agregar(Trabajadores trabajador) {
        lTrabajadores.add(trabajador);
        if(trabajador.getTipo() == "asalariado") {
            lAsalariados.add((TrabajadoresAsalariados) trabajador);
        }
    }

    /**
     * Itera sobre la lista de todos los trabajadores
     * @return Devuelve la lista completa de trabajadores
     */
    public List devolverTodos() {
        for(Trabajadores trabajador : lTrabajadores) {
            System.out.println(trabajador.toString());
        }
        return lTrabajadores;
    }

    // 4. obtener una lista de los trabajadores de un tipo que se pasará como parámetro.
    // helped by https://www.geeksforgeeks.org/stream-in-java/

    /**
     *
     * @param tipo
     * @return devuelve una lista filtrada de trabajadores según el tipo pasado por parámetro
     */
    public List<Trabajadores> devolverPorTipo(String tipo) {
        List<Trabajadores> trabajadoresFiltrados = new ArrayList<>();

        if(tipo.equalsIgnoreCase("asalariado")) {
            trabajadoresFiltrados = lTrabajadores.stream().filter(a -> a.getTipo() == "asalariado").collect(Collectors.toList());
        }
        if(tipo.equalsIgnoreCase("voluntario")) {
            List<Trabajadores> lVoluntarios = new ArrayList<>();
            trabajadoresFiltrados = lTrabajadores.stream().filter(v -> v.getTipo() == "voluntario").collect(Collectors.toList());
        }
        return trabajadoresFiltrados;
    }


    // 5. obtener una lista de los trabajadores (asalariados) con un salario superior a una cantidad pasada.

    /**
     * Devuelve los trabajadores que cobran más del salario pasado por parámetro
     * @param salarioMinimo
     * @return la lista de trabajadores filtrada por el salario indicado en parámetro
     */
    public List<Trabajadores> devolverPorSalario(double salarioMinimo) {
        return lAsalariados.stream().filter(s -> s.getSalario() > salarioMinimo).collect(Collectors.toList());
    }

    // 6. obtener el valor medio de los salarios de los trabajadores (asalariados).

    /**
     * Calcula el salario medio de los trabajadores
     * @return un número decimal (double) con la media del salario
     */
    public double devolverSalarioMedio() {
        double sumaSalarios = 0;

        for(TrabajadoresAsalariados asalariado : lAsalariados) {
            sumaSalarios += asalariado.getSalario();
        }

        return sumaSalarios / lAsalariados.size();
    }

    // 7. volcar en un archivo de texto los datos de los trabajadores de un tipo que será pasado como parámetro.

    /**
     * Crea un archivo .txt con la lista de trabajadores filtrados por tipo (pasado por parámetro)
     * @param tipo
     */
    public void volcar(String tipo) {
        List<Trabajadores> aTipoTrabajadores = devolverPorTipo(tipo);

        try {
            PrintStream archivo = new PrintStream("/archivo_trabajadores_" + tipo.toLowerCase() + ".csv");
            archivo.println("id;Nombre;Apellidos;Teléfono;Tipo;Salario/Turno;Puesto/Descripción;");
            for(Trabajadores trabajador : aTipoTrabajadores) {
                archivo.println(trabajador);
            }

        } catch(FileNotFoundException e) {
            System.out.println("Ha habido un error: " + e);
        }

    }
}
