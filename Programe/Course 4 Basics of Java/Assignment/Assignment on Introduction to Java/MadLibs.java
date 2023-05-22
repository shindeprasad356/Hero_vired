public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
  */
  	public static void main(String[] args){
      
String adjective1 = "refreshed";
String adjective2 = "wonderful";
String adjective3 = "happy";

String noun1 = "farmer";
String noun2 = "apples";
String noun3 = "drums";
String noun4 = "animas";
String noun5 = "yogurt";
String noun6 = "robot";

String verb1 = "dance";

String name1 = "John";
String name2 = "Mary";

String place1 ="Paris";
String number = "2023";

    //The template for the story
    String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

    System.out.println(story);
    }       
}
