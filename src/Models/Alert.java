/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gugatharsan
 */
public class Alert {
    private String content;
    private String alertId;
    private String to;
    private String from;

    public Alert(String content, String alertId, String to, String from) {
        this.content = content;
        this.alertId = alertId;
        this.to = to;
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public String getAlertId() {
        return alertId;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    
}
