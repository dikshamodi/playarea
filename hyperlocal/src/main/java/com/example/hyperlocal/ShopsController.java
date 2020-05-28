package com.example.hyperlocal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

@RestController
public class ShopsController {
  @GetMapping("/shops") 
  public WebAsyncTask<Shops> pqShops(@RequestParam(value="name",
   defaultValue = "Strnager")String name) {
    return new WebAsyncTask<Shops> (15000, () -> {
      Thread.sleep(10000);
      return new Shops(name, "grocery");
    });
  }

  @PostMapping("/shops")
  public Shops printShop(@RequestBody Shops newShop ) {
    return new Shops(newShop.getName(), newShop.getType());
  }
}