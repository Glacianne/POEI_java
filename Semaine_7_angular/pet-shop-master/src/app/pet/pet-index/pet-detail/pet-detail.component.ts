import { Component } from '@angular/core';
import { ActivatedRoute, Route } from '@angular/router';
import { Subscription } from 'rxjs';

import { IPet } from '../../model/pet';
import { PetService } from '../../pet.service';

@Component({
  selector: 'app-pet-detail',
  templateUrl: './pet-detail.component.html',
  styleUrls: ['./pet-detail.component.scss'],
})
export class PetDetailComponent {
  pet: IPet | null = null;
  private sub!: Subscription;

  constructor(private petService: PetService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.sub = this.route.params.subscribe(
      (p) => {
        (this.pet = this.petService.petWithId(p['id']))}
    );
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }
}
