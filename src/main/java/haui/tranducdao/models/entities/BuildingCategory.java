package haui.tranducdao.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "buildingCategory")
public class BuildingCategory  extends  BaseEntity {

    @Column(name = "buildingCategoryName")
    private String buildingCategoryName;

    @Column(name = "status")
    private String status;

    public String getBuildingCategoryName() {
        return buildingCategoryName;
    }

    public void setBuildingCategoryName(String buildingCategoryName) {
        this.buildingCategoryName = buildingCategoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
