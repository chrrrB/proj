var app = angular.module('app', ['ngRoute']);
  app.controller('FoodController', function($scope,$http) {
	$scope.message = "List of soon-to-be-expanded-upon consumable items";

	$scope.id ="";

	$scope.clickId = function (id) {
		$scope.id= id;
	}
	var onError = function(reason) {
		$scope.error = "Something got screwd up !!";
	};
	
	var onfoodlistcall = function(response) {
		$scope.foods = response.data;
		console.log(response.data);
		console.log(response.status);
		console.log($scope.foods[0].protein)
	};
	
	$http.get("http://localhost:8081/foods") //
		.then(onfoodlistcall,onError);
		
	
  });

  app.config(['$routeProvider', function($routeProvider){
	$routeProvider
	.when('/', {
		template: 'Text'
	})
	.when('/food/:a', {
		templateUrl:'page1.htm',
		controller: 'foodCrl'
	})
  }]);

  app.controller('foodCrl', ['$scope', '$routeParams', '$http', function($scope, $routeParams, $http){
	$scope.a = $routeParams.a;
	
	var onfoodlistcall = function(response) {
		$scope.foods = response.data;
		console.log(response.data);
		console.log(response.status);
	};
	
	var x = $scope.a;
	var string = "http://localhost:8081/foods/" + x;
	$http.get(string)
		.then(onfoodlistcall,onError);
		
	
  }])

