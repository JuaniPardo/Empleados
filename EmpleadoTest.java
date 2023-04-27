package empleados;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        //HAGO UN CICLO PARA CREAR "i" OBJETOS
        for (int i = 0; i < 3; i++) {
            empleados[i] = new Empleado();
        }
        //SETEO ID
        empleados[0].setId(918);
        empleados[1].setId(861);
        empleados[2].setId(737);

        //SETEO NOMBRES
        empleados[0].setNombre("Martina");
        empleados[1].setNombre("Catalina");
        empleados[2].setNombre("Amelia");

        //SETEO APELLIDOS
        empleados[0].setApellido("Ríos");
        empleados[1].setApellido("Medina");
        empleados[2].setApellido("González");

        //SETEO SALARIOS
        empleados[0].setSalario(483.33);
        empleados[1].setSalario(577.73);
        empleados[2].setSalario(457.43);

        //HAGO UN CICLO PARA MOSTRAR LOS DATOS
        for (int i = 0; i < 3; i++) {
            //System.out.println("EMPLEADO " + (i+1) + "\n" + "ID: " + empleados[i].getId()+ "\nNombre: " + empleados[i].getNombre() + "\nApellido: " + empleados[i].getApellido() + "\nSalario: " + empleados[i].getSalario() + "\n");
            System.out.println(empleados[i]);

        }




    }
}
