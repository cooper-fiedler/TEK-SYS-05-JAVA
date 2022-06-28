$(document).ready(function() {

	$("select").slice(1).prop("disabled", true);
	$("select").change(function() {
		if ($(this).val() !== "Select an option...") {
			$(this).next().next("select").prop("disabled", false);
		} else {
			if (!$(this).index() === 0)
				$(this).prop("disabled", true);
			$(this).next().next("select").prop("disabled", true);
		}
		if ($("#driveTrain").find(":selected").val() !== "Select an option..." && $("#brake").find(":selected").val() !== "Select an option..." && $("#wheelSet").find(":selected").val() !== "Select an option...") {
			$('#btn-sel').prop("disabled", false);
		} else {
			$('#btn-sel').prop("disabled", true);
		}

	});


})

function getForks() {
	console.log('In function')
	var id = $("#frame").find(":selected").val();
	if (id !== 'Select an option...') {
		console.log(id)
		var href = 'getForks/?id=' + id;
		$.get(href, function(forks, status) {
			console.log(forks)
			$("#fork").empty()
			$('#fork').append($('<option>', {
				text: 'Select an option...'
			}));
			$.each(forks, function(i, fork) {
				$('#fork').append($('<option>', {
					value: fork.id,
					text: fork.brand + ' ' + fork.model + ': $' + fork.cost.toFixed(2)
				}));
			});
		})
	}
}

function getComponents() {
	var id = $("#fork").find(":selected").val();
	if (id !== 'Select an option...') {
		console.log(id)
		var href = 'getComponents/?id=' + id;
		$.get(href, function(results, status) {
			$('#btn-sel').prop("disabled", true);
			console.log(results)
			$("#driveTrain").empty()
			$('#driveTrain').append($('<option>', {
				text: 'Select an option...'
			}));
			$("#brake").empty()
			$('#brake').append($('<option>', {
				text: 'Select an option...'
			}));
			$("#wheelSet").empty()
			$('#wheelSet').append($('<option>', {
				text: 'Select an option...'
			}));

			var driveTrains = results[0];
			var brakes = results[1];
			var wheelSets = results[2];

			$.each(driveTrains, function(i, driveTrain) {
				$('#driveTrain').append($('<option>', {
					value: driveTrain.id,
					text: driveTrain.brand + ' ' + driveTrain.model + ': $' + driveTrain.cost.toFixed(2)
				}));
			});
			$.each(brakes, function(i, brake) {
				$('#brake').append($('<option>', {
					value: brake.id,
					text: brake.brand + ' ' + brake.model + ': $' + brake.cost.toFixed(2)
				}));
			});
			$.each(wheelSets, function(i, wheelSet) {
				$('#wheelSet').append($('<option>', {
					value: wheelSet.id,
					text: wheelSet.brand + ' ' + wheelSet.model + ': $' + wheelSet.cost.toFixed(2)
				}));
			});

		})
	}
}


