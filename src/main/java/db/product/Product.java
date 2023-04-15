package db.product;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "product_code", length = 14, nullable = false)
    private String productCode;
    @Column(name = "product_name", length = 40, nullable = false)
    private String productName;
    @Column(name = "number_details", nullable = false)
    private int numberDetails;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberDetails() {
        return numberDetails;
    }

    public void setNumberDetails(int numberDetails) {
        this.numberDetails = numberDetails;
    }
}
