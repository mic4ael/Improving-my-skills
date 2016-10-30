package restaurantreservationsystem

class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/" (controller: 'Home')
        "/register" (controller: 'Registration') {
            action = [GET: "index", POST: "create"]
        }
        "/users" (controller: 'Users', action: 'index')
        name(userManagement: "/users/$id" (controller: 'Users') {
            action = [DELETE: "delete", PUT: "update"]
        })
        "500" (view: '/error')
        "404" (view: '/notFound')
    }
}
