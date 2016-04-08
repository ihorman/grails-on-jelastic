package helloworld
import org.codehaus.groovy.grails.core.io.ResourceLocator
import org.springframework.core.io.Resource


class InfortelecomHwController {

    ResourceLocator grailsResourceLocator

    def index() { 
        render "Hello from Infortelecom!"
}
}
