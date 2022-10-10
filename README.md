# libGDX Spriter Demo (updated)

A lot of the example Spriter repositories are old and I had a hard time making them work in HTML/GWT specifically.  
This project template was created using  [gdx-liftoff](https://github.com/tommyettinger/gdx-liftoff).  It uses gdxVersion 1.11.0.

This project includes the [spriter](https://github.com/Trixt0r/spriter) and [gdx-spriter](https://github.com/Trixt0r/gdx-spriter) 
source code in the core module because I wanted to modify some of the code.  For example:
- the entire library uses a custom Point class, which I am slowly migrating to libGDX's Vector2 class.
- the original examples used FileHandle.file() which is not supported in HTML/GWT.
- renaming the implementation classes.

# Dekstop, HTML, Android tested

This new Spriter demo was tested on Desktop, HTML, and a on a physical Android phone and all worked for me.

# Project Setup

This [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/tommyettinger/gdx-liftoff).

Android Studio IDE details: 

`Android Studio Chipmunk | 2021.2.1 Patch 2`

`Build #AI-212.5712.43.2112.8815526, built on July 10, 2022`

`Runtime version: 11.0.12+7-b1504.28-7817840 amd64`

This project was generated with a template including simple application launchers and an `ApplicationAdapter` extension that draws libGDX logo.

-  gwtFrameworkVersion=2.8.2
-  gwtPluginVersion=1.1.18
-  androidPluginVersion=7.0.4
-  gdxVersion=1.11.0

## Gradle

This project uses [Gradle](http://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `android:lint`: performs Android project validation.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `html:dist`: compiles GWT sources. The compiled application can be found at `html/build/dist`: you can use any HTTP server to deploy it.
- `html:superDev`: compiles GWT sources and runs the application in SuperDev mode. It will be available at [localhost:8080/html](http://localhost:8080/html). Use only during development.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.
