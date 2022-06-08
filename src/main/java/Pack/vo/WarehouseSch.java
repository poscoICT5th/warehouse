package Pack.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@Getter
@Setter
public class WarehouseSch {
	String location;
	String warehouse_code;
	String purpose;
	String warehouse_code_desc;
	String use;
	float min_maximum_weight;
	float max_maximum_weight;
	int min_maximum_count;
	int max_maximum_count;
	String inventory_using;
	String remarks;
}
