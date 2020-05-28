package com.example.cf;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class FetchData {
  @Async
  public static CompletableFuture<Merchants> getMerchants(String name) {
    CompletableFuture<Merchants> ftre = CompletableFuture.supplyAsync(
      () -> {
        try {
          System.out.println("I started");
          Thread.sleep(5000);
          System.out.println("I'm done");
          return new Merchants(name, "Grocery");
        } catch (Exception e) {
          e.printStackTrace();
          return null;
        }
      }
    );

   ftre = ftre.thenApply((f) -> {
      try {
        Thread.sleep(3000);
        return new Merchants(f.getname(), "second");
      } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
        return null;
      }
    });
    return ftre;
  }
}