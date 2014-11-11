package com.springmvc.service;

import java.util.List;

import com.springmvc.sdo.Movie;

public interface MovieService {
	boolean addMovie();
	Movie getMovie(String name);
	List<Movie> getMovies();
}
