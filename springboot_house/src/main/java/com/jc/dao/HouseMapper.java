package com.jc.dao;

import com.jc.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HouseMapper {

    List<House> selectHouseByPrice(@Param("low")Double lower_limit, @Param("up")Double upper_limit);
    List<House> selectHouseByInnerAcreage(@Param("low")Double lower_limit, @Param("up")Double upper_limit);
    List<House> selectHouseByType(@Param("num1")Integer num1, @Param("num2")Integer num2, @Param("num3")Integer num3, @Param("num4")Integer num4);
    List<House> selectHouseByRenovation(String rnv);
    List<House> selectHouseByStructure(String strc);

}
