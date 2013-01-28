JReddit
=======

A Java API for accessing Reddit

Overview
========
This API will allow you to access Reddit from within Java. Specifically, you can download information about Posts (links and text submitted by Reddit users) and Comments (replies to Posts written by Reddit users). Data returned using the API can either be raw JSON strings, a HashMap-based dictionary, or Java classes (Comment and Post). In addition, if your internet connection is not stable, or you want your API calls to be idempotent, you can use locally cached data for testing.

Getting Started
===============

Cache
=====
Using the cache is simple.

```java
public class JRedditTest {
	public static void main(String[] args) {
		Reddit reddit = Reddit.getInstance();
		
		reddit.setLocal(true); // USE THE CACHE!
    
		reddit.getPosts("virginiatech", SortMode.TOP, new PostListener() {
			public void onSuccess(ArrayList<Post> posts) {  
				System.out.println(posts);
			}
		}
	}
}
```

If the data isn't able to be found in the cache, then an empty list will be returned.
