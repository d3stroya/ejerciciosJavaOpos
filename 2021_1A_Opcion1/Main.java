public class Main {
    public static void main(String[] args) {
        Trabajadores t1 = new TrabajadoresAsalariados(1, "Doyle", "Franky", "695487621", 3254.21, "abogada");
        Trabajadores t2 = new TrabajadoresVoluntarios(2, "Westfall", "Bridget", "689784512", "Mañana", "descripción");
        Trabajadores t3 = new TrabajadoresAsalariados(3, "Doyle", "Tess", "64686841", 2254.21, "abogada");

        Coleccion coleccion = new Coleccion();
        coleccion.agregar(t1);
        coleccion.agregar(t2);
        coleccion.agregar(t3);


        coleccion.devolverTodos();
        System.out.println("Trabajadores por tipo: " + coleccion.devolverPorTipo("voluntario"));
        System.out.println("Trabajadores por tipo: " + coleccion.devolverPorTipo("asalariado"));

        System.out.println("Trabajadores que cobran más de 2000€" + coleccion.devolverPorSalario(2000));
        System.out.println("Salario medio: " + coleccion.devolverSalarioMedio());

        coleccion.volcar("asalariado");
        coleccion.volcar("Voluntario");

    }
}
