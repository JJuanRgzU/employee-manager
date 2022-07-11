import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL:string="http://localhost:8080/employee";

  constructor(private httpClient:HttpClient) { }

  addEmployee(employee:Employee) :Observable<Employee> {
    return this.httpClient.post<Employee>(`${this.baseURL}/add`,employee);
  }

  updateEmployee(employee:Employee) :Observable<Employee> {
    return this.httpClient.put<Employee>(`${this.baseURL}/update`,employee);
  }

  deleteEmployee(id:number) :Observable<void> {
    return this.httpClient.delete<void>(`${this.baseURL}/delete/${id}`);
  }

  findEmployeeById(id:number) :Observable<Employee> {
    return this.httpClient.get<Employee>(`${this.baseURL}/get/${id}`);
  }

  findAllEmployees(id:number) :Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.baseURL}/get`);
  }
}
