package com.example.wetest.Enum;

public enum Category {
    VIP("VIP"), EXCELLENT("우수"), BASIC("기본"), CAUTION("주의"), WARNING("경고");
    
    final private String category;
    
    Category(String category) {
        this.category = category;
    }
    public String getCategory() {
        return this.category;
    }
}
