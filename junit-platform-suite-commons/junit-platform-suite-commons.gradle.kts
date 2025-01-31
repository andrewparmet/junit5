plugins {
	`java-library-conventions`
}

description = "JUnit Platform Suite Commons"

dependencies {
	api(projects.junitPlatformLauncher)

	compileOnlyApi(libs.apiguardian)

	implementation(projects.junitPlatformEngine)
	implementation(projects.junitPlatformSuiteApi)

	osgiVerification(projects.junitJupiterEngine)
	osgiVerification(projects.junitPlatformLauncher)
}
