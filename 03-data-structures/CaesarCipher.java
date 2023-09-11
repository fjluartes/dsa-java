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
        char[] msg = original.toCharArray();
        for (int k = 0; k < msg.length; k++) {
            if (Character.isUpperCase(msg[k])) {
                int j = msg[k] - 'A';
                msg[k] = code[j];
            }
        }
        return new String(msg);
    }
    
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(3); // Encrypt = DEF...
        System.out.println("Encryption code = " + new String(cipher.encoder));
        System.out.println("Decryption code = " + new String(cipher.decoder));
        String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
        String coded = cipher.encrypt(message);
        System.out.println("Secret: " + coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Message: " + answer); // should be plain text again
    }
}
