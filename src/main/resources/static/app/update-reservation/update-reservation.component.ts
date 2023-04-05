import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IReservation } from '../reservation-list/reservation';
import { ReservationService } from '../reservation-list/reservation-list.service';

@Component({
  selector: 'app-update-reservation',
  templateUrl: './update-reservation.component.html',
  styleUrls: ['./update-reservation.component.css']
})
export class UpdateReservationComponent implements OnInit {

  constructor(private reservationService : ReservationService, private route: ActivatedRoute, private router : Router) {
  }

  reservation !: IReservation;
  reservationId !:number;
  submitted = false;


  ngOnInit(): void {

    this.reservation = new IReservation();
    this.reservationId = this.route.snapshot.params['id'];
    this.reservationService.getReservationById(this.reservationId).subscribe({
      next : data => this.reservation = data 
    });
  }


  onSubmit() {
    this.submitted = true;
    this.editReservationValue();
  }

  editReservationValue() {
    this.reservationService.editReservations(this.reservationId, this.reservation).
      subscribe(data => console.log(data), error => console.log(error));
    this.reservation = new IReservation();
    setTimeout(() => this.reservationList());
  }

  

  reservationList() {
    this.router.navigate(['']);
  }


}