package com.example.cf;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantsController {
  public static FetchData worker;

  @GetMapping("/merchants") 
  public CompletableFuture<Merchants> getMerchants(@RequestParam(value = "name", defaultValue = "Diksha") String name) {
    try {
        System.out.println("Starting work");
        CompletableFuture<Merchants> m1 = null;
        for (int i = 0; i < 3; i++) {;
          m1 = FetchData.getMerchants(Integer.toString(i));
        }
      //  CompletableFuture<Merchants> m2 = FetchData.getMerchants("Daisy");
       // CompletableFuture.allOf(m1,m2).join();
        return m1;
    } catch(Exception e) {
       // e.printStackTrace();
        return null;
    }
  }

  @PostMapping("/merchants")
  public Merchants printShop(@RequestBody Merchants newShop ) {
    return new Merchants(newShop.getname(), newShop.gettype());
  }
}