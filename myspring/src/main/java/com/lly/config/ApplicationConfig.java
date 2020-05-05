package com.lly.config;

import com.lly.anno.EnableLly;
import com.lly.myimports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//加这个注释后，spring扫描后，就会变成代理类，保证是个单例
@Configuration

@ComponentScan(value = "com.lly")

public class ApplicationConfig {
}
