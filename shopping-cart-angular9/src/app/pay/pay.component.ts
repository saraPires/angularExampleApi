import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

import { PayService } from '../pay.service';

@Component({
  selector: 'app-pay',
  templateUrl: './pay.component.html',
  styleUrls: ['./pay.component.css']
})
export class PayComponent {
  
  checkoutForm: FormGroup;

  constructor(
    private payService: PayService,
    private formBuilder: FormBuilder,
  ) {
  

    this.checkoutForm = this.formBuilder.group({
      idCard: '',
      bank: ''
    });
  }

  onSubmit(customerData) {
    // Process checkout data here
    console.warn('Your payment has been submitted', customerData);
    window.alert('Your payment is being process!')
    this.checkoutForm.reset();
  }

  
}