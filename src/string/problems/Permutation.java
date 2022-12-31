package string.problems;
public class Permutation {

    public static void main(String[] args) {
        String s = "ABC";
        int n = s.length();
                Permutation permutations = new Permutation();
                permutations.calculate(s, 0,n-1);
    }

    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */
     void calculate(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                String swapped = this.swap(str, left, i);
                this.calculate(swapped, left + 1, right);
            }
        }
    }

    //Swpa characters:
    private String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray [j] = temp;
        return String.valueOf(charArray);

    }


    }




