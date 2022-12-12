import { Component } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss']
})
export class ProductListComponent {

  get productList(){
    return this.productService.products;
  }

  constructor(private productService: ProductService){
    console.log(this.productService.products)
  }

  onSelectProduct(product:string){
    this.productService.selectProduct(product);
  }

}
