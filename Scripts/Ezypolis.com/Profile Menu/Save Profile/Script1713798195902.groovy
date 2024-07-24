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

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Profile Menu/Save Profile User/input_Email address_email'), 'senapahlevi1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile Menu/Save Profile User/input_Password_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/span_Login'))

WebUI.click(findTestObject('Karir/Search and filter job User can search and filter Job/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/span_senapahlev1'))

WebUI.click(findTestObject('Profile Menu/Change Password/a_Profil Saya'))

WebUI.setText(findTestObject('Object Repository/Profile Menu/Save Profile User/input_Nama Lengkap_name'), 'sena pahlevi')

WebUI.setText(findTestObject('Object Repository/Profile Menu/Save Profile User/input__birthdate'), '')

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/input__birthdate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Profile Menu/Save Profile User/select_192419251926192719281929193019311932_872961'), 
    '2000', true)

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_20'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_Pilih Provinsi'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_DI Yogyakarta'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_Pilih Kota'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/div_Kab. Bantul'))

WebUI.setText(findTestObject('Object Repository/Profile Menu/Save Profile User/input_Nomor KTP_user_identity_num'), '1842198398192321')

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/p_Profil Anda berhasil diubah'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Save Profile User/aside_Profil Anda berhasil diubah'))

WebUI.closeBrowser()

