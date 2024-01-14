package com.example.fooddelivery.Models

class PopularModel {
    private var foodImage: Int? = null
    private var foodName: String? = ""
    private var foodPrice: String? = ""

    constructor()
    constructor(foodImage: Int?, foodName: String?, foodPrice: String?) {
        this.foodImage = foodImage
        this.foodName = foodName
        this.foodPrice = foodPrice
    }

     fun getFoodImage() : Int? {
        return foodImage
    }
     fun getFoodName() : String? {
        return foodName
    }
     fun getFoodPrice() : String? {
        return foodPrice
    }

     fun setFoodImage(foodImage: Int?) {
        this.foodImage = foodImage
    }
     fun setFoodName(foodName: String?) {
        this.foodName = foodName
    }
     fun setFoodPrice(foodPrice: String?) {
        this.foodPrice = foodPrice
    }

}