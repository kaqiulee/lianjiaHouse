package com.jc.service;

import com.jc.dao.HouseMapper;
import com.jc.entity.House;
import com.jc.support.AccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseMapper houseMapper;


    @Override
    public AccessResult selectHouseByPrice(Double lower_limit, Double upper_limit) {
        List<House> houses = houseMapper.selectHouseByPrice(lower_limit,upper_limit);
        if (houses.size()==0){
            return new AccessResult(-1, "未找到符合条件的房子", null);
        }else {
            Map<Integer,House> map = new HashMap<>();
            int num = 1;
            for (House house:houses){
                map.put(num,house);
                num++;
            }
            return new AccessResult(0,"查询成功",map);
        }
    }

    @Override
    public AccessResult selectHouseByInnerAcreage(Double lower_limit, Double upper_limit) {
        List<House> houses = houseMapper.selectHouseByInnerAcreage(lower_limit, upper_limit);
        if (houses.size() == 0) {
            return new AccessResult(-1, "未找到符合条件的房子", null);
        } else {
            Map<Integer, House> map = new HashMap<>();
            int num = 1;
            for (House house : houses) {
                map.put(num, house);
                num++;
            }
            return new AccessResult(0, "查询成功", map);
        }
    }

    @Override
    public AccessResult selectHouseByType(Integer num1, Integer num2, Integer num3, Integer num4) {
        List<House> houses = houseMapper.selectHouseByType(num1, num2, num3, num4);
        if (houses.size() == 0) {
            return new AccessResult(-1, "未找到符合条件的房子", null);
        } else {
            Map<Integer, House> map = new HashMap<>();
            int num = 1;
            for (House house : houses) {
                map.put(num, house);
                num++;
            }
            return new AccessResult(0, "查询成功", map);
        }
    }

    @Override
    public AccessResult selectHouseByRenovation(String rnv) {
        List<House> houses = houseMapper.selectHouseByRenovation(rnv);
        if (houses.size() == 0) {
            return new AccessResult(-1, "未找到符合条件的房子", null);
        } else {
            Map<Integer, House> map = new HashMap<>();
            int num = 1;
            for (House house : houses) {
                map.put(num, house);
                num++;
            }
            return new AccessResult(0, "查询成功", map);
        }
    }

    @Override
    public AccessResult selectHouseByStructure(String strc) {
        List<House> houses = houseMapper.selectHouseByStructure(strc);
        if (houses.size() == 0) {
            return new AccessResult(-1, "未找到符合条件的房子", null);
        } else {
            Map<Integer, House> map = new HashMap<>();
            int num = 1;
            for (House house : houses) {
                map.put(num, house);
                num++;
            }
            return new AccessResult(0, "查询成功", map);
        }
    }
}
