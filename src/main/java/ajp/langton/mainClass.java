package ajp.langton;

public class mainClass {

    public static void main(String[] args) {

        ant theAnt = new ant();
        int i1, i2, i3;

        for(i1 = 0; i1<=200; i1++) {
            theAnt.move();
            System.out.println("ant facing "+ theAnt.direction.name() +" on square ("+ theAnt.column +"/"+ theAnt.row +")");
            for(i2 = 0; i2<theAnt.field.length; i2++) {
                for(i3 = 0; i3<theAnt.field.length; i3++) {
                    theAnt.field[i2][i3].printSquare();
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
