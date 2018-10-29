package hash_table;

/**
 * @author lycheeMao 2018-10-29
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        int i = numJewelsInStonesA("sM", "sssMSsM");
        System.out.println(i);
    }

    /**
     * You're given strings J representing the types of stones that are jewels,
     * and S representing the stones you have.  Each character in S is a type of stone you have.
     * You want to know how many of the stones you have are also jewels.
     * The letters in J are guaranteed distinct, and all characters in J and S are letters.
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     */
    private static int numJewelsInStonesA(String j,String s){
        char[] jChars = j.toCharArray();
        char[] sChars = s.toCharArray();
        int count = 0;
        for (char jChar:jChars){
            for (char sChar:sChars){
                if (jChar == sChar){
                    count++;
                }
            }
        }
        return count;
    }
}
