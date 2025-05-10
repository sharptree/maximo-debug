# Debug Project Template
This project template for IntelliJ is designed to allow for remote debugging of a Maximo system.

To get started use the extract-library script to extract the business objects and webclient Jar files from Maximo. Once extracted, unzip the Jar files to the libs directory and import the Gradle project so they will be included on the project classpath.

The extract-lirbary script can be found in the `scripts` folder for this project or you can find more details in the script library repository here:
[https://github.com/sharptree/autoscript-library/tree/main/extract-library](https://github.com/sharptree/autoscript-library/tree/main/extract-library)