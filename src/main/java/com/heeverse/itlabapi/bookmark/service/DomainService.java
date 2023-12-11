package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.entity.Domain;
import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import com.heeverse.itlabapi.bookmark.repository.DomainRepository;
import com.heeverse.itlabapi.bookmark.service.preprocess.SplitUrlPreprocessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class DomainService {

    private final DomainRepository domainRepository;
    private final SplitUrlPreprocessor splitUrlPreprocessor;

    public Domain createDomain(String domain) {
        return findDomain(domain)
                .orElseGet(() -> saveDomain(new Domain(domain)));
    }

    public Optional<Domain> findDomain(String domain) {
        return domainRepository.findByDomain(domain);
    }

    public Domain saveDomain(Domain domain) {
        return domainRepository.save(domain);
    }

}
