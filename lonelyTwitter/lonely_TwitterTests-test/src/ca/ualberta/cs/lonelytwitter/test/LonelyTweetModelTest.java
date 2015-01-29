package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;


public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public LonelyTweetModelTest()
	{
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}
	
	public void testSample()
	{
		//fail("This is a failing test");
		assertEquals("This is false",5,5);
	}
	
	private boolean isGreaterThan(int i, int j){
		if(i>j)
			return true;
		else
			return false;
	}

	public void testEquals(){
		Date date = new Date();
		ImportantTweetModel tweet1 = new ImportantTweetModel("hello",new Date(123));
		NormalTweetModel tweet2 = new NormalTweetModel("hello",new Date(123));
		assertFalse("different tweets",tweet1.equals(tweet2));
		
	}
}
