package com.example.dependencyinjectionapptest.example1

class MainActivity {

	lateinit var computer: Computer
	lateinit var keyboard: Keyboard

	init {
		Component().inject(this)
	}
}