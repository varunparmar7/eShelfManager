import { Component, OnInit } from '@angular/core';
import { BooksService } from '../../books.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent implements OnInit{

  books: any;

  constructor(private service: BooksService) { }

  ngOnInit() {
    this.service.getBooks().subscribe(data => {
      this.books =  data;
    });
  }

}
