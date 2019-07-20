class DigitalWalletTransaction {

    public DigitalWalletTransaction() {}

    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if (digitalWallet != null) {
            if (digitalWallet.getUserAccessCode() == null || digitalWallet.getUserAccessCode().equals("")) {
                throw new TransactionException("USER_NOT_AUTHORIZED", "User not authorized.");
            } else if (amount <= 0) {
                throw new TransactionException("INVALID_AMOUNT", "Amount should be greater than zero.");
            } else {
                digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() + amount);
            }
        }
    }

    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if (digitalWallet != null) {
            if (digitalWallet.getUserAccessCode() == null || digitalWallet.getUserAccessCode().equals("")) {
                throw new TransactionException("USER_NOT_AUTHORIZED", "User not authorized.");
            } else if (amount <= 0) {
                throw new TransactionException("INVALID_AMOUNT", "Amount should be greater than zero.");
            } else if (digitalWallet.getWalletBalance() < amount) {
                throw new TransactionException("INSUFFICIENT_BALANCE", "Insufficient balance.");
            } else {
                digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() - amount);
            }
        }
    }
}
