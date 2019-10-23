package pri.zjj.crudGenerator.db.bean;

import lombok.Builder;
import lombok.Data;

/**
 *ClassName:Column
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月21日
 *@Version 1.0
 */
@Data
@Builder
public class Column {
	private String field;
	private String type;
	private String Null;
	private String key;
	private String Default;
	private String extra;
}
