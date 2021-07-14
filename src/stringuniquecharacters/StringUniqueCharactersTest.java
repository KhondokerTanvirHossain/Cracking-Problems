package stringuniquecharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUniqueCharactersTest {
    StringUniqueCharacters.Solution stringUniqueCharacters = new StringUniqueCharacters.Solution();

    @Test
    public void isUniqueCharsCheckWithStream() {
        assertTrue(stringUniqueCharacters.isUniqueCharsCheckWithStream("123"));
        assertFalse(stringUniqueCharacters.isUniqueCharsCheckWithStream("1233"));
    }

    @Test
    public void isUniqueCharsCheckWithBruteForce() {
        assertTrue(stringUniqueCharacters.isUniqueCharsCheckWithBruteForce("123"));
        assertFalse(stringUniqueCharacters.isUniqueCharsCheckWithBruteForce("1233"));
    }

    @Test
    public void isUniqueCharsCheckWithSort() {
        assertTrue(stringUniqueCharacters.isUniqueCharsCheckWithSort("123"));
        assertFalse(stringUniqueCharacters.isUniqueCharsCheckWithSort("1233"));
    }

    @Test
    public void isUniqueCharsCheckWithBit() {
        assertTrue(stringUniqueCharacters.isUniqueCharsCheckWithBit("abc"));
        assertFalse(stringUniqueCharacters.isUniqueCharsCheckWithBit("abcc"));
    }

}
