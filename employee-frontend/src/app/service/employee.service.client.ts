import { Injectable } from '@angular/core';

@Injectable()
export class EmployeeServiceClient{
  getAllEmployees = () =>
    fetch('http://localhost:8080/api/v1/getAllEmployees').then(response => response.json())
}
