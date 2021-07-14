package stringuniquecharacters;

import readerwriter.ReaderWriter;

import java.io.IOException;
import java.util.Arrays;

public class StringUniqueCharacters {
    public static void main(String[] args) throws IOException {
        new Solution().solve();
    }
    static class Solution {
        private void solve() throws IOException {
            ReaderWriter readerWriter = new ReaderWriter();
            String inputString = readInput(readerWriter);
            writeOutput(inputString, readerWriter);
        }

        private String readInput(ReaderWriter readerWriter) throws IOException {
            return readerWriter.readOneLine();
        }

        private void writeOutput(String inputString, ReaderWriter readerWriter) throws IOException {
            readerWriter.writeLine(isUniqueCharsCheckWithStream(inputString) ? "Yes" : "No");
        }

        public boolean isUniqueCharsCheckWithStream(String str) {
            if (str.length() > 256)
                return false;
            return Arrays.stream(str.toLowerCase().split(""))
                    .distinct()
                    .count() == str.length();
        }

        public boolean isUniqueCharsCheckWithBruteForce(String str) {
            if (str.length() > 256)
                return false;
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[i] == chars[j] && i != j)
                        return false;
                }
            }
            return true;
        }

        public boolean isUniqueCharsCheckWithSort(String str) {
            if (str.length() > 256)
                return false;
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == chars[i + 1])
                    return false;
            }
            return true;
        }

        public boolean isUniqueCharsCheckWithBit(String str) {
            if (str.length() > 256)
                return false;
            int marker = 0;
            for (int i = 0; i < str.length(); i++) {
                int intValueOfChar = str.charAt(i) - 'a';
                if ((marker & (1 << intValueOfChar)) > 0)
                    return false;
                marker |= 1 <<intValueOfChar;
            }
            return true;
        }
    }
}
