package Pack.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import Pack.vo.WarehouseIns;
import Pack.vo.WarehouseLoc;
import Pack.vo.WarehouseSch;
import Pack.vo.WarehouseUpd;
import Pack.vo.WarehouseVo;

@Repository
@Mapper
public interface WarehouseMapper {
    List<WarehouseVo> selectAll();
    
    List<WarehouseVo> selectSome(WarehouseSch warehouseSch);
    
    List<WarehouseLoc> selectLocation(String location);
    
    int delete(String warehouseCode);
    
    int deletes(List warehouseDeleteList);
    
    int insert(WarehouseIns warehouseIns);
    
    int update(WarehouseUpd warehouseUpd);
}
