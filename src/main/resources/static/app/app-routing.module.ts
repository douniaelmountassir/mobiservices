import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddReservationComponent } from './add-reservation/add-reservation.component';
import { ReservationListComponent } from './reservation-list/reservation-list.component';
import { UpdateReservationComponent } from './update-reservation/update-reservation.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'resrvationList' },
  { path: 'resrvationList', component: ReservationListComponent },
  { path: 'update/:id', component: UpdateReservationComponent },
  { path: 'add', component: AddReservationComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
