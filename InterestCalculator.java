public class InterestCalculator {
    public double calculateInterest(String accountType, double balance) {
        // Predict what to touch:
        // If we add a 4th account type (like Salary), then we would have to open this exact file
        // and modify this method. we'd have to add another 'else if (accountType.equals("Salary"))'
        // right here. This violates the Open-Closed Principle because we have to modify 
        // existing code to add new features.
        
        if (accountType.equals("Savings")) {
            return balance * 0.04;
        } else if (accountType.equals("Current")) {
            return balance * 0.01;
        } else {
            return 0.0;
        }
    }          
}
