public class Empresa {
    private Tienda tienda1;
    private Tienda tienda2;
    private Tienda tienda3;

    public Empresa() {
        tienda1 = new Tienda();
        tienda2 = new Tienda();
        tienda3 = new Tienda();
    }

    public double getTotalValorTienda(int tienda) {
        switch (tienda) {
            case 1:
                return tienda1.getValorTotal();
            case 2:
                return tienda2.getValorTotal();
            case 3:
                return tienda3.getValorTotal();
            default:
                return 0;
        }
    }

    public double getTotalGananciasTienda(int tienda) {
        switch (tienda) {
            case 1:
                return tienda1.getGanancias();
            case 2:
                return tienda2.getGanancias();
            case 3:
                return tienda3.getGanancias();
            default:
                return 0;
        }
    }

    public void agregarCompra(int tienda, String producto, int cantidad, double valor) {
        switch (tienda) {
            case 1:
                tienda1.agregarCompra(producto, cantidad, valor);
                break;
            case 2:
                tienda2.agregarCompra(producto, cantidad, valor);
                break;
            case 3:
                tienda3.agregarCompra(producto, cantidad, valor);
                break;
        }
    }

    public double getGananciasTotales() {
        return tienda1.getGanancias() + tienda2.getGanancias() + tienda3.getGanancias();
    }

    public void reiniciarTienda(int tienda) {
        switch (tienda) {
            case 1:
                tienda1.reiniciar();
                break;
            case 2:
                tienda2.reiniciar();
                break;
            case 3:
                tienda3.reiniciar();
                break;
        }
    }
}
