package com.kristyn.springboot305;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {
}
