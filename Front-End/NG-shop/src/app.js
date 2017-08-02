


// Model
let items = [
    {
        name: 'Laptop',
        price: 198000,
        description: 'New Mac',
        canBuy: true,
        notAvailable: false,
        makeDate: Date.now(),
        discount: 10000,
        image: 'images/Laptop.png',
        reviews: [
            { stars: 5, author: 'nag@gmail.com', body: 'good one' },
            { stars: 1, author: 'indu@gmail.com', body: 'costly one' }
        ]
    },
    {
        name: 'Mobile',
        price: 18000,
        description: 'New iphone',
        canBuy: true,
        notAvailable: false,
        makeDate: Date.now(),
        image: 'images/Mobile.png',
        reviews: [
            { stars: 5, author: 'nag@gmail.com', body: 'good one' },
            { stars: 1, author: 'indu@gmail.com', body: 'costly one' }
        ]
    }
];



var mod = angular.module('shop', [])

mod.config(function (productServiceProvider) {
    console.log('module config phase started...');
    //productServiceProvider.setApiUrl('http:///');
});

// controller ( class )
mod.controller('ShopController', function ($scope, productService) {
    //this.product=item;
    $scope.products = productService.loadAll();
});
mod.controller('TabsController', function ($scope) {
    $scope.tab = 1;
    $scope.changeTab = function (tabIndex) {
        $scope.tab = tabIndex
    }
    $scope.isTabSelected = function (tabIndex) {
        return $scope.tab === tabIndex
    }
});

mod.controller('ReviewFormController', function ($scope) {
    $scope.review = { stars: 0, author: 'nag@gmail.com', body: '' };
    $scope.submitReview = function (product) {
        //
        product.reviews.push($scope.review);
        $scope.review = {};
    }
});
// filters
mod.filter('priceDiscount', function () {
    return function (originalPrice, discount) {
        if (discount) return originalPrice - discount;
        return originalPrice - 1;
    }
});

mod.directive('productTitle', function () {
    return {
        templateUrl: 'templates/product-title.html',
        replace: true,
        link: function (scope, jqEle, attr) {
            jqEle.on('mouseover', function () {
                jqEle.css('background-color', "#def");
            })
            jqEle.on('mouseout', function () {
                jqEle.css('background-color', "#fff");
            })
        }
    }
});

mod.directive('productTabs', function () {
    return {
        templateUrl: 'templates/product-tabs.html'
    }
});
mod.directive('productReviewForm', function () {
    return {
        templateUrl: 'templates/product-review-form.html'
    }
});

// mod.provider('productService', function () {
//     console.log('productServiceProvider instantiated');
//     this.apiUrl = '';
//     this.setApiUrl = function (url) {
//         this.apiUrl = url
//         console.log('apiUrl changed');
//     }
//     this.$get = function () {
//         console.log('productServiceProvider factoey method called..');
//         return {
//             loadAll: function () {
//                 return items;
//             }
//         }
//     }

// });


mod.factory('productService', function () {
    return {
        loadAll: function () {
            return items;
        }
    }
});


function MyConstructor() { }
mod.service('myService', MyConstructor);

var o = {}
mod.value('someValue', o);