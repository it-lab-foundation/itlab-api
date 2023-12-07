package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.entity.Domain;
import com.heeverse.itlabapi.bookmark.repository.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class DomainService {

    private final DomainRepository domainRepository;
    private final DomainPreprocessor domainPreprocessor;

    public Domain createDomain(String fullUrl) {
        String domain = domainPreprocessor.extractDomain(fullUrl);
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
