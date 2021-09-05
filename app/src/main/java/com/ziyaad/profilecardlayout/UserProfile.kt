package com.ziyaad.profilecardlayout

data class UserProfile(val name: String, val status: Boolean, val drawableId: Int)

val userProfileList = arrayListOf<UserProfile>(
    UserProfile(name = "John Doe", status = true, R.drawable.profilepicture),
    UserProfile(name = "Jessica Doe", status = false, R.drawable.profilepicture),
    UserProfile(name = "John Doe", status = true, R.drawable.profilepicture),
    UserProfile(name = "Jessica Doe", status = false, R.drawable.profilepicture),
    UserProfile(name = "John Doe", status = true, R.drawable.profilepicture),
    UserProfile(name = "Jessica Doe", status = false, R.drawable.profilepicture),
    UserProfile(name = "John Doe", status = true, R.drawable.profilepicture),
    UserProfile(name = "Jessica Doe", status = false, R.drawable.profilepicture),
)