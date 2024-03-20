import java.io.*;

class Fichero{
public static void main(String[] args) {
    File fichero = new File("./Ficheros/formulario.txt");
    //crear archivo
    if(fichero.exists()== false){
    try{
        if(fichero.createNewFile()){
        System.out.println("Se creo apa");
        }else {
            System.out.println("Ya existe o le moviste a algo");
        }
    }catch(IOException ex){
        ex.printStackTrace(System.out);
    }
    } 
    
    //Escribir en el fichero (aplicado a la actualizacion de los perros formularios)
    try{
        //El de prueba xd
       String cambios[] = new String[30];
       for(int i=0; i<cambios.length;i++){
         cambios[i]=String.valueOf(i)+", ";
       } 
       //Primero hacemos una copia de todo el contenido
       String content = "";
       FileReader leer = new FileReader(fichero);
       BufferedReader lector = new BufferedReader(leer);
       content=lector.readLine();
       String  general[] = content.split(", ");


       FileWriter escribir = new FileWriter(fichero);
       //Despues se compara y pues ya xd
       for(int i=0; i<general.length;i++){
        if(general[i] !=cambios[i]){
        escribir.write(cambios[i]);
        }else if(general[i] ==cambios[i] || cambios[i]==null){
        escribir.write(general[i]);
        }
       } 
        
       
       lector.close();
       escribir.close();
    }catch(IOException ex){
        ex.printStackTrace(System.out);
    }

    //leer el fichero (aplicado)
    try{
        /* Para cuando hay saltos de linea
        String texto= "";
        FileReader leer = new FileReader(fichero);
        BufferedReader lector = new BufferedReader(leer);
        texto=lector.readLine();
        while(texto != null){
            System.out.println(texto);
            texto=lector.readLine();
        }*/
        
        //Meter en un arreglo lo leido

        //Todo el perro formulario
        String texto2="";
        FileReader leer2 = new FileReader(fichero);
        BufferedReader lector2 = new BufferedReader(leer2);
        texto2=lector2.readLine();
        String  general[] = texto2.split(", ");
        //Preguntas
        String preg[] = new String[6];
        for(int i=0;i<preg.length;i++){
            preg[i]=general[i];
        }
        //Respuestas
        String resp[] = new String[12];
        int o=preg.length;
        for(int i=0;i<resp.length;i++){
            resp[i]=general[o];
            o=o+1;
        }o=0;
        //Valores
        String valo[] = new String[12];
        int u=preg.length +resp.length;
        for(int i=0;i<valo.length;i++){
            valo[i]=general[u];
            u=u+1;
        }u=0;
        

        //lector.close();
        lector2.close();
     }catch(IOException ex){
         ex.printStackTrace(System.out);
     }
 
}
}