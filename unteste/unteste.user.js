// ==UserScript==
// @name        unteste
// @namespace   teste
// @include     *
// @version     1
// @grant       none
// @require     http://code.jquery.com/jquery-1.11.0.min.js
// @require     apirectangle.js
// @require     apipoo.js
// @require     apiextractionbloc.js
// @require     indicetaillebalise.js
// @require		 parametreapiextractionbloc.js

// ==/UserScript==

this.$ = this.jQuery = jQuery.noConflict(true);

//nodeValue : retourne la valeur textuelle d'un noeud texte
//childNodes : retourne une liste des enfants du noeud
//nodeName : renvoie le nom du noeud courant
//nodeType : renvoie le type de noeud (1=element, 2=attribut, 3=texte)
//getElementsByTagName : renvoie collection de noeud par tag de balise
//getElementsById : renvoie noeud par identifiant
//style.background='red'
//left : x position horizontale haut gauche (la marge exterieur ne fait pas partie d'un élément)
//top : y position verticale haut gauche (la marge exterieur ne fait pas partie d'un élément)
//innerWidth() : calcule la largeur interieur d'un élément (sans la marge extérieur)
//innerHeight() : calcule la hauteur intérieur d'un élément (sans la marge exterieur)
//forEach() : permet de parcourir un tableau


var poolbloc_ref = [];


$(document).ready(function()
{
    console.log("LANCEMENT SCRIPT");
    var poolbloc_ref = [];
    var poolseparateur = [];
	 var poolblocSubDiviser = [];
	 var poolbloc_ref1 = [];
	
    
   //DivisionDomNoeud(document.getElementsByTagName('body')[0], 0, poolbloc_ref);
	//DivisionDomNoeud(document.getElementById('search'), 0, poolbloc_ref);


	/*1- construction arbre bloc visuel */
	var racine = document.createElement("racine");
	var id = generateId();
	annotation(racine, "doc-1");
	annotation(racine, id);
	annotation(document.getElementsByTagName('body')[0], id);
	annotation(document.getElementsByTagName('body')[0], "doc-1");

	console.log("debut extraction bloc");

	constructionArbreBlocVisuel(document.getElementsByTagName('body')[0], racine);
	console.log(printArbreBloc(racine, 0));

	console.log("fin extraction bloc");
	
	//console.log(printArbreBloc(racine, 0));

    //DEGRES DE PROXIMITE
    //poolseparateur = extractionSeparateurH(poolbloc_ref);
    
    
   // extractionSeparateurV(poolbloc_ref);
   // console.log(sommeEnfantSup(document.getElementById('bloc-b')));
    
    //poolseparateur = extractionSeparateurH(poolbloc);
    /*identificationRelationBlocH(poolbloc, poolseparateur);
    calculePoidSeparateur(poolseparateur);
    poolseparateur[3].weight = 10;

    fusionBloc(poolseparateur, 1);
    //printpool(poolseparateur,"calculePoidsSeparateur");
    dessinerPoolSep(poolseparateur);*/
    
	 //printnodes(poolbloc_ref, "poolblocvisuel");
    //printnodes(poolbloc_ref1, "poolblocvisuel");
    //dessinerPoolref(poolbloc_ref);
    //dessinerPool(poolseparateur);
    
    console.log("SCRIPT EXECUTE");
});


//
var cmptBloc = 0;
var comptPool = 1;
var nomPool = "id-VB";
function generateId(){
	var retour = nomPool+"-"+ cmptBloc;
	cmptBloc = cmptBloc + 1;
	return retour;
}

function setPoolName(name){
	nomPool = name;
	cmptBloc = 0;
}

function DownPoolLevel(){
	nomPool = nomPool +"-"+ (cmptBloc-1) ;
	cmptBloc = 0;
}


function parcoursDOM(node, foo){

	var fils = node.childNodes;
	var nbFils = fils.length;

	if (foo(node))	{ return node;	}

	for(var i = 0; i < nbFils; i++){
		if (parcoursDOM(fils[i], foo)){//si la fonction à trouver un résultat
			return parcoursDOM(fils[i], foo);
		}
	}
}


function constructionArbreBlocVisuel(noeudarbredom, noeudarbreblocvisuel){

	var poolblocextrait = [];
	DivisionDomNoeud(noeudarbredom, 0, poolblocextrait);
	//DownPoolLevel();
	for (var key in poolblocextrait){
			var id = generateId();
			var child = document.createElement(id);
			annotation(child, getDOC(poolblocextrait[key]));
			annotation(poolblocextrait[key], id);
			
			noeudarbreblocvisuel.appendChild(child);

			//verifie le doc
			if (getDOCValue(poolblocextrait[key]) < PDOC )
				constructionArbreBlocVisuel(poolblocextrait[key], child);
	}

	
}

//Test le degres de cohérence du noeud en entrée
//retourne vraie si le noeud est une feuille && il a doc < pdoc
function testPdocFeuille (node){
	//console.log(getDOCValue(node) + " : " + node.childNodes.length);
	//console.log((getDOCValue(node) < PDOC && node.childNodes.length == 0));
	return (getDOCValue(node) < PDOC && node.childNodes.length == 0);
}

//Parcours l'arbre des blocs visuels extraits
//Retourne les feuilles qui ont un Doc inférieur au pDoc
function checkPdoc(node, pdoc){
	 var enfants = node.firstChild;
    /*while (enfants) {
			if (enfants.firstChild) {
				checkPdoc(enfants, pdoc);
			}else{
				if (getDOCValue(enfants) < pdoc) return enfants;
			}
        enfants = enfants.nextSibling;
    }*/
	
	if (enfants) {
    while (enfants) {
			//noeud enfant est une feuille
			if (enfants.firstChild) {
				checkPdoc(enfants, pdoc);
			}else{
			//noeud enfant est une feuille
				if (getDOCValue(node) < pdoc) {
					return node;
					}else{
					return false;
				}
			}
        enfants = enfants.nextSibling;
    }
	}else{
		if (getDOCValue(node) < pdoc) {
			return node;
		}else{
			return false;
		}
	}
}



//OUTIL DEBBUG
function dessinerPool(pool){
    for (var key2 in pool ){
        pool[key2].dessiner();
    }
}

function dessinerPoolref(pool){
    for (var key2 in pool ){
        pool[key2].style.background = "green";
        pool[key2].style.borderStyle = "solid";
    }
}

function effacerPoolSep(pool){
    for (var key2 in pool ){
        pool[key2].effacer();
    }
}

function printArbreBloc(pNode, level){
	var retour = "";

    var enfants = pNode.firstChild;
    while (enfants) {
			retour = retour + "\n"+printEspace(level) +enfants.nodeName + enfants.className;
   	
			if (enfants.firstChild) {
				retour = printEspace(level) + retour;
				retour = retour + printArbreBloc(enfants, level + 1);
			}
			
        enfants = enfants.nextSibling;
    }
	return retour;
}

function printEspace(nbEspace){
	var retour = "";
	for (i=0; i<nbEspace; i++){
		retour = "_ " + retour;
	}
	return retour;
}

function printnodes(pool, msg){
    console.log("<"+msg+">");
    for (var key in pool) {
			console.log(pool[key]);
        console.log("	"+printNode(pool[key]));
    }
    console.log("<"+msg+">");
}

function printpool(pool, msg){
    console.log("<"+msg+">");
    for (key in pool){
        console.log(pool[key].print());
    }
    console.log("</"+msg+">");
}
