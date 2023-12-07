package com.heeverse.itlabapi.bookmark.repository;

import com.heeverse.itlabapi.bookmark.domain.entity.Bookmark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookmarkRepository extends CrudRepository<Bookmark, Long> {

    Optional<Bookmark> findBookmarkByMemberId(String memberId);
    void delete(Bookmark deleteBookmark);


}
