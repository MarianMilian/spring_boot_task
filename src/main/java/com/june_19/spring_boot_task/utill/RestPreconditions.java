package com.june_19.spring_boot_task.utill;

import com.june_19.spring_boot_task.exeption.MyResourceNotFoundException;

public class RestPreconditions {
    public static <T> T checkFound (T resouce){
      if(resouce==null){
          throw new MyResourceNotFoundException();
      }
      return resouce;
    }
}
