package cn.kgc.contorller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController是Controller和ResponseBody组合的注解
@RestController
@ConfigurationProperties(prefix = "person")
public class QuickController {
   private String name;
   private String age;
   @RequestMapping("/quick")
   public String quick(){
      return name+" spring boot"+age;

   }
   public void setName(String name) { this.name = name; }
   public void setAge(String age) { this.age = age; }
}
