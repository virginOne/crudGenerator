package pri.zjj.crudGenerator.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pri.zjj.crudGenerator.db.bean.Column;

/**
 *ClassName:DBmapper
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月21日
 *@Version 1.0
 */
@Mapper
public interface DBmapper {
	public List<String> getTables();
	public List<Column> getColumns(String table);
}
