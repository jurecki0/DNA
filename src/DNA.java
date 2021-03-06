//This program will return an answer if a given DNA strand is a Protein or not.
public class DNA {

    static String dna1 = "ATGCGATACGCTTGA";
    static String dna2 = "ATGCGATACGTGA";
    static String dna3 = "ATTAATATGTACTGA";

    static String dna;

    /* isProtein method will check if the given strand is a Protein or not by checking its Beginning, its Ending and if it's divisible by 3.
     * parameter: dna strand.
     * return: no return.
     */
    public static void isProtein (String dnaI) {

        //Find start and stop codon:
        int start = dnaI.indexOf("ATG");
        int stop = dnaI.indexOf("TGA");

        if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            String protein = dnaI.substring(start, stop+3);
            System.out.println(dnaI + ": This strand has in fact a Protein in it.");
            System.out.println("Protein: " + protein);
        } else{
            System.out.println(dnaI + ": This strand has definitely not any Protein in it.");
        }
    }

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        dna = dna1;
        isProtein(dna);
        //space
        System.out.println();
        dna = dna2;
        isProtein(dna);
        //space
        System.out.println();
        dna = dna3;
        isProtein(dna);
    }

}