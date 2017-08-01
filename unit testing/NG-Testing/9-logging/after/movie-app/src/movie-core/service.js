angular.module('movieCore', ['ngResource'])
	.factory('PopularMovies', function($resource) {
		var token = 'teddybear'; // TBC
		return $resource('http://www.omdbapi.com/?&apikey=3d569349/:movieId', { movieId: '@id' }, {
			update: {
				method: 'PUT',
				headers: { 'authToken': token }
			},
			get: {
				method: 'GET',
				headers: { 'authToken': token }
			},
			query: {
				method: 'GET',
				headers: { 'authToken': token }
			},
			save: {
				method: 'POST',
				headers: { 'authToken': token }
			},
			remove: {
				method: 'DELETE',
				headers: { 'authToken': token }
			}
		});
	});
