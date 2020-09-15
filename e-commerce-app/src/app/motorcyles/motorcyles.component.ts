import { Component, OnInit } from '@angular/core';
import  {Motorcyle} from "./motorcycles"

@Component({
  selector: 'app-motorcyles',
  templateUrl: './motorcyles.component.html',
  styleUrls: ['./motorcyles.component.css']
})
export class MotorcylesComponent implements OnInit {


  motorcyclesArray: Motorcyle[] = [

    {
      model : "S 1000 RR",
      manufacturer: "BMW",
      price: 16995,
      },

     {

      model : "Deluxe",
      manufacturer: "Harley Davidson",
      price: 18399,

      },

     {
      model : "CBR1000RR ",
      manufacturer: "Honda",
      price: 28500,

      }


  ]

selectMotorcycle =null;
  chooseMotorcycle(mt: Motorcyle) {
  this.selectMotorcycle=mt;

  }




  constructor() { }

  ngOnInit(): void {
  }

}
