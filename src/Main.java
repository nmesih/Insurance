import model.*;
import service.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        AgencyService agencyService = new AgencyService();
        Agency agency = agencyService.createAgency("MOM");
        System.out.println(agency.toString());

        BankAccountService bankAccountService = new BankAccountService();
        BankAccount bankAccount = bankAccountService.createBankAccount("Ziraat Bankasi", "TR20300000048476353", BigDecimal.ZERO);

        agencyService.addBankAccountToAgency(agency, bankAccount);
        System.out.println(agency.toString());

        InsuranceCompanyService insuranceCompanyService = new InsuranceCompanyService();
        InsuranceCompany insuranceCompany = insuranceCompanyService.createInsuranceCompany("Allianz", "727384849",
                "8234449", "Ankara/ Cankaya", new BigDecimal(8));

        InsuranceService insuranceService = new InsuranceService();
        Insurance insurance = insuranceService.createInsurance( InsuranceTypeEnum.COMPULSORY_TRAFFIC_INSURANCE, "compulsory traffic insurance");
        insuranceCompanyService.addInsuranceToInsuranceCompany(insurance, insuranceCompany);
        BankAccount allianzBankAccount = bankAccountService.createBankAccount("Yapi Kredi Bankasi", "TR20300000048476353", new BigDecimal(1000000));
        insuranceCompanyService.addBankAccountToInsuranceCompany(insuranceCompany, allianzBankAccount);

        CustomerService customerService = new CustomerService();
        Customer customer = customerService.createCustomer("Sinem", CustomerTypeEnum.CORPORATE);

        BankAccount customerBankAccount = bankAccountService.createBankAccount("Is Bankasi",
                "TR139128309183907", new BigDecimal(10000));

        customerService.addBankAccountToCustomer(customer, customerBankAccount);
        agencyService.addInsuranceToAgency(agency, insuranceCompany);
        agencyService.addCustomerToAgency(agency, customer);

        VehicleService vehicleService = new VehicleService();
        Vehicle vehicle = vehicleService.createVehicle("Ford", "Focus", "2345",
                "34cd474", 2010, ColorTypeEnum.BLACK);

        customerService.addVehicleToCustomer(customer, vehicle);
        System.out.println(customer);

        InsuranceRequestService insuranceRequestService = new InsuranceRequestService();
        InsuranceRequest insuranceRequest = insuranceRequestService.createInsuranceRequest(vehicle);

        customerService.addInsuranceRequestToCustomer(customer, insuranceRequest);
        LocalDate startDate = LocalDate.of(2010, Month.APRIL, 15);
        LocalDate endDate = LocalDate.of(2011, Month.APRIL, 15);
        LocalDate expireDate = startDate.plusDays(3);

        ProposalService proposalService = new ProposalService();

        Proposal proposal = proposalService.createProposal(insuranceCompany, vehicle,
                new BigDecimal(1000), startDate, endDate, expireDate, new BigDecimal(100));

        AccidentService accidentService = new AccidentService();
        LocalDate accidentDate = LocalDate.now();
        Accident accident = accidentService.createAccident(accidentDate, "Trafik kazasi gerceklesti",
                new BigDecimal(5000), 6);
        vehicleService.addAccidentToVehicle(vehicle, accident);

        insuranceRequestService.addProposalToInsuranceRequest(insuranceRequest, proposal);
        customerService.acceptProposal(customer, proposal, insuranceRequest, agency);



    }
}