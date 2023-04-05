import { Component, OnChanges, OnInit, SimpleChanges } from "@angular/core";
import { FormControl, FormGroup } from "@angular/forms";
import { ModalDismissReasons, NgbModal } from "@ng-bootstrap/ng-bootstrap";
import { IReservation } from "./reservation";
import { ReservationService } from "./reservation-list.service";

@Component({
    selector : 'rm-reservationList',
    templateUrl :'./reservation-list.component.html',
    providers : [ReservationService]
})


export class ReservationListComponent implements OnInit{

    constructor(private reservationService : ReservationService, private modalService : NgbModal) {
    }


    reservations : IReservation[] = [];
    

    ngOnInit() : void {
       this.reservationService.getReservations().subscribe({
            next : reservations => this.reservations = reservations
       })
    }

    deleteReservation(id : number) {
        this.reservationService.deleteReservation(id).
      subscribe(data => {
        console.log(data);
        this.ngOnInit();
      },
        error => console.log(error));

    }

    

}

