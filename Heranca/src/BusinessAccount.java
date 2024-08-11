
    //Define que esta classe terá todos os comportamentos da classe account
    public class BusinessAccount extends Account{

        private Double loanLimit;

        public BusinessAccount(){

        }


        public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
            super(number, holder, balance);
            this.loanLimit = loanLimit;
        }

        public Double getLoanLimit() {
            return loanLimit;
        }

        public void setLoanLimit(Double loanLimit) {
            this.loanLimit = loanLimit;
        }

        public void loan(Double amount) {
            if (amount > loanLimit) {
                deposit(amount);
                balance += amount - 10.0;
            }
        }

        @Override
        public void withdraw(double amount) {
            super.withdraw(amount);
            balance -= 2.0;
        }



    }

