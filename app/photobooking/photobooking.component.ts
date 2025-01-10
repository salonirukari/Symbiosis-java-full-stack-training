import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';


@Component({
  selector: 'app-photobooking',
  imports: [CommonModule,RouterModule,],
  templateUrl: './photobooking.component.html',
  styleUrl: './photobooking.component.css'
})
export class PhotobookingComponent {
  method2():void{
    alert("Booking Sucessfully.....!!")
  }
}
