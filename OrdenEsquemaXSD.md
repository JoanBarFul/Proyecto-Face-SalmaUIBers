**Facturae 3.2.2**.


---

### 1. **Facturae**
- **FileHeader** (obligatorio)
- **Parties** (obligatorio)
- **Invoices** (obligatorio)
- **Extensions** (opcional)

---

### 2. **FileHeader** (Cabecera de archivo)
Contiene metadatos del archivo:
- **SchemaVersion** (obligatorio): Versión del esquema, e.g., `"3.2.2"`.
- **Modality** (obligatorio): Modalidad del documento, e.g., `"I"` (individual).
- **InvoiceSeriesCode** (opcional): Serie de facturas.
- **InvoiceNumber** (obligatorio): Número de la factura.
- **InvoiceIssueDate** (obligatorio): Fecha de emisión de la factura.
- **FileHeaderExtensions** (opcional): Permite añadir extensiones personalizadas.

#### 2.1 **FileHeaderExtensions** (opcional)
- **Extension** (lista de extensiones, opcional)

---

### 3. **Parties** (Partes: Emisor y Receptor)
Define a las partes involucradas:
- **SellerParty** (obligatorio): Información sobre el emisor.
- **BuyerParty** (obligatorio): Información sobre el receptor.

#### 3.1 **BusinessType** (utilizado tanto para `SellerParty` como `BuyerParty`)
Un objeto `BusinessType` representa ya sea una entidad legal o una persona física.

- **TaxIdentification** (obligatorio): Información fiscal de la parte.
  - **PersonTypeCode** (obligatorio): Tipo de persona (Física o Jurídica).
  - **ResidenceTypeCode** (obligatorio): Tipo de residencia.
  - **TaxIdentificationNumber** (obligatorio): Número de identificación fiscal.
  
##### 3.1.1 **LegalEntity** (opcional si es una empresa)
- **CorporateName** (obligatorio si es empresa): Nombre de la empresa.
- **TradeName** (opcional): Nombre comercial.
- **RegistrationData** (opcional): Datos de registro.
  - **Book** (opcional).
  - **RegisterOfCompaniesLocation** (opcional).
  - **Sheet** (opcional).
  - **Folio** (opcional).
  - **Section** (opcional).
  - **Volume** (opcional).
  - **AdditionalRegistrationData** (opcional).

##### 3.1.2 **Individual** (opcional si es persona física)
- **Name** (obligatorio).
- **FirstSurname** (obligatorio).
- **SecondSurname** (opcional).

##### 3.1.3 **AddressType** (para `SellerParty` y `BuyerParty`)
- **Address** (obligatorio).
- **PostCode** (obligatorio).
- **Town** (opcional).
- **Province** (opcional).
- **CountryCode** (obligatorio): Código del país (ISO 3166-1 Alpha-2).
- **Telephone** (opcional).
- **WebAddress** (opcional).
- **ElectronicMail** (opcional).
- **ContactPersons** (opcional).

##### 3.1.4 **AdministrativeCentresType** (opcional)
- **AdministrativeCentre** (opcional, lista):
  - **CentreCode** (opcional): Código del centro administrativo.
  - **RoleTypeCode** (opcional): Código del rol del centro.
  - **Name** (opcional): Nombre del centro.
  - **FirstSurname** (opcional).
  - **SecondSurname** (opcional).
  - **AddressInSpain** (opcional): Dirección en España, de tipo `AddressType`.
  - **OverseasAddress** (opcional): Dirección en el extranjero.

---

### 4. **Invoices**
Este objeto contiene la lista de facturas, al menos una es obligatoria.
- **Invoice** (obligatorio): Lista de objetos `InvoiceType`.

#### 4.1 **InvoiceType**
Cada factura contiene múltiples detalles como productos, impuestos, totales y otros datos:
- **InvoiceNumber** (obligatorio).
- **InvoiceSeriesCode** (opcional): Serie de la factura.
- **InvoiceIssueDate** (obligatorio): Fecha de emisión de la factura.
- **InvoiceDueDate** (opcional): Fecha de vencimiento de la factura.
- **InvoiceTypeCode** (opcional): Código del tipo de factura (por ejemplo, "F" para factura, "NC" para nota de crédito).
- **SpecialTaxableEvent** (opcional):
  - **SpecialTaxableEventCode** (opcional).
  - **SpecialTaxableEventReason** (opcional).
- **InvoiceTotals** (obligatorio): Resumen de los totales.
- **TaxesOutputs** (opcional): Lista de impuestos aplicados.
- **Items** (obligatorio): Lista de líneas de la factura.
- **PaymentDetails** (opcional): Detalles del pago.
- **LegalLiterals** (opcional): Literales legales.
- **InvoiceExtensions** (opcional): Extensiones para la factura.
  
##### 4.1.1 **InvoiceTotalsType** (Totales de la factura)
Suma los importes totales de la factura.
- **TotalGrossAmount** (obligatorio).
- **TotalTaxOutputs** (obligatorio si hay impuestos): Suma de los impuestos.
- **TotalAmountWithoutTaxes** (opcional).
- **InvoiceTotal** (obligatorio): Total de la factura con impuestos.
- **Subsidies** (opcional):
  - **Subsidy** (lista opcional):
    - **SubsidyDescription** (opcional).
    - **SubsidyAmount** (obligatorio).
- **PaymentsOnAccount** (opcional):
  - **PaymentOnAccount** (lista opcional):
    - **PaymentOnAccountAmount** (obligatorio).
    - **PaymentOnAccountDate** (opcional).
- **ReimbursableExpenses** (opcional):
  - **ReimbursableExpense** (lista opcional):
    - **ReimbursableExpenseAmount** (obligatorio).
    - **ReimbursableExpenseDate** (opcional).

##### 4.1.2 **TaxesOutputsType** (Lista de impuestos aplicados)
Si se aplican impuestos, estos se desglosan en:
- **TaxOutput** (lista opcional): Cada `TaxOutputType` contiene detalles de un impuesto.

###### 4.1.2.1 **TaxOutputType** (Detalles de un impuesto)
Describe el impuesto que se aplica en la factura.
- **TaxTypeCode** (obligatorio): Código del tipo de impuesto (por ejemplo, "IVA").
- **TaxRate** (obligatorio): Porcentaje del impuesto.
- **TaxableBase** (obligatorio):
  - **TotalAmount** (obligatorio).
- **TaxAmount** (obligatorio).
- **EquivalenceSurcharge** (opcional).

##### 4.1.3 **InvoiceLineType** (Líneas de la factura)
Cada línea de la factura describe un producto o servicio facturado.
- **ItemDescription** (obligatorio): Descripción del producto o servicio.
- **Quantity** (obligatorio).
- **UnitPriceWithoutTax** (obligatorio): Precio unitario sin impuestos.
- **TotalCost** (opcional).
- **GrossAmount** (obligatorio): Importe bruto.
- **DiscountsAndRebates** (opcional):
  - **Discount** (lista opcional):
    - **DiscountReason** (opcional).
    - **DiscountRate** (opcional).
    - **DiscountAmount** (obligatorio).
  - **Rebate** (lista opcional):
    - **RebateReason** (opcional).
    - **RebateRate** (opcional).
    - **RebateAmount** (obligatorio).
- **Charges** (opcional):
  - **Charge** (lista opcional):
    - **ChargeReason** (opcional).
    - **ChargeRate** (opcional).
    - **ChargeAmount** (obligatorio).
- **TaxesWithheld** (opcional):
  - **TaxWithheld** (lista opcional):
    - **TaxTypeCode** (obligatorio).
    - **TaxRate** (obligatorio).
    - **TaxableBase** (obligatorio).
    - **TaxAmount** (obligatorio).

##### 4.1.4 **PaymentDetailsType** (Opcional, si existen detalles de pago)
- **Installment** (opcional, lista de pagos a plazos):
  - **InstallmentDueDate** (opcional).
  - **InstallmentAmount** (obligatorio).
  - **PaymentMeans** (opcional).
  - **AccountToBeCredited** (opcional):
    - **IBAN** (obligatorio si se utiliza).
    - **AccountNumber** (opcional).

##### 4.1.5 **LegalLiteralsType** (Opcional)
Sección opcional donde pueden añadirse literales legales en la factura.
- **LegalReference** (opcional).

---



### 5. **Extensions** (Opcional)
Si el esquema necesita ser ampliado con información adicional, se pueden añadir extensiones personalizadas:
- **Any** (opcional).

---


