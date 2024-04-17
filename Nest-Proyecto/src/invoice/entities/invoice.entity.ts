import { JoinColumn, BeforeInsert, OneToMany, Entity, Column, PrimaryGeneratedColumn, ManyToOne } from 'typeorm';
import { Customer } from 'src/customer/entities/customer.entity';
import { InvoiceDetail } from 'src/invoice-detail/entities/invoice-detail.entity';
@Entity()
export class Invoice {

    @PrimaryGeneratedColumn()
    id: number;

    
  @Column()
  amount: number;

  @Column({ type: 'date' })
  invoiceDate: Date;

  @Column({ default: true })
  isActive: boolean;

  @ManyToOne(() => Customer, (customer) => customer.invoices)
  @JoinColumn({ name: 'customer_id' })
  customer: Customer;

  @OneToMany(() => InvoiceDetail, (invoiceDetail) => invoiceDetail.invoice)
  details: InvoiceDetail[];

  @BeforeInsert()
  setDate() {
    this.invoiceDate = new Date();
  }


}
