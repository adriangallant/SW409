import { Component, OnInit } from '@angular/core';
import {EmployeeServiceClient} from '../service/employee.service.client';

@Component({
  selector: 'app-list-employees',
  templateUrl: './list-employees.component.html',
  styleUrls: ['./list-employees.component.css']
})
export class ListEmployeesComponent implements OnInit {

  constructor(private employeeServiceClient: EmployeeServiceClient) { }

  employees: [];

  ngOnInit(): void {
    this.employeeServiceClient.getAllEmployees().then(employees => this.employees = employees);
    console.log(this.employees);
  }

}
