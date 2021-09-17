package test;

public class TestArreglos {

    public static void main(String[] args) {

        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 10;
        edades[1] = 15;
        edades[2] = 20;
        System.out.println("edades = " + edades[0]);
        System.out.println("edades = " + edades[1]);
        System.out.println("edades = " + edades[2]);

        for (int i = 0; i < edades.length; i++) {

            System.out.println("Edades elmento = " + +i + ":" + edades[i]);

        }
        
        String frutas [] = {"Naranja","Platano", "Uva"};
        
        for (int i = 0; i < frutas.length; i++) {
            
            System.out.println("Indice = " + i+" Frutas: "+frutas[i]);
        }
        

    }

}
