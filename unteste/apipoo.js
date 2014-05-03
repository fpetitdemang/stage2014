//
function testeApiPoo() {
    alert("apipoo chargé");
}

var extendClass = function(child, parent) {
    var Surrogate = function() {};
    Surrogate.prototype = parent.prototype;
    child.prototype = new Surrogate();
    //child.prototype.constructor = child;
};


