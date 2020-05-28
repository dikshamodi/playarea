package com.example.hyperlocal;

public class Shops {
  private final String name;
  private final String type;

  public Shops(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }
}