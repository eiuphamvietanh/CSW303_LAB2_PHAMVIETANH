package Documentation;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class ConfidentialDoc extends Document {
    private String originalContent;
    private String encryptedContent;
    private SecretKey key;
    private IvParameterSpec iv;

    public ConfidentialDoc(String content) {
        this.originalContent = content;
    }

    @Override
    public void setExtension() {
        this.extension = ".zip";
    }

    @Override
    public void setEncryption() {
        try {
            String algorithm = "AES/CBC/PKCS5Padding"; //o file aes doan algo
            this.key = AESCipher.generateKey();
            this.iv = AESCipher.generateIv();

            this.encryptedContent = AESCipher.encrypt(algorithm, originalContent, key, iv);
            this.encryption = "AES";

        } catch (Exception e) {
            e.printStackTrace();
            this.encryption = "encrypt failed";
        }
    }

    public String decryptContent() {
        try {
            String algorithm = "AES/CBC/PKCS5Padding";//o file aes doan algo
            return AESCipher.decrypt(algorithm, encryptedContent, key, iv);
        } catch (Exception e) {
            return "decrypt failed";
        }
    }

    @Override
    public String buildDoc() {
        setExtension();
        setEncryption();
        return "Document stored as " + extension
                + " as encryption: " + encryption
                + "\n" + "Encrypted content: " + encryptedContent;
    }
}
