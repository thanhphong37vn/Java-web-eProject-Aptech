/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Administrator
 */
public class FeedBack {
    private int feedBackID;
    private String name, email, subject, content, feedbackDate;

    public FeedBack listFeedback;

    public FeedBack() {
    }

    public FeedBack(int feedBackID, String name, String email, String subject, String content, String feedbackDate, FeedBack listFeedback) {
        this.feedBackID = feedBackID;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.content = content;
        this.feedbackDate = feedbackDate;
        this.listFeedback = listFeedback;
    }

    public FeedBack getListFeedback() {
        return listFeedback;
    }

    public void setListFeedback(FeedBack listFeedback) {
        this.listFeedback = listFeedback;
    }

  

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFeedBackID() {
        return feedBackID;
    }

    public void setFeedBackID(int feedBackID) {
        this.feedBackID = feedBackID;
    }

    public String getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(String feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
