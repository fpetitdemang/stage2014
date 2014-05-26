//PARAMETRAGE APIEXTRACTION BLOC//

var PDOC = 5;


/**/
var tailleBalise = {
  "HEADER":3,
  "SECTION":3,
  "FOOTER":3,
  "NAV":3,
  "FORM" : 3,
  "TABLE" : 3,
  "DIV" : 3,
  "UL" : 2,
  "OL" : 2,
  "TR" : 2,
  "TD": 5,
  "LI" :5,
  "A" : 0,
  "P" : 5,
  "H1" : 5,
  "H2" : 5,
  "H3" : 5,
  "H4" : 5,
  "H5" : 5,
  "H6" : 5,
  "I" : 5,
  "B" : 5,
  "STRONG" : 6,
  "INPUT" : 5
};

var inlinetab = {	
  "H1" : true,
  "H2" : true,
  "H3" : true,
  "H4" : true,
  "H5" : true,
  "H6" : true,
  "LI" : true,
  "P" : true,
  "A" : true,
  "B" : true,
  "IMG" : true
}


/*règle d'application des heuristiques
	spécification de quel règle est applicable sur quelle balise HTML*/
function regle1(node){
	return true;
}

function regle2(node){
	return true;
}

function regle3(node){
	return true;
}

function regle4(node){
	if (node.nodeName == "TABLE") return false;
	if (node.nodeName == "TR") return false;
	return true;
}

function regle5(node){
	if (node.nodeName == "P") return true;
	if (isInline(node)) return true;
	return false;
}

function regle7(node){
	if (node.nodeName == "DIV") return false;
	if (node.nodeName == "TD") return false;

	return true;
}
