package ${param.basePackage!}.entity;

import lombok.Builder;
import lombok.Data;

/**
 *ClassName:${table.upName}
 *@Description:${param.description!}
 *
 *@Author ${param.author!}
 *@Date ${param.data!}
 *@Version ${param.version!}
 */
@Data
@Builder
public class ${table.upName} {
<%	for(column in table.columns) {
		println("private "+column.type+" "+column.field+";");
	}
%>
}
