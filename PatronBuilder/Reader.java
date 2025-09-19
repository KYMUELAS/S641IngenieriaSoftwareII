public class Reader {

    private String element; 
    private Converter converter; 

    public Reader (String element, Converter converter) {
        this.element = element;
        this.converter = converter; 
    }
    
    //Metodos
    public void parseInput(){
            switch (element){
                
        case "line":
        converter.makeLine();
        break;
        case "PRAGRAPH":


    }
    }

}
