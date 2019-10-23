package pri.zjj.crudGenerator.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.FileResourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import pri.zjj.crudGenerator.db.bean.Column;
import pri.zjj.crudGenerator.db.bean.Table;
import pri.zjj.crudGenerator.util.CrudGeneratorUtil;

/**
 *ClassName:BeetlConfig
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月22日
 *@Version 1.0
 */
@Configuration
public class BeetlConfig {
	
	@Bean
	public GroupTemplate getGroupTemplate() throws IOException {
		
		String root = ResourceUtils.getURL("classpath:").getPath()+File.separator+"templates";
		
		FileResourceLoader fileResourceLoader=new FileResourceLoader(root, "UTF-8");
		
		org.beetl.core.Configuration cfg=org.beetl.core.Configuration.defaultConfiguration();
		
		return new GroupTemplate(fileResourceLoader, cfg);
	}
	public static void main(String[] args) throws FileNotFoundException {
//		CrudGeneratorUtil crudGeneratorUtil=CrudGeneratorUtil.builder().build();
		Table table=Table.builder().name("Test").column(Column.builder().field("test").type("String").build()).build();
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("table", table);
//		String out=crudGeneratorUtil.generator("EntityTemplate.java", params);
//		System.out.println(out);
	}
}
