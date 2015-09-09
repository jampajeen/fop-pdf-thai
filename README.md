# fop-pdf-thai

This project was created to simplify embedding Thai font to PDF by using Apache FOP.

Installation

Add repository and dependency to pom.xml
```
    <repositories>
        <repository>
            <id>snapshots-repo</id>
            <url>https://oss.sonatype.org/content/repositories/snapshots</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
    <dependencies>
    	.....
        <dependency>
            <groupId>com.rinxor</groupId>
            <artifactId>fop-pdf-thai</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        .....
    </dependencies>
```

Use **"FopPdfThaiFactory"** instead of **"FopFactory"** to create a **"FopFactory"** object.

For example:

Change your code from...
```
FopFactory fopFactory = FopFactory.newInstance();
```

To...
```
FopFactory fopFactory = FopPdfThaiFactory.newInstance();
```

Or...
```
FopFactory fopFactory = FopPdfThaiFactory.newInstance(new ServletContextURIResolver(getServletContext())); // when you use FOP in servlet context
```

And now you can use XSLT to create your first PDF in Thai language (please specify font-family="Garuda").

This example project is a good point for start using the library:  https://github.com/jampajeen/business-pdf-form

Have fun!

