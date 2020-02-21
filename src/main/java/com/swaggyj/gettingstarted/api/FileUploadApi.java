package com.swaggyj.gettingstarted.api;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface FileUploadApi {

	String handleFileUpload(MultipartFile file, RedirectAttributes redirectAttributes);

	String listUploadedFiles(Model model);

	ResponseEntity<Resource> serveFile(String filename);
}
