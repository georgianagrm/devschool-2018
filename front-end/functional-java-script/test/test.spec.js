const {
    expect
} = require('chai');
//var script = require('../scripts/scripts');

var MockBrowser = require('mock-browser').mocks.MockBrowser;
var mock = new MockBrowser();
var doc = mock.getDocument();

var inputId = doc.getElementById('id');
var btn = doc.getElementById('btn');
let container = doc.querySelector('.container');

describe('Validate container has some text', function () {
    it('should pass if the input id is not null', function () {
        if (inputId != null) {
            expect(container).to.not.be.empty;
        }
    });
});

describe('Validate text button is Get Forecast', function () {
    it('should pass if the input id has a number in it', function () {
        if (inputId != null && inputId != '') {
            expect(btn).to.equal('Get Forecast');
        }
    });
});