package algoritmosResolvidos;

public class AreSimilar {

    public static boolean result (int [] a, int [] b){
        int[] diff = new int[2];
        int diffIndex = 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (diffIndex > 1) {
                    return false;
                }
                diff[diffIndex++] = i;
            }
        }
        return diffIndex == 0 || (a[diff[1]] == b[diff[0]] && a[diff[0]] == b[diff[1]]);
    }
}
