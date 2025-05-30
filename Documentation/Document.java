package Documentation;

public abstract class Document {
    protected String extension;
    protected String encryption;

    public abstract void setExtension();
    public abstract void setEncryption();

    public String buildDoc() {
        return "document stored as:" + extension + " as: " + encryption;
    }
}
