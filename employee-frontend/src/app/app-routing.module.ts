import { NgModule } from '@angular/core';
import {Routes, RouterModule, Router} from '@angular/router';
import {ListEmployeesComponent} from './list-employees/list-employees.component';

const routes: Routes = [
  {path: 'list-employees', component: ListEmployeesComponent}
];

export const routing = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
