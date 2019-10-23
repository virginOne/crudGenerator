package $

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

{param.basePackage}.entity;

/**
 *ClassName:${table.upName}Controller
 *@Description:${param.description!}
 *
 *@Author ${param.author!}
 *@Date ${param.data!}
 *@Version ${param.version!}
 */
@RestController
@RequestMapping("/${table.lowName}")
public class #{table.upName}Controller {
	
}
