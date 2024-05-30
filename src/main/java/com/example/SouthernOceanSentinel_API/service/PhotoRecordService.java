package com.example.SouthernOceanSentinel_API.service;

import com.example.SouthernOceanSentinel_API.repository.PhotoRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoRecordService {
    @Autowired
    private PhotoRecordRepository photoRecordRepository;

}
