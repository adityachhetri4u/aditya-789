public class InterestCalculator {
    public double calculateInterest(String accountType, double balance) {
        // (Warm-up 1) Predict what to touch:
        // If we add a 4th account type (like Salary), I would have to open this exact file
        // and modify this method. I'd have to add another 'else if (accountType.equals("Salary"))'
        // right here. This violates the Open-Closed Principle because I have to modify 
        // existing code to add new features!
        
        if (accountType.equals("Savings")) {
            return balance * 0.04;
        } else if (accountType.equals("Current")) {
            return balance * 0.01;
        } else {
            return 0.0;
        }
    }
}
