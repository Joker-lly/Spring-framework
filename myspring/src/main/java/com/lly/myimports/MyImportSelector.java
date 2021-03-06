package com.lly.myimports;

import com.lly.dao.MyBeanProcessor;
import com.lly.dao.UserDaoImpl2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{MyBeanProcessor.class.getName()};
}
}
