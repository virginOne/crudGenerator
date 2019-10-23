package ${param.basePackage}.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ${param.basePackage}.entity.${table.upName};

/**
 *ClassName:${table.upName!}
 *@Description:${param.description!}
 *
 *@Author ${param.author}ServiceImp
 *@Date ${param.data!}
 *@Version ${param.version!}
 */
@Service("${table.lowName}ServiceImp")
public class ${table.upName}ServiceImp {
	
	private ${table.upName}Mapper ${table.lowName}Mapper;
	
	List<${table.upName}> getAll(){
		return ${table.lowName}Mapper.getAll();
	}
	
	List<${table.upName}> getAllBy(${table.upName} record){
		return ${table.lowName}Mapper.getAllBy(record);
	}
	
	${table.upName} getOneBykey(${table.keyType} key){
		return ${table.lowName}Mapper.getOneByKey(key);
	}
	
	int insert(${table.upName} record) {
		return ${table.upName}Mapper.insert(record);
	}
	
	int insertList(List<${table.upName}> records) {
		return ${table.lowName}Mapper.insert<records>();
	}
	
	int update(${table.upName} record) {
		return ${table.lowName}Mapper.update(record);
	}
	
	int deleteByKey(${table.keyType} key) {
		return ${table.lowName}Mapper.deleteByKey(key);
	}
	
	int delete(${table.upName} record) {
		return ${table.upName}Mapper.delete(record);
	}
}
