package sortowanie_babelkowe;

public class NewClass {

    public static void main(String[] args) {
        int[] liczby = new int[6];
        int x, i, j;

        liczby[0] = 485;
        liczby[1] = 45;
        liczby[2] = 85;
        liczby[3] = 5;
        liczby[4] = 41;
        liczby[5] = 17;

        System.out.print("\nDla liczb: \n");

        for (i = 0; i <= 5; i++)
            if (i <= 4)
                System.out.print(liczby[i] + ", ");
            else
                System.out.print(liczby[i] + ". ");

        for (i = 1; i <= 5; i++) //algorytm sortowania babelkowego
        {
            for (j = 5; j >= i; j--)
            {
                if (liczby[j - 1] > liczby[j])
                {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }//j
        }//i

        System.out.println("\n");
        System.out.println("liczby uporzadkowane to: ");

        for (i = 0; i <= 5; i++)
        {
            if (i <= 4)
                System.out.print(liczby[i] + ", ");
            else
                System.out.print(liczby[i] + ".");
        }
        System.out.println("\n");
    }
}
