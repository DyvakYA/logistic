'use strict';

angular.module('myApp.transports', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/transports', {
    templateUrl: 'transports/transports.html',
    controller: 'TransportsCtrl'
  });
}])

.controller('TransportsCtrl', [function() {

}]);