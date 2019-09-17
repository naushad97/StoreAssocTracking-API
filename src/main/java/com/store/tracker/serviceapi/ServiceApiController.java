package com.store.tracker.serviceapi;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class ServiceApiController {

    private static List<BeaconData> beaconDataList = new ArrayList<>();

    @PostMapping("/saveBeaconData")
    public ResponseEntity<BaseResponse> saveData(@RequestBody BeaconData beaconData){
        if(beaconData != null){
            beaconDataList.add(beaconData);
            return ResponseEntity.ok().body(new BaseResponse(1, "Data saved successfully."));
        }

        return ResponseEntity.ok().body(new BaseResponse(0, "Data colud not be."));
    }

    @GetMapping("/getBeaconData")
    public ResponseEntity<List<BeaconData>> getBeaconData(){
        return ResponseEntity.ok().body(beaconDataList);
    }
}
