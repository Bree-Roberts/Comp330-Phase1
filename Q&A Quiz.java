import java.util.*;

import java.util.ArrayList;

public class Q&A Quiz{

  private String iQuestion[] = {
          Who was the first man to land on the moon?
          What movie is this line from: “Life is like a box a chocolate, you never know what your going to get.”
  True or False: A docudrama is a TV show is a fictionalized account of a true story?
  There are ____ pairs of chromosomes in the average human body?
};

private String iSelections [][]{
        {" Neil Armstrong", "Lance Armstrong", "Buzz Aldrin", "John Glenn"}
        {"The Notebook", "Breakfast at Tiffany's", "Forrest Gump", "Cast Away"}
        {"True", "False"}
        {"____"}

        };

private String iCorrectAnswer[] = {"Neil Armstrong", "Forrest Gump","True", "23"}

public String getQuestion(int a){
        String question = iQuestions [a];
        return question;
        }

public String getSelection1 (int a){
        String choice0 = iSelections [a][0];
        return choice0;
        }

public String getSelection2 (int a){
        String choice1 = iSelections [a][1];
        return choice1;
        }

public String getSelection3 (int a){
        String choice2 = iSelections [a][2];
        return choice2;
        }

public String getSelection4 (int a){
        String choice3 = iSelections [a][3];
        return choice3;
        }

public String getCorrect Answer(int a){
        String answer = iCorrectAnswer[a];
        return answer;
        }

        }