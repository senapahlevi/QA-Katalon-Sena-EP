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

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Hi senapahlev1'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_SelanjutnyaAsuransi Kecelakaan DiriPT M_494798'), 
    0)

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_SelanjutnyaAsuransi Kecelakaan DiriPT M_494798'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__form-field_field-input__Z28kU rounde_88b90b'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_23'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__vehicle_number'), 
    'B 13182 CF')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__hometown'), 'Tangerang')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__destination_city'), 
    'Yogyakarta')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Selanjutnya (1)'))

WebUI.doubleClick(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_first_name'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_first_name'), 
    'sena ')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_last_name'), 
    'Pahlevi')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_birth_place'), 
    'Yogyakarta')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_birth_date'), 
    '')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_birth_date'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/select_194419451946194719481949195019511952_3da7a2'), 
    '2009', true)

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_22'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Pilih Kewarganegaraan'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_address'), 
    'Jl Kenangan No 8')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Pilih Provinsi'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Banten'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input_Pilih Kota_react-select-cities-input'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Kota Tangerang Selatan'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input_Kode Pos(opsional)_zipcode'), 
    '141453')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_phone'), 
    '6281289318938913')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Select'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_KTP'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_identity_num'), 
    '1289398238918942')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Selanjutnya (2)'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/span_Konfirmasi  Bayar'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_EZYPOLIS'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Semua metode pembayaran'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_EZYPOLIS_modal-iframe'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/svg'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Virtual account_payment-page-text horizontal'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Salin'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Pembayaran berhasilRp75.000Order ID pay_9dd434'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/a_Asuransi Saya'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/td_sena  Pahlevi'))

WebUI.closeBrowser()

