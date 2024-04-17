import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CustomerModule } from './customer/customer.module';
import { InvoiceModule } from './invoice/invoice.module';
import { TypeOrmModule } from '@nestjs/typeorm';
import { InvoiceDetailModule } from './invoice-detail/invoice-detail.module';

@Module({
  imports: [
    TypeOrmModule.forRoot({
      type: 'postgres',
      host: 'localhost',
      port: 5432,
      username: 'postgres',
      password: 'root',
      database: 'patrones',
      entities: [
        __dirname + '/**/*.entity{.ts,.js}',
      ],
      synchronize: true,
    }),
  CustomerModule, InvoiceModule, InvoiceDetailModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
