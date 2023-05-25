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

Mobile.startApplication('C:\\Users\\PATAN MUNNA\\Downloads\\POS_Staging_ELO_Universal_13th_May_2023_4.0.9.106 (2).apk', 
    true)

Thread.sleep(20000)

Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText -Email field'), 0)

Thread.sleep(2000)

Mobile.sendKeys(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText -Email field'), 'noushad.pathan@eigital.com')

Thread.sleep(3000)

Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText Pswd'), 0)

Thread.sleep(2000)

Mobile.sendKeys(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText Pswd'), 'Noushad@123')

Thread.sleep(2000)

Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View eye'), 0)

Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View SingIn'), 0)

Thread.sleep(25000)

//Mobile.waitForElementPresent('LoginObjectRep/android.view.View 1', 10)

Mobile.tap(findTestObject('LoginObjectRep/android.view.View 1'), 0)

Mobile.tap(findTestObject('LoginObjectRep/android.view.View 2'), 0)

Mobile.tap(findTestObject('LoginObjectRep/android.view.View 3'), 0)

Mobile.tap(findTestObject('LoginObjectRep/android.view.View 4'), 0)

Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View Enter'), 0)

Thread.sleep(5000)

