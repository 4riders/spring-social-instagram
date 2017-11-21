package org.springframework.social.instagram.api;

public class Video {

	public static final String LOW_RESOLUTION = "low_resolution";
	public static final String LOW_BANDWIDTH = "low_bandwidth";
	public static final String STANDARD_RESOLUTION = "standard_resolution";

	private String id;
	private String url;
	private int width;
	private int height;

	public Video() {

	}

	public Video(final String id, final String url, final int width, final int height) {
		this.id = id;
		this.url = url;
		this.width = width;
		this.height = height;
	}
	
	public String getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
