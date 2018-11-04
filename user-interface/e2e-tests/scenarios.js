'use strict';

/* https://github.com/angular/protractor/blob/master/docs/toc.md */

describe('my app', function() {


  it('should automatically redirect to /transports when location hash/fragment is empty', function() {
    browser.get('index.html');
    expect(browser.getLocationAbsUrl()).toMatch("/transports");
  });


  describe('transports', function() {

    beforeEach(function() {
      browser.get('index.html#!/transports');
    });


    it('should render transports when user navigates to /transports', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for view 1/);
    });

  });


  describe('orders', function() {

    beforeEach(function() {
      browser.get('index.html#!/orders');
    });


    it('should render orders when user navigates to /orders', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for view 2/);
    });

  });
});
