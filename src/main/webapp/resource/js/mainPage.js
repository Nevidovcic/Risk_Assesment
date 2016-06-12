
$(document).ready(function(){
	
	var hiddenRepoNamb=$("#hiddenRepoNamb").val();

	
	$( "#reportPass").click(function() {
		 $("#reportF").attr("method", "get");
		 
	});

	$('#reportSub').click(function () {
		$("#reportF").attr("method", "post");
			
    });
	
$("#reportF").validate({
	
errorPlacement: function(error, element) 
	    {
		
	        if ( element.is("input:radio")){
	        	
	        	element.parents("div:first").before(error);

	     } else {
	            element.after(error);
	        }
	        
	        }/*,		
	
	        submitHandler: function (form) {
	        	
	        		$.ajax({
	     				url:"/RiskAssesemntCalc/reports",
	     	            type: "POST",
	     	            data: $(form).serialize(),
	     	            success: function (data) {
	     	            	
	     	            	$("#numberRepo").val(hiddenRepoNamb);
	     	           
	     	            }
	     	            
	        		});
	        		return false;
	        	
	        	}*/
	});  
	
	$("#reportF :input[type='radio']").each(function () {
		  $(this).rules("add", {
		    required: true 
		  });
		});
	
	$.extend($.validator.messages,{
		required:"You must checked at least one option!",
	});
	

	/*}*/
		/*da se sve zamaskira nakon submit*/
		/*
		$( "#reportF").submit(function(eve) {
			
			
			$("#submit").attr('disabled', true);
			$("#reportF :input[type='radio']").attr('disabled', true);
		
			
			});
	*/
	
	

}); 

