angular.module('module1', [])
  .controller('foodCrl', function($scope,$http) {

	
	$scope.message = "message";

	
	var onError = function(reason) {
		$scope.error = "error";
	};
	
	var onfoodlistcall = function(response) {
		$scope.foods = response.data;
		console.log(response.data);
		console.log(response.status);
	};
	
	var x = $scope.id;
	var string = "http://localhost:8081/foods/" + x;
	$http.get(string) // need to change for iteration
		.then(onfoodlistcall,onError);
		
		


  });