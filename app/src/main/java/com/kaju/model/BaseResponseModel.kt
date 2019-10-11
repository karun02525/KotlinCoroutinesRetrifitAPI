package com.kaju.model

import com.google.gson.annotations.SerializedName

data class BaseResponseModel(
        @SerializedName("data")
        var `data`: LoginModel?,
        @SerializedName("message")
        var message: String?
)

data class LoginModel(
        @SerializedName("account_name")
        var accountName: String?,
        @SerializedName("account_num")
        var accountNum: String?,
        @SerializedName("active")
        var active: Int?,
        @SerializedName("Authorization")
        var authorization: String?,
        @SerializedName("branch")
        var branch: String?,
        @SerializedName("captain_type")
        var captainType: String?,
        @SerializedName("created_at")
        var createdAt: String?,
        @SerializedName("deleted_at")
        var deletedAt: Any?,
        @SerializedName("earning_percentage")
        var earningPercentage: String?,
        @SerializedName("email")
        var email: String?,
        @SerializedName("employee_code")
        var employeeCode: String?,
        @SerializedName("first_login")
        var firstLogin: String?,
        @SerializedName("gender")
        var gender: Int?,
        @SerializedName("has_agree")
        var hasAgree: Int?,
        @SerializedName("id")
        var id: Int?,
        @SerializedName("ifsc_code")
        var ifscCode: String?,
        @SerializedName("lang")
        var lang: String?,
        @SerializedName("last_login")
        var lastLogin: String?,
        @SerializedName("lat")
        var lat: String?,
        @SerializedName("login_count")
        var loginCount: Int?,
        @SerializedName("long")
        var long: String?,
        @SerializedName("mobile")
        var mobile: String?,
        @SerializedName("mobile_verified")
        var mobileVerified: String?,
        @SerializedName("name")
        var name: String?,
        @SerializedName("pan_num")
        var panNum: String?,
        @SerializedName("partners")
        var partners: Int?,
        @SerializedName("password_changed")
        var passwordChanged: String?,
        @SerializedName("refresh_token")
        var refreshToken: String?,
        @SerializedName("region")
        var region: String?,
        @SerializedName("total_lead_assisted_partners")
        var totalLeadAssistedPartners: Int?,
        @SerializedName("total_self_initiated_partners")
        var totalSelfInitiatedPartners: Int?,
        @SerializedName("updated_at")
        var updatedAt: String?
)
