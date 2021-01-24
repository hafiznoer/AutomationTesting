import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Open Nobu Google Form
WebUI.openBrowser('https://docs.google.com/forms/d/e/1FAIpQLSctmM6X8JMOWdv2AtB7426aKQt5pRbAe4axu0eUxXaq11CYxA/viewform?fbzx=4060839759629849149')

//Click Next / Berikutnya
WebUI.click(findTestObject('Nobu Screen Update/Button_Berikutnya'))

//Set Nama
WebUI.setText(findTestObject('Nobu Screen Update/Text_nama'), 'Hafiz Muhammad Noer')

//Set NIK
WebUI.setText(findTestObject('Nobu Screen Update/Text_NIK'), 'N02561')

//Set Divisi
WebUI.setText(findTestObject('Nobu Screen Update/Text_Divisi'), 'IT Solution')

//Pilih Kendaraan
WebUI.click(findTestObject('Nobu Screen Update/RB_Kendaraan Pribadi'))

//Suhu Badan
WebUI.setText(findTestObject('Nobu Screen Update/Text_Suhu Badan'), '36.1')

//Sesak Napas
WebUI.click(findTestObject('Nobu Screen Update/button_Sesak'))

//Pneumonia
WebUI.click(findTestObject('Nobu Screen Update/button_Pneumonia'))

// Keluhan Lain
WebUI.setText(findTestObject('Nobu Screen Update/Text_Keluhan_Terakhir'), 'Tidak')

// Lokasi Kerja
WebUI.setText(findTestObject('Nobu Screen Update/Text_Lokasi Sekarang'), 'WFH')

// Suspect
WebUI.setText(findTestObject('Nobu Screen Update/text_Suspect'), 'Tidak')

// Kontak Erat
WebUI.setText(findTestObject('Nobu Screen Update/text_Kontak Erat'), 'Tidak')

// Konsultasi
WebUI.setText(findTestObject('Nobu Screen Update/text_Konsultasi Dokter'), 'Tidak')

// CT SCAN
WebUI.setText(findTestObject('Nobu Screen Update/text_CT Scan'), 'Tidak')

// SWAB
WebUI.setText(findTestObject('Nobu Screen Update/text_Swab'), 'Tidak')

//Rapid
WebUI.setText(findTestObject('Nobu Screen Update/txt_rapid_v3'), 'Tidak')

//Click Submit
WebUI.click(findTestObject('Nobu Screen Update/Button_Submit'))

//Close Browser
WebUI.closeBrowser()

