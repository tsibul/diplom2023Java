package db.product.detail;

import db.equipment.mold.MoldInsert;
import db.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Long detailId;
    @Column(name = "detail_name")
    private String detailName;
    @Column(name = "detail_base_weight_g")
    private int detailBaseWeightG;
    @Column(name = "detail_base_material")
    private int detailBaseMaterial;
    @ManyToOne(targetEntity = MoldInsert.class)
    @JoinColumn(name = "mold_insert", referencedColumnName = "equipment_id", nullable = false)
    private MoldInsert moldInsert;
    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product", referencedColumnName = "product_id", nullable = false)
    private Product product;
    @Column(name = "index_in_product", nullable = false)
    private int indexInProduct;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getIndexInProduct() {
        return indexInProduct;
    }

    public void setIndexInProduct(int indexInProduct) {
        if (indexInProduct <= this.product.getNumberDetails() && indexInProduct > 0) {
            this.indexInProduct = indexInProduct;
        }
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public int getDetailBaseWeightG() {
        return detailBaseWeightG;
    }

    public void setDetailBaseWeightG(int detailBaseWeightG) {
        this.detailBaseWeightG = detailBaseWeightG;
    }

    public int getDetailBaseMaterial() {
        return detailBaseMaterial;
    }

    public void setDetailBaseMaterial(int detailBaseMaterial) {
        this.detailBaseMaterial = detailBaseMaterial;
    }

    public MoldInsert getMoldInsert() {
        return moldInsert;
    }

    public void setMoldInsert(MoldInsert moldInsert) {
        this.moldInsert = moldInsert;
    }
}
