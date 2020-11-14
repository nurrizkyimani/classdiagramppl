class main {


  class admin {

    void manageCourse() {
       System.out.println("manage Course");
    }

    void manageSubtopic(){
        System.out.println("manage Course");
    }

    void manageUser() {
        System.out.println("manage Course");
    } 
    
  }


  class User {
    int user_id ;
    String password;
    boolean loginStatus;

    User(int user_id, String password, boolean loginStatus){
      this.user_id = user_id;
      this.password = password;
      this.loginStatus = loginStatus;
    }

    boolean verifyLogin(){
      if (user_id == 1234 && password == "passowrd"){
        return true; 
      }

      return false; 
    }

  }


  class Student {

    String name;
    String email;


    Student(String name, String email){
      this.name = name;
      this.email = email; 
    }

    void register(){
      System.out.println("add name and email to db");
    }

    void login (){  
      System.out.println("login email to db");
    }

    String search(){
      System.out.println("search  to db");
      return "name"; 
    }
  }


  class Notes {
    void addNote(){
        System.out.println("add note to db");
    }

    void editNotes(){
        System.out.println("Edit note and save");
    }

    void getNotes(){
        System.out.println("get note and save");
    }

    void deleteNodes(){
        System.out.println("edit note and save");
    } 
    
  }


  class Pembagi extends Notes {
    String notesname ;

    Pembagi(String notesname){
        this.notesname = notesname;
    }

    void addNote(){
        System.out.println("add note to db");
    }

    void editNotes(){
        System.out.println("Edit note and save");
    }
    

  }


  class Pencari extends Answer {
    String question_id_pencari  = question_id;

    Pencari(String question_id){
        this.question_id = question_id;
    }

    void searchNote(){
        System.out.println("add note to db");
    }

    void searchAnswer(){
        System.out.println("Edit note and save");
    }
    

  }

  class Answer extends Question{
    String answer_id;
    String answer ;

    Answer(String answer, String answer_id){
      this.answer = answer;
      this.answer_id = answer_id;
    }

    void addAnswer(){
        System.out.println("add asnwer to db");
    }

    void editAnswer(){
        System.out.println("Edit answer and save");
    }

    void getAnswer(){
        System.out.println("get answer and save");
    }

    void deleteAnswer(){
        System.out.println("edit answer and save");
    } 

  }

  class Question  extends Topic{
    String question_id;
    String question ;

    Question(String question, String question_id){
      this.question = question;
      this.question_id = question_id;
    }

    void addQuestion(){
        System.out.println("add Question to db");
    }

    void editQuestion(){
        System.out.println("Edit Question and save");
    }

    void getAnswer(){
        System.out.println("get Question and save");
    }

    void deleteQuestion(){
        System.out.println("edit Question and save");
    } 

  }

  class Topic {
    String topic_id; 
    String title;

    Topic(String topic_id, String title){
      this.topic_id = topic_id;
      this.title = title; 
    }

    void addTopic(){
        System.out.println("add Topic to db");
    }

    void editTopic(){
        System.out.println("Edit Topic and save");
    }

    void getTopic(){
        System.out.println("get Topic and save");
    }

    void deleteTopic(){
        System.out.println("edit Topic and save");
    } 


  }


  class Course extends Topic{
    String course_id; 
    String course_name;
    String lastUpdate; 

    Course(String course_id, String course_name, String lastUpdate){
      this.course_id = course_id;
      this.course_name = course_name; 
      this.lastUpdate = lastUpdate;
    }

    void addCourse(){
        System.out.println("add Topic to db");
    }

    void editCourse(){
        System.out.println("Edit Topic and save");
    }

    void getCourse(){
        System.out.println("get Topic and save");
    }

    void deleteCourse(){
        System.out.println("edit Topic and save");
    } 
  }

  class MaterialSupport {
    String materialSupportId; 
    String materialSupportName;
    String materialSupportContent;


    void addMaterialSupport(){
      System.out.println("add Material Support to db");
    }

    void getMaterialSupport(){    
      System.out.println("get Material Support to db");
    }

    void deleteMaterialSupport() {
      System.out.println("del Material Support to db");
    }

    void editMaterialSupport(){
        System.out.println("edit Material Support to db");
    }
  }

    
  
}