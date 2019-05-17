package com.yotalabs.koral.data.storages.impl

import com.yotalabs.koral.data.storages.SignUpCustomerRepository
import com.yotalabs.koral.data.storages.SignUpPersonalRepository
import com.yotalabs.koral.data.storages.SignUpRepository
import com.yotalabs.koral.ui.adapters.models.ProfessionItem
import io.reactivex.subjects.BehaviorSubject

/**
 * @author SashaKhyzhun
 * Created on 5/5/19.
 */
class SignUpPersonalRepositoryImpl(
    private val signUpRepository: SignUpRepository
) : SignUpPersonalRepository {

    override fun firstName(): BehaviorSubject<CharSequence> = signUpRepository.firstName()

    override fun lastName(): BehaviorSubject<CharSequence> = signUpRepository.lastName()

    override fun phoneNumber(): BehaviorSubject<CharSequence> = signUpRepository.phoneNumber()

    override fun email(): BehaviorSubject<CharSequence> = signUpRepository.email()

    override fun password(): BehaviorSubject<CharSequence> = signUpRepository.password()

    override fun photo(): BehaviorSubject<CharSequence> = signUpRepository.photo()

    override fun accountType(): BehaviorSubject<CharSequence> = signUpRepository.accountType()

    override fun terms(): BehaviorSubject<Boolean> = signUpRepository.terms()

    override fun nextButton(): BehaviorSubject<Boolean> = signUpRepository.nextButton()

    override fun profession(): BehaviorSubject<ProfessionItem> = signUpRepository.profession()
}
