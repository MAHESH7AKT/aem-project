package com.adobe.aem.may.batch.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoClass {

    @ValueMapValue
    private String title;

      @ValueMapValue
    private String description;

      @ValueMapValue
    private int number;

      public String getText() {
          return title;
      }

      public String getDescription() {
          return description;
      }

      public int getNumber() {
          return number;
      }

    
    ;

    


}
