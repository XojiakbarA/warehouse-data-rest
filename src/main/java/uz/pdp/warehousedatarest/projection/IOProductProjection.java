package uz.pdp.warehousedatarest.projection;

public interface IOProductProjection {
    Long getId();
    ProductProjection getProduct();
    Double getAmount();
    Double getPrice();
}
