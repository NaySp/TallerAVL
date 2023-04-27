package ui;

import model.*;  



public class Main {


    public static void main(String[] args) {
        
        ArbolAVL arbol = new ArbolAVL();

        arbol.insertar(20);
        arbol.insertar(17);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(1);
        arbol.insertar(0);

        arbol.mostrarArbolAVL();
        arbol.levelOrder(arbol.getRoot());
        

    }

}
