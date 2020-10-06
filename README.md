## No need to `gradle clean`

1. `git checkout broken` - goes back in history where we have broken test
2. `./gradlew build` - it's red
3. `git checkout fixed` - this deletes the red test
4. `./gradlew build` - it's green, you didn't have to `./gradlew clean build`

Gradle tasks can track their inputs and outputs.
They implicitly tell Gradle when to clean which files.
Standard Gradle tasks track their dependencies well.

Maybe your custom task doesn't do it, so a `clean` helps.
The correct solution is to fix your task dependency tracking.
You'll unblock the power of incremental builds and save time for yourself (and your teammates)
on every build.
