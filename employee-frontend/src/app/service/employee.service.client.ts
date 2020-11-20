import { Injectable } from '@angular/core';

@Injectable()
export class EmployeeServiceClient{
  getAllEmployees = () =>
    fetch('http://employeebackend-env.eba-7npijpzr.us-east-2.elasticbeanstalk.com/api/v1/getAllEmployees').then(response => response.json())
}
// http://employeebackend-env.eba-7npijpzr.us-east-2.elasticbeanstalk.com/api/v1/getAllEmployees
