package Pack.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@Getter
@Setter
public class WarehouseVo {
	String location;
	String warehouse_code;
	String purpose;
	String warehouse_desc;
	String use;
	float maximum_weight;
	int maximum_count;
	String inventory_using;
	String remarks;
}
