package com.LDLS.Litigation.Project.ClientManagement;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Client")
public class ClientManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @NonNull
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    private Long idNumber;
    @NonNull
    private String kraPin;
    private String emailAddr;
    private Long   phoneNo1;
    private Long   PhoneNo2;
    private String postalAddress;
    private String postalCode;
    private String city;
    private String country;
    private Long LoanAmount;
    private String  clientCode;
    private Long loanAccNo;
    private Double originalLoanAmount;
    private String interestRate;
    private Date startDate;
    private Date endDate;
    private String outPrincipal;
    private String outInterest;
    private Date lastAccrualDate;
    private Date lastPaymentDate;
    private String lastPayReceived;
    private Date lastIntAppDate;
    private String userAssetClass;
    private Date classifactionDate;
    private String loanTenor;
    private String defaultReason;
    private Date defaultDate;
    private String transferringOffice;
    private Double amountRemaining;
    private String loanDescription;

    // active, pending, closed
    private long activeCases;
    private long pendingCases;
    private long closedCases;

    private String status;
    private String details;
    private LocalDateTime lastUpdated;

    public ClientManagement(long activeCases, long pendingCases, long closedCases) {
        this.activeCases = activeCases;
        this.pendingCases = pendingCases;
        this.closedCases = closedCases;
    }
}
