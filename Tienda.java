/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.molina.discosdarks.deprecated;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
/**
 *
 * @author angel
 */
public class Tienda {
    public static void main(String[] args) {
        
    String nombre= JOptionPane.showInputDialog("Bienvenido introduce tu nombre:");
int PAA=2650,envio=150,PAL=3670,PBM=4380,PF=5680;
int Adiadema=500;
int Ach_goma=220;
int ABlue=380;
JOptionPane.showMessageDialog(null,"Hola " + nombre + " Bienvenido a la tienda de discos Online");
JOptionPane.showMessageDialog(null,"         ***DARKS***  ");
JOptionPane.showMessageDialog(null,"Ahora te mostraremos una lista de las bandas y algunos albumes disponibles");
Object bandas=JOptionPane.showInputDialog(null,"Selecciona tu banda favorita","DISCOS DARKS",JOptionPane.QUESTION_MESSAGE,
null,new Object []{"Asking Alexandria","Alesana","Bring me the Horizon","Famous last words"},"Seleccione");	
             if (bandas.equals("Asking Alexandria")){
JOptionPane.showMessageDialog(null,"Bien has seleccionado la opcion de Asking Alexandria a continuacion te mostraremos los albumes disponibles:");
	Object xx=JOptionPane.showInputDialog(null,"Seleccione su album:","ASKING ALEXANDRIA",JOptionPane.QUESTION_MESSAGE,null,
		new Object[]{"The Black","Reckless and relentless"},"Seleccione");
              if (xx.equals("The Black")) {
Object TB=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","THE BLACK",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-I Wont Give In","2.-The Black","3,.Undivided"},"Seleccione");	
} 
             if (xx.equals("Reckless and relentless")) {
Object RAR =JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","Reckless and relentless",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Closure","2.-Reckless & Relentless","3,.Breathless"},"Seleccione");	
}
JOptionPane.showMessageDialog(null, "El precio del album que has seleccionado es de: $"+PAA+" Mas envio ($"+envio+")");
int d=JOptionPane.showConfirmDialog(null,"¿Deseas comprarlo?");
            if (JOptionPane.OK_OPTION==d) {
JOptionPane.showMessageDialog(null,"Procesando por favor espere...");
String a= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
JOptionPane.showMessageDialog(null,"Gracias "+ nombre +" estamos validando tu numero de cuenta ");   
JOptionPane.showMessageDialog(null,"Tu compra ha sido realizada");
JOptionPane.showMessageDialog(null, "Precio final: $"+(PAA+envio));
JOptionPane.showMessageDialog(null,"Tu album estara en tu casa en 3 dias");
JOptionPane.showMessageDialog(null,"Gracias por tu preferencia");
int a1=JOptionPane.showConfirmDialog(null,"¿Deseas ver nuestra liena de audifonos?");
	       if (JOptionPane.OK_OPTION==a1){
JOptionPane.showMessageDialog(null, "Nuestra linea de audifonos tiene una gran variedad de diseños a continuacion te mostraremos la clave de los diseños de los audifonos");
		Object p=JOptionPane.showInputDialog(null,"Selecciona tu diseño favorito:","",JOptionPane.QUESTION_MESSAGE,null,
new Object []{"Diadema","Chicharos o goma","Bluethooth"},"Seleccione");        
             if (p.equals("Diadema")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ Adiadema);
int g=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?");
             if(JOptionPane.OK_OPTION==g){
    	  String a111= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
            if (a111.equals(a)){
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (Adiadema+PAA+envio));
JCheckBox chec= new JCheckBox("En otro momento gracias");
int cal2=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo",chec},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
           if (chec.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
          if (p.equals("Chicharos o goma")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+Ach_goma );
int g1=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
	      if(JOptionPane.OK_OPTION==g1){
String a11= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
          if (a11.equals(a)){
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (PAA+Ach_goma+envio));	
JCheckBox chec2= new JCheckBox("En otro momento gracias");
int cal1=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo",chec2},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");	    
if (chec2.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
	     if (p.equals("Bluethooth")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ ABlue);
int g11=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
     if(JOptionPane.OK_OPTION==g11){
	    	 String a2= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
	    	 if (a2.equals(a)){
JOptionPane.showMessageDialog(null,"¡¡Compra realizada!! ");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (PAA+ABlue+envio));
JCheckBox chec3= new JCheckBox("En otro momento gracias");int cal=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo"},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec3.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
}
}  
}
}
}
}
}
}
}
}
}
}
			
if (bandas.equals("Alesana")){
JOptionPane.showMessageDialog(null,"Bien has seleccionado la opcion de Alesana a continuacion te mostraremos los albumes disponibles:");
	Object xx=JOptionPane.showInputDialog(null,"Seleccione su album:","ALESANA",JOptionPane.QUESTION_MESSAGE,null,
		new Object[]{"The emptiness","Confessions"},"Seleccione");
     if (xx.equals("The emptiness")) {
JOptionPane.showMessageDialog(null,"Las canciones del album seleccionado son:");
Object TE=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","THE EMPTINESS",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Annabel","2.-In Her Tomb By the Sounding Sea","3.-The thespian"},"Seleccione");
    }
     if (xx.equals("Confessions")) {
Object C=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","Confessions",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Fatal Optimist","2.-Oh, How the Mighty Have Fallen","3.-Through the Eyes of Urie"},"Seleccione");
     }
JOptionPane.showMessageDialog(null,"El precio del album que has seleccionado es de: $"+PAL+" mas envio ($"+envio+")");
int d1=JOptionPane.showConfirmDialog(null,"¿Deseas comprarlo?");
if (JOptionPane.OK_OPTION==d1) {
JOptionPane.showMessageDialog(null,"Procesando por favor espere...");
String a4= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
JOptionPane.showMessageDialog(null,"Gracias "+ nombre +" estamos validando tu numero de cuenta ");   
JOptionPane.showMessageDialog(null,"Tu compra ha sido realizada");
JOptionPane.showMessageDialog(null,"Precio final: $"+(PAL+envio));
JOptionPane.showMessageDialog(null,"Tu album estara en tu casa en 3 dias");
JOptionPane.showMessageDialog(null,"Gracias por tu preferencia");
int a14=JOptionPane.showConfirmDialog(null,"¿Deseas ver nuestra liena de audifonos?");
	if (JOptionPane.OK_OPTION==a14){
JOptionPane.showMessageDialog(null, "Nuestra linea de audifonos tiene una gran variedad de diseños a continuacion te mostraremos la clave de los diseños de los audifonos");
		Object p7=JOptionPane.showInputDialog(null,"Selecciona tu diseño favorito:","",JOptionPane.QUESTION_MESSAGE,null,
new Object []{"Diadema","Chicharos o goma","Bluethooth"},"Seleccione");        
 if (p7.equals("Diadema")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ Adiadema);
int g=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?");
      if(JOptionPane.OK_OPTION==g){
    	  String a111= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
    	  if (a111.equals(a4)){
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (Adiadema+PAL+envio));
JCheckBox chec5= new JCheckBox("En otro momento gracias");
int cal7=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec5},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec5.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
      if (p7.equals("Chicharos o goma")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+Ach_goma );
	int g1=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
	     if(JOptionPane.OK_OPTION==g1){
String a112= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
if (a112.equals(a4)){
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (PAL+envio+Ach_goma));	
JCheckBox chec4=new JCheckBox("En otro momento gracias");
int cal6=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec4},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec4.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
	     if (p7.equals("Bluethooth")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ ABlue);
int g112=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
     if(JOptionPane.OK_OPTION==g112){
	    	 String a22= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
	    	 if (a22.equals(a4)){
JOptionPane.showMessageDialog(null,"¡¡Compra realizada!! ");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (ABlue+PAL+envio));
JCheckBox chec6=new JCheckBox("En otro momento gracias");
int cal8=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec6},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec6.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
}
}  
}
}
}
}
}
}
}
}
}
}

if (bandas.equals("Bring me the Horizon")){
JOptionPane.showMessageDialog(null,"Bien has seleccionado la opcion de Bring me the Horizon a continuacion te mostraremos los albumes disponibles:");
	Object xx=JOptionPane.showInputDialog(null,"Seleccione su album:","BRING ME THE HORIZON",JOptionPane.QUESTION_MESSAGE,null,
		new Object[]{"Sempiternal","The Deathbeds EP"},"Seleccione");
     if (xx.equals("Sempiternal")) {
JOptionPane.showMessageDialog(null,"Las canciones del album seleccionado son:");
Object S=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","Sempiternal",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Can You Feel My Heart","2.-Sleepwalking","3.-Shadow Moses "},"Seleccione");
}
     if (xx.equals("The Deathbeds EP")) {
JOptionPane.showMessageDialog(null,"Las canciones del album seleccionado son:");	
Object S=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","The Deathbeds EP",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Join the Club","2.-Chasing Rainbows","3.-Through the Eyes of Urie "},"Seleccione");
}   
JOptionPane.showMessageDialog(null,"El precio del album que has seleccionado es de: $"+PBM+" mas envio ($"+envio+")");
int d19=JOptionPane.showConfirmDialog(null,"¿Deseas comprarlo?");
if (JOptionPane.OK_OPTION==d19) {
	JOptionPane.showMessageDialog(null,"Procesando por favor espere...");
String a49= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
System.out.println("Gracias "+ nombre +" estamos validando tu numero de cuenta ");   
JOptionPane.showMessageDialog(null,"Tu compra ha sido realizada");
JOptionPane.showMessageDialog(null,"Precio final: $"+(PBM+envio));
JOptionPane.showMessageDialog(null,"Tu album estara en tu casa en 3 dias");
JOptionPane.showMessageDialog(null,"Gracias por tu preferencia");
int a149=JOptionPane.showConfirmDialog(null,"¿Deseas ver nuestra liena de audifonos?");
	if (JOptionPane.OK_OPTION==a149){
JOptionPane.showMessageDialog(null, "Nuestra linea de audifonos tiene una gran variedad de diseños a continuacion te mostraremos la clave de los diseños de los audifonos");
		Object p79=JOptionPane.showInputDialog(null,"Selecciona tu diseño favorito:","",JOptionPane.QUESTION_MESSAGE,null,
new Object []{"Diadema","Chicharos o goma","Bluethooth"},"Seleccione");        
 if (p79.equals("Diadema")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ Adiadema);
int g=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?");
      if(JOptionPane.OK_OPTION==g){
    	  String a111= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
    	  if (a111.equals(a49)) {
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (Adiadema+PBM+envio));
JCheckBox chec7=new JCheckBox("En otro momento gracias");
int cal88=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec7},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec7.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
      if (p79.equals("Chicharos o goma")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+Ach_goma );
	int g1=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
	     if(JOptionPane.OK_OPTION==g1){
String a112= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
    if (a112.equals(a49)) {
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (Ach_goma+PBM+envio));	
JCheckBox chec8=new JCheckBox("En otro momento gracias");
int cal777=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec8},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");  
if (chec8.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
	     if (p79.equals("Bluethooth")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ ABlue);
int g112=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
     if(JOptionPane.OK_OPTION==g112){
	    	 String a22= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
	    	 if (a22.equals(a49)) {
JOptionPane.showMessageDialog(null,"¡¡Compra realizada!! ");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (ABlue+PBM+envio));
JCheckBox chec9=new JCheckBox("En otro momento gracias");
int cal44=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec9},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec9.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
}
}  
}
}
}
}
}
}
}
}
}
}

if (bandas.equals("Famous last words")){
JOptionPane.showMessageDialog(null,"Bien has seleccionado la opcion de Famous last words a continuacion te mostraremos los albumes disponibles:");
	Object xx=JOptionPane.showInputDialog(null,"Seleccione su album:","Famous last words",JOptionPane.QUESTION_MESSAGE,null,
		new Object[]{"the incubus","Council of the Dead"},"Seleccione");
     if (xx.equals("the incubus")) {
JOptionPane.showMessageDialog(null,"Las canciones del album seleccionado son:");
Object TI=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","the incubus",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Pretty in Porcelain","2.-Marionette","3.-Trophy Wife "},"Seleccione");
}
     if (xx.equals("Council of the Dead")) {
JOptionPane.showMessageDialog(null,"Las canciones del album seleccionado son:");	
Object CD=JOptionPane.showInputDialog(null,"Las canciones del album seleccionado son:","Council of the Dead",JOptionPane.QUESTION_MESSAGE,null,
new Object[]{"1.-Council of the Dead","2.-The Fog","3.-The End of the Beginning "},"Seleccione");
}  
     JOptionPane.showMessageDialog(null,"El precio del album que has seleccionado es de: $"+PF +" mas envio ($"+envio+")");
int d1=JOptionPane.showConfirmDialog(null,"¿Deseas comprarlo?");
if (JOptionPane.OK_OPTION==d1) {
	JOptionPane.showMessageDialog(null,"Procesando por favor espere...");
String a4= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
JOptionPane.showMessageDialog(null,"Gracias "+ nombre +" estamos validando tu numero de cuenta ");   
JOptionPane.showMessageDialog(null,"Tu compra ha sido realizada");
JOptionPane.showMessageDialog(null,"Precio final: $"+(PF+envio));
JOptionPane.showMessageDialog(null,"Tu album estara en tu casa en 3 dias");
JOptionPane.showMessageDialog(null,"Gracias por tu preferencia");
int a14=JOptionPane.showConfirmDialog(null,"¿Deseas ver nuestra liena de audifonos?");
	if (JOptionPane.OK_OPTION==a14){
JOptionPane.showMessageDialog(null, "Nuestra linea de audifonos tiene una gran variedad de diseños a continuacion te mostraremos la clave de los diseños de los audifonos");
		Object p7=JOptionPane.showInputDialog(null,"Selecciona tu diseño favorito:","",JOptionPane.QUESTION_MESSAGE,null,
new Object []{"Diadema","Chicharos o goma","Bluethooth"},"Seleccione");        
 if (p7.equals("Diadema")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ Adiadema);
int g=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?");
      if(JOptionPane.OK_OPTION==g){
    	  String a111= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
    	  if (a4.equals(a111)){
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (Adiadema+PF+envio));
JCheckBox chec83=new JCheckBox("En otro momento gracias");
int cal666=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec83},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec83.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
      if (p7.equals("Chicharos o goma")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+Ach_goma );
	int g1=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
	     if(JOptionPane.OK_OPTION==g1){
String a112= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
if (a4.equals(a112)){
JOptionPane.showMessageDialog(null,"Compra realizada!!!");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (Ach_goma+PF+envio));	
JCheckBox chec82=new JCheckBox("En otro momento gracias");
int cal123=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec82},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec82.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
	     if (p7.equals("Bluethooth")){
JOptionPane.showMessageDialog(null, "El precio de estos audifonos es de: "+ ABlue);
int g112=JOptionPane.showConfirmDialog(null,"¿Desea reaizar la compra?"); 
     if(JOptionPane.OK_OPTION==g112){
	    	 String a22= JOptionPane.showInputDialog("Introduce tu numero de cuenta:");
	    	 if (a4.equals(a22)){
JOptionPane.showMessageDialog(null,"¡¡Compra realizada!! ");
JOptionPane.showMessageDialog(null,"PRECIO FiNAL: " + (ABlue+PF+envio));
JCheckBox chec81=new JCheckBox("En otro momento gracias");
int cal321=JOptionPane.showOptionDialog(null,"¿Que te parecio nuestro programa?","ANGEL Y PAOLA",JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,null,new Object []{"Bueno","Regular","Malo","Ignorar",chec81},"Seleccione");
JOptionPane.showMessageDialog(null,"Gracias seguiremos mejorando");
if (chec81.isSelected()){
JOptionPane.showMessageDialog(null,"Disculpe las molestias");
}
}
}  
}
}
}
}
}
}
}
}
}
}

}
}
