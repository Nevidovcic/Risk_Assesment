/**
 * 
 */

$(document).ready(function(){
	

	
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
	        
	        },		
	
	       /* submitHandler: function (form) {
	        	$('#reportSub').click(function(){
	        		 $("#reportModal").modal('show');
	        	});
	        	var myInput = $('#hiddenRepoNamb').val();
     			 $('#numberRepo').data("key1",myInput);
	        }
	        	*/
	});  
	
	$("#reportF :input[type='radio']").each(function () {
		  $(this).rules("add", {
		    required: true 
		  });
		});
	
	$.extend($.validator.messages,{
		required:"You must checked at least one option!",
	});
	
	/*$("#reportF").submit( function(e) {
		e.preventDefault();
		var form=("#reportF");
		
		$("#reportSub").on("click",function(){
			if(form.valid()){
				var myInput = $('#hiddenRepoNamb').val();
				 $('#numberRepo').val(myInput);
			
			}
		});*/
/*});
*/

		$("#reportSub").on("submit",function(){
			var myInput = $('#hiddenRepoNamb').val();
			
		       $('#numberRepo').val(myInput);
		});
				
	
		$("#comintentsF").submit(function(){
			$("#comintButton").attr('disabled', true);
		});
	
		$("#comintButtonChange").on("click",function(){
			$("#comintButton").attr('disabled', false);
		});
	

		/*da se sve zamaskira nakon submit*/
		/*
		$( "#reportF").submit(function(eve) {
			e.preventDefault();
			
			$("#submit").attr('disabled', true);
			$("#reportF :input[type='radio']").attr('disabled', true);
		
			
			});
	*/

}); 

