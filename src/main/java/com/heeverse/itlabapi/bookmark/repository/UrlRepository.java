package com.heeverse.itlabapi.bookmark.repository;

import com.heeverse.itlabapi.bookmark.domain.entity.Url;
import org.springframework.data.repository.CrudRepository;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
public interface UrlRepository extends CrudRepository<Url, Long> {
}
