/**
 * Created by lihong on 16/10/25.
 */
(function(angular) {
    var ItemFactory = function($resource) {
        return $resource('/user', {
            id: '@id'
        }, {
            save: {
                url:'/user/add',
                method: "PUT"
            },
            update: {
                url:'/user/update',
                method: "PUT"
            },
            remove: {
                url:'/user/delete',
                method: "DELETE"
            }
        });
    };

    ItemFactory.$inject = ['$resource'];
    angular.module("myApp.services").factory("Item", ItemFactory);
}(angular));
