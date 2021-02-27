package xyz.wheelertree.mybatisjunit.domain;

import java.io.Serializable;

public class VisitorListQuery implements Serializable {
    private static final long serialVersionUID = -7918073549057533968L;
    private String deviceCode;

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
}
