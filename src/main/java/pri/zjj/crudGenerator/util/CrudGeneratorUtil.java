package pri.zjj.crudGenerator.util;

import java.util.Map;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 *ClassName:CrudGeneratorUtil
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月21日
 *@Version 1.0
 */
@Component
public class CrudGeneratorUtil {
	
	@Setter
	@Getter
	private String basePackage;
	@Autowired
	private GroupTemplate gt;
	
	
	public String generator(String templateName,Map params) {
		
		Template template=gt.getTemplate(templateName);
		template.binding(params);
		return template.render();
	}
	
	public static void main(String[] args) {
		
		
	}
}
