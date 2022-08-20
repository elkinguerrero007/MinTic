import java.util.HashMap;
import java.util.Scanner;

class Reto3 {

    private final Scanner scanner = new Scanner(System.in); 

    public String read() {
        return this.scanner.nextLine();
    }

    public void run() {

        BaseDatosProductos ListaProductos = new BaseDatosProductos();
        String operacion = read();
        String[] entrada = read().split(" ");
        Productos productos = new Productos(Integer.parseInt(entrada[0]), entrada[1], Double.parseDouble(entrada[2]),
                Integer.parseInt(entrada[3]));
        boolean salida = false;

        if (operacion.equals("AGREGAR")) {
            salida = ListaProductos.agregar(productos.getCodigo(), productos);
        } else if (operacion.equals("ACTUALIZAR")) {
            salida = ListaProductos.actualizar(productos.getCodigo(), productos);
        } else if (operacion.equals("BORRAR")) {
            salida = ListaProductos.eliminar(productos.getCodigo(), productos);
        }
        if (salida) {
            ListaProductos.generarInforme();

        } else {
            System.out.println("ERROR");
        }

    }
}

class BaseDatosProductos {

    private HashMap<Integer, Productos> ListaProductos = new HashMap<Integer, Productos>();

    BaseDatosProductos() {

        this.ListaProductos.put(1, new Productos(1, "Manzanas", 5000.0, 25));
        this.ListaProductos.put(2, new Productos(2, "Limones", 2300.0, 15));
        this.ListaProductos.put(3, new Productos(3, "Peras", 2700.0, 33));
        this.ListaProductos.put(4, new Productos(4, "Arandanos", 9300.0, 5));
        this.ListaProductos.put(5, new Productos(5, "Tomates", 2100.0, 42));
        this.ListaProductos.put(6, new Productos(6, "Fresas", 4100.0, 3));
        this.ListaProductos.put(7, new Productos(7, "Helado", 4500.0, 41));
        this.ListaProductos.put(8, new Productos(8, "Galletas", 500.0, 8));
        this.ListaProductos.put(9, new Productos(9, "Chocolates", 3500.0, 80));
        this.ListaProductos.put(10, new Productos(10, "Jamon", 15000.0, 10));
    }

    public boolean agregar(int codigo, Productos productos) {
        if (this.ListaProductos.containsKey(codigo)) {
            return false;
        }
        this.ListaProductos.put(codigo, productos);
        return true;
    }

    public boolean actualizar(int codigo, Productos productos) {
        if (this.ListaProductos.containsKey(codigo)) {
            this.ListaProductos.replace(codigo, productos);
            return true;
        }
        return false;
    }

    public boolean eliminar(int codigo, Productos productos) {
        if (this.ListaProductos.containsKey(codigo)) {
            this.ListaProductos.remove(codigo);
            return true;
        }
        return false;
    }

    public double valor_inventario() {
        double contador = 0;
        for (Integer i : ListaProductos.keySet()) {
            contador += (ListaProductos.get(i).getPrecio() * ListaProductos.get(i).getInventario());
        }
        return contador;
    }

    public void generarInforme() {
        double sumatoriaValores = 0;
        Double precioMayor = 0.0;
        Double precioMenor = 9999999.9;
        String nombreMayor = "";
        String nombreMenor = "";

        for (Productos producto : ListaProductos.values()) {
            if (producto.getPrecio() > precioMayor) {
                precioMayor = producto.getPrecio();
                nombreMayor = producto.getNombre();
            }

            if (producto.getPrecio() < precioMenor) {
                precioMenor = producto.getPrecio();
                nombreMenor = producto.getNombre();
            }

            sumatoriaValores += producto.getPrecio();
        }

        Double promedio = sumatoriaValores / ListaProductos.size();

        System.out.println(nombreMayor + " " + nombreMenor + " " + String.format("%.1f", promedio));

    }
}

class Productos {

    int Codigo;
    String Nombre;
    double Precio;
    int Inventario;

    public Productos(int Codigo, String Nombre, double Precio, int Inventario) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Inventario = Inventario;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getInventario() {
        return Inventario;
    }

    public void setInventario(int Inventario) {
        this.Inventario = Inventario;
    }
}