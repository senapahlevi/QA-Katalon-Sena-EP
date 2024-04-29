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

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/img'))

WebUI.verifyElementText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Rp75.000'), 'Rp75.000')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__vehicle_number'), 
    'b 123 ctn')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__hometown'), 
    'Tangerang')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__destination_city'), 
    'Semarang')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_first_name'), 
    'Sena Pahlevi')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/p_75.000IDR'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_last_name'), 
    'Pahlevi')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_birth_place'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_birth_date'), 
    '')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_birth_date'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_7'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Pilih Kewarganegaraan'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_address'), 
    'Jl kemanggisan no 8')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Pilih Provinsi'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Bangka Belitung'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input_Pilih Kota_react-select-cities-input'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Kab. Bangka Barat'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input_Kode Pos(opsional)_zipcode'), 
    '15131')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_email'), 
    'senapahlevi1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_phone'), 
    '0812834912321')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Select'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_KTP'))

WebUI.setText(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/input__user_identity_num'), 
    '8998123891289421')

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/button_Konfirmasi  Bayar'))

WebUI.click(findTestObject('Object Repository/Personal Accident/User Purchase according to the package and price PA/div_Rp75.000'))

WebUI.closeBrowser()

