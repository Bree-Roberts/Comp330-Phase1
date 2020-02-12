import java.util.*;

public class Quiz{

  public String iQuestion[] = { //hold question
          "Who was the first man to land on the moon?",
          "What movie is this line from: Life is like a box a chocolate, you never know what your going to get",
          "True or False: A docudrama is a TV show is a fictionalized account of a true story?",
          "There are ____ pairs of chromosomes in the average human body?",
  };

  public String iSelections [][] = { //hold answer options
          {"Neil Armstrong", "Lance Armstrong", "Buzz Aldrin", "John Glenn"}
          {"The Notebook", "Breakfast at Tiffany's", "Forrest Gump", "Cast Away"}
          {"True", "False"}
          {"____"}

  };

  public String iCorrectAnswer[] = {"Neil Armstrong", "Forrest Gump","True", "23"} //getting answer

  public String getQuestion(int a){ //return question from iQuestion
    String question = iQuestions [a];
    return question;
  }

  public String getSelection1 (int a){ //return first item in array of selection
    String choice0 = iSelections [a][0];
    return choice0;
  }

  public String getSelection2 (int a){ //return second item in array of selection
    String choice1 = iSelections [a][1];
    return choice1;
  }

  public String getSelection3 (int a){ //return third item in array of selection
    String choice2 = iSelections [a][2];
    return choice2;
  }

  public String getSelection4 (int a){ //return fourth item in array of selection
    String choice3 = iSelections [a][3];
    return choice3;
  }

  public String getCorrect Answer(int a){ //get the right answer
    String answer = iCorrectAnswer[a];
    return answer;
  }
}
