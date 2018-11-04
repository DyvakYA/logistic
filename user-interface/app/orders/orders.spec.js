'use strict';

describe('myApp.orders module', function() {

  beforeEach(module('myApp.orders'));

  describe('orders controller', function(){

    it('should ....', inject(function($controller) {
      //spec body
      var view2Ctrl = $controller('OrdersCtrl');
      expect(view2Ctrl).toBeDefined();
    }));

  });
});