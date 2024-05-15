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

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input_Email address_email'), 
    'senapahlevi1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input_Password_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.sendKeys(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/a_Asuransi Kecelakaan Diri'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_SelanjutnyaAsuransi Kecelakaan DiriPT M_494798'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/h4_Proteksi Bronze'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Proteksi Bronze'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_SelanjutnyaProteksi Bronze'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Selanjutnya'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__vehicle_number'), 
    'B 1234 ctb')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__hometown'), 'Tangerang')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__destination_city'), 
    'Semarang')

WebUI.click(findTestObject('Personal Accident/User Journey Purchase PA - Login/button_Selanjutnya - destination'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/p_75.000IDR'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_birth_place'), 
    'jakarta')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Pilih Kewarganegaraan'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_address'), 
    'Jl kenangan no 8')

WebUI.click(findTestObject('Personal Accident/User Journey Purchase PA - Login/input_Pilih Provinsi_react-select-province-input'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_DKI Jakarta'))

WebUI.click(findTestObject('Personal Accident/User Journey Purchase PA - Login/input_Pilih Kota_react-select-cities-input'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Kota Jakarta Timur'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input_Kode Pos(opsional)_zipcode'), 
    '1539423')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_Select'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/div_KTP'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/input__user_identity_num'), 
    '3128129392193293')

WebUI.click(findTestObject('Personal Accident/User Journey Purchase PA - Login/button_Selanjutnya-Bayar Personal Form'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/button_Konfirmasi  Bayar'))

WebUI.switchToFrame(findTestObject('Midtrans Snap.js/iframe id midtrans object'), 3)

WebUI.click(findTestObject('Midtrans Snap.js/iframe - midtrans va'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Midtrans Snap.js/iframe - midtrans - bca selected va'), 5)

WebUI.click(findTestObject('Midtrans Snap.js/iframe - midtrans - bca selected va'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Midtrans Snap.js/svg - Close'), 5)

WebUI.waitForElementClickable(findTestObject('Midtrans Snap.js/svg - Close'), 5)

WebUI.click(findTestObject('Midtrans Snap.js/svg - Close'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Personal Accident/User Journey Purchase PA - Login/div_Lihat_Daftar_Polis'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Journey Purchase PA - Login/td_sena pahlevi'))

WebUI.closeBrowser()

