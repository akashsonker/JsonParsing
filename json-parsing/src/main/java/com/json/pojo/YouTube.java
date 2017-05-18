package com.json.pojo;

import java.util.Arrays;

public class YouTube {

	private String etag;

	private Items[] items;

	private PageInfo pageInfo;

	private String nextPageToken;

	private String kind;

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public Items[] getItems() {
		return items;
	}

	public void setItems(Items[] items) {
		this.items = items;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "YouTube [etag=" + etag + ", items=" + Arrays.toString(items) + ", pageInfo=" + pageInfo
				+ ", nextPageToken=" + nextPageToken + ", kind=" + kind + "]";
	}

	
}
