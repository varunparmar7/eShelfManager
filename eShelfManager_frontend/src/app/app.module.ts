import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookComponent } from './MyComponentes/book/book.component';
import { AddBookComponent } from './MyComponentes/add-book/add-book.component';
import { GetBooksComponent } from './MyComponentes/get-books/get-books.component';
import { DeleteBooksComponent } from './MyComponentes/delete-books/delete-books.component';
import { HomeComponent } from './MyComponentes/home/home.component';
import { UpdateBooksComponent } from './MyComponentes/update-books/update-books.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    BookComponent,
    AddBookComponent,
    GetBooksComponent,
    DeleteBooksComponent,
    HomeComponent,
    UpdateBooksComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
