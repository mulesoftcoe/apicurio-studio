![Verify Build Workflow](https://github.com/Apicurio/apicurio-studio/workflows/Verify%20Build%20Workflow/badge.svg)

# Boilerplate studio project

## Summary

This is the  Git repository for the Boilerplate studio project:  https://github.com/mulesoftcoe/apicurio-studio

The apicurio studio project is a standalone API design studio that can be used to create
new or edit existing API designs (using the OpenAPI specification).

## Get the code

The easiest way to get started with the code is to [create your own fork](http://help.github.com/forking/)
of this repository, and then clone your fork:
```bash
  $ git clone git@github.com:<you>/apicurio-studio.git
  $ cd apicurio-studio
  $ git remote add upstream git://github.com/mulesoftcoe/apicurio-studio.git
```
At any time, you can pull changes from the upstream and merge them onto your master:
```bash
  $ git checkout master               # switches to the 'master' branch
  $ git pull upstream master          # fetches all 'upstream' changes and merges 'upstream/master' onto your 'master' branch
  $ git push origin                   # pushes all the updates to your fork, which should be in-sync with 'upstream'
```
The general idea is to keep your 'master' branch in-sync with the 'upstream/master'.

## Building Boilerplate-studio

### Requirements
- Maven 3.x
- Java 8 or 11 (recommended)

The following command compiles all the code, installs the JARs into your local Maven repository, and runs all of the unit tests:
```bash
  $ mvn clean install
```
## Quickstart (i.e. How To Run It)

The fastest way to get started using Boilerplate Studio is to use the Quickstart. The Boilerplate Studio bits required for this mode are produced as part 
of the full maven build - you can find it in.  To start up the Dev Mode, once the project has been built, follow the instructions under the [quickstart](./distro/quickstart/QUICKSTART.md) directory.

This will start the required Quarkus components on your local machine and you can access the UI at [http://localhost:8080](http://localhost:8080).