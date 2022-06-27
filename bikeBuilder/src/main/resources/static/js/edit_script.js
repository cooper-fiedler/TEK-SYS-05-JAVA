$(document).ready(function() {
	
	var firstId = $("#frameEdit").find(":selected").val();
	var href = 'getForks/?id=' + firstId;
	$.get(href, function(forks, status) {
		console.log(forks)
		
		$.each(forks, function(i, fork) {
			$('#forkEdit').append($('<option>', {
				value: fork.id,
				text: fork.brand + ' ' + fork.model + ': $' + fork.cost.toFixed(2)
			}));
		});
	})
	var forkId = $("#forkEdit").find(":selected").val()
	var href = 'getComponents/?id=' + forkId;
	$.get(href, function(results, status) {
		console.log(results)
	
		var driveTrains = results[0];
		var brakes = results[1];
		var wheelSets = results[2];

		$.each(driveTrains, function(i, driveTrain) {
			$('#driveTrainEdit').append($('<option>', {
				value: driveTrain.id,
				text: driveTrain.brand + ' ' + driveTrain.model + ': $' + driveTrain.cost.toFixed(2)
			}));
		});
		$.each(brakes, function(i, brake) {
			$('#brakeEdit').append($('<option>', {
				value: brake.id,
				text: brake.brand + ' ' + brake.model + ': $' + brake.cost.toFixed(2)
			}));
		});
		$.each(wheelSets, function(i, wheelSet) {
			$('#wheelSetEdit').append($('<option>', {
				value: wheelSet.id,
				text: wheelSet.brand + ' ' + wheelSet.model + ': $' + wheelSet.cost.toFixed(2)
			}));
		});

	})



})



function getForksEdit() {
	console.log('In function')
	var id = $("#frameEdit").find(":selected").val();
	if (id !== 'Select an option...') {
		console.log(id)
		var href = 'getForks/?id=' + id;
		$.get(href, function(forks, status) {
			console.log(forks)
			$("#forkEdit").empty()
			$('#forkEdit').append($('<option>', {
				text: 'Select an option...'
			}));
			$.each(forks, function(i, fork) {
				$('#forkEdit').append($('<option>', {
					value: fork.id,
					text: fork.brand + ' ' + fork.model + ': $' + fork.cost.toFixed(2)
				}));
			});
		})
	}
}

function getComponentsEdit() {
	var id = $("#forkEdit").find(":selected").val();
	if (id !== 'Select an option...') {
		console.log(id)
		var href = 'getComponents/?id=' + id;
		$.get(href, function(results, status) {
			console.log(results)
			$("#driveTrainEdit").empty()
			$('#driveTrainEdit').append($('<option>', {
				text: 'Select an option...'
			}));
			$("#brakeEdit").empty()
			$('#brakeEdit').append($('<option>', {
				text: 'Select an option...'
			}));
			$("#wheelSetEdit").empty()
			$('#wheelSetEdit').append($('<option>', {
				text: 'Select an option...'
			}));

			var driveTrains = results[0];
			var brakes = results[1];
			var wheelSets = results[2];

			$.each(driveTrains, function(i, driveTrain) {
				$('#driveTrainEdit').append($('<option>', {
					value: driveTrain.id,
					text: driveTrain.brand + ' ' + driveTrain.model + ': $' + driveTrain.cost.toFixed(2)
				}));
			});
			$.each(brakes, function(i, brake) {
				$('#brakeEdit').append($('<option>', {
					value: brake.id,
					text: brake.brand + ' ' + brake.model + ': $' + brake.cost.toFixed(2)
				}));
			});
			$.each(wheelSets, function(i, wheelSet) {
				$('#wheelSetEdit').append($('<option>', {
					value: wheelSet.id,
					text: wheelSet.brand + ' ' + wheelSet.model + ': $' + wheelSet.cost.toFixed(2)
				}));
			});

		})
	}
}