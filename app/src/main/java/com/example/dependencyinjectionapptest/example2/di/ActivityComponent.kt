package com.example.dependencyinjectionapptest.example2.di

import com.example.dependencyinjectionapptest.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
	modules = [ViewModelModule::class]
)
interface ActivityComponent {

	fun inject(activity: MainActivity)

	@Subcomponent.Factory
	interface Factory {
		fun create(
			@BindsInstance @IdQualifier id: String,
			@BindsInstance @NameQualifier name: String
		): ActivityComponent
	}
}