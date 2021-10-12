package com.jc.controller;


import com.jc.service.HouseService;
import com.jc.support.AccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("/selectHouseByPrice")
    AccessResult selectHouseByPrice(Double lower_limit,Double upper_limit){
        AccessResult accessResult = houseService.selectHouseByPrice(lower_limit,upper_limit);
        return accessResult;
    }

    @RequestMapping("/selectHouseByInnerAcreage")
    AccessResult selectHouseByInnerAcreage(Double lower_limit,Double upper_limit){
        AccessResult accessResult = houseService.selectHouseByInnerAcreage(lower_limit,upper_limit);
        return accessResult;
    }

    @RequestMapping("/selectHouseByType")
    AccessResult selectHouseByType(Integer num1,Integer num2,Integer num3,Integer num4){
        AccessResult accessResult = houseService.selectHouseByType(num1,num2,num3,num4);
        return accessResult;
    }

    @RequestMapping("/selectHouseByRenovation")
    AccessResult selectHouseByRenovation(String rnv){
        AccessResult accessResult = houseService.selectHouseByRenovation(rnv);
        return accessResult;
    }

    @RequestMapping("/selectHouseByStructure")
    AccessResult selectHouseByStructure(String strc){
        AccessResult accessResult = houseService.selectHouseByStructure(strc);
        return accessResult;
    }

}
