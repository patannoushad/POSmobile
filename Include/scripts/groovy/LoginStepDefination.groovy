import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStepDefination {

	@Given("User navigate to login screen")
	def User_navigate_to_login_screen() {
		println ("User navigate to login screen")
		Mobile.startApplication('C:\\Users\\PATAN MUNNA\\Downloads\\POS_Staging_ELO_Universal_13th_May_2023_4.0.9.106.apk', true)

		Thread.sleep(20000)

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText -Email field'), 0)

		Thread.sleep(2000)
	}

	@When("User enter (.*) and (.*)")
	def User_enter_username_and_password(String username, String password) {
		println ("User ented username and password")
		Mobile.sendKeys(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText -Email field'), 'noushad.pathan@eigital.com')

		Thread.sleep(3000)

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText Pswd'), 0)

		Thread.sleep(2000)

		Mobile.sendKeys(findTestObject('Object Repository/LoginObjectRep/android.widget.EditText Pswd'), 'Noushad@123')

		Thread.sleep(2000)

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View eye'), 0)

		Thread.sleep(2000)
	}

	@And("Tap on login button")
	def Tap_on_login_button() {
		println ("logIn button")

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View SingIn'), 0)

		Thread.sleep(20000)
	}

	@And("Eneterd the PIN")
	def Entered_the_PIN() {
		println ("Entered the PIN")

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View 1'), 0)

		Thread.sleep(3000)

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View 2'), 0)

		Thread.sleep(3000)

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View 3'), 0)

		Thread.sleep(3000)

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View 4'), 0)

		Thread.sleep(3000)
	}

	@Then("User Successfuly login")
	def User_Successfuly_login() {
		println("Successfuly login")

		Mobile.tap(findTestObject('Object Repository/LoginObjectRep/android.view.View Enter'), 0)

		Thread.sleep(5000)
	}
}