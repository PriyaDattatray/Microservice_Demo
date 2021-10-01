package com.example.filedemo.service;

import com.example.filedemo.exception.FileStorageException;
import com.example.filedemo.exception.MyFileNotFoundException;
import com.example.filedemo.model.DBFile;
import com.example.filedemo.payload.UploadFileResponse;
import com.example.filedemo.repository.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;
  
    private Path fileStorage;
    
    private String fileStorageLocation;
    
    
    public DBFileStorageService() {
    	
    }
    
    public DBFileStorageService(DBFileRepository dbFileRepository)
    {
    	this.dbFileRepository =dbFileRepository;
    }
    
    //if storage location is not available then it stores into default folder temp
    public DBFileStorageService(@Value("${file.storage.location:temp}") String fileStorageLocation) {
    	this.fileStorageLocation = fileStorageLocation;
    	
    	fileStorage = Paths.get(fileStorageLocation).toAbsolutePath().normalize();
    	
    	try {
			Files.createDirectories(fileStorage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Issue In creating File Directory");
		}
    	
    }


   public DBFile storeFile(MultipartFile file) {
    	//String fileNames = file.getOriginalFilename();
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
       
       try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

           DBFile dbFile1 = new DBFile( file.getContentType(), fileName, file.getBytes());
           // UploadFileResponse dbFile1 = new UploadFileResponse(fileName,file.fileDownloadUri,file.getContentType(),file.getSize());
            System.out.println("***************"+ file.getBytes());

            return dbFileRepository.save(dbFile1);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }
    

    
    public DBFile getFile(String fileId) {
        return dbFileRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
}
