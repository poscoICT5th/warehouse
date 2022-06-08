package Pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Pack.service.TestService;
import Pack.service.WarehouseService;
import Pack.vo.TestVo;
import Pack.vo.WarehouseIns;
import Pack.vo.WarehouseLoc;
import Pack.vo.WarehouseSch;
import Pack.vo.WarehouseUpd;
import Pack.vo.WarehouseVo;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class MainController {
	@Autowired
	WarehouseService wareService;
	TestService testService;
	
	@GetMapping("/test")
	public List test() {
		System.out.println("test");
	    ModelAndView mav = new ModelAndView("test");

	    List<TestVo> testList = testService.selectTest();
	    System.out.println(testList);
	    mav.addObject("list", testList);

	    return testList;
	}
	
	@GetMapping("/")
	public List warehouse() {
		System.out.println("select all");
	    List<WarehouseVo> warehouseAll = wareService.selectAll();
	    System.out.println(warehouseAll);
	    return warehouseAll;
	}
	
	@GetMapping("/search")
	public List warehouseSch(WarehouseSch warehouseSch) {
		System.out.println("warehouseSearch");
		System.out.println(warehouseSch);
		List<WarehouseVo> warehouseSearch = wareService.selectSome(warehouseSch);
		System.out.println(warehouseSearch);
		return warehouseSearch;
	}
	
	@GetMapping("/warehouse/{location}")
	public List warehouseLoc(@PathVariable("location") String location) {
		System.out.println("warehouseLocation");
		List<WarehouseLoc> warehouseLocation = wareService.selectLocation(location);
		System.out.println(warehouseLocation);
		return warehouseLocation;
	}
	
	@PostMapping("/")
	public boolean warehouseIns(@RequestBody WarehouseIns warehouseIns) {
		System.out.println(warehouseIns);
		int result = wareService.warehouseIns(warehouseIns);
		return result == 1 ? true : false;
	}
		
	@PutMapping("/{warehouseCode}")
	public boolean warehouseUpd(@PathVariable("warehouseCode") String warehouseCode, @RequestBody WarehouseUpd warehouseUpd) {
		System.out.println(warehouseCode);
		System.out.println(warehouseUpd);
		int result = wareService.warehouseUpd(warehouseCode, warehouseUpd);
		return result == 1 ? true : false;
	}
	
	@DeleteMapping("/{warehouseCode}")
	public boolean warehouseDel(@PathVariable("warehouseCode") String warehouseCode) {
		System.out.println(warehouseCode);
		int result = wareService.warehouseDel(warehouseCode);
		return result == 1 ? true : false;
	}
}
