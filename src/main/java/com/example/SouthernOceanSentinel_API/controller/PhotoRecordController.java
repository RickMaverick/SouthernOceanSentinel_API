package com.example.SouthernOceanSentinel_API.controller;

import com.example.SouthernOceanSentinel_API.controller.dto.PhotoRecordDTO;
import com.example.SouthernOceanSentinel_API.model.PhotoRecord;
import com.example.SouthernOceanSentinel_API.service.PhotoRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class PhotoRecordController {
    @Autowired
    private PhotoRecordService photoRecordService;


}
