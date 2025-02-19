class Solution {

    private void generateHappyStrings(
        int n,
        int k,
        StringBuilder currentString,
        int[] indexInSortedList,
        String[] result
    ) {
        // If the current string has reached the desired length
        if (currentString.length() == n) {
            indexInSortedList[0]++; // Increment the count of generated strings

            // If this is the k-th string, store it in the result
            if (indexInSortedList[0] == k) result[0] = currentString.toString();
            return;
        }

        // Try adding each character ('a', 'b', 'c') to the current string
        for (char currentChar = 'a'; currentChar <= 'c'; currentChar++) {
            // Skip if the current character is the same as the last one
            if (
                currentString.length() > 0 &&
                currentString.charAt(currentString.length() - 1) == currentChar
            ) continue;

            currentString.append(currentChar);

            // Recursively generate the next character
            generateHappyStrings(
                n,
                k,
                currentString,
                indexInSortedList,
                result
            );

            // If the result is found, stop further processing
            if (result[0] != null) return;

            // Backtrack by removing the last character
            currentString.deleteCharAt(currentString.length() - 1);
        }
    }

    public String getHappyString(int n, int k) {
        StringBuilder currentString = new StringBuilder();
        String[] result = new String[1];
        int[] indexInSortedList = new int[1];

        // Generate happy strings and track the k-th string
        generateHappyStrings(n, k, currentString, indexInSortedList, result);
        return result[0] == null ? "" : result[0];
    }
}