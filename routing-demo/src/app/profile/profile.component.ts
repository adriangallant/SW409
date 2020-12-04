import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {UserService} from '../service/user.service.client';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(
    private activatedRoute: ActivatedRoute,
    private userService: UserService
    ) { }

  user: any;

  ngOnInit(): void {
    this.activatedRoute.params.subscribe(params => {
      console.log(params);
      this.user = this.userService.findUserById(params.userId);
    });
  }
}
