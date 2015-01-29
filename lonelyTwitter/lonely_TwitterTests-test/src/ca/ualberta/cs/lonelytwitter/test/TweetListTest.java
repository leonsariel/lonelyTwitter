package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetListTest(String name)
	{

		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}
	
	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("tweet list not initialise",tweets);
	}
	
	public void testCunts(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("hello");
		tweetList.addTweet(tweet);
		assertEquals("This shoud be 1",1, tweetList.getCounts());
	}

}
