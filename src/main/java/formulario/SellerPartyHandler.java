/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import javax.swing.JTextField;
import MARSHAL.*;

/**
 *
 * @author alexc
 */
public class SellerPartyHandler {
    private javax.swing.JTextField book;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField corporateName;
    private javax.swing.JTextField countryCode;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField folio;
    private javax.swing.JTextField personType;
    private javax.swing.JTextField taxIdNumber;
    private javax.swing.JTextField sheet;
    private javax.swing.JTextField location;
    private javax.swing.JTextField seccion;
    private javax.swing.JTextField volumen;

    public SellerPartyHandler(JTextField book, JTextField ciudad, JTextField corporateName, JTextField countryCode, JTextField cp, JTextField folio, JTextField personType, JTextField taxIdNumber, JTextField sheet, JTextField location, JTextField seccion, JTextField volumen) {
        this.book = book;
        this.ciudad = ciudad;
        this.corporateName = corporateName;
        this.countryCode = countryCode;
        this.cp = cp;
        this.folio = folio;
        this.personType = personType;
        this.taxIdNumber = taxIdNumber;
        this.sheet = sheet;
        this.location = location;
        this.seccion = seccion;
        this.volumen = volumen;
    }



    
    
    public SellerParty getSellerParty() {
        SellerParty sellerPartyObjeto = new SellerParty();
        
        TaxIdentification sellerTaxId = new TaxIdentification();
        sellerTaxId.setPersonTypeCode(personType.getText());
        sellerTaxId.setResidenceTypeCode("R");
        sellerTaxId.setTaxIdentificationNumber(taxIdNumber.getText());
        sellerPartyObjeto.setTaxIdentification(sellerTaxId);

        LegalEntity sellerLegalEntity = new LegalEntity();
        sellerLegalEntity.setCorporateName(corporateName.getText());

        RegistrationData sellerRegistrationData = new RegistrationData();
        sellerRegistrationData.setBook(Integer.valueOf(book.getText()));
        sellerRegistrationData.setRegisterOfCompaniesLocation(location.getText());
        sellerRegistrationData.setSheet(Integer.valueOf(sheet.getText()));
        sellerRegistrationData.setFolio(Integer.valueOf(folio.getText()));
        sellerRegistrationData.setSection(Integer.valueOf(seccion.getText()));
        sellerRegistrationData.setVolume(Integer.valueOf(volumen.getText()));
        sellerLegalEntity.setRegistrationData(sellerRegistrationData);

        AddressInSpain sellerAddress = new AddressInSpain();
        sellerAddress.setAddress("Calle falsa 123");
        sellerAddress.setPostCode("07600");
        sellerAddress.setTown("Palma");
        sellerAddress.setProvince("Baleares");
        sellerAddress.setCountryCode("ESP");
        sellerLegalEntity.setAddressInSpain(sellerAddress);
        sellerPartyObjeto.setLegalEntity(sellerLegalEntity);

        return sellerPartyObjeto;
            
    }
    
    
}
