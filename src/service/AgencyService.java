package service;

import model.*;

import java.util.ArrayList;

public class AgencyService {

    public Agency createAgency(String name) {
        Agency agency = new Agency();
        agency.setName(name);
        return agency;
    }

    public void addBankAccountToAgency(Agency agency, BankAccount bankAccount) {
        if (agency.getBankAccountList() != null) {
            agency.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccountArrayList = new ArrayList<>();
            bankAccountArrayList.add(bankAccount);
            agency.setBankAccountList(bankAccountArrayList);
        }
    }

    public void addPaymentMovementToAgency(Agency agency, PaymentMovement paymentMovement) {
        if (agency.getPaymentMovementList() != null) {
            agency.getPaymentMovementList().add(paymentMovement);
        } else {
            ArrayList<PaymentMovement> paymentMovementArrayList = new ArrayList<>();
            paymentMovementArrayList.add(paymentMovement);
            agency.setPaymentMovementList(paymentMovementArrayList);
        }
    }


    public void addInsuranceToAgency(Agency agency, InsuranceCompany insuranceCompany) {
        if (agency.getInsuranceCompanyList() != null) {
            agency.getInsuranceCompanyList().add(insuranceCompany);
        } else {
            ArrayList<InsuranceCompany> insuranceCompanyList = new ArrayList<>();
            insuranceCompanyList.add(insuranceCompany);
            agency.setInsuranceCompanyList(insuranceCompanyList);
        }
    }

    public void addCustomerToAgency(Agency agency, Customer customer){
        if (agency.getCustomerList() != null) {
            agency.getCustomerList().add(customer);
        } else {
            ArrayList<Customer> customerArrayList = new ArrayList<>();
            customerArrayList.add(customer);
            agency.setCustomerList(customerArrayList);
        }
    }
}
