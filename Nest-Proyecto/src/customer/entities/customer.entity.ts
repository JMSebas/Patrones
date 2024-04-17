import { Entity, Column, PrimaryGeneratedColumn, OneToMany } from 'typeorm';
import { Invoice } from 'src/invoice/entities/invoice.entity';
@Entity()
export class Customer {

    @PrimaryGeneratedColumn()
    id: number;
  
    @Column()
    firstName: string;
  
    @Column()
    lastName: string;
  
    @Column()
    adress: string;

    @Column()
    phone: string;

    @Column()
    mail: string;

    
  @Column({ default: true })
  isActive: boolean;

  @OneToMany(()=> Invoice, invoice => invoice.customer)
  invoices: Invoice[];



}

