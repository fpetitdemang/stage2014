//API SEPARATEUR

function extractionSeparateurH(pool) {

    var poolSeparateur = [];
    var poolBloc = ConstruireTableauRectangle(pool);

    
    //intialisation séparateur
    var separateurInit = new SeparateurH(0, 2000);

    poolSeparateur.push(separateurInit);
    

    for (var key1 in poolBloc) {
        //console.log("<TOUR : "+key1+">"); 
        //$(poolBloc[key1]).css( "background-color", "green");

        var tmppoolSeparateur = poolSeparateur;
        
        for (var key2 in tmppoolSeparateur ){
            
            var bloc = poolBloc[key1];
            var separateur = poolSeparateur[key2];
            
            //Separateur contient le bloc
            if (bloc.EstContenuH(separateur)) {
                var separateurs = separateur.splitH(bloc.bordSup, bloc.bordInf);
                
                //console.log("suppression "+poolSeparateur[key2].print());
                poolSeparateur.splice(key2, 1);
                //console.log(separateurs[0].print() + " avant " + separateurs[0].poolbloc2.length);
                
                
                //ajout des nouveaux separateurs
                poolSeparateur.push(separateurs[0]);
                poolSeparateur.push(separateurs[1]);
                
                

                //console.log(separateurs[0])

                //console.log("creation "+separateurs[0].print());
                //console.log("creation "+separateurs[1].print());
                
                
                
                
            }else{
                //Le separateur est traverse par le bloc
                if (separateur.EstTraverseH(bloc)) {
                    if(separateur.bordSup > bloc.bordSup){
                        //bloc en haut du separateur
                        separateur.bordSup = bloc.bordInf;
                        //console.log("met à jour "+separateur.print() +" -> "+separateur.print());
                    }else{
                        //bloc en bas du séparateur
                        //console.log("met à jour \n   "+separateur.print());
                        separateur.SetbInf(bloc.bordSup);
                        //console.log("   "+separateur.print());
                    }
                }
            }
            
            //Separateur est contenu dans le bloc
            if (separateur.EstContenuH(bloc)) {
                //console.log("suppression "+separateur.print());
               poolSeparateur.splice(key2, 1);
            }
            
            
        }
        //
        //dessinerPoolSep(poolSeparateur);
        //alert("<TOUR : "+key1+">");
        //console.log("</TOUR : "+key1+">");
        //effacerPoolSep(poolSeparateur);
        //
    }
    
   /*console.log("<RESULTAT>");
    for (var key2 in poolSeparateur ){
    //console.log(poolSeparateur[key2].print())
    console.log(poolSeparateur[key2]);
    }
    console.log("</RESULTAT>");*/
    
    //
    //dessinerPoolSep(poolSeparateur);
    //effacerPoolSep(poolSeparateur);
    //
    return poolSeparateur;
    
}

function identificationRelationBlocH(poolBloc, poolSeparateur) {
    poolBloc = ConstruireTableauRectangle(poolBloc);
    for (var key1 in poolSeparateur) {
        for (var key2 in poolBloc) {
            //console.log(poolSeparateur[key1].print() + " : "+poolBloc[key2].print());
            if (poolSeparateur[key1].bordSup == poolBloc[key2].bordInf) {
                poolSeparateur[key1].addpoolbloc1(poolBloc[key2]);
            }
            if (poolSeparateur[key1].bordInf == poolBloc[key2].bordSup) {
                poolSeparateur[key1].addpoolbloc2(poolBloc[key2]);
            }
        }
    }
}

function identificationRelationBlocV(poolBloc, poolSeparateur) {
    poolBloc = ConstruireTableauRectangle(poolBloc);
    for (var key1 in poolSeparateur) {
        for (var key2 in poolBloc) {
            //console.log(poolSeparateur[key1].print() + " : "+poolBloc[key2].print());
            if (poolSeparateur[key1].bordDroit == poolBloc[key2].bordGauche) {
                poolSeparateur[key1].addpoolbloc1(poolBloc[key2]);
            }
            if (poolSeparateur[key1].bordGauche == poolBloc[key2].bordDroit) {
                poolSeparateur[key1].addpoolbloc2(poolBloc[key2]);
            }
        }
    }
}

function calculePoidSeparateur(poolSeparateur) {
    for (var key in poolSeparateur){
        //poids = distanceVisuelle + distanceGeographique
        poolSeparateur[key].weight = 20;
    }
}


function extractionSeparateurV(pool) {
    //var poolBloc = [$("#bloc1"),$("#bloc2"),$("#bloc3"), $("#bloc4")];
    //var poolBloc = [];
    var poolSeparateur = [];
    
    //

    //
    
    poolBloc = ConstruireTableauRectangle(pool);
    //intialisation séparateur
    //se referer à la position des blocs (le plus en haut? le plus en bas?)
    var separateurInit = new SeparateurV(0, 2000);
   // separateurInit.dessiner();
    separateurInit.SetWidth(2000);
    
    poolSeparateur.push(separateurInit);
    //separateurInit.dessiner();
    
    //console.log("Separateur initial : "+separateurInit.print());

    //Dectection des séparateurs Horizontales
    for (var key1 in poolBloc) {
        console.log("<TOUR : "+key1+">");
            //
            $(pool[key1]).css( "background-color", "green");
            //
        var tmppoolSeparateur = poolSeparateur;
        for (var key2 in tmppoolSeparateur ){
            var bloc = poolBloc[key1];
            var separateur = poolSeparateur[key2];
            
            //Separateur contient le bloc
            if (bloc.EstContenuV(separateur)) {
                var separateurs = separateur.splitV(bloc.bordGauche, bloc.bordDroit);
                
                //console.log("suppression "+poolSeparateur[key2].print());
                poolSeparateur.splice(key2, 1);
                poolSeparateur.push(separateurs[0]);
                poolSeparateur.push(separateurs[1]);
                console.log("creation "+separateurs[0].print());
                console.log("creation "+separateurs[1].print());
                //return -1;
                //
                
                
            }else{
                //Le separateur est traverse par le bloc
                if (separateur.EstTraverseV(bloc)) {
                    if(separateur.bordGauche > bloc.bordGauche){
                        //
                        separateur.bordGauche = bloc.bordDroit;
                        console.log("met à jour "+separateur.print() +" -> "+separateur.print());
                    }else{
                        //bloc en bas du séparateur
                        //console.log("met à jour \n   "+separateur.print());
                        separateur.bordDroit = bloc.bordGauche;
                        console.log("met à jour"+separateur.print());
                    }
                }
            }
            
            //Separateur est contenu dans le bloc
            if (separateur.EstContenuV(bloc)) {
                console.log("suppression "+separateur.print());
               poolSeparateur.splice(key2, 1);
            }
            //dessinerPoolSep(poolSeparateur);
            //if (key1 == 0) return -1;
        }
        //
        //effacerPoolSep(poolSeparateur);
        
        //alert("<TOUR : "+key1+">");
        
        //console.log("</TOUR : "+key1+">");
        //effacerPoolSep(poolSeparateur);
        //
    }
    console.log("<RESULTAT>");
    //printpool(poolSeparateur);

    console.log("</RESULTAT>");
    
    //
    dessinerPoolSep(poolSeparateur);
    //effacerPoolSep(poolSeparateur);
    //
    
    
    
}

var trieSeparateur = function(sep1, sep2){
    if (sep1.weight > sep2.weight)
        return true;
    return false;
}

function fusionBloc(poolseparateur, level){
    poolseparateur.sort(trieSeparateur);
    var seuil = 10;
    var label = "pool-"+level+"-";
    var cmpt = 0;
    for (var key in poolseparateur){
        if (poolseparateur[key].weight <= 10) {
            for (var key2 in poolseparateur[key].poolbloc1) {
                ref = poolseparateur[key].poolbloc1[key2].reference;

                if (!$(ref).is('.pool')) {
                    annotation(ref, "pool");
                    annotation(ref, label+cmpt);
                }
                
            }
            for (var key2 in poolseparateur[key].poolbloc2) {
                ref = poolseparateur[key].poolbloc2[key2].reference;
                if (!$(ref).is('.pool')) {
                    annotation(ref, "pool");
                    annotation(ref, label+cmpt);
                }
            }
        }else{
            for (var key2 in poolseparateur[key].poolbloc1) {
                ref = poolseparateur[key].poolbloc1[key2].reference;
                if (!$(ref).is('.pool')) {
                    annotation(ref, "pool");
                    annotation(ref, label+cmpt);
                }
                cmpt = cmpt + 1;
            }
            for (var key2 in poolseparateur[key].poolbloc2) {
                ref = poolseparateur[key].poolbloc2[key2].reference;
                if (!$(ref).is('.pool')) {
                    annotation(ref, "pool");
                    annotation(ref, label+cmpt);
                }
                cmpt = cmpt + 1;                
            }
        }
    }
}
