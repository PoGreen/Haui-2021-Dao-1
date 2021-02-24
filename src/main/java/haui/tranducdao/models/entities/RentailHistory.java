package haui.tranducdao.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity(name = "rentailHistory")
public class RentailHistory extends  BaseEntity {
    @Column(name = "seller")
    private String seller;

    @Column(name = "buyer")
    private String buyer;

    @Column(name = "buildingId")
    private String buildingId;

    @Column
    private ZonedDateTime timeEnd;

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public ZonedDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(ZonedDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }
}
