import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable()
export class PayService {
  product = [
    {
        name: 'Phone S Plus',
        price: 340,
        description: 'A Phone large size'
    }
  ];

  constructor(
    private http: HttpClient
  ) {}


  addToPay(product) {
    this.product.push(product);
  }

  getProduct() {
    return this.product;
  }

  clearProduct() {
    this.product = [];
    return this.product;
  }

  getShippingPrices() {
    return this.http.get('/assets/shipping.json');
  }
}