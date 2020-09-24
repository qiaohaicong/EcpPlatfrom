package com.wy.server.utils;

import com.baomidou.mybatisplus.annotation.DbType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Auther: DELL
 * @Date: 2020/9/11 16:06
 * @Description:
 */
public class Generator {

    //项目路径
    private static String canonicalPath = "D:\\TestMySpringBoot\\ecp-server\\wy-server";

    //基本包名
    private static String basePackage = "com.wy.server.auto.web";

    //要生成的表名
    private static String[] tables = {"t_jf_charging_item_total_info","t_jf_assets_charging_detail_info","tc_building"};
//    ,
//    "t_ac_account","t_ac_bill_detail","t_ac_bill_project","t_ac_business_opera_detail","t_ac_common_account_detail",
//    "t_ac_current_charge_detail","t_ac_cycle_order_detail","t_ac_delay_account","t_ac_last_bill_fee_info","t_ac_late_fee_bill_info",
//    "t_ac_late_fee_stream","t_ac_order",""};
    //table前缀，会在生成相应文件命名的时候去掉，这里不给
    private static String prefix = "";

    //数据库类型
    private static DbType dbType = DbType.MYSQL;
    //数据库配置四要素
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://10.1.20.11:3306/wypt?useUnicode=true&serverTimezone=UTC&allowMultiQueries=true";
    private static String username = "root";
    private static String password = "JJ_passwd@2017";


    public static void main(String[] args) {

        AutoGenerator gen = new AutoGenerator();

        /**
         * 获取项目路径(默认的是获取本项目的根目录，如果是子项目会生成到根项目去,不用这个直接给定就好)
         */
//        try {
//            canonicalPath = new File("D:\\TestMySpringBoot\\wy").getCanonicalPath();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * 数据库配置
         */
        gen.setDataSource(new DataSourceConfig()
                .setDbType(dbType)
                .setDriverName(driverName)
                .setUrl(url)
                .setUsername(username)
                .setPassword(password)
                .setTypeConvert(new MySqlTypeConvert() {
                    // 自定义数据库表字段类型转换【可选】
                    //@Override
                    //public DbColumnType processTypeConvert(String fieldType) {
                    //System.out.println("转换类型：" + fieldType);
                    // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                    //    return DbColumnType.BOOLEAN;
                    // }
                    //return super.processTypeConvert(fieldType);
                    //}
                }));

        /**
         * 全局配置
         */
        gen.setGlobalConfig(new GlobalConfig()
                //输出目录
                .setOutputDir( canonicalPath + "/src/main/java")
                // 是否覆盖文件
                .setFileOverride(true)
                .setAuthor("qhc")
                // 开启 activeRecord 模式
                .setActiveRecord(true)
                // XML 二级缓存
                .setEnableCache(false)
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columList
                .setBaseColumnList(true)
                //生成后打开文件夹
                .setOpen(false)
                // 自定义文件命名，注意 %s 会自动填充表实体属性！
                .setMapperName("%sMapper")
                .setXmlName("%sxml")
                .setServiceName("%sService")
                .setServiceImplName("%sServiceImpl")
                .setControllerName("%sController")
                .setBaseResultMap(true)
                .setBaseColumnList(true)
        );

        /**
         * 策略配置
         */
        gen.setStrategy(new StrategyConfig()
                        // .setCapitalMode(true)// 全局大写命名
                        //.setDbColumnUnderline(true)//全局下划线命名
                        // 此处可以修改为您的表前缀
                        .setTablePrefix(new String[]{prefix})
                        // 表名生成策略
                        .setNaming(NamingStrategy.underline_to_camel)
                        // 需要生成的表
                        .setInclude(tables)
                        .setRestControllerStyle(true)
                        // 排除生成的表
//                        .setExclude(tables)
                        // 自定义实体父类
                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
                        //.setSuperEntityColumns(new String[]{"test_id"})
                        //.setTableFillList(tableFillList)
//                         自定义 mapper 父类 默认BaseMapper
//                        .setSuperMapperClass("com.baomidou.mybatisplus.mapper.BaseMapper")
                        // 自定义 service 父类 默认IService
                        // .setSuperServiceClass("com.baomidou.demo.TestService")
                        // 自定义 service 实现类父类 默认ServiceImpl
                        // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                        // 自定义 controller 父类
                        //.setSuperControllerClass("com.kichun."+packageName+".controller.AbstractController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                        // .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
                        // .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                        .setEntityLombokModel(true)
                // Boolean类型字段是否移除is前缀处理
                // .setEntityBooleanColumnRemoveIsPrefix(true)
                // .setRestControllerStyle(true)
                // .setControllerMappingHyphenStyle(true)
        );

        /**
         * 包配置
         */
        gen.setPackageInfo(new PackageConfig()
                //.setModuleName("User")
                // 自定义包路径
                .setParent(basePackage)
                // 这里是控制器包名，默认 web
                .setController("controller")
                // 设置Entity包名，默认entity
                .setEntity("entity")
                // 设置Mapper包名，默认mapper
                .setMapper("mapper")
                // 设置Service包名，默认service
                .setService("service")
                // 设置Service Impl包名，默认service.impl
                .setServiceImpl("service.impl")
                // 设置Mapper XML包名，默认mapper.xml
                .setXml("mapper")
        );

        /**
         * 注入自定义配置
         */
        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig abc = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        //自定义文件输出位置（非必须）
        List<FileOutConfig> fileOutList = new ArrayList<FileOutConfig>();
        fileOutList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return canonicalPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        abc.setFileOutConfigList(fileOutList);
        gen.setCfg(abc);

        /**
         * 指定模板引擎 默认是VelocityTemplateEngine ，需要引入相关引擎依赖
         */
        //gen.setTemplateEngine(new FreemarkerTemplateEngine());

        /**
         * 模板配置
         */
        gen.setTemplate(
                // 关闭默认 xml 生成，调整生成 至 根目录
                new TemplateConfig().setXml(null)
                // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                // .setController("...");
                // .setEntity("...");
                // .setMapper("...");
                // .setXml("...");
                // .setService("...");
                // .setServiceImpl("...");
        );

        // 执行生成
        gen.execute();
    }

}
