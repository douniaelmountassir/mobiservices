import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IReservation } from '../reservation-list/reservation';
import { ReservationService } from '../reservation-list/reservation-list.service';

@Component({
  selector: 'app-add-reservation',
  templateUrl: './add-reservation.component.html',
  styleUrls: ['./add-reservation.component.css']
})
export class AddReservationComponent {

  constructor(private reservationService : ReservationService, private router : Router) {
  }

  reservation !: IReservation;
  submitted = false;


  ngOnInit(): void {
  }


  onSubmit() {
    this.submitted = true;
    this.save();
  }

  newReservation(): void {
    this.submitted = false;
    this.reservation = new IReservation();
  }

  save() {
    this.reservationService.addReservation(this.reservation)
      .subscribe(data => console.log(data), error => console.log(error));
    this.reservation = new IReservation();
    setTimeout(() => this.reservationList());
  }

  

  reservationList() {
    this.router.navigate(['']);
  }

}
