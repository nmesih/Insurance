package service;

import model.BankAccount;
import model.Customer;
import model.CustomerTypeEnum;
import model.InsuranceRequest;

import java.util.ArrayList;

public class CustomerService {

    public Customer createCustomer(String name, CustomerTypeEnum customerTypeEnum) {
        return new Customer(name, customerTypeEnum);
    }


    public void addBankAccountToCustomer(Customer customer, BankAccount bankAccount){
        if (customer.getBankAccountList() != null) {
            customer.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccountArrayList = new ArrayList<>();
            bankAccountArrayList.add(bankAccount);
            customer.setBankAccountList(bankAccountArrayList);
        }
    }

    public void addInsuranceRequestToCustomer(Customer customer, InsuranceRequest insuranceRequest){
        if (customer.getInsuranceRequestList() != null) {
            customer.getInsuranceRequestList().add(insuranceRequest);
        } else {
            ArrayList<InsuranceRequest> insuranceRequestArrayList = new ArrayList<>();
            insuranceRequestArrayList.add(insuranceRequest);
            customer.setInsuranceRequestList(insuranceRequestArrayList);
        }
    }


}
