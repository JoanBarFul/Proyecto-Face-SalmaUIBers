package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexc
 */



@XmlType(propOrder = {"paymentTypeCode", "paymentMethod", "installments"})
public class PaymentDetails {
    private String paymentTypeCode;
    private String paymentMethod;
    private List<Installment> installments; // Cambia esto para usar una lista

    public PaymentDetails() {
        installments = new ArrayList<>(); // Inicializa la lista
    }

    @XmlElement(name = "PaymentTypeCode")
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }

    @XmlElement(name = "PaymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @XmlElement(name = "Installment") // Esto indica que se marshalle como una lista
    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment); // Método para agregar
    }
}

