//Country class to represent a country with its name, capital, primary language, and image file.
public class Country {
  // instance variables
  private String name;
  private String capital;
  private String imageFile;
  private String language;
  //constructor
  //pre con - none
  //post con - instance variables are initialized to default values
  public Country() {
    name ="";
    capital="";
    language= "";
    imageFile= "";
  }
  

  //constructor that takes in parameters for each instance variable and sets them.
  //pre con - parameters are valid Strings
  //post con - instance variables are initialized to the passed in values
  public Country(String name, String capital, String language, String imageFile){
    this.name=name;
    this.capital=capital;
    this.language=language;
    this.imageFile=imageFile;
  }
  //accessor/getter methods for each instance variable
  public String getName(){
    return name;
  }

  public String getCapital(){
    return capital;
  }

  public String getLanguage(){
    return language;
  }

  public String getImageFile(){
    return imageFile;
  }
  // toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString(){
    return name + " 's capital is " + capital + " and its primary language is " + language + ".";
  }


  
}