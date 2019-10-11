package com.kaju.model

import com.google.gson.annotations.SerializedName


data class UserModel(
        @SerializedName("data")
        val `data`: List<UserData>,
        @SerializedName("message")
        val message: String,
        @SerializedName("status")
        val status: Boolean
)

data class UserData(
        @SerializedName("create_at")
        val createAt: String,
        @SerializedName("dob")
        val dob: String,
        @SerializedName("email")
        val email: String,
        @SerializedName("first_name")
        val firstName: String,
        @SerializedName("gender")
        val gender: String,
        @SerializedName("last_name")
        val lastName: String,
        @SerializedName("mobile")
        val mobile: String,
        @SerializedName("password")
        val password: String,
        @SerializedName("token")
        val token: Any,
        @SerializedName("uid")
        val uid: String,
        @SerializedName("user_avatar")
        val userAvatar: String
)
