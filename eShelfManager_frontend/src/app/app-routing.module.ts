import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './MyComponentes/home/home.component';
import { GetBooksComponent } from './MyComponentes/get-books/get-books.component';
import { AddBookComponent } from './MyComponentes/add-book/add-book.component';
import { DeleteBooksComponent } from './MyComponentes/delete-books/delete-books.component';
import { UpdateBooksComponent } from './MyComponentes/update-books/update-books.component';

export const routes: Routes = [
  {
    path: '', 
    component: HomeComponent
  },
  {
    path: 'GetBooks',
    component: GetBooksComponent
  },
  {
    path: 'AddBook',
    component: AddBookComponent
  },
  {
    path: 'DeleteBooks',
    component: DeleteBooksComponent
  },
  {
     path: 'UpdateBooks',
    component: UpdateBooksComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }