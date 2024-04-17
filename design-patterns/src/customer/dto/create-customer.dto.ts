import { IsBoolean, IsNotEmpty, IsNumber, IsString } from 'class-validator';

export class CreateCustomerDto {

   
    id: number;

    @IsString()
    @IsNotEmpty()
    firstName: string;
  
    lastName: string;
  
    adress: string;

    phone: string;

    mail: string;

    isActive: boolean;
  
    
    

}
