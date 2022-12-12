import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  selectedSport: string = "";
   sportList: string[] = ['tir sportif', 'natation', 'ultimate', 'waterpolo', 'gymnastique', 'futsal', 'lancer de nains'];

   selectSport(sport:string):void{
    this.selectedSport = sport;
   }
}

