package main.com.spring.model;

public class StoreInfo {
    private Integer id;

    private String username;

    private String productname;

    private Integer stroway;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getStroway() {
        return stroway;
    }

    public void setStroway(Integer stroway) {
        this.stroway = stroway;
    }
}