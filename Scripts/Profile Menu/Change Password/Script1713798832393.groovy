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

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Profile Menu/Change Password/input_Email address_email'), 'senapahlevi1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile Menu/Change Password/input_Password_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/button_Login'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/span_Hi sena pahlevi'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/a_Profil Saya'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/span_Pengaturan Akun_absolute inset-0'))

WebUI.setEncryptedText(findTestObject('Object Repository/Profile Menu/Change Password/input_Password Lama_old_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile Menu/Change Password/input_Password Baru_new_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile Menu/Change Password/input_Konfirmasi Password Baru_confirm_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/aside_Password Anda berhasil diubah'))

WebUI.click(findTestObject('Object Repository/Profile Menu/Change Password/p_Password Anda berhasil diubah'))

WebUI.closeBrowser()

