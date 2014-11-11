package com.springmvc.service;

import java.util.List;

import com.springmvc.sdo.Movie;

public class MovieServiceImpl implements MovieService {

	@Override
	public boolean addMovie() {
		
		return false;
	}

	@Override
	public Movie getMovie(String name) {
		return new Movie(1, "I am legend", 8.0f);
	}

	@Override
	public List<Movie> getMovies() {
		
		return null;
	}

}
