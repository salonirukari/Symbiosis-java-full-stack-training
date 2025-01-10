import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PhotobookingComponent } from './photobooking/photobooking.component';

export const routes: Routes = [

    { path:  '',component: HomeComponent },

{ path: 'photobooking',component: PhotobookingComponent },
];
