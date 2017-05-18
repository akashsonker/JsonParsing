package com.json;

import java.io.IOException;

import com.google.gson.Gson;
import com.json.pojo.Items;
import com.json.pojo.YouTube;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JsonParsing {

	OkHttpClient client = new OkHttpClient();

	String run(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();

		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public static void main(String[] args) throws IOException {
		JsonParsing example = new JsonParsing();
		String response = example.run(
				"https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&videoId=G62HrubdD6o&key=AIzaSyBLwr3SS5LaDiE3J03rndaommuSuSBN8L8");
		Gson gson = new Gson();
		YouTube uTube = gson.fromJson(response, YouTube.class);
		//System.out.println(uTube);
		System.out.println("kind=" + uTube.getKind());
		System.out.println("etag=" + uTube.getEtag());
		System.out.println("nextPageToken=" + uTube.getNextPageToken());
		System.out.println("Get page info");
		System.out.println("GetTotalResult=" + uTube.getPageInfo().getTotalResults());
		System.out.println("Get result per page=" + uTube.getPageInfo().getResultsPerPage());
		System.out.println("------------------------------------------------------------------");
		System.out.println("Items");
		System.out.println(uTube.getItems());
		for (Items items : uTube.getItems()) {
			System.out.println(items.getKind());
			System.out.println(items.getEtag());
			System.out.println(items.getId());
			System.out.println("Snippet");
			System.out.println(items.getSnippet().getVideoId());
			System.out.println("Get Top level comments");
			System.out.println("Kind="+items.getSnippet().getTopLevelComment().getKind());
			System.out.println("eta="+items.getSnippet().getTopLevelComment().getEtag());
			System.out.println("id="+items.getSnippet().getTopLevelComment().getId());
			System.out.println("Snippet");
			System.out.println("Author display name="+items.getSnippet().getTopLevelComment().getSnippet().getAuthorDisplayName());
			System.out.println("Author profile img url="+items.getSnippet().getTopLevelComment().getSnippet().getAuthorProfileImageUrl());
			System.out.println("Author channel url="+items.getSnippet().getTopLevelComment().getSnippet().getAuthorChannelUrl());
			System.out.println("authorChannelId");
			System.out.println("value="+items.getSnippet().getTopLevelComment().getSnippet().getAuthorChannelId().getValue());
			System.out.println("video id="+items.getSnippet().getTopLevelComment().getSnippet().getVideoId());
			System.out.println("Text display="+items.getSnippet().getTopLevelComment().getSnippet().getTextDisplay());
			System.out.println("Text original="+items.getSnippet().getTopLevelComment().getSnippet().getTextOriginal());
			System.out.println("can rate="+items.getSnippet().getTopLevelComment().getSnippet().getCanRate());
			System.out.println("view rating="+items.getSnippet().getTopLevelComment().getSnippet().getViewerRating());
			System.out.println("Like count="+items.getSnippet().getTopLevelComment().getSnippet().getLikeCount());
			System.out.println("publish at="+items.getSnippet().getTopLevelComment().getSnippet().getPublishedAt());
			System.out.println("update at="+items.getSnippet().getTopLevelComment().getSnippet().getUpdatedAt());
			System.out.println("can reply"+items.getSnippet().getCanReply());
			System.out.println("Total reply count"+items.getSnippet().getTotalReplyCount());
			System.out.println("is public="+items.getSnippet().getIsPublic());
			System.out.println("*******************************************************************");
		}

	}
}
