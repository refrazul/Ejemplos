$(document).ready(function(){
 	$.ajax({
	    url: "http://localhost:7000/cross-server/saludar/refrazul",
	    success: function (response) {
	        console.log(response);
	    	$("#saludo").html(response.saludo)
	    },
	    error: function (error) {
	        console.log('error', error)
	    }
	})
	
});