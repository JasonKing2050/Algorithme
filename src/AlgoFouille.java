




public class AlgoFouille {

    /**
     * Fouille binaire non recursive
     * @param tableau
     * @param element
     * @param <E>
     * @return
     * @throws ElementNonPresent
     */
    public static <E extends Comparable<E>> int FouilleBinaire(E[] tableau, E element)
            throws ElementNonPresent{
        {
            int debut = 0;
            int fin = tableau.length - 1;

            while (debut < fin) {
                int milieu = (debut + fin) / 2;
                if (element.compareTo(tableau[milieu]) <= 0) {
                    fin = milieu;
                } else {
                    debut = milieu + 1;
                }
            }
            if (tableau[debut].compareTo(element) != 0) {
                throw new ElementNonPresent();
            }

            return debut;
        }
    }


    /**
     * Fouille binaire recursive
     * @param tableau
     * @param element
     * @param debut
     * @param fin
     * @param <E>
     * @return
     */
    public static < E extends Comparable< E > >
        int FouilleBinaireR( E [] tableau, E element, int debut, int fin ){

        while ( debut <= fin){
            int mid = (debut+fin)/2;
            if (tableau[mid].compareTo(element) == 0){
                return mid;
            }
            if (tableau[mid].compareTo(element) < 0){
                debut = mid + 1;
                FouilleBinaireR(tableau,element,debut,fin);
            }
            if (tableau[mid].compareTo(element) > 0){
                fin = mid - 1;
                FouilleBinaireR(tableau,element,debut,fin);
            }
        }
        return -1;
    }
}