package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
    "installmentDueDate", 
    "installmentAmount", 
    "paymentMeans", 
    "accountToBeCredited" // Asegúrate de que este esté incluido
})
public class Installment {
    private String installmentDueDate;
    private String installmentAmount; // Cambiado a String
    private String paymentMeans; // Cambiado a String para código de pago
    private AccountToBeCredited accountToBeCredited;

    @XmlElement(name = "InstallmentDueDate")
    public String getInstallmentDueDate() {
        return installmentDueDate;
    }

    public void setInstallmentDueDate(String installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    @XmlElement(name = "InstallmentAmount")
    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    @XmlElement(name = "PaymentMeans") // Esto se cambiará a un String
    public String getPaymentMeans() {
        return paymentMeans;
    }

    public void setPaymentMeans(String paymentMeans) {
        this.paymentMeans = paymentMeans;
    }

    @XmlElement(name = "AccountToBeCredited")
    public AccountToBeCredited getAccountToBeCredited() {
        return accountToBeCredited;
    }

    public void setAccountToBeCredited(AccountToBeCredited accountToBeCredited) {
        this.accountToBeCredited = accountToBeCredited;
    }
}
