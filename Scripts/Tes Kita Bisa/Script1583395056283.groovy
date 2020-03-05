import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitabisa.com/')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/img_Bantu siapa hari ini_style__ListImageCanvas-sc-1sl4ulh-3 cTDNTQ'))

WebUI.click(findTestObject('Object Repository/Page_Hidup Sebatang Kara di Gubuk Reyot/button_DONASI SEKARANG'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/div_Rp 10000'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/div_BCA Virtual Account'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_fullname'), 
    'rizza hafidz zarkasyi')

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    '085728934340')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/svg_Sisa hari_svg-inline--fa fa-times fa-w-10 fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/button_KEMBALI KE PENGGALANGAN'))

WebUI.click(findTestObject('Object Repository/Page_Hidup Sebatang Kara di Gubuk Reyot/svg_Hidup Sebatang Kara di Gubuk Reyot_svg-inline--fa fa-arrow-left fa-w-14'))

