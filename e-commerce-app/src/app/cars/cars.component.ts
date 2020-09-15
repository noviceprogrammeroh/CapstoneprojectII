import { Component, OnInit } from '@angular/core';
import {Car} from "./cars";
@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

carArray: Car[] = [

  {
    model : "Mustang",
    manufacturer: "Ford",
    price: 28000,
    },

   {

    model : "M5",
    manufacturer: "BMW",
    price: 45000,

    },

   {
    model : "RS",
    manufacturer: "Audi",
    price: 55000,

    }


]






selectCar = null;

chooseCar(vh: Car)
{
 this.selectCar=vh;

}


  constructor() { }

  ngOnInit(): void {
  }

}
