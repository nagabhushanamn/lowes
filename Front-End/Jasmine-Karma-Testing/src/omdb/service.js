/**
 * 
 */




(function() {

	angular.module('omdb', [])

		.factory('omdbApi', function($http, $q) {
			var service = {}
			var baseUrl = "http://omdbapi.com/?apikey=3d569349&";

			function get(param) {
				var def = $q.defer();
				$http.get(baseUrl + param)
					.then(function(resp) {
						def.resolve(resp.data);
					}, function(reason) {
						def.reject(reason);
					})

				return def.promise;
			}

			service.search = function(query) {
				return get("s=" + encodeURIComponent(query));
			};
			service.find = function(id) {
				return get("i=" + id);
			}

			return service;
		});


})();