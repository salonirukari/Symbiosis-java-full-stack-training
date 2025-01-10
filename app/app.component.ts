import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
// import { BookingPage } from './bookingphoto/bookingphoto.component';
import { PhotobookingComponent } from './photobooking/photobooking.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
}
