public class Tienda {
    private int cantidadTransacciones;
    private double valorTotal;
    private double valorLacteos;
    private double valorDulces;
    private double valorPanaderia;
    private double ganancias;

    public Tienda() {
        reiniciar();
    }

    public void agregarCompra(String producto, int cantidad, double valor) {
        double gananciaProducto = 0;
        
        switch (producto.toLowerCase()) {
            case "lacteos":
                valorLacteos += valor;
                gananciaProducto = valor * 0.37;  
                break;
            case "dulces":
                valorDulces += valor;
                gananciaProducto = valor * 0.55;  
                break;
            case "panaderia":
                valorPanaderia += valor;
                gananciaProducto = valor * 0.22;  
                break;
        }
        
        cantidadTransacciones++;
        valorTotal += valor;
        ganancias += gananciaProducto;  
    }

    public int getCantidadTransacciones() {
        return cantidadTransacciones;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getGanancias() {
        return ganancias;
    }

    public double getValorLacteos() {
        return valorLacteos;
    }

    public double getValorDulces() {
        return valorDulces;
    }

    public double getValorPanaderia() {
        return valorPanaderia;
    }

    public void reiniciar() {
        cantidadTransacciones = 0;
        valorTotal = 0;
        valorLacteos = 0;
        valorDulces = 0;
        valorPanaderia = 0;
        ganancias = 0;
    }
}
