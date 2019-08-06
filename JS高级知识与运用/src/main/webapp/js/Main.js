
var  containter = document.getElementsByClassName("container");
var father =containter[0];
var array=[];
for (var i = 0; i <10 ; i++) {
       var r = Tools.getRadom(0,255);
       var g = Tools.getRadom(0,255);
       var b = Tools.getRadom(0,255);
        var div = new Div(father,{
           backgroundColor:"rgb("+r+","+g+","+b+")"
       });
    array.push(div);

}

setInterval(function () {
    for (var i = 0; i < array.length; i++) {
        var person = array[i];
        person.random();
    }
},500);