package pageobjectfactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert; 

//id="ctl00_ContentPlaceHolder1_lblCallStatus"
public class RequestsAtAGlancePOF {
	
	//Call Status same ID for all 
	@FindBy (id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement CallStatus;

	
	//Service Request Bucket
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement SRAwaitingETABucket;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement SRConfirmedETABucket;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
	WebElement SROnsiteBucket;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
	WebElement SRAdditionalWorkBucket;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl04_HyperlinkCatDet")
	WebElement SRPartOrderBucket;
	//after clicking into bucket sub status 
	@FindBy(id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRAwaitingETABucketAssert ;
	@FindBy(id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRConfirmedAssert ;
	@FindBy(id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SROnsiteAssert;
	@FindBy(id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRAdditionalWorkAssert ;
	@FindBy(id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRPartOrderAssert ;
	
	
	
	//Quotes.Estimates Bucket 
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_ImageExpCol")
	WebElement Quotesbtn;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement UnderReview;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement NeedsApprovalQuote;
	@FindBy (id="ctl00_ContentPlaceHolder1_rptrSRData_ctl03_hlSR#")
	WebElement NeedsApprovalSRApprove;
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlQapproval")
	WebElement QuoteStatusDropDown;
	@FindBy (id="ctl00_ContentPlaceHolder1_btnQapprovall")
	WebElement QuoteStatusSubmit;
	@FindBy (id="ctl00_ContentPlaceHolder1_rptrSRData_ctl04_hlSR#")
	WebElement NeedsApprovalSRDecline;
	@FindBy (id="ctl00_ContentPlaceHolder1_quotesGrid_ctl02_quoteDetailsLink")
	WebElement QuoteDetailLink;
	
	
	//ctl00_ContentPlaceHolder1_lblQuoteStatus
	@FindBy (id="ctl00_ContentPlaceHolder1_btnQapprovall")
	WebElement StatusConfirmation;

	
	
	
	//Completed Requests Bucket
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_ImageExpCol")
	WebElement CompletedRequestsbtn;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement ToBeBilled;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement Billed;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
	WebElement Other;
	
	//RFPs in Progress
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_ImageExpCol")
	WebElement RFPinProgressbtn;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement Created;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement Submitted;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
	WebElement ResponseReceived;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
	WebElement NeedsApprovalrfp;
	
	//CompletedRFPs
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl04_ImageExpCol")
	WebElement CompletedRfpbtn;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl04_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement ApprovedRfp;
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl04_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement CancelledRfp; 
	
	//PMs 
	@FindBy(id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl05_HyperlinkCat")
	WebElement PMbtn;


	
	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;


}

//METHODS
	//Service Requests In Progress Methods 

public void AwaitingEtabucket(){
	SRAwaitingETABucket.click();
	
}

public void ConfirmedETAbucket(){
	SRConfirmedETABucket.click();
}
public void Onsitebucket(){
	SROnsiteBucket.click();
}
public void Additionalworkbucket(){
	SRAdditionalWorkBucket.click();
}
public void PartsOnOrderBucket(){
	SRPartOrderBucket.click();
}
//
public void AwaitingEtabucketAssertion(){
	Assert.assertTrue(SRAwaitingETABucketAssert.getText().contains("Awaiting ETA"), "Incorrect Page, SR list does not match status selected ");
}

public void ConfirmedETAbucketAssertion(){
	Assert.assertTrue(SRConfirmedAssert.getText().contains("Confirmed ETA"), "Incorrect Page, SR list does not match status selected ");
}
public void OnsitebucketAssertion(){
	Assert.assertTrue(SROnsiteAssert.getText().contains("On Site"), "Incorrect Page, SR list does not match status selected ");
}
public void AdditionalworkbucketAssertion(){
	Assert.assertTrue(SRAdditionalWorkAssert.getText().contains("Additional Work Needed"), "Incorrect Page, SR list does not match status selected ");
}
public void PartsOnOrderBucketAssertion(){
	Assert.assertTrue(SRPartOrderAssert.getText().contains("Parts on Order"), "Incorrect Page, SR list does not match status selected ");
}


//Quotes.Estimates Methods 
public void Quotebtnclick (){
	Quotesbtn.click();
}


public void UnderReviewclick(){
UnderReview.click();
}

public void NeedingApprovalclick(){
NeedsApprovalQuote.click();
}
public void NeedingApprovalSR1click(){
	NeedsApprovalSRApprove.click();
}

public void NeedingApprovalSR2click(){
	NeedsApprovalSRDecline.click();
}

public void UnderReviewStatus(){
	
}
public void UnderReviewassert(){
	Assert.assertTrue(CallStatus.getText().contains("Under FSN Review"), "Incorrect Page, SR list does not match status selected ");

}

public void NeedingApprovalassert(){
	Assert.assertTrue(CallStatus.getText().contains("Needing Approval"), "Incorrect Page, SR list does not match status selected ");

}

public void QuoteStatusoptionConfirmation(){
	QuoteDetailLink.click();
	Select Quotestatusdd= new Select(QuoteStatusDropDown);
	Quotestatusdd.selectByVisibleText("Decline");
	QuoteStatusDropDown.click();
	Quotestatusdd.selectByVisibleText("Request Revised Quote");
	QuoteStatusDropDown.click();
	Quotestatusdd.selectByVisibleText("Approve");

	
}

public void QuoteStatusApproval(){
	QuoteDetailLink.click();
	Select Quotestatusdd= new Select(QuoteStatusDropDown);
	Quotestatusdd.selectByVisibleText("Approve");
	QuoteStatusSubmit.click();
	Assert.assertTrue(StatusConfirmation.getText().contains("Approve"), "Approval Status selected does not match approval status on confirmatikon page");

}

public void QuoteStatusDecline(){
	QuoteDetailLink.click();
	Select Quotestatusdd= new Select(QuoteStatusDropDown);
	Quotestatusdd.selectByVisibleText("Decline");
	QuoteStatusSubmit.click();
	Assert.assertTrue(StatusConfirmation.getText().contains("Decline"), "Approval Status selected does not match approval status on confirmatikon page");
	
}
/*SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
Thread.sleep(3000);
SelectSitebox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
Select siteareadd= new Select(SiteAreaDropDown);
Thread.sleep(3000);
siteareadd.selectByVisibleText("Core Store");
Select subsiteareadd= new Select(SubSiteAreaDropDown);
Thread.sleep(3000);
subsiteareadd.selectByVisibleText("Sales floor");
Select typeofservicedd= new Select(TypeofService);
Thread.sleep(3000);
typeofservicedd.selectByVisibleText("Automatic Doors");
Select reasondd= new Select(ReasonForCall);
Thread.sleep(3000);
reasondd.selectByVisibleText("Off Track");
RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
DetailedDescription.sendKeys("brokenalarm");
Submitbtn.click();
wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
SRConfirmationLink.click();
String urlsrconfirmation= driver.getCurrentUrl();
Assert.assertTrue(urlsrconfirmation.contains("http://www.ourfsn.com/myfsn/SRdetail.aspx?"), "SR processing unsuccessful");
*/

//Completed Requests Methods 

public void completedrequestsclick(){
CompletedRequestsbtn.click();

}
public void Tobebilledclick(){
ToBeBilled.click();

}
public void TobebilledAssertion(){
	Assert.assertTrue(CallStatus.getText().contains("Completed (To Be Billed)"), "Incorrect Page, SR list does not match status selected ");


}
public void billedclick(){
Billed.click();

}
public void billedassertion(){
	Assert.assertTrue(CallStatus.getText().contains("Completed (Billed)"), "Incorrect Page, SR list call status does not match status selected ");


}
public void otherclick(){
Other.click();

}
public void Otherassertion(){
	Assert.assertTrue(CallStatus.getText().contains("Completed (Other)"), "Incorrect Page, SR list call status does not match status selected ");


}
//RFPs in progress method 
public void RFPinProgressbtnclick(){
RFPinProgressbtn.click();

}
public void CreatedClick(){
Created.click();

}
public void SubmittedClick(){
Submitted.click();

}
public void ResponseReceivedClick(){
ResponseReceived.click();

}
public void NeedsApprovalClickrfp(){
NeedsApprovalrfp.click();

}

public void Createdassertion(){
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrrfp"), "Incorrect Page, SR list call status does not match status selected ");


}
public void Submittedassertion(){
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custsrfp"), "Incorrect Page, SR list call status does not match status selected ");

}
public void ResponseReceivedassertion(){
	String url = driver.getCurrentUrl();
	url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custsrfp"), "Incorrect Page, SR list call status does not match status selected ");

}
public void NeedsApprovalrfpssertion(){
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custprfp"), "Incorrect Page, SR list call status does not match status selected ");

}

// Completed RFPs Methods
public void CompletedRFPsclick (){
CompletedRfpbtn.click();
}
public void Approvedclick (){
ApprovedRfp.click();
}
public void Cancelledclick (){
CancelledRfp.click();
}
public void Approvedrfpassertion(){
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrfp"), "Incorrect Page, SR list call status does not match status selected ");

}
public void Canceledrfpassertion(){
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrfp"), "Incorrect Page, SR list call status does not match status selected ");

}

// PM Method 
public void PMclick (){
PMbtn.click();
}

public void PMassertion(){
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/CommonObjects/PMBucketsByMonths.aspx"), "Incorrect Page, SR list call status does not match status selected ");

}
}

