package org.example.util;


public class CharReplaceUtils {

    /**
     * Replaces all occurrences of the character array {@code find} in the character array {@code source} with the specified character {@code replace}.
     *
     * <p>The method scans through the {@code source} array to find occurrences of the {@code find} subarray. When an occurrence is found,
     * it is replaced with the {@code replace} character. The result is returned as a new character array with all found subarrays replaced.</p>
     *
     * @param source  the character array in which replacements will be made
     * @param find    the character array to find
     * @param replace the character to replace the found subarrays with
     * @return a new character array with the specified subarrays replaced
     */
    public static char[] replace(char[] source, char[] find, char replace) {
        int sourceLength = source.length;
        int findLength = find.length;

        if (findLength == 0 || findLength > sourceLength) {
            return source;
        }

        char[] resultArray = new char[sourceLength];

        for (int k = 0; k < sourceLength; k++) {
            resultArray[k] = source[k];
        }

        for (int i = 0; i <= sourceLength - findLength; i++) {
            boolean match = true;

            for (int j = 0; j < findLength; j++) {
                if (resultArray[i + j] != find[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                char[] newArray = new char[resultArray.length - findLength + 1];

                for (int m = 0; m < i; m++) {
                    newArray[m] = resultArray[m];
                }

                newArray[i] = replace;

                for (int k = i + findLength; k < resultArray.length; k++) {
                    newArray[k - findLength + 1] = resultArray[k];
                }

                resultArray = newArray;
                sourceLength = resultArray.length;
            }
        }
        return resultArray;
    }
}
