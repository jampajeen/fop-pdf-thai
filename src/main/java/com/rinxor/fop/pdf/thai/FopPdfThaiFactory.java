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

import java.io.IOException;
import javax.naming.ConfigurationException;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.servlet.ServletContextURIResolver;
import org.xml.sax.SAXException;

/**
 *
 * @author Thitipong Jampajeen <jampajeen@gmail.com>
 */
public class FopPdfThaiFactory {

    public static FopFactory newInstance() throws IOException, SAXException, ConfigurationException, org.apache.avalon.framework.configuration.ConfigurationException {

        return (new FopPdfThai()).initFopFactoryFromJar();
    }

    public static FopFactory newInstance(ServletContextURIResolver servletResolver) throws IOException, SAXException, ConfigurationException, org.apache.avalon.framework.configuration.ConfigurationException {

        return (new FopPdfThai(servletResolver)).initFopFactoryFromJar();
    }

}
