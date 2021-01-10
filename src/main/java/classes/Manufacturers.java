package classes;

import java.util.List;

public class Manufacturers {
    private String officePhoneNumber;
    private String siteAddress;
    private String siteName;
    private String siteRegionState;
    private List<ChildCompanies> childCompanies;
    private String reportSource;

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteRegionState() {
        return siteRegionState;
    }

    public void setSiteRegionState(String siteRegionState) {
        this.siteRegionState = siteRegionState;
    }

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public List<ChildCompanies> getChildCompanies() {
        return childCompanies;
    }

    public void setChildCompanies(List<ChildCompanies> childCompanies) {
        this.childCompanies = childCompanies;
    }

}
