package org.grails.plugin.zippedresources

import java.util.zip.*

import org.grails.plugin.resource.mapper.MapperPhase

class ZipResourceMapper {

    static defaultExcludes = ['**/*.png','**/*.gif','**/*.jpg','**/*.jpeg','**/*.gz','**/*.zip']
    
    static phase = MapperPhase.ALTERNATEREPRESENTATION
    
    /**
     * Rename the file to a hash of it's contents, and set caching headers 
     */
    def map(resource, config) {
        def f = resource.processedFile

        def name = f.name
        def target = new File(f.parentFile, name+'.gz')

        if (log.debugEnabled) {
            log.debug "gzipping $f to $target"
        }
        def out = new GZIPOutputStream(new FileOutputStream(target))
        try {
            f.withInputStream { out << it }
        } finally {
            out.close()
        }


        // Update mapping entry 
        // NOTE: we don't change actualUrl because we want to link to the xxxx.css file
        // but transparently serve up the xxx.css.gz file
        resource.processedFile = target
        resource.requestProcessors << { req, resp ->
            // @todo perhaps we need to sense the request headers here and return some bad status / redirect
            // if the browser can't take gzip?
            
            // We leave content type as is, but set encoding
            resp.setHeader('Content-Encoding', 'gzip')

            // set Vary headers to enable caching in downstream caches
            resp.setHeader('Vary', 'Accept-Encoding')
            return true
        }    
    }
}
