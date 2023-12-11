package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.entity.Bookmark;
import com.heeverse.itlabapi.bookmark.exceptions.NotExistBookmarkException;
import com.heeverse.itlabapi.bookmark.repository.BookmarkRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author gutenlee
 * @since 2023/11/24
 */
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Component
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;


    public Bookmark findBookmark(String memberId) {
        return bookmarkRepository.findBookmarkByMemberId(memberId)
                .orElseGet(() -> bookmarkRepository.save(new Bookmark(memberId)));
    }
}
