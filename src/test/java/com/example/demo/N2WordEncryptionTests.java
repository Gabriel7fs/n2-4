package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class N2WordEncryptionTests {
    @Test
    void testEncryptThis() {
        assertEquals("72olle", N2WordEncryption.encryptThis("Hello"));
        assertEquals("103doo", N2WordEncryption.encryptThis("good"));
        assertEquals("104olle 119drlo", N2WordEncryption.encryptThis("hello world"));
        assertEquals("", N2WordEncryption.encryptThis(""));
    }
}
