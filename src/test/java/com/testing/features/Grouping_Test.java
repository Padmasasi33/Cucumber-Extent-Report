package com.testing.features;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups="Music" )
	private void spotify() {
		
		System.out.println("Spotify");
		

	}
	
	@Test(groups="Music" )
	private void wynk() {
		System.out.println("Wynk");

	}
	
	@Test(groups="Social Media" )
	private void facebook() {
		System.out.println("Facebook");

	}
	
	@Test(groups="Social Media")
	private void whatsapp() {
	System.out.println("Whatsapp");

	}
	
	@Test(groups="Books")
	private void novels() {
		System.out.println("Novels");
	}
	@Test(groups="Books")
	private void books() {
		System.out.println("Books");

	}
	
	@Test(groups="Shopping")
	private void tshirts() {
		System.out.println("Tshirts");
	}
	@Test(groups="Shopping")
	private void dress() {
		System.out.println("Dress");
	}
	

}

//In xml file for group concept
/*<groups>
<run>

<exclude name="Music"></exclude>
</run>


</groups>*/

/* in xml file for groups of groups concept
<groups>
<define name="Entertainment">

<include name="Social Media" ></include>
<include name="Music"></include>


</define>
<run>

<include name="Entertainment"></include>
</run>

</groups>*/


