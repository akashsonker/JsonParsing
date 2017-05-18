package com.json;

import com.json.pojo.AuthorChannelId;

public class Snippet {
	private String authorDisplayName;
	private String authorProfileImageUrl;
	private String authorChannelUrl;
	private String videoId;
	private String textDisplay;
	private String textOriginal;
	private String canRate;
	private String viewerRating;
	private String likeCount;
	private String publishedAt;
	private String updatedAt;
	private AuthorChannelId authorChannelId;

	public String getAuthorDisplayName() {
		return authorDisplayName;
	}

	public void setAuthorDisplayName(String authorDisplayName) {
		this.authorDisplayName = authorDisplayName;
	}

	public String getAuthorProfileImageUrl() {
		return authorProfileImageUrl;
	}

	public void setAuthorProfileImageUrl(String authorProfileImageUrl) {
		this.authorProfileImageUrl = authorProfileImageUrl;
	}

	public String getAuthorChannelUrl() {
		return authorChannelUrl;
	}

	public void setAuthorChannelUrl(String authorChannelUrl) {
		this.authorChannelUrl = authorChannelUrl;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getTextDisplay() {
		return textDisplay;
	}

	public void setTextDisplay(String textDisplay) {
		this.textDisplay = textDisplay;
	}

	public String getTextOriginal() {
		return textOriginal;
	}

	public void setTextOriginal(String textOriginal) {
		this.textOriginal = textOriginal;
	}

	public String getCanRate() {
		return canRate;
	}

	public void setCanRate(String canRate) {
		this.canRate = canRate;
	}

	public String getViewerRating() {
		return viewerRating;
	}

	public void setViewerRating(String viewerRating) {
		this.viewerRating = viewerRating;
	}

	public String getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public AuthorChannelId getAuthorChannelId() {
		return authorChannelId;
	}

	public void setAuthorChannelId(AuthorChannelId authorChannelId) {
		this.authorChannelId = authorChannelId;
	}

	@Override
	public String toString() {
		return "SnippetInner [authorDisplayName=" + authorDisplayName + ", authorProfileImageUrl="
				+ authorProfileImageUrl + ", authorChannelUrl=" + authorChannelUrl + ", videoId=" + videoId
				+ ", textDisplay=" + textDisplay + ", textOriginal=" + textOriginal + ", canRate=" + canRate
				+ ", viewerRating=" + viewerRating + ", likeCount=" + likeCount + ", publishedAt=" + publishedAt
				+ ", updatedAt=" + updatedAt + ", authorChannelId=" + authorChannelId + "]";
	}

}
