package Stepdefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Hookstart.hookstart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdefination {
	
	WebDriver driver=hookstart.driver;
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		Thread.sleep(2000);
		try {
			String actual = "My Organization - My education";
			String expected = driver.getTitle();
			Assert.assertEquals(expected, actual);
			System.out.println("User is on the Elearning site "+expected);
		}
		catch(Exception e){
			System.out.println("User is not on the Elearning site"+e);
			Assert.fail();
		}

	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			WebElement search = driver.findElement(By.name("login"));
			String search4 = search.getAttribute("value");
			WebElement search1 = driver.findElement(By.name("password"));
			String search41 = search.getAttribute("value");
			if(search4.isEmpty() && search41.isEmpty()) {
				driver.findElement(By.name("login")).sendKeys("abxy11");
				driver.findElement(By.name("password")).sendKeys("abxy21");
				System.out.println("User has put the values in the login field");
			}
			else {
				System.out.println("login field is empty");
				Assert.fail();
			}
			
	
		}
		catch(Exception e){
			System.out.println("User is not able to put values"+e);
			Assert.fail();
		}

	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.name("login"));
			String search4 = search.getAttribute("value");
			WebElement search1 = driver.findElement(By.name("password"));
			String search41 = search.getAttribute("value");
			if(!search4.isEmpty() && !search41.isEmpty()) {
				driver.findElement(By.name("submitAuth")).click();
				System.out.println("User is able to click login button");
			}
			else {
				System.out.println("login field is empty");
				Assert.fail();
			}
			
		}
		catch(Exception e){
			System.out.println("User is not able to click login"+e);
			Assert.fail();
		}
	
	}

	@Then("^User gets redirected to the dashboard$")
	public void user_gets_redirected_to_the_dashboard() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual = "Hello ABC XYZ and welcome,";
			String expected = driver.findElement(By.xpath("//div[@class='normal-message']/p[1]")).getText();
			Assert.assertEquals(expected, actual);
			System.out.println("User is on the dashboard : "+expected);
		}
		catch(Exception e){
			System.out.println("User failed to login"+e);
			Assert.fail();
		}

	}

	@Then("^User clicks on the social network on the menu bar$")
	public void user_clicks_on_the_social_network_on_the_menu_bar() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		
		try {
			driver.findElement(By.xpath("//li[@class='social-network ']")).click();
			System.out.println("User is able to click on social network");
		}
		catch(Exception e){
			System.out.println("User is not able to click on social network"+e);
			Assert.fail();
		}
	}

	@Then("^User gets redirected to the social network page$")
	public void user_gets_redirected_to_the_social_network_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual2 = "Social network";
			String expected2 = driver.findElement(By.xpath("//ul[@class='breadcrumb']")).getText();
			Assert.assertEquals(expected2, actual2);
			System.out.println("User is on social network page"+expected2);
		}
		catch(Exception e){
			System.out.println("User is not on social network page"+e);
			Assert.fail();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("^User enters the\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"in the comment field$")
	public void user_enters_the_in_the_comment_field(String alph, String num, String specialchar, String blank) throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.name("social_wall_new_msg_main")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.name("social_wall_new_msg_main")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.name("social_wall_new_msg_main")).sendKeys(specialchar);
			Thread.sleep(1000);
			driver.findElement(By.name("social_wall_new_msg_main")).sendKeys(blank);
			Thread.sleep(1000);
			System.out.println("User is able to put values in comment field");
		}
		catch(Exception e){
			System.out.println("User is not able to put values in comment field"+e);
			Assert.fail();
		}

	}

	@When("^User clicks the post button$")
	public void user_clicks_the_post_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.name("social_wall_new_msg_main"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.name("wall_post_button")).click();
				System.out.println("User is able to click post button");
			}
			else {
				System.out.println("comment text area is empty");
				Assert.fail();
			}
			
		}
		catch(Exception e){
			System.out.println("User is not able to click on post button"+e);
			Assert.fail();
		}

	}


	@Then("^User views his posted comment$")
	public void user_views_his_posted_comment() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual2 = "svdfavfjs12321@$%&";
			String expected2 = driver.findElement(By.xpath("//div[@class='msg-content']")).getText();
			Assert.assertEquals(expected2, actual2);
			System.out.println("User has posted the comment : "+expected2);
		}
		catch(Exception e){
			System.out.println("User has not posted the comment "+e);
			Assert.fail();
		}

	}
	
	@Then("^User verifies the comment for (\\d+) characters$")
	public void user_verifies_the_comment_for_characters(int arg1) throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual2 = "svdfavfjs12321@$%&";
			String expected2 = driver.findElement(By.xpath("//div[@class='msg-content']")).getText();
			Assert.assertEquals(expected2, actual2);
			System.out.println("User has posted the comment : "+expected2);
			int len = expected2.length();
			if(len<256) {
				System.out.println("User has entered comment less than 256 characters");
			}
			else {
				System.out.println("User has entered comment more than 256 characters");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User has entered comment more than 256 characters "+e);
			Assert.fail();
		}

	}

	@Then("^User replies to the posted comment \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_replies_to_the_posted_comment(String alph, String num, String specialchar, String blank){
	    // Write code here that turns the phrase above into concrete actions
		try {
			driver.findElement(By.name("comment")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.name("comment")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.name("comment")).sendKeys(specialchar);
			Thread.sleep(1000);
			driver.findElement(By.name("comment")).sendKeys(blank);
			Thread.sleep(1000);
			System.out.println("User is able to put values in reply comment");
		}
		catch(Exception e){
			System.out.println("User is not able to put values in reply comment"+e);
			Assert.fail();
		}	
	}
	
	@Then("^User clicks on post button$")
	public void user_clicks_on_post_button(){
	    // Write code here that turns the phrase above into concrete actions
		try {
			WebElement search = driver.findElement(By.name("comment"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.name("social_wall_new_msg_submit")).click();
				System.out.println("User is able to click post button");
			}
			else {
				System.out.println("comment text area is empty");
				Assert.fail();
			}
			
		}
		catch(Exception e){
			System.out.println("User is not able to click on post button"+e);
			Assert.fail();
		}
	}
	
	


	@Then("^User deletes the reply$")
	public void user_deletes_the_reply() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		try {
			String s4=driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 social-post-answers']//preceding::span[2]")).getText();
			System.out.println(s4);
			driver.findElement(By.xpath("//span[contains (text(),'"+s4+"')]//following::a[starts-with(@id,'message')]")).click();
			System.out.println("User has deleted the reply to the post");
		}
		catch(Exception e){
			System.out.println("User is not able to delete the reply to the post" +e);
			Assert.fail();
		}
	
	}

	@Then("^User delets the comment$")
	public void user_delets_the_comment() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String s5=driver.findElement(By.xpath("//div[@class='msg-content']//child::div[1]")).getText();
			driver.findElement(By.xpath("//div[contains(text(),'"+s5+"')]//preceding::a[starts-with(@id,'message')]")).click();
			System.out.println("User has deleted the post");
		}
		catch(Exception e){
			System.out.println("User is not able to delete the post" +e);
			Assert.fail();
		}
	
	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("^User enters a string \"([^\"]*)\" in the friends search field$")
	public void user_enters_a_character_in_the_friends_search_field(String str){
	    // Write code here that turns the phrase above into concrete actions
		try {
			WebElement search = driver.findElement(By.name("q"));
			String search1 = search.getAttribute("value");
			
			if(search1.isEmpty())
			{
			   System.out.println("Input field is empty");
			   search.sendKeys(str);
			   System.out.println("User has put values");
			}
		}
		catch(Exception e){
			System.out.println("User is not able put value" +e);
			Assert.fail();
		}

	}


	@Then("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			WebElement search = driver.findElement(By.name("q"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty() || search4.isEmpty()) {
				driver.findElement(By.xpath("//div[@class='input-group-btn']//child::button[1]")).click();
				System.out.println("User is able to click search button");
			}
			else {
				System.out.println("User is not able to click search button");
				Assert.fail();
			}
		}
			
		catch(Exception e){
			System.out.println("User is not able to click" +e);
			Assert.fail();
		}

	}

	@Then("^User gets redirected to the search page$")
	public void user_gets_redirected_to_the_search_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = "Social network";
			String expected4 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[1]")).getText();
			String actual41 = "Search";
			String expected41 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[2]")).getText();

			Assert.assertEquals(expected4, actual4);
			Assert.assertEquals(expected41, actual41);
			System.out.println(expected4+"/"+expected41);
			System.out.println("User is on search page");
			
		
		}
		catch(Exception e){
			System.out.println("User is not on search page" +e);
			Assert.fail();
		}

	}
	
	@Then("^User verifies the result$")
	public void user_verifies_the_result() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
		String user="Users";
		String group="Groups";
		
		String user1 = driver.findElement(By.xpath("//a[contains(text(),'Users')]")).getText();
		
		
		if(user1.contains(user)) {
			System.out.println("User can view the related results");
		}
		else{
			String group1 = driver.findElement(By.xpath("//a[contains(text(),'Groups')]")).getText();
			
			if(group1.contains(group)) {
				System.out.println("User can view the related results");
			}
			else {
				String no=driver.findElement(By.xpath("//div[contains(text(),'Sorry no results')]")).getText();
				System.out.println(no);
				System.out.println("User is not able to view results");
				Assert.fail();
			}
		}
		}
		catch(Exception e){
			System.out.println("User is not able to view results" +e);
			Assert.fail();
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("^User clicks on the search button while field is null$")
	public void user_clicks_on_the_search_button_while_field_is_null() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			
			WebElement search = driver.findElement(By.name("q"));
			String search3 = search.getAttribute("value");
			
			if(search3.isEmpty() || !search3.isEmpty())
			{
			   driver.findElement(By.xpath("//div[@class='input-group-btn']//child::button[1]")).click();
			   System.out.println("User has clicked the search button");
			}	
			
			else {
				System.out.println("User is not able to click search button");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click search button" +e);
			Assert.fail();
		}

	}

	@Then("^User gets redirected to the detailed search page area$")
	public void user_gets_redirected_to_the_detailed_search_page_area() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = "Social network";
			String expected4 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[1]")).getText();
			String actual41 = "Search";
			String expected41 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[contains(text(),'Search')]")).getText();

			Assert.assertEquals(expected4, actual4);
			Assert.assertEquals(expected41, actual41);
			System.out.println("User is not on search page : "+expected4+"/"+expected41);
			
		
		}
		catch(Exception e){
			System.out.println("User is not on search page" +e);
			Assert.fail();
		}


	}

	@Then("^User enters \"([^\"]*)\" letter or word in the search field$")
	public void user_enters_letter_or_word_in_the_search_field(String str1){
	    // Write code here that turns the phrase above into concrete actions
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			
			if(search4.isEmpty())
			{
			   System.out.println("Input field is empty");
			   search.sendKeys(str1);
			   System.out.println("User is able to put value"+str1);
			}
		}
		catch(Exception e){
			System.out.println("User is not able put value" +e);
			Assert.fail();
		}

	}

	@Then("^User selects User from drop down options$")
	public void user_selects_User_from_drop_down_options() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[@class='filter-option-inner']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='inner open']//following::a[1]//child::span[contains(text(),'User')]")).click();
			System.out.println("User has selected user option");
		}
		catch(Exception e){
			System.out.println("User is not able to select option" +e);
			Assert.fail();
		}

	}

	@Then("^User clicks on search icon$")
	public void user_clicks_on_search_icon() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.xpath("//button[@name='submit']")).click();
				System.out.println("User is able to click search");
			}
			else {
				System.out.println("Search field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click search" +e);
			Assert.fail();
		}

	}

	@Then("^User is able to see the related user results$")
	public void user_is_able_to_see_the_related_user_results() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
		String user="Users";
		String user1 = driver.findElement(By.xpath("//a[contains(text(),'Users')]")).getText();
		
		
		if(user1.contains(user)) {
			System.out.println("User can view the User related results");
		}
		else{
				System.out.println("User is not able to view User related results");
				Assert.fail();	
		}
		}
		catch(Exception e){
			System.out.println("User is not able to view results" +e);
			Assert.fail();
		}

	}
	
	@Then("^User selects Groups from drop down field options$")
	public void user_selects_Groups_from_drop_down_field_options() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[@class='filter-option-inner']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='inner open']//following::a[1]//child::span[contains(text(),'Group')]")).click();
			System.out.println("User has selected groups option");
		}
		catch(Exception e){
			System.out.println("User is not able to select option" +e);
			Assert.fail();
		}
		
	
	}

	@Then("^User clicks on search button$")
	public void user_clicks_on_search_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.xpath("//button[@name='submit']")).click();
			}
			else {
				System.out.println("Search field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click search" +e);
			Assert.fail();
		}

	}

	@Then("^User is able to see the groups related results$")
	public void user_is_able_to_see_the_groups_related_results() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
		String group="Groups";
		String group1 = driver.findElement(By.xpath("//a[contains(text(),'Groups')]")).getText();
		
		
		if(group1.contains(group)) {
			System.out.println("User can view the Group related results");
		}
		else{
				System.out.println("User is not able to view Group related results");
				Assert.fail();	
		}
		}
		catch(Exception e){
			System.out.println("User is not able to view results" +e);
			Assert.fail();
		}

	}

	@Then("^User selects select from drop down field$")
	public void user_selects_select_from_drop_down_field() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[@class='filter-option-inner']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Select')]")).click();
			System.out.println("User has selected select option");
		}
		catch(Exception e){
			System.out.println("User is not able to select option" +e);
			Assert.fail();
		}

	}

	@Then("^User clicks on search tab$")
	public void user_clicks_on_search_tab() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.xpath("//button[@name='submit']")).click();
			}
			else {
				System.out.println("Search field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click search" +e);
			Assert.fail();
		}

	}

	@Then("^User is able to see both the user and groups related results$")
	public void user_is_able_to_see_both_the_user_and_groups_related_results() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
		String user="Users";	
		String user1 = driver.findElement(By.xpath("//a[contains(text(),'Users')]")).getText();
		String group="Groups";
		String group1 = driver.findElement(By.xpath("//a[contains(text(),'Groups')]")).getText();
		
		
		if(user1.contains(user) && group1.contains(group)) {
			System.out.println("User can view both User and Group related results");
		}
		else{
				System.out.println("User is not able to view related results");
				Assert.fail();	
		}
		}
		catch(Exception e){
			System.out.println("User is not able to view results" +e);
			Assert.fail();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	@When("^User clicks on the search button while field is empty$")
	public void user_clicks_on_the_search_button_while_field_is_empty() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			
			WebElement search = driver.findElement(By.name("q"));
			String search3 = search.getAttribute("value");
			
			if(search3.isEmpty() || !search3.isEmpty())
			{
			   driver.findElement(By.xpath("//div[@class='input-group-btn']//child::button[1]")).click();
			   System.out.println("User is able to click on search");
			   
			}	
			
			else {
				System.out.println("User is not able to click");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click on search" +e);
			Assert.fail();
		}

	}

	@Then("^User again gets redirected to the detailed search page$")
	public void user_again_gets_redirected_to_the_detailed_search_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = "Social network";
			String expected4 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[1]")).getText();
			String actual41 = "Search";
			String expected41 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[contains(text(),'Search')]")).getText();

			Assert.assertEquals(expected4, actual4);
			Assert.assertEquals(expected41, actual41);
			System.out.println(expected4+"/"+expected41);
			
		
		}
		catch(Exception e){
			System.out.println("User is not on search page" +e);
			Assert.fail();
		}

	}

	@Then("^User enters a \"([^\"]*)\" letter or word in the search field$")
	public void user_enters_a_letter_or_word_in_the_search_field(String str2){
	    // Write code here that turns the phrase above into concrete actions
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			
			if(search4.isEmpty())
			{
			   System.out.println("Input field is empty");
			   search.sendKeys(str2);
			   
			}
		}
		catch(Exception e){
			System.out.println("User is not able put value" +e);
			Assert.fail();
		}

	}

	@Then("^User selects User from drop down field$")
	public void user_selects_User_from_drop_down_field() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[@class='filter-option-inner']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='inner open']//following::a[1]//child::span[contains(text(),'User')]")).click();
			System.out.println("User is able to select option");
		}
		catch(Exception e){
			System.out.println("User is not able to select option" +e);
			Assert.fail();
		}

	}

	@Then("^User clicks search$")
	public void user_clicks_search() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.xpath("//button[@name='submit']")).click();
			}
			else {
				System.out.println("Search field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click search" +e);
			Assert.fail();
		}

	}

	@Then("^User is able to see the user related results$")
	public void user_is_able_to_see_the_user_related_results() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
		String user="Users";
		String user1 = driver.findElement(By.xpath("//a[contains(text(),'Users')]")).getText();
		
		
		if(user1.contains(user)) {
			System.out.println("User can view the User related results");
		}
		else{
				System.out.println("User is not able to view User related results");
				Assert.fail();	
		}
		}
		catch(Exception e){
			System.out.println("User is not able to view results" +e);
			Assert.fail();
		}

	}
	
	@Then("^User clicks on send invitation to a specific user$")
	public void user_clicks_on_send_invitation_to_a_specific_user(){
	    // Write code here that turns the phrase above into concrete actions
		try {
			driver.findElement(By.xpath("//div[@id='user_card_3745']//child::div[@class='btn-group pull-right']//child::a[1]")).click();
			System.out.println("User has clicked on invite user");
		}
		catch(Exception e){
			System.out.println("User is not able to click on invite user" +e);
			Assert.fail();
		}
	}

	@Then("^User is able to view a popup window$")
	public void user_is_able_to_view_a_popup_window() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual4 = "Send invitation";
			String expected4 = driver.findElement(By.xpath("//h4[@id='send-invitation-modal-title']")).getText();		
			Assert.assertEquals(expected4, actual4);
			System.out.println(expected4);
			System.out.println("User is able to see popup window");
		}
		catch(Exception e){
			System.out.println("User is not able to view invite popup window" +e);
			Assert.fail();
		}

	}

	@Then("^User enters the message \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_the_message(String alph, String num, String specialchar, String blank){
	    // Write code here that turns the phrase above into concrete actions
		try {
			driver.findElement(By.xpath("//textarea[@id='content_invitation_id']")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_invitation_id']")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_invitation_id']")).sendKeys(specialchar);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_invitation_id']")).sendKeys(blank);
			Thread.sleep(1000);
			System.out.println("User is able to enter the message in invite area");
		}
		catch(Exception e){
			System.out.println("User is not able to enter the message in invite area" +e);
			Assert.fail();
		}

	}

	@Then("^User click on send invitation button$")
	public void user_click_on_send_invitation_button(){
try {
			
			WebElement search = driver.findElement(By.xpath("//textarea[@id='content_invitation_id']"));
			String search3 = search.getAttribute("value");
			
			if(!search3.isEmpty())
			{
			   driver.findElement(By.xpath("//button[@id='btn-send-invitation']")).click();
			   System.out.println("User clicked the send button");
			   
			}	
			
			else {
				System.out.println("The text field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click on send" +e);
			Assert.fail();
		}
	
	}

	@Then("^User verifies the message is sent$")
	public void user_verifies_the_message_is_sent() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual4 = "The invitation has been sent";
			String actual41="You already sent an invitation";
			String expected4 = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']/div[1]")).getText();
			
			if(expected4.contains(actual4)) {
				Assert.assertEquals(expected4, actual4);
				System.out.println(expected4);
				System.out.println("User is able to send the invitation");
			}
			else if(expected4.contains(actual41)) {
				Assert.assertEquals(expected4, actual41);
				System.out.println(expected4);
				System.out.println("User is able to send the invitation");
			}
			else {
				System.out.println("User is not able to send the invitation");
				Assert.fail();
			}
	
			System.out.println(expected4);
			System.out.println("User is able to send the invitation");
		}
		catch(Exception e){
			System.out.println("User is not able to send the invitation" +e);
			Assert.fail();
		}

	}

	@Then("^User clicks on the send message button$")
	public void user_clicks_on_the_send_message_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[@id='user_card_3745']//child::div[@class='btn-group pull-right']//child::a[2]")).click();
			System.out.println("User has clicked on send message");
		}
		catch(Exception e){
			System.out.println("User is not able to click on invite user" +e);
			Assert.fail();
		}

	}

	@Then("^User is able to view the send message popup window$")
	public void user_is_able_to_view_the_send_message_popup_window() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual4 = "Send message";
			String expected4 = driver.findElement(By.xpath("//h4[@id='global-modal-title']")).getText();		
			Assert.assertEquals(expected4, actual4);
			System.out.println(expected4);
			System.out.println("User is able to see message popup window");
		}
		catch(Exception e){
			System.out.println("User is not able to view message popup window" +e);
			Assert.fail();
		}

	}

	@Then("^User enters title \"([^\"]*)\" and message \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_title_and_message(String title, String alph, String num, String splchar, String blank){
	    // Write code here that turns the phrase above into concrete actions
		try {
			driver.findElement(By.xpath("//input[@id='subject_id']")).sendKeys(title);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_id']")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_id']")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_id']")).sendKeys(splchar);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='content_id']")).sendKeys(blank);
			Thread.sleep(1000);
			System.out.println("User is able to enter the message in message popup");
		}
		catch(Exception e){
			System.out.println("User is not able to enter the message in message popup" +e);
			Assert.fail();
		}
	
	}
	
	@Then("^User clicks on the send this message button$")
	public void user_clicks_on_the_send_this_message_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {

		WebElement search = driver.findElement(By.xpath("//textarea[@id='content_id']"));
		String search3 = search.getAttribute("value");
		
		if(!search3.isEmpty())
		{
		   driver.findElement(By.xpath("//a[@id='send_message_link']")).click();
		   System.out.println("User clicked the send button");
		   
		}	
		
		else {
			System.out.println("The text field is empty");
			Assert.fail();
		}
	}
	catch(Exception e){
		System.out.println("User is not able to click on send" +e);
		Assert.fail();
	}

	}

	@Then("^User verifies if the message is sent$")
	public void user_verifies_if_the_message_is_sent() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual4 = "Your message has been sent.";
			String expected4 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();		
			Assert.assertEquals(expected4, actual4);
			System.out.println(expected4);
			System.out.println("User is able to send message");
		}
		catch(Exception e){
			System.out.println("User is not able to send message" +e);
			Assert.fail();
		}

	}

	@Then("^User closes the popup window$")
	public void user_closes_the_popup_window(){
	    // Write code here that turns the phrase above into concrete actions
		try{
			driver.findElement(By.xpath("//div[@id='global-modal']//span[1]")).click();
			System.out.println("User is has closed the message window");
		}
		catch(Exception e){
			System.out.println("User is not able to close window" +e);
			Assert.fail();
		}

	}


	@Then("^User clicks over users name \\(wish to send post with\\)$")
	public void user_clicks_over_users_name_wish_to_send_post_with() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//a[contains (text(),'Jerry Dam')]")).click();
			String usr = driver.findElement(By.xpath("//a[contains (text(),'Jerry Dam')]")).getText();
			System.out.println("User has clicked over "+usr);

		}
		catch(Exception e){
			System.out.println("User is not able to click over users name" +e);
			Assert.fail();
		}

	}

	@Then("^User gets redirected to the users social wall$")
	public void user_gets_redirected_to_the_user_s_social_wall() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = "Jerry Dam";
			String expected4 = driver.findElement(By.xpath("//li[contains (text(),'Jerry Dam')]")).getText();
			String actual41 = "Social";
			String expected41 = driver.findElement(By.xpath("//li[contains (text(),'Social')]")).getText();

			Assert.assertEquals(expected4, actual4);
			Assert.assertEquals(expected41, actual41);
			System.out.println(expected4+"/"+expected41);
			
		
		}
		catch(Exception e){
			System.out.println("User is not on search page" +e);
			Assert.fail();
		}

	}

	@When("^User enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters(String alph, String num, String specialchar, String blank){
	    // Write code here that turns the phrase above into concrete actions
		try {
			driver.findElement(By.xpath("//textarea[@name='social_wall_new_msg_main']")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@name='social_wall_new_msg_main']")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@name='social_wall_new_msg_main']")).sendKeys(specialchar);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@name='social_wall_new_msg_main']")).sendKeys(blank);
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println("User is not able to put values"+e);
			Assert.fail();
		}

	}

	@When("^User clicks post button$")
	public void user_clicks_post_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//button[@name='wall_post_button']")).click();
		}
		catch(Exception e){
			System.out.println("User is not able to click on post button"+e);
			Assert.fail();
		}


	}

	@Then("^User views the uploaded post \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_views_the_uploaded_post(String aplh, String num, String spl, String blank) throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = aplh+num+spl+blank;
			String expected4 = driver.findElement(By.xpath("//div[@class='msg-content']//child::div[1]")).getText();
			
			if(expected4.contains(actual4)) {
				
				Assert.assertEquals(expected4, actual4);
				System.out.println("Complete post has been uploaded");
				System.out.println(expected4);
			}
			else {
				System.out.println("Complete post has failed to uploaded");
				Assert.fail();
			}

		}
		catch(Exception e){
			System.out.println("User is not on search page" +e);
			Assert.fail();
		}
		

	}

	@Then("^User also deletes the post$")
	public void user_also_deletes_the_post() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String s5=driver.findElement(By.xpath("//div[@class='msg-content']//child::div[1]")).getText();
			driver.findElement(By.xpath("//div[contains(text(),'"+s5+"')]//preceding::a[starts-with(@id,'message')]")).click();
			System.out.println("User is able to delete");
		}
		catch(Exception e){
			System.out.println("User is not able to delete" +e);
			Assert.fail();
		}

	}
	
	
	
	
	
	
	
	
	
	
	@When("^User clicks on the search button while field is empty again$")
	public void user_clicks_on_the_search_button_while_field_is_empty_again() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			
			WebElement search = driver.findElement(By.name("q"));
			String search3 = search.getAttribute("value");
			
			if(search3.isEmpty() || !search3.isEmpty())
			{
			   driver.findElement(By.xpath("//div[@class='input-group-btn']//child::button[1]")).click();
			   System.out.println("User is able to click on search");
			}	
			
			else {
				System.out.println("User is not able to click");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click on search" +e);
			Assert.fail();
		}

	}

	@Then("^User gets redirected to the detailed search page$")
	public void user_gets_redirected_to_the_detailed_search_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = "Social network";
			String expected4 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[1]")).getText();
			String actual41 = "Search";
			String expected41 = driver.findElement(By.xpath("//ul[@class='breadcrumb']//child::li[contains(text(),'Search')]")).getText();

			Assert.assertEquals(expected4, actual4);
			Assert.assertEquals(expected41, actual41);
			System.out.println(expected4+"/"+expected41);
			
		
		}
		catch(Exception e){
			System.out.println("User is not on search page" +e);
			Assert.fail();
		}

	}

	@Then("^User enters a string \"([^\"]*)\" letter or word in the search field$")
	public void user_enters_a_string_letter_or_word_in_the_search_field(String str3){
	    // Write code here that turns the phrase above into concrete actions
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			
			if(search4.isEmpty())
			{
			   System.out.println("Input field is empty");
			   search.sendKeys(str3);
			   
			}
		}
		catch(Exception e){
			System.out.println("User is not able put value" +e);
			Assert.fail();
		}
	   
	}

	@Then("^User selects Groups from drop down field$")
	public void user_selects_Groups_from_drop_down_field() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[@class='filter-option-inner']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='inner open']//following::a[1]//child::span[contains(text(),'Group')]")).click();
		}
		catch(Exception e){
			System.out.println("User is not able to select option" +e);
			Assert.fail();
		}
	    
	}

	@Then("^User clicks on search$")
	public void user_clicks_on_search() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.xpath("//button[@name='submit']")).click();
			}
			else {
				System.out.println("Search field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click search" +e);
			Assert.fail();
		}
	   
	}

	@Then("^User is able to see the related results$")
	public void user_is_able_to_see_the_related_results() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
		String group="Groups";
		String group1 = driver.findElement(By.xpath("//a[contains(text(),'Groups')]")).getText();
		
		
		if(group1.contains(group)) {
			System.out.println("User can view the Group related results");
		}
		else{
				System.out.println("User is not able to view Group related results");
				Assert.fail();	
		}
		}
		catch(Exception e){
			System.out.println("User is not able to view results" +e);
			Assert.fail();
		}
		
	}
	
	@Then("^User clicks on see more or group name to see more details about the group$")
	public void user_clicks_on_see_more_or_group_name_to_see_more_details_about_the_group() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions

				Thread.sleep(2000);
				try {
					driver.findElement(By.xpath("//a[contains (text(),'demoDRY')]")).click();
				
				}
				catch(Exception e){
					System.out.println("User is not able to view results" +e);
					Assert.fail();
				}

	}
	
	@Then("^User sees earlier discussions in discussion tab$")
	public void user_sees_earlier_discussions_in_discussion_tab() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual4 = "Discussions";
			String expected4 = driver.findElement(By.xpath("//a[contains(text(),'Discussions')]")).getText();
						
			Assert.assertEquals(expected4, actual4);	
			System.out.println(expected4);
			System.out.println("User is able to see prior discussions");
		
		}
		catch(Exception e){
			System.out.println("User is not able to see prior discussions" +e);
			Assert.fail();
		}

	}

	@When("^User clicks on members$")
	public void user_clicks_on_members() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Members')]")).click();
			System.out.println("User is able to click on members tab");
		}
		catch(Exception e){
			System.out.println("User is not able to click on members tab" +e);
			Assert.fail();
		}

	}

	@Then("^User can view members of the group$")
	public void user_can_view_members_of_the_group() throws InterruptedException{
		Thread.sleep(2000);
		try {
			String actual4 = "Members";
			String expected4 = driver.findElement(By.xpath("//a[contains(text(),'Members')]")).getText();
						
			Assert.assertEquals(expected4, actual4);	
			System.out.println(expected4);
			System.out.println("User is able to see all members in the group");
		
		}
		catch(Exception e){
			System.out.println("User is not able to see all members in the group" +e);
			Assert.fail();
		}


	}

	@Then("^User clicks on compose message if already joined group$")
	public void user_clicks_on_compose_message_if_already_joined_group() throws InterruptedException{
		Thread.sleep(2000);
		//WebElement element1=driver.findElement(By.xpath("//a[contains (text(),'Join group')]"));
		
		try {
			//boolean b1=driver.findElement(By.xpath("//a[contains (text(),'Join group')]")).isDisplayed();
			//WebElement element1=driver.findElement(By.xpath("//a[contains (text(),'Join group')]"));
			//boolean flag=displayed(element1);
			//System.out.println(flag);
			if(displayed()) {
				//driver.findElement(By.xpath("//a[contains (text(),'Join group')]")).click();
				System.out.println("Inside if condition");
				//element1.click();
			}
			
			Thread.sleep(3000);	
			boolean b2=driver.findElement(By.xpath("//div[@class='pull-right']//a[1]")).isDisplayed();
				if(b2) {
					driver.findElement(By.xpath("//div[@class='pull-right']//a[1]")).click();
				}
				else {
					System.out.println("Create thread tab is not available");
					Assert.fail();
				}				
		}
		catch(Exception e){
			System.out.println("User is not able to compose messsage" +e);
			//Assert.fail();
		}


	}
	
	public boolean displayed() {
		
        try {
        	WebElement element = driver.findElement(By.xpath("//a[contains (text(),'Join group')]"));
        	boolean value=element.isDisplayed();
        	return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

	@Then("^User can see the compose message window pop$")
	public void user_can_see_the_compose_message_window_pop() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			String actual4 = "Compose message";
			String expected4 = driver.findElement(By.xpath("//h4[@id='global-modal-title']")).getText();
						
			Assert.assertEquals(expected4, actual4);	
			System.out.println(expected4);
			System.out.println("User is on message popup");
		
		}
		catch(Exception e){
			System.out.println("User is not on message popup" +e);
			Assert.fail();
		}
		

	}

	@Then("^User writes the subject and message,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_writes_the_subject_and_message(String alph, String num, String splchar, String blank){
	    // Write code here that turns the phrase above into concrete actions
		try {
			
			
			
			driver.findElement(By.xpath("//input[@id='form_title']")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='form_title']")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='form_title']")).sendKeys(splchar);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='form_title']")).sendKeys(blank);
			
		
		// WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Press ALT 0 for help')]/../iframe"));
		    driver.switchTo().frame(0);
	
			driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p")).sendKeys(alph);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p")).sendKeys(splchar);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p")).sendKeys(blank);
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
		
			
		}
		catch(Exception e){
			System.out.println("User is not able to put values"+e);
			Assert.fail();
		}
		

	}

	@Then("^User clicks on the send button$")
	public void user_clicks_on_the_send_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		try {
			WebElement search = driver.findElement(By.xpath("/html/body/p"));
			String search4 = search.getAttribute("value");
			if(!search4.isEmpty()) {
				driver.findElement(By.xpath("//button[@id='form_submit']")).click();
				System.out.println("User is able to click send message");
			}
			else {
				System.out.println("message field is empty");
				Assert.fail();
			}
		}
		catch(Exception e){
			System.out.println("User is not able to click send message" +e);
			Assert.fail();
		}

	}

	@Then("^User gets redirected to the discussion page$")
	public void user_gets_redirected_to_the_discussion_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try {
			String actual4 = "Discussions";
			String expected4 = driver.findElement(By.xpath("//li[contains(text(),'Discussions')]")).getText();
						
			Assert.assertEquals(expected4, actual4);	
			System.out.println(expected4);
			System.out.println("User is on discussion page");
		
		}
		catch(Exception e){
			System.out.println("User is not on discussion page" +e);
			Assert.fail();
		}
		

	}

	@Then("^User sees the sent message$")
	public void user_sees_the_sent_message(){
	    // Write code here that turns the phrase above into concrete actions
		try {
			String actual4 = "Discussions";
			String expected4 = driver.findElement(By.xpath("//li[contains(text(),'Discussions')]")).getText();
						
			Assert.assertEquals(expected4, actual4);	
			System.out.println(expected4);
			System.out.println("User is on discussion page");
		
		}
		catch(Exception e){
			System.out.println("User is not on discussion page" +e);
			Assert.fail();
		}

	}

	


	
	
	
	
}
