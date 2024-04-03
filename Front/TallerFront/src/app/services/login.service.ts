import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  login(params:HttpParams):Observable<any>{
    return this.http.post("http://localhost:8080/api/v1/login", params.toString(),{
      headers:{'Content.Type' : ' application/x-www-form-urlencoded'}
    });
  }
}
