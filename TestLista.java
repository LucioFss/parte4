package parte4;

public class TestLista{
    public static void main(String[] args) {
        /*
        ListaArreglo<Integer> lista1 = new ListaArreglo<>();
        System.out.println("La lista esta vacia?: "+ lista1.esVacia());
        lista1.insertarInicio(12);
        lista1.insertarInicio(22);
        lista1.insertarInicio(32);
        lista1.insertarFin(42);
        lista1.insertarFin(62);
        lista1.insertarFin(72);
        lista1.insertarFin(82);
        lista1.insertarFin(92);
        lista1.insertarPos(52, 2);
        lista1.imprimir();
        lista1.eliminarPrimero();
        lista1.imprimir();
        lista1.eliminarUltimo();
        lista1.imprimir();
        lista1.eliminarPos(3);
        System.out.println(lista1.obtenerElemPos(4));
        System.out.println(lista1.obtenerPrimero());
        System.out.println(lista1.obtenerUltimo());
        System.out.println("La lista posee " + lista1.longitud() + " elementos");
        lista1.imprimir();
        System.out.println("Su elemento se encuentra en la posicion: " + lista1.buscar(62));
        System.out.println("La lista esta vacia?: "+ lista1.esVacia());
        */
        ListaEnlazada<Integer> lista2 = new ListaEnlazada<>();
        lista2.insertarInicio(1);
        lista2.insertarFin(2);
        lista2.insertarPos(12, 2);
        
        lista2.imprimir();

        
        System.out.println(lista2.eliminarPrimero());
        System.out.println(lista2.eliminarPos(0));
        lista2.insertarInicio(11);
        lista2.insertarFin(13);

        lista2.imprimir();
        System.out.println(lista2.obtenerPrimero());
        System.out.println(lista2.obtenerUltimo());
        System.out.println(lista2.obtenerElemPos(2));
        System.out.println(lista2.longitud());
        System.out.println(lista2.esVacia());

        


        

    }
}