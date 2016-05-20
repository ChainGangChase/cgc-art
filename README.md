# art
_____
This repo contains the source art, packed textures, and atlas data files for the game. The [ChainGangChase/game](https://github.com/ChainGangChase/game) project build scripts will reference the files from `/package/assets` when building the game.

### Project Overview
```
/
assets/.............source art, files follow naming convention for frames
gradle/wrapper/...............properties and .jar file for gradle wrapper
package/assets/...........................built textures and .atlas files
src/.../art/Textures.java............................performs the packing
build.gradle.........................gradle build tasks and configuration
gradlew.....................................gradle wrapper for Mac, Linux
gradlew.bat....................................gradle wrapper for Windows
```

### Installation
Clone the repo.

Install the [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). The libGDX project requires 7+. Android Studio requires 8+. For consistency, 8u91 is recommended - which `java -version` reports as 1.8.0_91.

Optionally, you may install gradle v2.13 on your system ([mac](https://www.jayway.com/2013/05/12/getting-started-with-gradle/) | [windows](http://www.bryanlor.com/blog/gradle-tutorial-how-install-gradle-windows) | [linux](http://exponential.io/blog/2015/03/30/install-gradle-on-ubuntu-linux/)). But if you'd rather not, the bundled gradle wrappers will take care of everything for you.

### Usage
There are two options here, depending on how you decided to do the Installation:

###### Gradle Wrapper
On the commande line working in the repository root, run `./gradlew build` (mac | linux) or `gradlew build` (windows) - then sit back and watch the texture packer do its thing.

###### System Gradle
On the commande line working in the repository root, run `gradle build` - then sit back and watch the texture packer do its thing.

### Changelog
The first real release version is coming soon (once I iron out the build process in the game repo).
