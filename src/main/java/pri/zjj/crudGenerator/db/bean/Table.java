package pri.zjj.crudGenerator.db.bean;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

/**
 *ClassName:Table
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月21日
 *@Version 1.0
 */
@Data
@Builder
public class Table {
	private String name;
	private String lowName;
	private String upName;
	@Singular
	private List<Column> columns;
}
