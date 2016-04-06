package helloworld
import org.codehaus.groovy.grails.core.io.ResourceLocator
import org.springframework.core.io.Resource


class InfortelecomHwController {

    ResourceLocator grailsResourceLocator

    def index() { 
        final Resource image = grailsResourceLocator.findResourceForURI('/images/it2.png')
        render file: image.inputStream, contentType: 'image/png'
        
}
}
