angular.module('demo', []).controller(
		'usersCtrl',
		function($scope, $http) {
			$http.get('http://localhost:8080/webApp/user').then(
					function(response) {
						$scope.users = response.data;
					});
			$scope.firstName = "";
			$scope.lastName = "";
			$scope.edit = true;
			$scope.error = false;
			$scope.incomplete = false;
			$scope.hideform = true;
			$scope.editUser = function(id) {
				$scope.hideform = false;
				if (id == 'new') {
					$scope.edit = true;
					$scope.incomplete = true;
					$scope.id = '';
					$scope.username = '';
					$scope.email = '';
					$scope.firstName = '';
					$scope.lastName = '';
					$scope.password = '';
					$scope.phone = '';
					$scope.userStatus = '';
				} else {
					$scope.edit = true;
					$scope.firstName = $scope.users[id].firstName;
					$scope.lastName = $scope.users[id].lastName;
					$scope.id = $scope.users[id].id;
					$scope.username = $scope.users[username].username;
					$scope.email = $scope.users[email].email;
					$scope.password = $scope.users[password].password;
					$scope.phone = $scope.users[phone].phone;
					$scope.userStatus = $scope.users[userStatus].userStatus;
				}
			};

			$scope.saveUser = function() {
				var obj = {
					id : $scope.id,
					username : $scope.username,
					email : $scope.email,
					firstName : $scope.firstName,
					lastName : $scope.lastName,
					password : $scope.password,
					phone : $scope.phone,
					userStatus : $scope.userStatus
				};
				$scope.hideform = true;


				if($scope.id=='')
				$http.post('http://localhost:8080/webApp/user', obj, {
					headers : {
						'Content-Type' : 'application/json; charset=UTF-8'
					},
					'Accept' : 'application/json'
				}).then(function onSuccess(data) {
					window.alert(JSON.stringify(data.data));
					$http.get('http://localhost:8080/webApp/user').then(
							function(response) {
								$scope.users = response.data;
							});
				}, function onError(err) {
					// do something on error
				});
				else
				$http.put('http://localhost:8080/webApp/user', obj, {
					headers : {
						'Content-Type' : 'application/json; charset=UTF-8'
					},
					'Accept' : 'application/json'
				}).then(function onSuccess(data) {
					window.alert(JSON.stringify(data.data));
					$http.get('http://localhost:8080/webApp/user').then(
							function(response) {
								$scope.users = response.data;
							});
				}, function onError(err) {
					// do something on error
				});
				$scope.id=''
			};

			$scope.$watch('id', function() {
				$scope.test();
			});
			$scope.$watch('username', function() {
            				$scope.test();
            			});
            $scope.$watch('email', function() {
            				$scope.test();
            			});
			$scope.$watch('firstName', function() {
				$scope.test();
			});
			$scope.$watch('lastName', function() {
				$scope.test();
			});
			$scope.$watch('password', function() {
            				$scope.test();
            			});
            $scope.$watch('phone', function() {
            				$scope.test();
            			});
            $scope.$watch('userStatus', function() {
            				$scope.test();
            			});

			$scope.test = function() {
				$scope.incomplete = false;
				if ($scope.edit
						&& (!$scope.firstName.length || !$scope.lastName.length)) {
					$scope.incomplete = true;
				}
			};
		});