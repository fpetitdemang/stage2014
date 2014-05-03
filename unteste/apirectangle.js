function testeApiRectangle() {
    alert("apirectangle chargé");
}

//Start Classe Point
function Point(x, y) {
    this.x = x;
    this.y = y;
}

Point.prototype.XestSup = function (point) {
    if (this.x >= point.x) {
        return true;
    }
    return false;
}

Point.prototype.YestSupEgal = function (point) {
    if (this.y >= point.y) {
        return true;
    }
    return false;
}

Point.prototype.print = function () {
    return "("+this.x+", "+this.y+")";
    };  
//End Classe Point

//Classe Rectangle
function Rectangle(){
    this.label = "0";
    this.conteneur;
    this.reference;
    this.p1;//coin(haut,droit)
    this.p2;//coin(haut, gauche)
    this.p3;//coin(bas, droit)
    this.p4;//coin(bas, gauche)
    this.bordSup;//top
    this.bordInf;//top+height
    this.bordGauche;//
    this.bordDroit;//
    this.height;
    this.width = 0;
    this.weight = 0;
}

Rectangle.prototype.Construire = function () {};

//@Depreciate
Rectangle.prototype.ConstruireSeparateurH = function (bSup, bInf) {
    this.bordSup = bSup;
    this.bordInf = bInf;
};

Rectangle.prototype.SetbSup = function (bSup) {
    this.bordSup = bSup;
};

Rectangle.prototype.SetbInf = function (bInf) {
    this.bordInf = bInf;
};

Rectangle.prototype.SetLabel = function (label){
    this.label = label;
}

Rectangle.prototype.SetWidth = function (width){
    this.width = width;
}

Rectangle.prototype.Setweight = function (weight){
    this.weight = weight;
}


//Rectangle.prototype.constructor = function(){   
//}


//bordure : Int
Rectangle.prototype.EstAvantBordSup = function (bordure){
    return (this.bordSup >= bordure);
};

//bordure : Int
Rectangle.prototype.EstAvantBordGauche = function (bordure){
    return (this.bordGauche <= bordure);
};

//bordure : Int
Rectangle.prototype.EstAvantBordDroit = function (bordure){
    return (this.bordDroit <= bordure);
};

//bordure : Int
Rectangle.prototype.EstAvantBordInf = function (bordure){
    return (this.bordInf >= bordure);
};


//Relation d'inclusion (Horizontale)
Rectangle.prototype.EstContenuH = function (bloc) {
    //alert(this.EstAvantBordSup(bloc));
    //alert(this.p3.y +" < "+bloc.p3.y);
    if (this.EstAvantBordSup(bloc.bordSup) && !this.EstAvantBordInf(bloc.bordInf)) {
        return true;
    }
    return false;
};

//Relation d'intersection (Horizontale)
Rectangle.prototype.EstTraverseH = function (bloc) {
    //bord supérieur du bloc passé en paramètre est contenu dans l'air du bloc courant
    if (!this.EstAvantBordSup(bloc.bordSup) && this.EstAvantBordInf(bloc.bordSup)) {
        return true;
    }
    //bord inférieur du bloc passé en paramètre est contenu dans l'air du bloc courant
    if (!this.EstAvantBordSup(bloc.bordInf) && this.EstAvantBordInf(bloc.bordInf)) {
        return true;
    }
    return false;
};

//Relation d'inclusion
Rectangle.prototype.EstContenuV = function (bloc) {
    /*console.log(this.print());
    console.log(bloc.print());
    console.log(!this.EstAvantBordGauche(bloc.bordGauche));*/
    if (!this.EstAvantBordGauche(bloc.bordGauche) && this.EstAvantBordDroit(bloc.bordDroit)) {
        return true;
    }
    return false;
};

//Relation d'intersection
Rectangle.prototype.EstTraverseV = function (bloc) {
    console.log("EstTraverseV");
    console.log("sep : "+this.print());
    console.log("bloc : "+bloc.print());
    if (this.bordGauche < bloc.bordDroit && this.bordDroit > bloc.bordGauche) {
        return true;
    }
    
    if (this.bordGauche > bloc.bordDroit && this.bordDroit < bloc.bordGauche) {
        return true;
    }
    return false;
};



//Soustrait, Decoupe l'interval de pixel, passé en parametre, du rectangle courant
//debut : Flottant, fin : Flottant
//Retourne deux instances de rectangle
Rectangle.prototype.splitH = function(debut, fin){
    /*var rec1 = new Rectangle();
    var rec2 = new Rectangle();
    
    rec1.ConstruireSeparateurH(this.bordSup, debut);
    rec2.ConstruireSeparateurH(fin, this.bordInf);
    
    var retour = [];
    retour.push(rec1, rec2);
    
    return retour;*/
    
    alert("Utilisation d'une méthode déprécié : Rectangle.prototype.splitH");
    
    
};

Rectangle.prototype.print = function(){
    retour = "";
    retour = retour +"" +"(bordSup:" + this.bordSup + ", " + "bordInf:"+this.bordInf +")";
    return retour;
}

//END CLASSE RECTANGLE


//CLASSE BLOCVISUEL

var Blocvisuel = function(elementNode){
    elementNode = $(elementNode);
    this.p1 = new Point(elementNode.offset().left, elementNode.offset().top);
    this.p2 = new Point(elementNode.offset().left + elementNode.innerHeight(), elementNode.offset().top);
    this.p3 = new Point(elementNode.offset().left, elementNode.offset().top + elementNode.innerHeight());
    this.p4 = new Point(elementNode.offset().left + elementNode.innerHeight(), elementNode.offset().top + elementNode.innerHeight());
    this.bordSup = elementNode.offset().top;
    this.bordInf = elementNode.offset().top + elementNode.innerHeight();
    this.bordGauche = elementNode.offset().left;
    this.bordDroit = elementNode.offset().left + elementNode.width();
}
//Blocvisuel hérite de rectangle
Blocvisuel.prototype = new Rectangle();
Blocvisuel.prototype.constructor = Blocvisuel;

/*methode*/
Blocvisuel.prototype.dessiner = function(){   
    this.reference.style.background = "green";    
}

//END CLASSE BLOCVISUEL


//CLASSE SEPARATEUR
var Separateur = function () {

    }; 
Separateur.prototype = new Rectangle();
Separateur.prototype.constructor = Separateur;




//END CLASSE


//CLASSE SEPARATEURH
var SeparateurH = function (mtop, mheight) {
    this.bordSup = mtop;
    this.bordInf = mtop + mheight;
    this.height = mheight;
    this.poolbloc1 = [];
    this.poolbloc2 = [];
};
SeparateurH.prototype = new Separateur();
SeparateurH.prototype.constructor = SeparateurH;

/*Methodes*/
SeparateurH.prototype.addpoolbloc1 = function(bloc){
    //this.poolbloc1 = bloc;
    this.poolbloc1.push(bloc);
};

SeparateurH.prototype.addpoolbloc2 = function(bloc){
    this.poolbloc2.push(bloc);
    //this.poolbloc2 = bloc;
};

SeparateurH.prototype.splitH = function(debut, fin){
    var sep1 = new SeparateurH(this.bordSup, debut - this.bordSup);
    var sep2 = new SeparateurH(fin, this.bordInf);
    
    var retour = [];
    retour.push(sep1, sep2);
    
    return retour;
};


SeparateurH.prototype.addpoolbloc = function(bloc){

    //poolbloc1 -> bloc est à gauche du séparateur
    if (this.EstAvantBordSup(bloc.bordSup)){
        this.addpoolbloc1(bloc);
    }else{
        this.addpoolbloc2(bloc);
    }
};


SeparateurH.prototype.dessiner = function(){
    var _body = document.getElementsByTagName('body')[0];
    this.reference = document.createElement('div');
    
    var _text = document.createTextNode('Separateur : '+this.print())
    this.reference.appendChild(_text);

    
    this.reference.style.position = "absolute";
    this.reference.style.top = this.bordSup + "px";
    this.reference.style.height = this.height + "px";
    this.reference.style.width = "2000px";
    this.reference.style.background = "red";
    _body.appendChild(this.reference);
    
}

SeparateurH.prototype.effacer = function(){
    this.reference.parentNode.removeChild(this.reference);
}

SeparateurH.prototype.print = function(){
    retour = "";
    retour = retour +"" +"(bordSup:" + this.bordSup + ", " + "bordInf:"+this.bordInf +") : poids = "+this.weight;

    /*for (var key1 in poolbloc1){
        retour = " "+retour + poolbloc1[key1].label;
    }
    for (var key2 in poolbloc2) {
        retour = " "+retour + poolbloc2[key2].label;
    }*/
        
    return retour;
}

//END CLASSE

//CLASSE SEPARATEURV
var SeparateurV = function (mleft, mwidth) {
    this.bordGauche = mleft;
    this.bordDroit = mleft + mwidth;
    this.width = mwidth;
    this.poolbloc1 = [];
    this.poolbloc2 = [];
};
SeparateurV.prototype = new Separateur();
SeparateurV.prototype.constructor = SeparateurV;

/*Methodes*/
SeparateurV.prototype.addpoolbloc1 = function(bloc){
    //this.poolbloc1 = bloc;
    this.poolbloc1.push(bloc);
};

SeparateurV.prototype.addpoolbloc2 = function(bloc){
    this.poolbloc2.push(bloc);
    //this.poolbloc2 = bloc;
};
SeparateurV.prototype.splitV = function(debut, fin){
    var sep1 = new SeparateurV(this.bordGauche, debut - this.bordGauche);
    var sep2 = new SeparateurV(fin, this.width);
    
    var retour = [];
    retour.push(sep1, sep2);
    
    return retour;
};

SeparateurV.prototype.dessiner = function(){
    console.log("dessiner"+this.print());
    var _body = document.getElementsByTagName('body')[0];
    this.reference = document.createElement('div');
    
    var _text = document.createTextNode('Separateur : '+ this.print());
    this.reference.appendChild(_text);

    
    this.reference.style.position = "absolute";
    this.reference.style.top = "0px";
    this.reference.style.left = this.bordGauche + "px";
    this.reference.style.width = this.width + "px";
    this.reference.style.height = "1100px";
    this.reference.style.background = "yellow";
    _body.appendChild(this.reference);   
}

SeparateurV.prototype.addpoolbloc = function(bloc){
    //poolbloc1 -> bloc est en haut du séparateur
    if (this.EstAvantBordSup(bloc.bordSup)){
        addpoolbloc1(bloc);
    }else{
        addpoolbloc2(bloc);
    }
};

SeparateurV.prototype.effacer = function(){
    this.reference.parentNode.removeChild(this.reference);
}


SeparateurV.prototype.print = function(){
    retour = "";
    retour = retour +"" +"(bordGauche:" + this.bordGauche + ", " + "bordDroit:"+this.bordDroit +")";
    return retour;
}
//END CLASSE


//construit une collection de Rectangle à partir d'une collection de reference d'element du DOM
function ConstruireTableauRectangle (tableauRef){
    var retour = [];
        for(var key in tableauRef){
            var tmpR = new Blocvisuel(tableauRef[key]);
           // console.log(tableauRef[key].getAttribute('id'));
            tmpR.reference = tableauRef[key];
            tmpR.SetLabel(tableauRef[key].getAttribute('id'));
            retour.push(tmpR);
            //alert(retour[key].p1.print());
    }
    return retour;
}


//

