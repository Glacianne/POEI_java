import { Component } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.scss']
})
export class ProductDetailComponent {
   get selectedProduct(){
    return this.productService.selectedProduct;
  }

  constructor(private productService: ProductService){
    console.log(this.productService.products)
  }
}
