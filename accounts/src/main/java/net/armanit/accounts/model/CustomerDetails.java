package net.armanit.accounts.model;

import lombok.Data;

import java.util.List;

@Data
public class CustomerDetails {
    private Account account;
    private List<Loans> loans;
    private List<Cards> cards;
}
