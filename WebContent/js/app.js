var myApp = angular.module('myApp',['ui.bootstrap']);

myApp.controller('myController', function($scope, $http){
	
	$http.get('js/keyholdings.json').success(function(data) {
	    $scope.keyHoldings = data.keyHoldings;
	    $scope.keyHoldingClass = data.class;
	    $scope.perfCurr = data.prefCurr;
	    $scope.sortBySize = ['Largest','Smallest'];
	    $scope.showMoreRows = ['Show 10','Show 25','Show 50'];
	    $scope.export = ['Export'];
	  });
});