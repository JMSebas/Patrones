import { Injectable } from '@nestjs/common';
import { PaymentMethod } from './payment-method.interface';
import { CashPaymentMethod } from './cash-payment-method';
import { CardPaymentMethod } from './card-payment-method';

@Injectable()
export class PaymentMethodFactory {
  createPaymentMethod(methodType: string): PaymentMethod {
    switch (methodType) {
      case 'cash':
        return new CashPaymentMethod();
      case 'card':
        return new CardPaymentMethod();
      default:
        throw new Error('Invalid payment method type.');
    }
  }
}