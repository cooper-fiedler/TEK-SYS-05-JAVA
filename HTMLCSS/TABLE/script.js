var select = document.getElementById("toggle");
toggle.addEventListener('change',function(){
    var tbs = document.getElementsByClassName('table');
for(var i=0;i<5;i++){
    tbs[i].style.display = 'none';
}
var tbName = select.value;
document.getElementById('tbName').style.display = 'block';
});