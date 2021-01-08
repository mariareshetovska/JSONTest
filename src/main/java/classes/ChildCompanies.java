package classes;


public class ChildCompanies {
    private String address;
    private String phone;
    private String state;

    public ChildCompanies() {
    }

    public ChildCompanies(String address, String state, String phone) {
        this.address = address;
        this.state = state;
        this.phone = phone;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildCompanies that = (ChildCompanies) o;
        return address.equals(that.address) &&
                state.equals(that.state) &&
                phone.equals(that.phone);
    }

}
