# Change Details @ 2022-08-30
---------------------------
1.  DebitCredit_Schematron_2p0.sch แก้ไชไฟล์ Schematron แก้ filed IssueDateTime และ IssuerAssignID เป็น Mandatory
2.  TaxInvoice_Schematron_2p0.sch แก้ไชไฟล์ Schematron แก้ filed IssueDateTime และ IssuerAssignID เป็น Mandatory

# Change Details @ 2021-10-26
---------------------------
1.  Invoice_Schematron_2p0.sch แก้ไชไฟล์ Schematron ยกเลิกการเช็ค Name ของเอกสาร
	
# Change Details @ 2021-03-22
---------------------------
1.  Invoice_CrossIndustryInvoice_2p0.xsd 
    1.1.  เพิ่ม Element Signature ใน schema  
    


# Change Details @ 2019-12-11
---------------------------
1. แก้ไข TaxInvoice_Schematron_2p0.sch ดังนี้
    
    1.1. แก้ไข TIV-InvoicerTradeParty-008 กรณีระบุประเภทเลขประจำตัวผู้เสียภาษีอากรของผู้ซื้อ 
         เปลี่ยนเป็น TIV-InvoicerTradeParty-008 กรณีระบุประเภทเลขประจำตัวผู้เสียภาษีอากรของผู้ออกเอกสารแทน
   
    1.2. แก้ไข (BuyerTradeParty/SpecifiedTaxRegistration/ID) เปลี่ยนเป็น (InvoicerTradeParty/SpecifiedTaxRegistration/ID)

2. แก้ไข Receipt_Schematron_2p0.sch ดังนี้ 
    
    2.1. แก้ไข RCT-InvoicerTradeParty-008 กรณีระบุประเภทเลขประจำตัวผู้เสียภาษีอากรของผู้ซื้อ 
         เปลี่ยนเป็น  RCT-InvoicerTradeParty-008 กรณีระบุประเภทเลขประจำตัวผู้เสียภาษีอากรของผู้ออกเอกสารแทน
    
    2.2.  แก้ไข (BuyerTradeParty/SpecifiedTaxRegistration/ID) เปลี่ยนเป็น (InvoicerTradeParty/SpecifiedTaxRegistration/ID)

3. แก้ไขไฟล์ DebitCreditNote_Schematron_2p0.sch ดังนี้
  
    3.1.  แก้ไข DCN-InvoicerTradeParty-008 กรณีระบุประเภทเลขประจำตัวผู้เสียภาษีอากรของผู้ซื้อ 
         เปลี่ยนเป็น DCN-InvoicerTradeParty-008 กรณีระบุประเภทเลขประจำตัวผู้เสียภาษีอากรของผู้ออกเอกสารแทน
    
    3.2.  แก้ไข (BuyerTradeParty/SpecifiedTaxRegistration/ID) เปลี่ยนเป็น (InvoicerTradeParty/SpecifiedTaxRegistration/ID)