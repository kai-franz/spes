# SQL Query Equivalence

A tool for checking equivalence of SQL queries.

# Directions for use (Intel Mac)

1. Clone this repository
2. Download z3 from https://github.com/Z3Prover/z3/releases/tag/z3-4.6.0
3. Unzip z3 and copy the folder to the root directory of this repository.
4. You should up with a directory structure like this:
    - `spes`
        - `src`
        - `testData`
        - `z3-4.6.0-x64-osx-10.11.6`
5. Build the project (hammer icon in IntelliJ)
6. To use SPES, you need to set the environment variables `LD_LIBRARY_PATH` and `DYLD_LIBRARY_PATH` to the path of
   the `bin` folder in the z3 directory. For example, if you cloned the repository to `/Users/test/spes`, you would set
   the environment variables to `/Users/test/spes/z3-4.6.0-x64-osx-10.11.6/bin`. You also need to add this
   to `java.library.path`.
    - To do this in IntelliJ, go to `Run > Edit Configurations...` and click on `Edit configuration templates` in the
      bottom left. Then click on `Application` and paste this to the `Environment variables` section, changing the
      directory to point to your z3
      directory: `LD_LIBRARY_PATH=/Users/test/IdeaProjects/spes/z3-4.6.0-x64-osx-10.11.6/bin/;
      DYLD_LIBRARY_PATH=/Users/test/IdeaProjects/spes/z3-4.6.0-x64-osx-10.11.6/bin/`
    - To now run a test, go to `target/test-classes/SimpleQueryTests`, right click on a test, for
      example `JoinEqualOuterJoin`, and click `Run`.

# z3 update

needs to build on z3 4.6 version:
github link: https://github.com/Z3Prover/z3/releases

# test case

1. check SimpleTest in test/java/SimpleQuery/Tests.
