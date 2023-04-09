//this app solves Euler_14 Collatz sequence problem. It takes numbers ranging form 0 to 1000000 and validates which one has the largest sequence to reach value 1.
//the sequence is initialized by dividing even numbers by 2; and multiplication of odd ones by 3 whilist adding 1 to the output.
//the source number is also regarded as a part of a chain

public class App {


    public static boolean oddoreven (int interpretednumber) {
        boolean iseven = true;
        if (interpretednumber % 2 == 0) {
            iseven = true;
        } else {
            iseven = false;
        }
        return iseven;
    }


    public static int evencalc (int evenumber) {
        int evenresult = evenumber / 2;
        return evenresult;
    }
    

    public static int oddcalc (int oddnumber) {
        int casche = 3 * oddnumber;
        int oddresult = casche + 1;
        return oddresult;
    }

    
    public static int chaincalc (int Collatznumber) {
            int chain_l1 = 0;
            if (Collatznumber == 1) { 
            chain_l1 = 1;
            }else if (Collatznumber <= 1000000) {
                int interpretednumber = Collatznumber;
                int chain_l = 0;
                do {
                    if (oddoreven(interpretednumber) == true) {
                        interpretednumber = evencalc(interpretednumber);
                        chain_l ++;
                    }else {
                        interpretednumber = oddcalc(interpretednumber);
                        chain_l ++;
                    };
                }while (interpretednumber > 1);
                chain_l1 = chain_l + 1;
            }
            return chain_l1;
        }
    public static void main(String[] args) {
        int Collatznumber = 1;
        int collectorarray[] = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            collectorarray[i] = chaincalc (Collatznumber);
            Collatznumber ++;
        }
        int indexmax = 0;
        for (int k = 0; k < collectorarray.length; k++) {
            if (collectorarray[k] > collectorarray[indexmax]) {
                indexmax = k;
            }
        }
        int hihgesTST = indexmax + 1;
        System.out.println(hihgesTST);
    }
    }
