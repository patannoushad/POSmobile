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

Mobile.tap(findTestObject('MenuManagementObjRepo/android.widget.ImageView DownArrow'), 0)

Mobile.tap(findTestObject('MenuManagementObjRepo/android.widget.ImageView-MenuManagement'), 0)

Mobile.tap(findTestObject('MenuManagementObjRepo/android.view.View-Live'), 0)

Mobile.tap(findTestObject('MenuManagementObjRepo/android.view.View-AddButton'), 0)

Mobile.tap(findTestObject('MenuManagementObjRepo/android.widget.EditText-MenuName'), 0)

Mobile.sendKeys(findTestObject('MenuManagementObjRepo/android.widget.EditText-MenuName'), 'Menus01')

Thread.sleep(5000)

Mobile.tap(findTestObject('MenuManagementObjRepo/android.view.View (2)'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('MenuManagementObjRepo/android.widget.ImageView-X'), 0)

Thread.sleep(5000)

