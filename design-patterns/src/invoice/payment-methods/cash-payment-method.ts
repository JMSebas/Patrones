import { PaymentMethod } from './payment-method.interface';

export class CashPaymentMethod implements PaymentMethod {
  pay(amount: number): void {
    console.log(`Paying $${amount} in cash.`);
    // Lógica para procesar el pago en efectivo
  }
}