package ${param.basePackage}.entity;

import org.apache.ibatis.annotations.Mapper;
import ${param.basePackage}.entity.${table.upName};

/**
 *ClassName:${table.upName}Mapper
 *@Description:${param.description!}
 *
 *@Author ${param.author!}
 *@Date ${param.data!}
 *@Version ${param.version!}
 */
@Mapper
public interface ${table.upName}Mapper {
	List<${table.upName}> getAll();
	
	List<${table.upName}> getAllBy(${table.upName} record);
	
	${table.upName} getOneByKey(${table.keyType} key);
	
	int insert(${table.upName} record);
	
	int insertList(List<${table.upName}> records);
	
	int update(${table.upName} record);
	
	int deleteByKey(${table.keyType} key);
	
	int delete(${table.upName} record);
}
