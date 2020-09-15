import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CarsComponent} from "./cars/cars.component"
import {MotorcylesComponent} from "./motorcyles/motorcyles.component";
import {BoatsComponent} from "./boats/boats.component"
import {WelcomeComponent} from "./welcome/welcome.component"
// cars
// motorcycles
// boats


const routes: Routes = [

{path: 'cars', component: CarsComponent},
{path: 'motorcycles',component: MotorcylesComponent},
{path: 'boats', component: BoatsComponent},
{path: '', component: WelcomeComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
