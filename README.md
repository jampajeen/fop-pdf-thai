# fop-pdf-thai

This project was created to simplify embedding Thai font to PDF by using Apache FOP.

You can use **"FopPdfThaiFactory"** instead of **"FopFactory"** to create a **"FopFactory"** object.

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

And now you can use XSLT to create your first PDF in Thai language.
Have fun!

