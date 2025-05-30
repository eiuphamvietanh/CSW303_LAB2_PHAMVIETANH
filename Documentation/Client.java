package Documentation;

public class Client {
    public static void main(String[] args) {
        //normie doc
        String publicInfo = "something something public";
        Document normDoc = new NormalDoc(publicInfo);
        System.out.println("Normal document:"+"\n" + normDoc.buildDoc());

        //conf doc
        String sensitiveInfo = "Lemuen my beloved bankrupt information 111";
        ConfidentialDoc confiDoc = new ConfidentialDoc(sensitiveInfo);
        System.out.println("\n"+"Confidential document:" + confiDoc.buildDoc());
        System.out.println("Decrypted Content:" + confiDoc.decryptContent());
    }
}
