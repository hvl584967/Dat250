# Expass1
### Software installation
I already had multiple JDK's and IDE's along with gitBash and GitHub desctop. 
The only thing remaining was Maven. I ran in to some problems with setting
the java version, but quickly fixed it after watching a tutorial.
### Heroku deployment
I started by not following the guide and making my own java project and deploying it.
This did somewhat work, but i found out that the guide had a pre-made project and
started going through the steps in the guide.
I successfully deployed the starter application. I ran in to problems on the database part due to my
laptop not having a propper path to the installed psql. This was fixed by adding a path to psql in the system variables.
I then ran into problems with installing Maven in the project as it claimed the project had no compiler.
The problem occured due to my java path being set to a jre. I fixed this by changing it to JDK 15. 
I could not start the application localy due to an error stating that the app had been compiled
in a newer Java version compared to the one i was trying to run it with.
It took a while to figure out this problem. I tried different java versions
and tried updating postgres. None of it worked so i tried having the project use java 1.8. This worked
and i could complete the rest of the tutorial without problems.

https://obscure-island-53125.herokuapp.com/
