var app1 = angular.module('myApp', ['ngResource']);


app1.controller('PersonController', ['$scope', '$resource',function($scope,$resource) {
      
    function fetchAllStudents(){
        $scope.students = $resource('http://localhost:9999/jpa/v1/allStuds'
        ).query(function(data){return data;});
        console.log("create11sss")
    };
    fetchAllStudents();
	
    $scope.refresh = function(){
    	fetchAllStudents();
    	console.log("refresh123")
    };
    
    $scope.create = function(){
    	console.log("create")
    	User = $resource(
    		    "http://localhost:9999/jpa/v1/StudEnq",
    		    {},
    		    {save: {method:'POST',isArray:false}}
    	);
    	
    	var user = {};

    	user.uid = $scope.studentForm.uid;
    	user.name = $scope.studentForm.name;
		user.dob = $scope.studentForm.dob;
		user.mobile = $scope.studentForm.mobile;
		user.address = $scope.studentForm.address;
		user.fatherName = $scope.studentForm.fatherName;
		user.occupation = $scope.studentForm.occupation;
		user.campus = $scope.studentForm.campus;
		user.course = $scope.studentForm.course;
		user.branch = $scope.studentForm.branch;
		user.sourceKnow = $scope.studentForm.sourceKnow;
		user.qualification = $scope.studentForm.qualification;
		user.status = $scope.studentForm.status;
		user.lastAssigned = $scope.studentForm.lastAssigned;
		
		$scope.Message = User.save(user);
		
		$scope.studentForm.uid="";
		$scope.studentForm.name="";
		$scope.studentForm.dob="";
		$scope.studentForm.mobile="";
		$scope.studentForm.address="";
		$scope.studentForm.fatherName="";
		$scope.studentForm.occupation="";
		$scope.studentForm.campus="";
		$scope.studentForm.course="";
		$scope.studentForm.branch="";
		$scope.studentForm.sourceKnow="";
		$scope.studentForm.qualification="";
		$scope.studentForm.status="";
		$scope.studentForm.lastAssigned="";

    };
    
    
    $scope.bookSeat=function()
    {
    	console.log("bookSeat")
    	User = $resource(
    		    "http://localhost:9999/jpa/v1/BookSeat",
    		    {},
    		    {save: {method:'POST',isArray:false}}
    	);
    	
    	var user = {};

    	user.uid = $scope.bookingForm.uid;
    	user.name = $scope.bookingForm.name;
		user.sname = $scope.bookingForm.sname;
        user.amount = $scope.bookingForm.amount;
        user.agentName = $scope.bookingForm.agentName;
		
		$scope.Message = User.save(user);
		
		$scope.bookingForm.uid="";
		$scope.bookingForm.name="";
		$scope.bookingForm.sname="";
		$scope.bookingForm.amount="";
		$scope.bookingForm.agentName="";
    };
    
    $scope.deleteRec = function(){
    	User = $resource(
    		    "http://localhost:9999/jpa/v1/delete/:id",
    		    {},
    		    {save: {method:'DELETE', params: {id: '@id'}}}
    	);
    	
			
		User.delete({id: $scope.studentForm.uid}).then(function successCallback(response) {
			$scope.Message = response;
		}, function errorCallback(response) {
		    
		});
				
		$scope.studentForm.uid="";
		$scope.studentForm.name="";
		$scope.studentForm.dob="";
		$scope.studentForm.mobile="";
		$scope.studentForm.address="";
		$scope.studentForm.fatherName="";
		$scope.studentForm.occupation="";
		$scope.studentForm.campus="";
		$scope.studentForm.course="";
		$scope.studentForm.branch="";
		$scope.studentForm.sourceKnow="";
		$scope.studentForm.qualification="";
		$scope.studentForm.status="";
		$scope.studentForm.lastAssigned="";
    };
    
    
    $scope.update = function(){
    		
    	User = $resource(
    		    "http://localhost:9999/update/:id",
    		    {},
    		    {save: {method:'PUT', params: {id: '@id'}}}
    	);
    	
		var user = {};
		
		user.uid = $scope.studentForm.uid;
    	user.name = $scope.studentForm.name;
		user.dob = $scope.studentForm.dob;
		user.mobile = $scope.studentForm.mobile;
		user.address = $scope.studentForm.address;
		user.fatherName = $scope.studentForm.fatherName;
		user.occupation = $scope.studentForm.occupation;
		user.campus = $scope.studentForm.campus;
		user.course = $scope.studentForm.course;
		user.branch = $scope.studentForm.branch;
		user.sourceKnow = $scope.studentForm.sourceKnow;
		user.qualification = $scope.studentForm.qualification;
		user.status = $scope.studentForm.status;
		user.lastAssigned = $scope.studentForm.lastAssigned;
		
		$scope.Message = User.save(user);
		$scope.Message = User.save({id: $scope.studentForm.uid}, user);
		
		$scope.studentForm.uid="";
		$scope.studentForm.name="";
		$scope.studentForm.dob="";
		$scope.studentForm.mobile="";
		$scope.studentForm.address="";
		$scope.studentForm.fatherName="";
		$scope.studentForm.occupation="";
		$scope.studentForm.campus="";
		$scope.studentForm.course="";
		$scope.studentForm.branch="";
		$scope.studentForm.sourceKnow="";
		$scope.studentForm.qualification="";
		$scope.studentForm.status="";
		$scope.studentForm.lastAssigned="";
    };
    
}]);

var app = angular.module('StudVisit', ['ngResource']);
console.log("create1155")

app.controller('VisitorController', ['$scope', '$resource',function($scope,$resource) {
    
    function fetchAllStaffs(){
        $scope.staff = $resource('http://localhost:9999/jpa/v1/allStaff'
        ).query(function(data){return data;});
        console.log("create11")
    };
    fetchAllStaffs();
    
    $scope.refresh = function(){
    	fetchAllPersons();
    	console.log("create111")
    };
    
    $scope.create = function(){
    	console.log("create")
    	User = $resource(
    		    "http://localhost:9999/jpa/v1/StudVisit",
    		    {},
    		    {save: {method:'POST',isArray:false}}
    	);
    	
    	var user = {};

    	user.uid = $scope.visitorForm.uid;
    	user.name = $scope.visitorForm.name;
		user.mobile = $scope.visitorForm.mobile;
		user.transportBy = $scope.visitorForm.transportBy;
		user.staffName = $scope.visitorForm.staffName;
		user.visitedWith = $scope.visitorForm.visitedWith;
		
		$scope.Message = User.save(user);
		
		$scope.visitorForm.uid="";
		$scope.visitorForm.name="";
		$scope.visitorForm.mobile="";
		$scope.visitorForm.transportBy="";
		$scope.visitorForm.staffName="";
		$scope.visitorForm.visitedWith="";

    };
    
    $scope.deleteRec = function(){
    	User = $resource(
    		    "http://localhost:9999/jpa/v1/delete/:id",
    		    {},
    		    {save: {method:'DELETE', params: {id: '@id'}}}
    	);
    	
			
		User.delete({id: $scope.studentForm.uid}).then(function successCallback(response) {
			$scope.Message = response;
		}, function errorCallback(response) {
		    
		});
				
		$scope.visitorForm.uid="";
		$scope.visitorForm.name="";
		$scope.visitorForm.mobile="";
		$scope.visitorForm.transportBy="";
		$scope.visitorForm.staffName="";
		$scope.visitorForm.visitedWith="";

    };
    
    
    $scope.update = function(){
    		
    	User = $resource(
    		    "http://localhost:9999/update/:id",
    		    {},
    		    {save: {method:'PUT', params: {id: '@id'}}}
    	);
    	
		var user = {};
		
		user.uid = $scope.visitorForm.uid;
    	user.name = $scope.visitorForm.name;
		user.mobile = $scope.visitorForm.mobile;
		user.transportBy = $scope.visitorForm.transportBy;
		user.staffName = $scope.visitorForm.staffName;
		user.visitedWith = $scope.visitorForm.visitedWith;
		
		$scope.Message = User.save(user);
		$scope.Message = User.save({id: $scope.visitorForm.uid}, user);
		
		$scope.visitorForm.uid="";
		$scope.visitorForm.name="";
		$scope.visitorForm.mobile="";
		$scope.visitorForm.transportBy="";
		$scope.visitorForm.staffName="";
		$scope.visitorForm.visitedWith="";

    };
    
}]);