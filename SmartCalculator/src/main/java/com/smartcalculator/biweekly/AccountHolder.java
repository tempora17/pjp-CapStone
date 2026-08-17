package com.smartcalculator.biweekly;


/*
 * Immutability is helpful for an AccountHolder in banking because
 * once the customer information is set, it cannot be changed by mistake.
 */
public final class AccountHolder {

    private final String name;
    private final String customerId;
    private final String email;

    /**
     * Creates an immutable AccountHolder.
     *
     * @param name account holder's name
     * @param customerId unique customer ID
     * @param email account holder's email address
     */
    public AccountHolder(String name, String customerId, String email) {
        this.name = name;
        this.customerId = customerId;
        this.email = email;
    }

    /**
     * Returns the account holder's name.
     *
     * @return account holder's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the customer ID.
     *
     * @return customer ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Returns the account holder's email address.
     *
     * @return email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns a string representation of the account holder.
     *
     * @return formatted account holder information
     */
    @Override
    public String toString() {
        return "AccountHolder[name=" + name
                + ", customerId=" + customerId
                + ", email=" + email + "]";
    }

    /**
     * Demonstrates the immutable AccountHolder class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        AccountHolder holder = new AccountHolder(
                "XYz",
                "101",
                "xyz@gmail.com"
        );

        System.out.println(holder);
        System.out.println(holder.getName());
        System.out.println(holder.getCustomerId());
        System.out.println(holder.getEmail());
    }
}