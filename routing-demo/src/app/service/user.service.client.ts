import {Injectable} from '@angular/core';

@Injectable()
export class UserService{

  users = [
    {_id: 123, username: 'bob', password: 'bobpassword'},
    {_id: 456, username: 'mike', password: 'mikepassword'}
  ];

  findUserByCredentials(username:String, password:String){
    for (let i = 0; i < this.users.length; i++){
      const user = this.users[i];
      if(username === user.username && password === user.password){
        return user;
      }
      return null;
    }
  }

}
