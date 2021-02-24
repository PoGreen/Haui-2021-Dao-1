package haui.tranducdao.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "news")
public class News extends  BaseEntity {

    @Column(name = "shortContent")
    private String shortContent;

    @Column(name = "content",columnDefinition = "TEXT")
    private String content;

    @Column(name = "userId")
    private String userId;

    @Column(name = "status")
    private String status;

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
