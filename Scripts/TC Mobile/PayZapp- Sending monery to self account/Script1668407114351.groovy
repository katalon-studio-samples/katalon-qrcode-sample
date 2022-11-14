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

Mobile.startExistingApplication('com.enstage.wibmo.hdfc')

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/OR PayZapp/android.widget.EditText - Registered Mobile number or Email ID'), 
    'mobile number', 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('OR PayZapp/android.widget.Button - 1'), 0)

Mobile.setText(findTestObject('Object Repository/OR PayZapp/android.widget.EditText - 1'), '1234', 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - Login (1)'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - WHILE USING THE APP'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.CheckBox - Dont ask again'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.TextView - Skip'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - Login (2)'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - SKIP FOR NOW'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.TextView - Sendmoney'), 0)

Mobile.tap(findTestObject('OR PayZapp/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.TextView - To Self'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.TextView -  0172'), 0)

Mobile.setText(findTestObject('Object Repository/OR PayZapp/android.widget.EditText - Amount'), '10', 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.Button - SEND'), 0)

Mobile.tap(findTestObject('Object Repository/OR PayZapp/android.widget.TextView - CONFIRM'), 0)

Mobile.closeApplication()

