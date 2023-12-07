package com.heeverse.itlabapi.bookmark.repository;

import com.heeverse.itlabapi.bookmark.domain.entity.Domain;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
public interface DomainRepository extends CrudRepository<Domain, String> {

    Optional<Domain> findByDomain(String domain);
}
