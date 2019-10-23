package pri.zjj.crudGenerator;


import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pri.zjj.crudGenerator.db.bean.Column;
import pri.zjj.crudGenerator.db.bean.Table;
import pri.zjj.crudGenerator.util.CrudGeneratorUtil;

@SpringBootApplication
public class CrudGeneratorApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(CrudGeneratorApplication.class, args);
		CrudGeneratorUtil crudGeneratorUtil=applicationContext.getBean(CrudGeneratorUtil.class);
		Table table=Table.builder().name("Test").column(Column.builder().field("test").type("String").build()).build();
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("table", table);
		String out=crudGeneratorUtil.generator("\\EntityTemplate.java", params);
		System.out.println(out);
	}

}
