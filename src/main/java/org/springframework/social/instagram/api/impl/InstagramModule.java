package org.springframework.social.instagram.api.impl;

import org.springframework.social.instagram.api.Caption;
import org.springframework.social.instagram.api.Comment;
import org.springframework.social.instagram.api.CommentsInfo;
import org.springframework.social.instagram.api.Image;
import org.springframework.social.instagram.api.InstagramProfile;
import org.springframework.social.instagram.api.LikesInfo;
import org.springframework.social.instagram.api.Location;
import org.springframework.social.instagram.api.Media;
import org.springframework.social.instagram.api.PagedMediaList;
import org.springframework.social.instagram.api.Pagination;
import org.springframework.social.instagram.api.Relationship;
import org.springframework.social.instagram.api.Tag;
import org.springframework.social.instagram.api.Video;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class InstagramModule extends SimpleModule {
	private static final long serialVersionUID = 1912452314183749926L;

	public InstagramModule() {
		super(InstagramModule.class.getName(), new Version(1, 0, 0, null, "org.springframework.social", "spring-social-instagram"));
	}

	@Override
	public void setupModule(final SetupContext context) {
		context.setMixInAnnotations(Caption.class, CaptionMixin.class);
		context.setMixInAnnotations(Comment.class, CommentMixin.class);
		context.setMixInAnnotations(CommentsInfo.class, CommentsInfoMixin.class);
		context.setMixInAnnotations(Image.class, ImageMixin.class);
		context.setMixInAnnotations(Video.class, VideoMixin.class);
		context.setMixInAnnotations(InstagramProfile.class, InstagramProfileMixin.class);
		context.setMixInAnnotations(LikesInfo.class, LikesInfoMixin.class);
		context.setMixInAnnotations(Location.class, LocationMixin.class);
		context.setMixInAnnotations(Media.class, MediaMixin.class);
		context.setMixInAnnotations(PagedMediaList.class, PagedMediaListMixin.class);
		context.setMixInAnnotations(Pagination.class, PaginationMixin.class);
		context.setMixInAnnotations(Relationship.class, RelationshipMixin.class);
		context.setMixInAnnotations(Tag.class, TagMixin.class);
	}

}
