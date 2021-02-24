package haui.tranducdao.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "image")
public class image extends BaseEntity{

    @Column(name = "imageName")
    private String imageName;

    @Column(name = "url")
    private String url;

    @Column(name = "type")
    private String type;

    @Column(name = "buildingId")
    private String buildingId;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }
}
