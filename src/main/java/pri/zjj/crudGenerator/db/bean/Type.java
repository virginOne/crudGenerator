package pri.zjj.crudGenerator.db.bean;

import lombok.Getter;

/**
 *ClassName:Type
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月21日
 *@Version 1.0
 */
public enum Type {
	
	VARCHAR("varchar","String"),CHAR("char","String"),INT("int","int");
	
	@Getter
	private String name;
	@Getter
	private String type;
	private Type(String name,String type) {
		this.name=name;
		this.type=type;
	}
	static String getTypeByName(String name) {
		for(Type type:Type.values()) {
			if(name.equals(type.getName())) {
				return type.getType();
			}
		}
		return null;
	}
	
}
