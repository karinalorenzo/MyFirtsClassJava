package dev.karina.my_firts_class;

public class Person {
    
    public String name;
    public String surname;
    public String numDocument;
    public int yearBirthday;

public Person(String name, String surname, String numDocument, int yearBirthday){
    this.name = name;
    this.surname = surname;
    this.numDocument = numDocument;
    this.yearBirthday = yearBirthday;
}

public String getName(){
    return name;
}

public String getSurname(){
    return surname;
}


public String getNumDocument(){
    return numDocument;
}

public int getYearBirthday(){
    return yearBirthday;
}

public void setName(String name){
    this.name = name;
}

public void setSurname(String surname){
    this.surname = surname;
}

public void setNumDocument(String numDocument){
    this.numDocument = numDocument;
}

public void setYearBirthday(int yearBirthday){
    this.yearBirthday = yearBirthday;
}

}


