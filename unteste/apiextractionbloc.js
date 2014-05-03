//PARAMETRE//
var seuilRelative = 3;


//
//parcours les éléments du DOM (en profondeur) tant qu'il ne rencontre pas de
//bloc visuel
//sinon recupere la reference du noeud qui contient le bloc visuel et l'ajoute à la pool (sous arbre)
//retourne une pool de bloc visuel 
function DivisionDomNoeud(pNode, nLevel, pool) {
   
	//console.log(pNode);
    if (filtre(pNode)) {
			//console.log("ff");
        //console.log(nLevel + " - 1 noeud filtré " + existChild(pNode, isNodeValide)+ printNode(pNode));
        return -1;
    }
    //elements filtés
    //Filtre pNode si il n'a pas d'enfant valide
    if (!isHr(pNode) && !existChild(pNode, isNodeValide)) {
        //console.log(nLevel + " - 2 noeud filtré, enfants valides : " + existChild(pNode, isNodeValide) +" "+ printNode(pNode));
        return -1;   
    }


    
    var annotationBlocVisuel = nLevel - 1;//teste si le noeud à déjà été annoter comme bloc visuel : règle 8    
    if (isClass(pNode, "blocvisuel-"+annotationBlocVisuel)) {
         pool.push(pNode);
         return 1;
    }
    
    if (Divisable(pNode, nLevel) == true) {
        var enfants = pNode.firstChild;
            while (enfants) {
               
               if (!filtre(enfants)){
                //console.log(enfants);
                //console.log(!filtre(enfants));
                //console.log(pNode);
                //console.log("noeud parent "+ printNode(pNode) + "- noeud enfant parcouru: " + printNode(enfants));
                DivisionDomNoeud(enfants, nLevel+1, pool);
               }
               enfants = enfants.nextSibling;
            }
        }else{
            //filtre
            //Création d'un objet bloc visuel
            //console.log("Bloc extrait : "+printNode(pNode))
            //pNode.style.background = 'red';
            pool.push(pNode)
        }
    //console.log(nLevel + "- debut noeud traité : " + printNode(pNode));
}




//contient les heuristiques qui décident si un noeud doit être parcouru ou non
//c'est à dire si ses enfants forment un bloc sémantique
function Divisable(node, nLevel){
    
    /*console.log("level : "+nLevel + " - type : "+ pNode.nodeType +" - name : "+ pNode.nodeName);
    console.log("isInline : "+isInline(pNode));
    console.log("isNodeText : "+isNodeText(pNode));
    console.log("isNodeValide : "+ isValideNode(pNode));*/
    if (node.nodeName == "BODY") {
        return true;
    }
    

    //REGLE 2
    if (hasOnlyOneChild(node, isNodeValide) && !isNodeText(node.firstChild)) {
        //console.log("   Regle 2 " + printNode(node));
        annotation(node, " regle2");
        //console.log(node);
        return true;
    }
    
    //REGLE 3 
	//le bloc possede un DOC alors on parcourt
	 if (getDOC(node) != "doc-NA"){
		//console.log("   Regle 3 " + printNode(node));
		return true;      }

    //REGLE 4
    if (regle4(node) && forallChild(node, isNodeText)) {//note : tester virtual texte node
        //console.log("   Regle 4 (vb) " + printNode(node) + " class : " + node.className + " taille : "+node.length + " data : "+node.data);
        //console.log(node);
        if (!isNodeText(node)) {
            annotation(node, "blocvisuel regle4");
            annotation(node, " doc-10");
        }
        return false;
    }

        //REGLE 5
    //si il existe un bloc dans les enfants, alors on divise
   if (regle5(node) && !forallChild(node, isInline)) {
		  annotation(node, " regle5");
		  //console.log(node);
        return true;
    }
    

    //REGLE 6
    //il existe un noeud HR dans les enfants
    if (existChild(node, isHr)) {
        //console.log("Regle 6 " + printNode(node));
        annotation(node, " regle6");
        //console.log(node);
        return true;
    }

    //REGLE 7
    //
    if (sommeEnfantSup(node) && regle7(node)){
        //console.log("Regle 7 " + printNode(node));
        annotation(node, " regle7");
        //console.log(node);
        return true;
    }
    
    //REGLE 10
    if (existChild(node, compareSeuil)){
        //console.log("   Regle 10 (vb) " + printNode(node));
        annotation(node, " regle10");
        //console.log(node);
        if (!isNodeText(node)) {
            annotation(node, "blocvisuel regle10");
            annotation(node, " doc-"+tailleBalise[node.nodeName]);
        }
        return false;
    }
    
        //REGLE 8

   /*var enfants = node.firstChild;
    var condCouleurDiff = false;
    while (enfants) {
        if (!isNodeText(enfants)) {
            //console.log(enfants);
            //console.log($(node).css("background-color"));
            //console.log($(enfants).css("background-color"));
        }
        if (!isNodeText(enfants) && ($(node).css("background-color") != $(enfants).css("background-color"))) {
            condCouleurDiff = true;
            annotation(enfants, "blocvisuel-"+nLevel+ " regle8");
            annotation(enfants, "doc-8");
            //console.log("Regle 8 " + printNode(enfants));
            //console.log(enfants);
        }
        enfants = enfants.nextSibling;
    }
    if (condCouleurDiff == true) return true;*/






    
    //REGLE 9
    


    //REGLE 11
    //REGLE 12
    //REGLE 13
    //console.log("   AUCUNE REGLE");
    annotation(node, "aucuneRegle");
    //console.log(node);
    return true;
}

//
//pNode : reference element noeud du DOM
//foo : function
//return : bool
function forallChild(pNode, foo) {
    var enfants = pNode.firstChild;
    while (enfants) {

        if (!filtre(enfants)) {
            
            if (!foo(enfants)) {
                //console.log("   retour false : " + printNode(enfants));
            return false;}
        }

        enfants = enfants.nextSibling;
        }
    return true;
}

function forallChildComp(pNode, foo) {
    var enfants = pNode.firstChild;
    while (enfants) {
                if (!filtre(enfants)) {
        if (!foo(pNode, enfants)) return false;}
        enfants = enfants.nextSibling;
        }
    return true;
}

//
//pNode : reference element noeud du DOM
//foo : function
//return : bool
function existChild(pNode, foo) {
    var enfants = pNode.firstChild;
    while (enfants) {
        if (foo(enfants)) return true;

        enfants = enfants.nextSibling;
    }
    return false;
}

function existChildComp(pNode, foo) {
    var enfants = pNode.firstChild;

    while (enfants) {
        if (foo(pNode, enfants) && isNodeValide(enfants)) return true;
        enfants = enfants.nextSibling;
        }
    return false;
}

//pNode : reference element noeud du DOM
//foo : function
//return : bool
function hasOnlyOneChild(pNode, foo) {
    var enfants = pNode.firstChild;
    var cmpt = 0;
    while (enfants) {
        if (foo(enfants)) cmpt = cmpt + 1;
        enfants = enfants.nextSibling;
        }
    return (cmpt == 1);
}

function hasOnlyOneChildComp(pNode, foo) {
    var enfants = pNode.firstChild;
    var cmpt = 0;
    while (enfants) {
        if (foo(pNode, enfants)) cmpt = cmpt + 1;
        enfants = enfants.nextSibling;
        }
    return (cmpt == 1);
}
//fonction comparaison
function compareSeuil(node){
    //console.log("   noeud analysé par la règle 10 " + " taillenoeud  : "+tailleBalise[node.nodeName]);
    //console.log("       "+node.nodeName+(seuilRelative > tailleBalise[node.nodeName]))
    if (seuilRelative > tailleBalise[node.nodeName]) {
        return true;
    }
    return false;
}

function sommeEnfantSup(pNode){
    var sommeEnfant = 0;
    var enfants = pNode.firstChild;
    while (enfants) {
        if (!filtre(enfants)) {
        if (tailleBalise[enfants.nodeName]) sommeEnfant = sommeEnfant + tailleBalise[enfants.nodeName];
        }
        enfants = enfants.nextSibling;
        }
    if (tailleBalise[pNode.nodeName]){
            //console.log("sommeEnfant : " + sommeEnfant);
            //console.log(pNode);
        if (tailleBalise[pNode.nodeName] < sommeEnfant)
            return true;
    }
   return false;
}

//
function isInline(node) {
    if (isNodeText(node)) {return true};
    //console.log(node);
    //console.log("           "+inlinetab[node.nodeName]);
    //console.log("           "+$(node).css("display"));
    
    return ($(node).css("display") == "inline" || (inlinetab[node.nodeName] == true));
}

function isNodeText(node) {
    return (node.nodeType == 3);
}

function isNodeValide(node) {
    //
    if (node.nodeName == "SCRIPT") return false;
    //console.log((node.nodeType != 1 && node.nodeType != 3));
    if (node.nodeType != 1 && node.nodeType != 3) return false;//accepete que les noeuds de type element ou texte
        
    if (isNodeText(node) && (node.nodeValue.length > 0) && node.data != "") return true;
    return ($(node).width() > 0 && $(node).height() > 0);
}

function isHr(node) {
    return (node.nodeName == "HR");
}

function isBackgroundcolor(node1, node2){
    return (node1.style.background == node2.style.background);
}

function isClass(node, classname){
    //console.log("class "+classname);
    //console.log("pNode " + $(node).is("."+classname));
    if ($(node).is("."+classname)) return true;
    return false;
}

//Renvoie vraie si le noeud doit être filtré
 function filtre(node){
    
    if (node.nodeType != 1) return true;//parcours que les éléments de type ELEMENT
    if (node.nodeName == "SCRIPT") return true;
    if (node.nodeName == "STYLE") return true;
    if (node.nodeName == "NOSCRIPT") return true;
    
    return false;
 }

//
function printNode(node) {
    var id = "N/A";
    if (!isNodeText(node)) id = node.getAttribute("id");
    return "type : "+ node.nodeType +" - tag : "+ node.nodeName + " id : "+id + "classe : "+node.className;
}

function annotation(node, value){
    node.className = node.className + " " + value;
}

function getDOC(node) {
	var retour = "";
	var classes = node.className;
	classes = classes.split(" ");

	for (var key in classes){
		if (classes[key].match("doc-*")) return classes[key];}

	return "doc-NA";

}

function getDOCValue(node) {
	var retour = "";
	var classes = node.className;
	classes = classes.split(" ");

	for (var key in classes){
		if (classes[key].match("doc-*")) {
			retour = classes[key].split("-")[1];
			return retour;
			}
	}

	return "doc-NA";

}

function getID(node) {
	var retour = "";
	var classes = node.className;
	classes = classes.split(" ");

	for (var key in classes){
		if (classes[key].match("id-*")) return classes[key];}

	return "id-NA";

}

//
//plus seuil fort, moins on à de chance de la diviser
var tailleBalise = {
  "HEADER":3,
  "SECTION":3,
  "FOOTER":3,
  "NAV":3,
  "FORM" : 3,
  "TABLE" : 3,
  "DIV" : 3,
  "UL" : 0,
  "OL" : 0,
  "TD": 0,
  "LI" :0,
  "A" : 0,
  "P" : 0,
  "H1" : 0,
  "H2" : 0,
  "H3" : 0,
  "H4" : 0,
  "H5" : 0,
  "H6" : 0,
  "I" : 0,
  "B" : 0,
  "STRONG" : 0,
  "INPUT" : 0
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
  "B" : true
}

//

