class TransactionException extends Exception {
    private String errorCode;
    private String errorMessage;

    public TransactionException(String errorMessage, String errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
