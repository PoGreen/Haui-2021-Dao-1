package haui.tranducdao.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "ward")
public class Ward extends  BaseEntity {

    @Column(name = "wardName")
    private String wardName;

    @Column(name = "districtId")
    private String districtId;

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }
}
