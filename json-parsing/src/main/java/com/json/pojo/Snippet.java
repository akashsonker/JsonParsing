package com.json.pojo;

public class Snippet {
	private String videoId;
	private String canReply;
	private String totalReplyCount;
	private String isPublic;
	private TopLevelComment topLevelComment;

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getCanReply() {
		return canReply;
	}

	public void setCanReply(String canReply) {
		this.canReply = canReply;
	}

	public String getTotalReplyCount() {
		return totalReplyCount;
	}

	public void setTotalReplyCount(String totalReplyCount) {
		this.totalReplyCount = totalReplyCount;
	}

	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public TopLevelComment getTopLevelComment() {
		return topLevelComment;
	}

	public void setTopLevelComment(TopLevelComment topLevelComment) {
		this.topLevelComment = topLevelComment;
	}

	@Override
	public String toString() {
		return "SnippetOuter [videoId=" + videoId + ", canReply=" + canReply + ", totalReplyCount=" + totalReplyCount
				+ ", isPublic=" + isPublic + ", topLevelComment=" + topLevelComment + "]";
	}

}
