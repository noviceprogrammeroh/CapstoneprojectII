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
      image: "/assets/motobmw.jpeg"
      },

     {

      model : "Deluxe",
      manufacturer: "Harley Davidson",
      price: 18399,
      image: "/assets/harleydavidsondeluxe.jpeg"

      },

     {
      model : "CBR1000RR ",
      manufacturer: "Honda",
      price: 28500,
      image: "/assets/hondacbr1000rr.jpeg"

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
