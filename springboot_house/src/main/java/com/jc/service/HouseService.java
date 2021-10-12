package com.jc.service;

import com.jc.support.AccessResult;

public interface HouseService {

    AccessResult selectHouseByPrice(Double lower_limit, Double upper_limit);
    AccessResult selectHouseByInnerAcreage(Double lower_limit, Double upper_limit);
    AccessResult selectHouseByType(Integer num1, Integer num2, Integer num3, Integer num4);
    AccessResult selectHouseByRenovation(String rnv);
    AccessResult selectHouseByStructure(String strc);
}
