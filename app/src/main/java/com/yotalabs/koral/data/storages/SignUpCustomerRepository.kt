package com.yotalabs.koral.data.storages

import android.graphics.Bitmap
import io.reactivex.subjects.BehaviorSubject

interface SignUpCustomerRepository {

    fun firstName(): BehaviorSubject<CharSequence>
    fun lastName(): BehaviorSubject<CharSequence>
    fun phoneNumber(): BehaviorSubject<CharSequence>
    fun email(): BehaviorSubject<CharSequence>
    fun password(): BehaviorSubject<CharSequence>
    fun photo(): BehaviorSubject<Bitmap>
    fun accountType(): BehaviorSubject<CharSequence>
    fun terms(): BehaviorSubject<Boolean>
    fun nextButton(): BehaviorSubject<Boolean>

}