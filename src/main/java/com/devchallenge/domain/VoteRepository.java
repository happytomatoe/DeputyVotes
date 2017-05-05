package com.devchallenge.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "votes", path = "votes")
public interface VoteRepository extends PagingAndSortingRepository<GeneralVote, Long> {
}