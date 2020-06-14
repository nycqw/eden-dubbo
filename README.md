#### IDEA自定义骨架

注意：顶级项目名称需是子项目名称的前缀

```shell
# 模板项目根路径下执行生成骨架：F:\Code\eden-dubbo
mvn archetype:create-from-project
# 安装骨架：F:\Code\eden-dubbo\target\generated-sources\archetype
mvn install
# 发布骨架到maven仓库，任意路径执行
mvn archetype:crawl
# idea 中添加骨架
```



