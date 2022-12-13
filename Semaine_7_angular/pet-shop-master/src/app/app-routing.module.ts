import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { AddPetComponent } from "./pet/add-pet/add-pet.component";
import { PetIndexComponent } from "./pet/pet-index/pet-index.component";
import { PetListComponent } from "./pet/pet-index/pet-list/pet-list.component";
import { PetComponent } from "./pet/pet.component";

const routes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'pet', component: PetComponent,
    children: [
        {path: 'index', component: PetIndexComponent},
        {path: 'add', component: AddPetComponent},
        {path: '', redirectTo: 'index', pathMatch: 'full'},
        {path: '**', redirectTo: 'index'},
    ]},
    {path: '', redirectTo: 'home', pathMatch: 'full'},
    {path: '**', redirectTo: 'home'},
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
})

export class AppRoutingModule{}