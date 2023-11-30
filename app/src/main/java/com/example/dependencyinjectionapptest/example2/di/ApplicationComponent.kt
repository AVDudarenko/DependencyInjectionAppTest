package com.example.dependencyinjectionapptest.example2.di

import android.content.Context
import com.example.dependencyinjectionapptest.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

	fun inject(activity: MainActivity)

	@Component.Factory
	interface ApplicationComponentFactory {
		fun create(
			@BindsInstance context: Context,
			@BindsInstance currentTimeMillis: Long
		): ApplicationComponent
	}

}