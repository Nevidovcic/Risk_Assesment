/**
 * 
 */
$(document).ready(function(){
	
	
	$("#comintentsF").validate({
			 
	    rules : {
	        name : { required: true },
	        pib : { required: true, minlength: 9 },
	        mb: { required: true, minlength: 8 },
	        activity: { required: true}
	    },
	    messages: {
	        name: {
	           required: "We need your name of company."
	        },
	        pib: {
	           required: "We need your PIB.",
	           minlength: jQuery.validator.format("At least {0} characters required!")
	        },
	        mb: {
	            required: "We need your MB.",
	            minlength: jQuery.validator.format("At least {0} characters required!")
	        },
	        activity: {
	            required: "You need to write your activity"
	        },
	    },
	    submitHandler: function() { 

	    	
	    	 $.ajax({
	            url:"/RiskAssesemntCalc/comintents",
	            type: "POST",
	            data:$(form).serialize(),
	            success: function (response) {
	            
	            	       	                
	            },
	            
	        });
	        
	        return false;
	    }
	});
	

});