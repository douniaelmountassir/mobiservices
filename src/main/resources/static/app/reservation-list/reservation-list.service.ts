import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http"
import { Observable, tap } from "rxjs";
import { IReservation } from "./reservation";


@Injectable({
    providedIn : 'root'
}
)
export class ReservationService {

    private baseUrl = 'http://localhost:8080/api/v1/reservation'

    constructor(private http:HttpClient) {}

    getReservations() : Observable<IReservation[]> {
        return this.http.get<IReservation[]>(`${this.baseUrl}/all`).pipe(
            tap((data) => console.log('All: ', JSON.stringify(data)))
        )
    }

    editReservations(id: number, value: any) : Observable<void> {
        return this.http.put<void>(`${this.baseUrl}/edit/${id}`, value);
    }

    getReservationById(id : number) : Observable<IReservation> {
        return this.http.get<IReservation>(`${this.baseUrl}/${id}`).pipe(
            tap((data) => console.log('All: ', JSON.stringify(data)))
        )
    }

    public deleteReservation(id: number): Observable<any> {
        return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
    }

    public addReservation(reservation: IReservation): Observable<object> {
        return this.http.post(`${this.baseUrl}`, reservation);
    }

}