import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products = ['rouge', 'bleu', 'vert'];
  selectedProduct:string|null = null;

  constructor() { }

  selectProduct(product: string){
    this.selectedProduct = product;
  }

}
