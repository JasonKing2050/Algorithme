public class Principal {
    private static Object Fraction;

    public static void main(String[] args) {

        Fraction [] a = new Fraction[8]  ;

        a[7] = new Fraction(2,1);
        a[6] = new Fraction(2,2);
        a[5] = new Fraction(2,3);
        a[4] = new Fraction(2,4);
        a[3] = new Fraction(2,5);
        a[2] = new Fraction(2,6);
        a[1] = new Fraction(2,7);
        a[0] = new Fraction(2,8);

        //Fraction b sert a entrer la valeur recherchée...
        Fraction b = new Fraction(2,9);

        try {
            //Fouille binaire récursive..
            int r = AlgoFouille.FouilleBinaireR(a,b,0,a.length);
            if (r < 0){
                System.out.println("Pas présent");
            }else {
                System.out.println(AlgoFouille.FouilleBinaireR(a,b,0,a.length));
            }

            //Fouille binaire non récursive..
            System.out.println(AlgoFouille.FouilleBinaire(a,b));

        }catch
        (ElementNonPresent e){
            System.out.println("Element non présent");
        }
    }
}
