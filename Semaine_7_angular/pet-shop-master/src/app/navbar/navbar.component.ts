import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
})
export class NavbarComponent {
  constructor(private authService: AuthService) {}

  onToggleAuth(){
    console.log(this.isAuth);
    this.authService.toggleAuth();
  }

  get isAuth(){
    return this.authService.isAuth;
  }
}
