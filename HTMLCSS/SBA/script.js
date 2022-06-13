// Variable for the dropdown menu value
var select = document.getElementById("toggle");

// When "toggle" changes - for loop sets all table displays to none
toggle.addEventListener("change", function () {
  var tbs = document.getElementsByClassName("table");
  for (var i = 0; i < 5; i++) {
    tbs[i].style.display = "none";
  }

  // Dropdown selected value is set as table and table display is changed to block to show the selected table
  var tbName = select.value;
  document.getElementById(tbName).style.display = "block";
});
