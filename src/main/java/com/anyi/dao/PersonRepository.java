package com.anyi.dao;

import com.anyi.dto.Person;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    Person findByName(@Param("name") String name);
}
