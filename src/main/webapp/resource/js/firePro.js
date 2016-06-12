/**
 * 
 */


$(document).ready(function(){

	//disable/enable radio butoon
	/*$("#hydrantsYes").click(function(){*/
	
	$( ".panel" ).click(function( event ) {
		  var target = $( event.target );
		  if ( target.is( "#hydrantsYes" ) ) {
			  $("#hydrantsPressureYes").attr('disabled', false);
				$("#hydrantsPressureNo").attr('disabled', false);
				$("#hydrantsCabAffordableYes").attr('disabled', false);
				$("#hydrantsCabAffordableNo").attr('disabled', false);
				
				$("#hydrantsCabEqquipedYes").attr('disabled', false);
				$("#hydrantsCabEqquipedNo").attr('disabled', false);
		  }else if(target.is( "#hydrantsNo")){
			  $("#hydrantsPressureYes").attr('disabled', true);
				$("#hydrantsPressureNo").attr('disabled', true);
				$("#hydrantsCabAffordableYes").attr('disabled', true);
				$("#hydrantsCabAffordableNo").attr('disabled', true);
				
				$("#hydrantsCabEqquipedYes").attr('disabled', true);
				$("#hydrantsCabEqquipedNo").attr('disabled', true);
		  }
		});
		
	$( ".panel" ).click(function( event ) {
		  var target = $( event.target );
		  if ( target.is( "#fireExtingYes" ) ) {
			  $("#fireExtingNumbYes").attr('disabled', false);
				$("#fireExtingNumbNo").attr('disabled', false);
				
				$("#fireExtingProbeYes").attr('disabled', false);
				$("#fireExtingProbeNo").attr('disabled', false);
		  }else if(target.is( "#fireExtingNo")){
			  $("#fireExtingNumbYes").attr('disabled', true);
				$("#fireExtingNumbNo").attr('disabled', true);
				
				$("#fireExtingProbeYes").attr('disabled', true);
				$("#fireExtingProbeNo").attr('disabled', true);
		  }
		});
		
	$( ".panel" ).click(function( event ) {
		  var target = $( event.target );
		  if ( target.is( "#lightningRodYes" ) ) {
			  $("#lightningRodProbeYes").attr('disabled', false);
				$("#lightningRodProbeNo").attr('disabled', false);
				
				$("#lightningRodFunctYes").attr('disabled', false);
				$("#lightningRodFunctNo").attr('disabled', false);
		  }else if(target.is( "#lightningRodNo")){
			  $("#lightningRodProbeYes").attr('disabled', true);
				$("#lightningRodProbeNo").attr('disabled', true);
				
				$("#lightningRodFunctYes").attr('disabled', true);
				$("#lightningRodFunctNo").attr('disabled', true);
		  }
		});
	
	$( ".panel" ).click(function( event ) {
		  var target = $( event.target );
		  if ( target.is( "#fireReportYes" ) ) {
			  $("#fireReportProbeYes").attr('disabled', false);
				$("#fireReportProbeNo").attr('disabled', false);
				
				$("#fireReportMonitordYes").attr('disabled', false);
				$("#fireReportMonitordNo").attr('disabled', false);
		  }else if(target.is( "#fireReportNo")){
			  $("#fireReportProbeYes").attr('disabled', true);
				$("#fireReportProbeNo").attr('disabled', true);
				
				$("#fireReportMonitordYes").attr('disabled', true);
				$("#fireReportMonitordNo").attr('disabled', true);
		  }
		});
	
	$( ".panel" ).click(function( event ) {
		  var target = $( event.target );
		  if ( target.is( "#fireFigtingInstalYes" ) ) {
			  $("#fireFigtingInstProbeYes").attr('disabled', false);
				$("#fireFigtingInstProbeNo").attr('disabled', false);
				
				$("#fireFigtingInstFunctYes").attr('disabled', false);
				$("#fireFigtingInstFunctNo").attr('disabled', false);
		  }else if(target.is( "#fireFigtingInstalNo")){
			  $("#fireFigtingInstProbeYes").attr('disabled', true);
				$("#fireFigtingInstProbeNo").attr('disabled', true);
				
				$("#fireFigtingInstFunctYes").attr('disabled', true);
				$("#fireFigtingInstFunctNo").attr('disabled', true);
		  }
		});
	
	$( ".panel" ).click(function( event ) {
		  var target = $( event.target );
		  if ( target.is( "#fireFigtingInstalYes" ) ) {
			  $("#fireFigtingInstProbeYes").attr('disabled', false);
				$("#fireFigtingInstProbeNo").attr('disabled', false);
				
				$("#fireFigtingInstFunctYes").attr('disabled', false);
				$("#fireFigtingInstFunctNo").attr('disabled', false);
		  }else if(target.is( "#fireFigtingInstalNo")){
			  $("#fireFigtingInstProbeYes").attr('disabled', true);
				$("#fireFigtingInstProbeNo").attr('disabled', true);
				
				$("#fireFigtingInstFunctYes").attr('disabled', true);
				$("#fireFigtingInstFunctNo").attr('disabled', true);
		  }
		});
	

}); 




	
