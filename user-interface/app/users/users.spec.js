'use strict';

describe('myApp.users module', function() {

  beforeEach(module('myApp.users'));

  describe('users controller', function(){

    it('should ....', inject(function($controller) {
      //spec body
      var usersCtrl = $controller('UsersCtrl');
      expect(usersCtrl).toBeDefined();
    }));

  });
});