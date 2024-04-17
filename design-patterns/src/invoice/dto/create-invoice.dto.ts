import { IsBoolean, IsNotEmpty, IsNumber, IsString } from 'class-validator';

export class CreateInvoiceDto {

    id: number;

  amount: number;

  invoiceDate: Date;

  customerID:number;

  isActive: boolean;
}
