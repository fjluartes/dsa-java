/* Class for doing encryption and decryption using Caesar Cipher */
public class CaesarCipher {
    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];

    // constructor for encryption/decryption arrays
    public CaesarCipher(int rotation) {
        for (int k = 0; k < 26; k++) {
            encoder[k] = (char) ('A' + (k + rotation) % 26);
            decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
        }
    }

    // returns String representing encrypted message
    public String encrypt(String message) {
        return transform(message, encoder);
    }

    // returns decrypted message given encrypted secret
    public String decrypt(String secret) {
        return transform(secret, decoder);
    }

    // returns transformation fo original String using given code
    private String transform(String original, char[] code) {
        // code to transform
    }
    
    public static void main(String[] args) {
        System.out.println("Caesar Cipher");
    }
}
