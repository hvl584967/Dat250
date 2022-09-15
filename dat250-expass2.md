## Expass2
I had no problems getting JPA to start and finnished the optional task.
I had som problems with ManyToMany relations. These problems led me to install
Derby in hopes of setting up a database. This somewhat worked, but som changes
to persistence.xml allowed me to set up the database. The Derby innstallation
allowed me to view the tables and their relations. There was otherwise no other
problems with the database. The test came back red multiple times. Some of the
errors were caused by forgetting to add objects in relations such as credit cards
not being given the pincod. Other errors were simply incorrect typing of the returned values.
