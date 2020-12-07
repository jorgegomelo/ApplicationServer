# Application-Server
Application Server that simulates a scenario where the user needs to query data and integrate services.

JAVA; JPA/Hibernate; XML; XSD; EJB; Web Service; Web Front-End; Wildfly; PostgreSQL;

- The Loader loads the XML data about books into a database.
- Web Service Basic acesses the database (via EJB) and provides functionlaties like: "obtain all data about books", "obtain all titles", etc.
- Web Service New acesses the Web Service Basic and provides other kind of functionalities like: "Given a publisher, obtain the average rating of all its books", "Given a publisher name and a set of categories obtain its total number of books that
are classified in at least one of the categories provided.", etc.
- Client Application it's a command line app capable of using all functionality provided by both web services.
- Web Front-End where the user can use the system in a browser.
