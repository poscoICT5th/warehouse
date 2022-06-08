package Pack.vo;

import java.text.SimpleDateFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@Getter
@Setter
public class WarehouseIns {
	String location;
	String warehouse_code;
	String purpose;
	String warehouse_code_desc;
	String use;
	float maximum_weight;
	int maximum_count;
	String inventory_using;
	String remarks;
	public WarehouseIns(String location, String warehouse_code, String purpose, String warehouse_code_desc, String use,
			float maximum_weight, int maximum_count, String inventory_using, String remarks) {
		super();
		this.warehouse_code = warehouse_code;
		this.location = location;
		this.purpose = purpose;
		this.warehouse_code_desc = warehouse_code_desc;
		this.use = use;
		this.maximum_weight = maximum_weight;
		this.maximum_count = maximum_count;
		this.inventory_using = inventory_using;
		this.remarks = remarks;
	}
}
