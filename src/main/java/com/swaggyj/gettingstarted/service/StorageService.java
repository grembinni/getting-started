package com.swaggyj.gettingstarted.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	void deleteAll();

	void init();

	Path load(String filename);

	Stream<Path> loadAll();

	Resource loadAsResource(String filename);

	void store(MultipartFile file);

}