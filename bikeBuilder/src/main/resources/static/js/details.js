function showModal(id) {
	
	var href = 'bikes/getBike/?id=' + id;
	$.get(href, function(bike, status) {
		console.log(bike)

		var frame = bike[0];
		var fork = bike[1];
		var driveTrain = bike[2];
		var brake = bike[3];
		var wheelSet = bike[4];

		var total = frame.cost + fork.cost + driveTrain.cost + brake.cost + wheelSet.cost;

		$("#exampleModal").modal('show');
		$("#exampleModal").find("#modalHeader").text('Bike Build #' + id);
		$("#exampleModal").find("#modalName").text('Frame: ' + frame.brand + ' ' + frame.model + ' ' + ' - Cost: $' + frame.cost.toFixed(2));
		$("#exampleModal").find("#modalFork").text('Fork: ' + fork.brand + fork.model + ' ' + ' - Cost: $' + fork.cost.toFixed(2));
		$("#exampleModal").find("#modalDriveTrain").text('Drive Train: ' + driveTrain.brand + ' ' + driveTrain.model + ' ' + driveTrain.gears +'-speed - Cost: $' + driveTrain.cost.toFixed(2));
		$("#exampleModal").find("#modalBrake").text('Brake: ' + brake.brand + ' ' + brake.model + ' ' + ' - Cost: $' + brake.cost.toFixed(2));
		$("#exampleModal").find("#modalWheelSet").text('Wheel Set: ' + wheelSet.brand + ' ' + wheelSet.model + ' ' + ' - Cost: $' + wheelSet.cost.toFixed(2));
		$("#exampleModal").find("#modalTotal").text('Total: $' + total.toFixed(2));
	});
}

