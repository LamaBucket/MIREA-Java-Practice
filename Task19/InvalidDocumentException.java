package Task19;

public class InvalidDocumentException extends Throwable {

    @Override
    public String getLocalizedMessage() {
        // TODO Auto-generated method stub
        return super.getLocalizedMessage() + "Hello From Invalid Document Exception";
    }

    public InvalidDocumentException(String message) {
        super(message);
    }
}
