function Div(parent, options) {

    //设置属性
    options = options || {};
    this.backgroundColor = options.backgroundColor || "red";
    this.width = options.width || 20;
    this.height = options.height || 20;
    this.x = options.x || 0;
    this.y = options.y || 0;

    this.parent = parent;
    //创造di
    this.div = document.createElement("div");

    parent.appendChild(this.div);

    //设置样式
    this.init();
    this.random();

}

//设置
Div.prototype.init = function () {

    var div = this.div;
    div.style.backgroundColor = this.backgroundColor;
    div.style.width = this.width + "px";
    div.style.height = this.height + "px";
    div.style.top = this.y + "px";
    div.style.left = this.x + "px";
    div.style.position = "absolute";
}
//随机坐标
Div.prototype.random = function () {
    var x = Tools.getRadom(0, this.parent.offsetWidth / this.width - 1) * this.width;
    var y = Tools.getRadom(0, this.parent.offsetHeight / this.height - 1) * this.height;

    this.div.style.left = x + "px";
    this.div.style.top = y + "px";


}





