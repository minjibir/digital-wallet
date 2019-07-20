class TransactionException extends Exception {
    static final long serialVersionUID = 1L;

    private String errorCode;

    public TransactionException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
