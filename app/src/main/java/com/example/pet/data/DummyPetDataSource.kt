package com.example.pet.data

import com.example.pet.R


object DummyPetDataSource {

    private val owner = listOf(
        Owner(name = "Deon", "Developer", R.drawable.deon_cartoon),
        Owner(name = "Deon", "Music Producer", R.drawable.deon_cartoon),
        Owner(name = "Deon", "Mix Engineer", R.drawable.deon_cartoon),
        Owner(name = "Deon", "Audio Engineer", R.drawable.deon_cartoon),
        Owner(name = "Deon", "Lawyer", R.drawable.deon_cartoon)

    )

    val petList = listOf(
        Pet(
            id = 0,
            name = "Hachiko",
            age = "Adult",
            gender = "Male",
            owner = owner[0],
            color = "Brown",
            breed = "Akita",
            location = "Toronto, Canada",
            image = R.drawable.orange_dog,
            description = "Hachiko, a loyal Akita, is famous for his unwavering devotion to his owner. He would wait for his owner at the train station every day after work, even after his owner passed away."
        ),
        Pet(
            name = "Skooby Doo",
            gender = "Male",
            age = "Adult",
            breed = "Great Dane",
            color = "Gold",
            location = "Tokyo, Japan",
            image = R.drawable.white_dog,
            description = "Skooby Doo, a playful and curious Great Dane, loves solving mysteries with his friends and enjoys a good Scooby Snack!",
            id = 1,
            owner = owner[1]
        ),
        Pet(
            name = "Miss Agnes",
            gender = "Female",
            age = "Adult",
            breed = "Chihuahua",
            color = "White",
            location = "Rome, Italy",
            image = R.drawable.red_dog,
            description = "Miss Agnes, a sassy Chihuahua, loves to play dress-up and has a wardrobe full of tiny outfits. She's also a champion lap warmer!",
            id = 2,
            owner = owner[2]
        ),
        Pet(
            name = "Cyrus",
            gender = "Male",
            age = "Baby",
            breed = "Chihuahua",
            color = "Black",
            location = "Barcelona, Spain",
            image = R.drawable.yellow_dog,
            description = "Cyrus, a curious Chihuahua puppy, loves exploring every nook and cranny of the house. He's full of energy and always up for an adventure!",
            id = 3,
            owner = owner[3]
        ),
        Pet(
            name = "Shelby",
            gender = "Female",
            age = "Baby",
            breed = "Mixed",
            color = "Chocolate",
            location = "Dordrecht, The Netherlands",
            image = R.drawable.white_dog,
            description = "Shelby, a playful and cuddly mixed breed puppy, is full of love and enjoys playing fetch in the park. She's always wagging her tail and eager to meet new friends!",
            id = 4,
            owner = owner[4]
        ),
    )
}