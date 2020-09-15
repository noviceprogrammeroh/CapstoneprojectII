import { Component, OnInit } from '@angular/core';
import {Boat} from './boats'
@Component({
  selector: 'app-boats',
  templateUrl: './boats.component.html',
  styleUrls: ['./boats.component.css']
})
export class BoatsComponent implements OnInit {

  boatArray: Boat[] = [

    {
      model : "Rio",
      manufacturer: "Yacht",
      price: 2500000,
      },

     {

      model : "Deluxe",
      manufacturer: "Yacht",
      price: 3450000,

      },

     {
      model : "Gallant Lady",
      manufacturer: "Yacht",
      price: 4000000,

      }


  ]



selectBoat=null;


chooseBoat(bt: Boat){
this.selectBoat= bt;

}



  constructor() { }

  ngOnInit(): void {
  }

}
