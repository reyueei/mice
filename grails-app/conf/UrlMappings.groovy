class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        // "/" (controller:'NodeChart',action:'index')
		"500"(view:'/error')
	}
}
