package Pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.mapper.WarehouseMapper;
import Pack.vo.WarehouseIns;
import Pack.vo.WarehouseLoc;
import Pack.vo.WarehouseSch;
import Pack.vo.WarehouseUpd;
import Pack.vo.WarehouseVo;

@Service
public class WarehouseService {
    @Autowired
    public WarehouseMapper mapper;
    
    public List<WarehouseVo> selectAll() {
        return mapper.selectAll();
    }
    
    public List<WarehouseVo> selectSome(WarehouseSch warehouseSch){
    	return mapper.selectSome(warehouseSch);
    }
    
    public List<WarehouseLoc> selectLocation(String location){
    	return mapper.selectLocation(location);
    }
    
    public int warehouseDel(String warehouseCode) {
    	return mapper.delete(warehouseCode);
    }
    
    public int warehouseIns(WarehouseIns warehouseIns) {
    	return mapper.insert(warehouseIns);
    }
    
    public int warehouseUpd(String warehouseCode, WarehouseUpd warehouseUpd) {
    	warehouseUpd.setWarehouse_code(warehouseCode);
    	System.out.println(warehouseUpd);
    	return mapper.update(warehouseUpd);
    }
}
