package com.example.filedemo.repository;

import com.example.filedemo.model.DBFile;
import com.example.filedemo.payload.UploadFileResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

	DBFile save(UploadFileResponse dbFile1);

	//public DBFile storeFile(MultipartFile file);

}
