package managers;

import dtos.ProductDTO;
import dtos.StoreDTO;
import gateways.ProductGateway;
import java.util.ArrayList;

public class ProductManager {
  
  private ProductGateway gateway = new ProductGateway();
  
  public ArrayList<ProductDTO> getProductDetails()
  {
    return gateway.findAllProducts();
  }
  
  public ProductDTO getProductDetailsById(int id)
  {
    return gateway.findProductById(id);
  }
  
  public ProductDTO findProduct(int id, int storeId, String productName, String imageName, int quantity, double price, ProductDTO product)
  {
    return gateway.findProduct(id, storeId, productName, imageName, quantity, price);
  }
  
  public ArrayList<ProductDTO> getProductsByStoreId(int id)
  {
    return gateway.findProductsByStoreId(id);
  }
  
  public boolean addProduct(ProductDTO product)
  {
    return gateway.addProduct(product);
  }
  
  public void remove(int id)
  {
     gateway.delete(id);
  }
  
  public void update(ProductDTO product, int id)
  {
    gateway.update(product, id);
  }
  
}