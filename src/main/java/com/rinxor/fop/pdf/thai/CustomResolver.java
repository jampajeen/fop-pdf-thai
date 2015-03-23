/*
 * Copyright 2015 Thitipong Jampajeen <jampajeen@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rinxor.fop.pdf.thai;

/**
 *
 * @author Thitipong Jampajeen <jampajeen@gmail.com>
 */
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamSource;
import org.apache.fop.servlet.ServletContextURIResolver;

public class CustomResolver implements URIResolver {

    ServletContextURIResolver servletResolver;

    public CustomResolver() {

    }

    public CustomResolver(ServletContextURIResolver servletResolver) {
        this.servletResolver = servletResolver;
    }

    @Override
    public Source resolve(String href, String base) throws TransformerException {

        if (href.contains("font/Garuda-Bold.ttf")
                || href.contains("font/Garuda-Bold.xml")
                || href.contains("font/Garuda-BoldOblique.ttf")
                || href.contains("font/Garuda-BoldOblique.xml")
                || href.contains("font/Garuda-Oblique.ttf")
                || href.contains("font/Garuda-Oblique.xml")
                || href.contains("font/Garuda.ttf")
                || href.contains("font/Garuda.xml")
                || href.contains("fop-pdf-thai.xml")) {

            return new StreamSource(getClass().getResourceAsStream(href));

        } else if (this.servletResolver != null) {

            return servletResolver.resolve(href, base);
        } else {

            return new StreamSource(href);
        }
    }
}
