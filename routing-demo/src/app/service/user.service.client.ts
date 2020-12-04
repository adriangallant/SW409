import {Injectable} from '@angular/core';

@Injectable()
export class UserService{

  users = [
    {_id: 123, username: 'bob', password: 'bobpassword'},
    {_id: 456, username: 'mike', password: 'mikepassword'}
  ];

  findUserByCredentials(username: string, password: string){
    for (let i = 0; i < this.users.length; i++){
      const user = this.users[i];
      if (username === user.username && password === user.password){
        return this.users[i];
      }
      return null;
    }
  }

  findUserById(id: number) {
    for (let i = 0; i < this.users.length; i++){
      const user = this.users[i];
      if (Number.parseFloat(String(id)) === user._id){
        return this.users[i];
      }
      return null;
    }
  }

}
