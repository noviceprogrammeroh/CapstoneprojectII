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
      image: "/assets/anotherluxuryyacht.jpeg"
      },

     {

      model : "Deluxe",
      manufacturer: "Yamaha",
      price: 3450000,
      image: "/assets/luxuryrioyacht.jpeg"

      },

     {
      model : "Gallant Lady",
      manufacturer: "Lund",
      price: 4000000,
      image: "/assets/gallantladyyacth.jpeg"

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
