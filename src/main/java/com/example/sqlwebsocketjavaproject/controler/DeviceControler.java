package com.example.sqlwebsocketjavaproject.controler;

import com.example.sqlwebsocketjavaproject.dao.DeviceDao;
import com.example.sqlwebsocketjavaproject.model.AvgTemperature;
import com.example.sqlwebsocketjavaproject.model.DeviceEsp32Dht11;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/DeviceDBService")
public class DeviceControler {


    @PostMapping("/data/add")
    public boolean addData(@RequestBody DeviceEsp32Dht11 d){
        return DeviceDao.addData(d);
    }

    @GetMapping("/all")
    public List<DeviceEsp32Dht11> getAll(){
        return DeviceDao.getAll();
    }

    @GetMapping("/delete/all")
    public boolean deleteAll(){
        return DeviceDao.deleteAll();
    }

    @GetMapping("/avg/temperature")
    public List<AvgTemperature> getAvg(){ return DeviceDao.getAvg(); }

}


