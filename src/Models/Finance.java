package Models;

public class Finance {

    public String profit;

    public Finance(String profit) {
        this.profit = profit;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public class Income extends Finance {

        public int incomeId;
        public double income;
        public String description;
        public String date;

        public Income(int incomeId, double income, String description, String date, String profit) {
            super(profit);
            this.incomeId = incomeId;
            this.income = income;
            this.description = description;
            this.date = date;
        }

        public int getIncomeId() {
            return incomeId;
        }

        public void setIncomeId(int incomeId) {
            this.incomeId = incomeId;
        }

        public double getIncome() {
            return income;
        }

        public void setIncome(double income) {
            this.income = income;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

    }

    public class Expences extends Finance {

        private int expencesId;
        private double expences;
        private String description;
        private String date;

        public Expences(int expencesId, double expences, String description, String date, String profit) {
            super(profit);
            this.expencesId = expencesId;
            this.expences = expences;
            this.description = description;
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getExpencesId() {
            return expencesId;
        }

        public void setExpencesId(int expencesId) {
            this.expencesId = expencesId;
        }

        public double getExpences() {
            return expences;
        }

        public void setExpences(double expences) {
            this.expences = expences;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

}
