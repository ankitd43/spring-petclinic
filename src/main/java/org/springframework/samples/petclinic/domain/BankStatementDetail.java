package org.springframework.samples.petclinic.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankStatementDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="transaction_reference")
    private Long transactionReference;
    
    @Column(name ="account_number", unique = true)
    private String accountNumber;

    @Column(name ="start_balance")
    private String startBalance;

    @Column(name ="end_alance")
    private String endBalance;

    private String mutation;
    
    private String description;
}
