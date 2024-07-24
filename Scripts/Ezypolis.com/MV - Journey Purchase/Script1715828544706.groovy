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

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input_Email address_email'), 'senapahlevi1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input_Password_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.sendKeys(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/a_Asuransi Kendaraan'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__vehicle_chassis_number'), '82183214921932132')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Cek rangka'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Comprehensive'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_--- Pilih ---'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_2023'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_--- Pilih ---'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_CITY CAR'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_--- Pilih ---'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_CHEVROLET'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_--- Pilih ---'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_ALL NEW CHEVROLET TRAX LT 1.4 AT'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_--- Pilih ---'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_DINAS  OPERATIONAL'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_--- Pilih ---'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_NEW'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Select Option'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Banten'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__vehicle_plat_number'), 'b 123 ctn')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__vehicle_color'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__vehicle_color'), 'hitam')

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__vehicle_machine_number'), 'DF 8123124213')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_KTP  SIM_absolute inset-0 bg-black bg-o_9cba2e'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_STNK_absolute inset-0 bg-black bg-opaci_3abaf0'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_BASTK_absolute inset-0 bg-black bg-opac_e351cc'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya'))

WebUI.doubleClick(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_first_name'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_first_name'), 'sena')

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_last_name'), 'pahlevis')

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_birth_place'), 'Madiune')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_birth_date'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_20'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Laki-laki_1'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Pilih Kewarganegaraan'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_address'), 'Jl kenangan no 8')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Pilih Provinsi'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_DKI Jakarta'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Nama DepanNama BelakangTempat LahirTang_059fad'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Pilih Kota'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Kota Jakarta Barat'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input_Kode Pos(opsional)_zipcode'), 
    '14314123123116')

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_email (1)'), 'senapahlevi1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_phone'), '9812839123891')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Select'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_KTP'))

WebUI.setText(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input__user_identity_num'), '8912983982489219')

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya (1)'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/input_Saya mengerti dan lanjutkan_terms-and_590fa3'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Selanjutnya_1'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/button_Konfirmasi  Bayar'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Virtual account'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/div_Virtual account_bank-list-content'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/svg'))

WebUI.click(findTestObject('Object Repository/Motor Vehicle/MV - Journey Purchase/a_Lihat Daftar Polis'))

