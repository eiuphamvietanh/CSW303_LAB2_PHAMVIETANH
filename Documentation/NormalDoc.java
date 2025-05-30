package Documentation;

public class NormalDoc extends Document {
    private String content;

    public NormalDoc(String content) {
        this.content = content;
    }

    @Override
    public void setExtension() {
        this.extension = ".txt";
    }

    @Override
    public void setEncryption() {
        this.encryption = "none";
    }

    @Override
    public String buildDoc() {
        setExtension();
        setEncryption();
        return "Document stored as "
                + extension + " with encryption: "
                + encryption + "\n" + "stored content: " + content;
    }
}
