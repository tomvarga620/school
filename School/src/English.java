/*Tomáš Varga*/
public class English extends Subject {
    
    public String translateAnimal(String animal){
       /* if(animal.toLowerCase() == "pes"){
            return "Dog";
        }else if(animal.toLowerCase() == "mačka" || animal.toLowerCase() == "macka"){
            return "Cat";
        }else if(animal.toLowerCase() == "kohut" || animal.toLowerCase() == "kohút"){*/

       String rslt="";

       switch(animal.toLowerCase()){
           case "mačka": rslt = "Cat"; break;
           case "macka": rslt = "Cat"; break;
           case "pes": rslt = "Dog"; break;
           case "kohut": rslt = "Cock"; break;
           case "kohút": rslt = "Cock"; break;
           case "papagaj": rslt = "Parrot"; break;
           case "papagáj": rslt = "Parrot"; break;
           case "ježko": rslt = "Hedgehog"; break;
           case "jezko": rslt = "Hedgehog"; break;
           case "lenochod": rslt = "Sloth"; break;
           case "leňochod": rslt = "Sloth"; break;
           case "pavúk": rslt = "Spider"; break;
           case "pavuk": rslt = "Spider"; break;
           case "vták": rslt = "Bird"; break;
       }
       return rslt;
    }
}
