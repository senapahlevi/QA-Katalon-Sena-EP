import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.ezypolis.com:3001/')

WebUI.findWebElements(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_EzyPolis - Asuransi SeEzyItu/a_Produk Asuransi Lainnya'), 
    0)

WebUI.click(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_EzyPolis - Asuransi SeEzyItu/a_Produk Asuransi Lainnya'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Other Insurance/Validation missing fields/h5_Asuransi Kesehatan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Pilih Asuransi Terbaikmu - EzyPolis/button_Ajukan Sekarang'))

WebUI.setText(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/input_Nama_customer_name'), 
    'Sena')

WebUI.setText(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/input_Email_customer_email'), 
    'senapahlevi2@gmail.com')

WebUI.setText(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/input_Nama Perusahaan (Opsional)_customer_company'), 
    'PT ABCD')

WebUI.setText(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/input_Nomor Handphone_customer_phone'), 
    '081231294201')

WebUI.setText(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/textarea_Catatan (Opsional)_customer_note'), 
    'Saya ingin membeli asuransi kesehatan ....')

WebUI.click(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/button_Kirim'))

WebUI.click(findTestObject('Other Insurance/User Journey for Purchasing Other Insurance/Page_Asuransi Kesehatan - EzyPolis/div_Terima Kasih. Pengajuan Asuransi Anda b_772255'))

