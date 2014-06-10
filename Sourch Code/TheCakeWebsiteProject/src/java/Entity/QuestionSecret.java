/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author ThanhTung
 */
public class QuestionSecret {

    public int questionSecretID;
    public String questionSecretContent;

    public QuestionSecret() {
    }

    public QuestionSecret(int questionSecretID, String questionSecretContent) {
        this.questionSecretID = questionSecretID;
        this.questionSecretContent = questionSecretContent;
    }


    
    public String getQuestionSecretContent() {
        return questionSecretContent;
    }

    public void setQuestionSecretContent(String questionSecretContent) {
        this.questionSecretContent = questionSecretContent;
    }

    public int getQuestionSecretID() {
        return questionSecretID;
    }

    public void setQuestionSecretID(int questionSecretID) {
        this.questionSecretID = questionSecretID;
    }

    
  

  
    
}
